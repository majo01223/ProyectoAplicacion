package xyz.maga.EconomIA;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.Objects;

public class NavegadorDiarios extends AppCompatActivity {

    WebView navegador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navegador_diarios2);


        navegador = findViewById(R.id.webView_NavegadorDiario);


        //Recuperar Valores del Intent
        String url = getIntent().getStringExtra("url");


        //Crear un cliente Web
        navegador.setWebViewClient(new WebViewClient());
        navegador.loadUrl(url);
    }

    public void Volver(View view){
        finish();
    }

    //Inicializar el Menu OverFlow
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_overflow,menu);
        return true;
    }

    //Selección de Una opcion de Menú
    public boolean onOptionsItemSelected(MenuItem item){
        int id= item.getItemId();
        if(id == R.id.opc_acercade){
            Intent i = new Intent(this,AcercaDe.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}