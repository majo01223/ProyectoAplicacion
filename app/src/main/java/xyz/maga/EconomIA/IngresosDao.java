package xyz.maga.EconomIA;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import xyz.maga.EconomIA.BaseDeDatos.TablaIngresos;

@Dao
public interface IngresosDao {
    @Query("SELECT* FROM tablaIngresos")
    List<TablaIngresos> getAll();
    @Query("SELECT * FROM tablaIngresos WHERE contextoI LIKE :contextoI LIMIT 1")
    TablaIngresos findByName(String contextoI);
    @Insert
    long insert(TablaIngresos tablaIngresos);
}