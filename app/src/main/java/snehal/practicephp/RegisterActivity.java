package snehal.practicephp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    EditText nameRegister, userRegister, passwordRegister, confirmPasswordRegister;
    String fullname, username, password, confirm_password;
    String method = "register";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        nameRegister = findViewById(R.id.reg_fullname);
        userRegister = findViewById(R.id.reg_user);
        passwordRegister = findViewById(R.id.reg_password);
        confirmPasswordRegister = findViewById(R.id.reg_conf_password);

    }

    public void addData(View view) {
        fullname = nameRegister.getText().toString();
        username = userRegister.getText().toString();
        password = passwordRegister.getText().toString();
        confirm_password = confirmPasswordRegister.getText().toString();

        InsertDataBackgroundTask backgroundTask = new InsertDataBackgroundTask(this);
        backgroundTask.execute(method, fullname, username, password, confirm_password);
        finish();

    }

    public void delData(View view) {
        username = userRegister.getText().toString();
        DeleteDataBackgroundTask deleteBackgroundTask = new DeleteDataBackgroundTask(this);
        deleteBackgroundTask.execute(method, fullname, username, password, confirm_password);
    }

    public void backLog(View view) {
        Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
        startActivity(intent);
    }
}
