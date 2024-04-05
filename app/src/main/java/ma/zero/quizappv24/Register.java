package ma.zero.quizappv24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    EditText etMail, etPassword, etPassword1;
    Button bRegister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etMail = findViewById(R.id.etMail);
        etPassword = findViewById(R.id.etPassword);
        etPassword1 = findViewById(R.id.etPassword1);
        bRegister = findViewById(R.id.bRegister);

        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail = etMail.getText().toString();
                String password = etPassword.getText().toString();
                String password1 = etPassword1.getText().toString();
                if (TextUtils.isEmpty(mail) || TextUtils.isEmpty(password) || TextUtils.isEmpty(password1)) {
                    Toast.makeText(getApplicationContext(), "Please fill in all the required fields", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (password.length() < 6) {
                    Toast.makeText(getApplicationContext(), "Password must be at least 6 characters", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (!password.equals(password1)) {
                    Toast.makeText(getApplicationContext(), "Passwords do not match", Toast.LENGTH_SHORT).show();
                    return;
                }
                // Assuming you want to show a success message after successful registration
                Toast.makeText(getApplicationContext(), "Registration Successful!", Toast.LENGTH_SHORT).show();

                // Start the LoginActivity
                startActivity(new Intent(Register.this, Login.class));

                // Finish the RegisterActivity
                finish();
            }
        });
    }
}
