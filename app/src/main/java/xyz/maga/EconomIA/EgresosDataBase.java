package xyz.maga.EconomIA;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import xyz.maga.EconomIA.BaseDeDatos.TablaEgresos;

@Database(entities = {TablaEgresos.class}, version=1)
public abstract class EgresosDataBase extends RoomDatabase {
    public abstract EgresosDao egresosDao();

}
