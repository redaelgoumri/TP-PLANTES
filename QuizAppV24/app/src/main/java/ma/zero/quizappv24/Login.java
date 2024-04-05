package ma.zero.quizappv24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText etLogin, etPassword;
    Button bLogin;
    TextView tvRegister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etLogin = (EditText) findViewById(R.id.etLogin);
        etPassword = (EditText) findViewById(R.id.etPassword);
        bLogin = (Button) findViewById(R.id.bLogin);
        tvRegister = (TextView) findViewById(R.id.tvRegister);

        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Step 4: Traitement
                if (etLogin.getText().toString().equals("toto") && etPassword.getText().toString().equals("123")){
                    startActivity(new Intent(Login.this, Quiz1.class));
                }
                else {
                    Toast.makeText(getApplicationContext(),"Login or password incorrect !",Toast.LENGTH_SHORT).show();
                }
            }
        });
        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Step 4: Traitement
                startActivity(new Intent(Login.this, Register.class));
            }
        });

    }
}