package xyz.maga.EconomIA.BaseDeDatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BDCreada extends SQLiteOpenHelper {

    private static final int BdeD_version = 2;
    private static final String BdeD_nombre = "agenda.db";
    public static final String tablaContactos = "t_contactos";


    public BDCreada(@Nullable Context context) {
        super(context, BdeD_nombre, null, BdeD_version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE " + tablaContactos + "(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "usuario TEXT NOT NULL," +
                "contraseña TEXT NOT NULL," +
                "correo TEXT NOT NULL)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE " + tablaContactos);
        onCreate(sqLiteDatabase);
    }
}
