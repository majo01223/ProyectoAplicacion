package xyz.maga.EconomIA;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import xyz.maga.EconomIA.BaseDeDatos.TablaEgresos;
import xyz.maga.EconomIA.BaseDeDatos.TablaIngresos;

public class ingresos extends AppCompatActivity {
    private Button btnMostrar1;
    private Button btnGuardar1;
    private EditText etContexto1, etValor1, etFecha1, etConsulta1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresos);

        etContexto1 = findViewById(R.id.etContexto1);
        etConsulta1 = findViewById(R.id.etConsulta1);
        etFecha1 = findViewById(R.id.etFecha1);
        etValor1 = findViewById(R.id.etValor1);
        btnMostrar1 = findViewById(R.id.btnMostrar1);
        btnGuardar1 = findViewById(R.id.btnGuardar1);

        btnMostrar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IngresosDataBase db1 = Room.databaseBuilder(ingresos.this,
                        IngresosDataBase.class, "database-name1").allowMainThreadQueries().build();
                List<TablaIngresos> lista1 = db1.ingresosDao().getAll();
                String resultado1 ="";
                for (int i=0;i<lista1.size();i++){
                    resultado1 += lista1.get(i).getId()+": "+ lista1.get(i).getContextoI()+" "+lista1.get(i).getValorI()+" $"+lista1.get(i).getFechaI()+"\n";
                }
                etConsulta1.setText(resultado1);
            }
        });

        btnGuardar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IngresosDataBase db1 = Room.databaseBuilder(ingresos.this,
                        IngresosDataBase.class, "database-name1").allowMainThreadQueries().build();
                TablaIngresos tablaIngresos= new TablaIngresos(etContexto1.getText().toString(), etFecha1.getText().toString(), etValor1.getText().toString());
                Long reg = db1.ingresosDao().insert(tablaIngresos);
                Toast.makeText(getApplicationContext(), "reg",Toast.LENGTH_LONG).show();
            }
        });
    }
}