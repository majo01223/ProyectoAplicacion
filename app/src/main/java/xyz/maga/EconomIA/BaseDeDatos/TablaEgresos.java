package xyz.maga.EconomIA.BaseDeDatos;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class TablaEgresos {
    @PrimaryKey(autoGenerate = true)
    int id;
    @ColumnInfo(name = "contextoE")
    String contextoE;
    @ColumnInfo(name = "valorE")
    String valorE;
    @ColumnInfo(name = "fechaE")
    String fechaE;

    public TablaEgresos(String contextoE, String valorE, String fechaE) {
        this.contextoE = contextoE;
        this.valorE = valorE;
        this.fechaE = fechaE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContextoE() {
        return contextoE;
    }

    public void setContextoE(String contextoE) {
        this.contextoE = contextoE;
    }

    public String getValorE() {
        return valorE;
    }

    public void setValorE(String valorE) {
        this.valorE = valorE;
    }

    public String getFechaE() {
        return fechaE;
    }

    public void setFechaE(String fechaE) {
        this.fechaE = fechaE;
    }
}