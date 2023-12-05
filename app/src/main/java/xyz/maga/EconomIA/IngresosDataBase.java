package xyz.maga.EconomIA;
import androidx.room.Database;
import androidx.room.RoomDatabase;

import xyz.maga.EconomIA.BaseDeDatos.TablaIngresos;

@Database(entities = {TablaIngresos.class}, version=1)
public abstract class IngresosDataBase extends RoomDatabase {
    public abstract IngresosDao ingresosDao();

}
