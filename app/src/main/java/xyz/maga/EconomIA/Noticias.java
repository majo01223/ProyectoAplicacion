package xyz.maga.EconomIA;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;
import java.util.Objects;

public class Noticias extends AppCompatActivity {

    private ListView listView_DiarioMexico;

    private String noticierosMexico [] = {"El Tiempo","BBC","Portafolio","El economista"};
    private String ulrnoticieros[]={"https://www.eltiempo.com/noticias/educacion-financiera","https://www.bbc.com/mundo/topics/cwr9j2xgyynt","https://www.portafolio.co/noticias-economicas/educacion-financiera","https://www.eleconomista.es/"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticias);


        listView_DiarioMexico = findViewById(R.id.listview_diariosMexico);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.listview_diariomexico,noticierosMexico);

        listView_DiarioMexico.setAdapter(adapter);

        //Agregar el evento Clic al ListView
        listView_DiarioMexico.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String url = ulrnoticieros[i];
                navegar(url);
            }
        });


    }

    public void Volver(View view){
        finish();
    }

    private void navegar(String url) {

        Intent i = new Intent(this,NavegadorDiarios.class);
        i.putExtra("url",url);
        startActivity(i);
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

