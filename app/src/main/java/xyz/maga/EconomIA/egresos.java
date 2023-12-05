package xyz.maga.EconomIA;

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

public class egresos extends AppCompatActivity {
    private Button btnMostrar;
    private Button btnGuardar;
    private EditText etContexto, etValor, etFecha, etConsulta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egresos);

        etContexto = findViewById(R.id.etContexto);
        etConsulta = findViewById(R.id.etConsulta);
        etFecha = findViewById(R.id.etFecha);
        etValor = findViewById(R.id.etValor);
        btnMostrar = findViewById(R.id.btnMostrar);
        btnGuardar = findViewById(R.id.btnGuardar);

        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EgresosDataBase db = Room.databaseBuilder(egresos.this,
                        EgresosDataBase.class, "database-name").allowMainThreadQueries().build();
                List<TablaEgresos> lista = db.egresosDao().getAll();
                String resultado ="";
                 for (int i=0;i<lista.size();i++){
                     resultado += lista.get(i).getId()+": "+ lista.get(i).getContextoE()+" "+lista.get(i).getValorE()+" $"+lista.get(i).getFechaE()+"\n";
                 }
                 etConsulta.setText(resultado);
            }
        });

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EgresosDataBase db = Room.databaseBuilder(egresos.this,
                        EgresosDataBase.class, "database-name").allowMainThreadQueries().build();
                TablaEgresos tablaEgresos= new TablaEgresos(etContexto.getText().toString(), etFecha.getText().toString(), etValor.getText().toString());
                Long reg = db.egresosDao().insert(tablaEgresos);
                Toast.makeText(getApplicationContext(), "reg",Toast.LENGTH_LONG).show();
            }
        });
    }
}