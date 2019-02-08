package snehal.practicephp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    TextView signupText;
    EditText emailEdittext, passwordEdittext;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        signupText = findViewById(R.id.signup);
        emailEdittext = findViewById(R.id.email);
        passwordEdittext = findViewById(R.id.password);
        loginButton = findViewById(R.id.signin);
    }

    public void newUser(View view) {
        Intent reg = new Intent(getApplicationContext(),RegisterActivity.class);
        startActivity(reg);
    }

}
