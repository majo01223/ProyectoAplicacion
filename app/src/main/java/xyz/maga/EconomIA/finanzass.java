package xyz.maga.EconomIA;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class finanzass extends AppCompatActivity {
    Button ingresos, egresos;
    ImageButton home6, buscar, perfil5;
    EditText TotalDisponible;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finanzass);

        ingresos = (Button) findViewById(R.id.ingresos);
        egresos = (Button) findViewById(R.id.egresos);
        home6= (ImageButton) findViewById(R.id.home6);
        buscar= (ImageButton) findViewById(R.id.buscar);
        perfil5= (ImageButton) findViewById(R.id.perfil5);
    }


    public void home(View view ){
        Intent home= new Intent(this, PaginaPrincipal.class);
        startActivity(home);
    }
    public void buscar(View view ){
        Intent buscar= new Intent(this, Ayuda.class);
        startActivity(buscar);
    }
    public void perfil(View view ){
        Intent perfil= new Intent(this, perfil.class);
        startActivity(perfil);
    }
    public void egre(View view ){
        Intent egre= new Intent(this, egresos.class);
        startActivity(egre);
    }
    public void ingre(View view ){
        Intent ingre= new Intent(this, ingresos.class);
        startActivity(ingre);
}}