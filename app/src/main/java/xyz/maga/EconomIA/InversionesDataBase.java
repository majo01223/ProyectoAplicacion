package xyz.maga.EconomIA;
import androidx.room.Database;
import androidx.room.RoomDatabase;

import xyz.maga.EconomIA.BaseDeDatos.TablaInversiones;

@Database(entities = {TablaInversiones.class}, version=1)
public abstract class InversionesDataBase extends RoomDatabase {
    public abstract InversionesDao inversionesDao();

}