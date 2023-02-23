package sv.edu.utec.login;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText etUser, etContra;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       btnLogin=findViewById(R.id.btnLogin);
       etUser = findViewById(R.id.edtUsername);
       etContra = findViewById(R.id.edtPass);

    }

    public void login(View view){
        String user, contrasena;
        user = etUser.getText().toString();
        contrasena = etContra.getText().toString();

        if (user.equals("parcialETps1") && contrasena.equals("p4rC14l#tp$")){

            btnLogin=findViewById(R.id.btnLogin);
            btnLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intento=new Intent(getApplicationContext(),Pantalla.class);
                    startActivity(intento);
                }
            });
        }else {
            Toast mensaje= Toast.makeText(this,"Contraseña y Usuario no son correctos",Toast.LENGTH_SHORT);
            mensaje.show();
        }
    }

}