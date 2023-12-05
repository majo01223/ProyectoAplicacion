package xyz.maga.EconomIA;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PaginaPrincipal extends AppCompatActivity {

    Button finanz, inversion, noticia, chat;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principal);

        finanz = findViewById(R.id.finanz);
        inversion = findViewById(R.id.inversion);
        noticia = findViewById(R.id.noticia);
        chat = findViewById(R.id.chat);
    }
    public void finanzas(View view){
        Intent finanzas= new Intent(this, finanzass.class);
        startActivity(finanzas);
    }
    public void inversiones(View view){
        Intent inversiones= new Intent(this, inversion.class);
        startActivity(inversiones);
    }
    public void noticias(View view){
        Intent noticias= new Intent(this, Noticias.class);
        startActivity(noticias);
    }
    public void chats(View view){
        Intent chats= new Intent(this, tips.class);
        startActivity(chats);
    }
}