package xyz.maga.EconomIA.BaseDeDatos;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class TablaIngresos {
    @PrimaryKey(autoGenerate = true)
    int id;
    @ColumnInfo(name = "contextoI")
    String contextoI;
    @ColumnInfo(name = "valorI")
    String valorI;
    @ColumnInfo(name = "fechaI")
    String fechaI;

    public TablaIngresos(String contextoI, String valorI, String fechaI) {
        this.contextoI = contextoI;
        this.valorI = valorI;
        this.fechaI = fechaI;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContextoI() {
        return contextoI;
    }

    public void setContextoI(String contextoI) {
        this.contextoI = contextoI;
    }

    public String getValorI() {
        return valorI;
    }

    public void setValorI(String valorI) {
        this.valorI = valorI;
    }

    public String getFechaI() {
        return fechaI;
    }

    public void setFechaI(String fechaI) {
        this.fechaI = fechaI;
    }
}

