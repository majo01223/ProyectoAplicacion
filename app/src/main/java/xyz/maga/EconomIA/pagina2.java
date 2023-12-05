package xyz.maga.EconomIA;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import org.jetbrains.annotations.Nullable;

import xyz.maga.EconomIA.BaseDeDatos.BDCreada;
import xyz.maga.EconomIA.BaseDeDatos.DbContactos;

public class pagina2 extends AppCompatActivity {
    EditText txtUsuario, txtContrasena, txtCorreo;
    Button finalizarR;
    CheckBox TyC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina2);

        txtUsuario= findViewById(R.id.txtUsuario);
        txtContrasena= findViewById(R.id.txtContrasena);
        txtCorreo= findViewById(R.id.txtCorreo);
        finalizarR= (Button) findViewById(R.id.finalizarR);
        TyC= (CheckBox) findViewById(R.id.TyC);
        finalizarR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DbContactos dbContactos = new DbContactos(pagina2.this);
                long id = dbContactos.insertaContacto(txtUsuario.getText().toString(), txtContrasena.getText().toString(), txtCorreo.getText().toString());
                if (id>=0 && TyC.isChecked()==true){
                    Intent IniciarSesion = new Intent(pagina2.this, PaginaPrincipal.class);
                    startActivity(IniciarSesion);
                }
                else {
                    Toast.makeText(pagina2.this, "Error al registro", Toast.LENGTH_LONG).show();
                }}
        });


}}