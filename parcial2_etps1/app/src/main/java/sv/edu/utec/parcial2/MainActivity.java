package sv.edu.utec.parcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button btnMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMostrar=findViewById(R.id.btnMostrar);
    }

    public void mostrar(View view){
        Intent intento=new Intent(getApplicationContext(),Principal.class);
        startActivity(intento);
    }


}