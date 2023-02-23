package sv.edu.utec.parcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Principal extends AppCompatActivity {

    ArrayList<Personas> listapersonas;
    ListView lv1;
    Integer[]ImgPpersonas={
            R.drawable.lead_photo_1,
            R.drawable.lead_photo_2,
            R.drawable.lead_photo_3,
            R.drawable.lead_photo_4,
            R.drawable.lead_photo_5,
            R.drawable.lead_photo_6,
            R.drawable.lead_photo_7,
            R.drawable.lead_photo_8,
            R.drawable.lead_photo_9,
            R.drawable.lead_photo_10
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        listapersonas = new ArrayList<Personas>();
        listapersonas.add(new Personas("Alexander Pierrot", "CEO", "Insures S.O."));
        listapersonas.add(new Personas("Carlos Lopez", "Asistente","Hospital Blue"));
        listapersonas.add(new Personas("Sara Bonz", "Directora de Marketing","Electrical Parts Itd"));
        listapersonas.add(new Personas("Liliana Clarence", "Diseñadora de Producto","Creativa App"));
        listapersonas.add(new Personas("Benito Peralta", "Supervisor de Ventas","Neumàticos Press"));
        listapersonas.add(new Personas("Juan Jaramillo", "CEO","Banco Nacional"));
        listapersonas.add(new Personas("Christian Steps", "CTO","Cooperativa Verde"));
        listapersonas.add(new Personas("Alexa Giraldo", "Lead Programmer", "Frutisofy"));
        listapersonas.add(new Personas("Linda Murillo", "Directora de Marketing","Seguros Boliver"));
        listapersonas.add(new Personas("Lizeth Astrada", "CEO","Concesionario Motolox"));

        AdaptadorPersonas adaptador = new AdaptadorPersonas(this, listapersonas, ImgPpersonas);
        lv1 = findViewById(R.id.IsvPersonas);
        lv1.setAdapter(adaptador);
    }
}