package xyz.maga.EconomIA.BaseDeDatos;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class TablaInversiones {
    @PrimaryKey(autoGenerate = true)
    int id;
    @ColumnInfo(name = "contextoIn")
    String contextoIn;
    @ColumnInfo(name = "valorIn")
    String valorIn;
    @ColumnInfo(name = "fechaIn")
    String fechaIn;

    public TablaInversiones(String contextoIn, String valorIn, String fechaIn) {
        this.contextoIn = contextoIn;
        this.valorIn = valorIn;
        this.fechaIn = fechaIn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContextoIn() {
        return contextoIn;
    }

    public void setContextoIn(String contextoIn) {
        this.contextoIn = contextoIn;
    }

    public String getValorIn() {
        return valorIn;
    }

    public void setValorIn(String valorIn) {
        this.valorIn = valorIn;
    }

    public String getFechaIn() {
        return fechaIn;
    }

    public void setFechaIn(String fechaIn) {
        this.fechaIn = fechaIn;
    }
}
