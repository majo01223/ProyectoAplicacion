package xyz.maga.EconomIA;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import xyz.maga.EconomIA.BaseDeDatos.TablaEgresos;

@Dao
public interface EgresosDao {
    @Query("SELECT* FROM tablaEgresos")
    List<TablaEgresos> getAll();
    @Query("SELECT * FROM tablaEgresos WHERE contextoE LIKE :contextoE LIMIT 1")
    TablaEgresos findByName(String contextoE);
    @Insert
    long insert(TablaEgresos tablaEgresos);
}
