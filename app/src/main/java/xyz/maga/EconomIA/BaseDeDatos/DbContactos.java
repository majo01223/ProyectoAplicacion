package xyz.maga.EconomIA.BaseDeDatos;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import org.jetbrains.annotations.Nullable;

public class DbContactos extends BDCreada{

    Context context;
    public DbContactos(@Nullable Context context){
        super(context);
        this.context =context;
    }
    public long insertaContacto(String usuario, String contraseña, String correo) {
        long id = 0;
        try {
            BDCreada bdCreada = new BDCreada(context);
            SQLiteDatabase db = bdCreada.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put("usuario", usuario);
            values.put("contraseña", contraseña);
            values.put("correo", correo);

            id = db.insert(tablaContactos, null, values);

        } catch (Exception ex) {
            ex.toString();
        }
        return id;
    }

}



