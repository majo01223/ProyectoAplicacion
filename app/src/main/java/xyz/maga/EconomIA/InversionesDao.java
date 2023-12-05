package xyz.maga.EconomIA;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import xyz.maga.EconomIA.BaseDeDatos.TablaInversiones;

@Dao
public interface InversionesDao {
    @Query("SELECT* FROM tablaInversiones")
    List<TablaInversiones> getAll();
    @Query("SELECT * FROM tablaInversiones WHERE contextoIn LIKE :contextoIn LIMIT 1")
    TablaInversiones findByName(String contextoIn);
    @Insert
    long insert(TablaInversiones tablaInversiones);
}
