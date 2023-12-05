package xyz.maga.EconomIA;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import java.util.List;

import xyz.maga.EconomIA.BaseDeDatos.TablaInversiones;

public class inversion extends AppCompatActivity {
    private Button btnMostrar2;
    private Button btnGuardar2;
    private EditText etContexto2, etValor2, etFecha2, etConsulta2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inversion);

        etContexto2 = findViewById(R.id.etContexto2);
        etConsulta2 = findViewById(R.id.etConsulta2);
        etFecha2 = findViewById(R.id.etFecha2);
        etValor2 = findViewById(R.id.etValor2);
        btnMostrar2 = findViewById(R.id.btnMostrar2);
        btnGuardar2 = findViewById(R.id.btnGuardar2);

        btnMostrar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InversionesDataBase db2 = Room.databaseBuilder(inversion.this,
                        InversionesDataBase.class, "database-name2").allowMainThreadQueries().build();
                List<TablaInversiones> lista2 = db2.inversionesDao().getAll();
                String resultado2 ="";
                for (int i=0;i<lista2.size();i++){
                    resultado2 += lista2.get(i).getId()+": "+ lista2.get(i).getContextoIn()+" "+lista2.get(i).getValorIn()+" $"+lista2.get(i).getFechaIn()+"\n";
                }
                etConsulta2.setText(resultado2);
            }
        });

        btnGuardar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InversionesDataBase db2 = Room.databaseBuilder(inversion.this,
                        InversionesDataBase.class, "database-name2").allowMainThreadQueries().build();
                TablaInversiones tablaInversiones= new TablaInversiones(etContexto2.getText().toString(), etFecha2.getText().toString(), etValor2.getText().toString());
                Long reg = db2.inversionesDao().insert(tablaInversiones);
                Toast.makeText(getApplicationContext(), "reg",Toast.LENGTH_LONG).show();
            }
        });
    }
}


