package xyz.maga.EconomIA;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button iniciarSesion, registrarse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciarSesion= (Button) findViewById(R.id.iniciarSesion);
        registrarse= (Button) findViewById(R.id.registrarse);
        ;
    }
    public void InSe(View vista){
        Intent IniciarSesion = new Intent(this, PaginaPrincipal.class);
        startActivity(IniciarSesion);
    }
    public void Registro(View view){
        Intent Registro = new Intent(this, pagina2.class);
        startActivity(Registro);
    }
}