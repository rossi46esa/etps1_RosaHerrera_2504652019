package sv.edu.utec.parcial4.datos;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class baseHelper extends SQLiteOpenHelper {

    private static final int VERSION_BASEDATOS=1;
    private static final String NOMBRE_BASE="Parcial4.db";
    private static final String NOMBRE_TABLACl="t_MD_Clientes";
    private static final String NOMBRE_TABLACV="t_MD_ClienteVehiculo";
    private static final String NOMBRE_TABLAV="t_MD_Vehiculos";

    public baseHelper(@Nullable Context context) {
        super(context, NOMBRE_BASE, null, VERSION_BASEDATOS);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+ NOMBRE_TABLACl+ "("+
                "ID_Cliente INTEGER PRIMARY KEY AUTOINCREMENT ,"+
                "sNombreCliente TEXT NOT NULL ,"+
                "sApellidosCliente TEXT NOT NULL ,"+
                "sDireccionCliente TEXT NOT NULL,"+
                "sCiudadCliente TEXT NOT NULL"
                +")");

        db.execSQL("CREATE TABLE "+ NOMBRE_TABLACV+ "("+
                "ID_Vehiculo INTEGER PRIMARY KEY AUTOINCREMENT ,"+
                "sMarca TEXT NOT NULL ,"+
                "sModelo TEXT NOT NULL"
                +")");

        db.execSQL("CREATE TABLE "+ NOMBRE_TABLAV+ "("+
                "ID_Cliente INTEGER PRIMARY KEY AUTOINCREMENT ,"+
                "ID_Vehiculo INTEGER PRIMARY KEY AUTOINCREMENT ,"+
                "sMatricula TEXT NOT NULL ,"+
                "iKilometros TEXT NOT NULL"
                +")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE "+NOMBRE_TABLACl);
        db.execSQL("DROP TABLE "+NOMBRE_TABLACV);
        db.execSQL("DROP TABLE "+NOMBRE_TABLAV);

        onCreate(db);
    }
}
