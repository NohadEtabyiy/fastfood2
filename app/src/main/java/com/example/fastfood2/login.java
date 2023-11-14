package com.example.fastfood2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class login extends AppCompatActivity {

    private EditText editTextMatricul;
    private EditText editTextPassword;
    private Button btnLogin;

    private TextView errmsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextMatricul = findViewById(R.id.editTextMatricul);
        editTextPassword = findViewById(R.id.editTextPassword);
        btnLogin = findViewById(R.id.btnLogin);
        errmsg = findViewById(R.id.textVie);

        // Create a User object and add it to the list of users
        User user = new User("admin", "admin");
        User.addUser(user);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String matricul = editTextMatricul.getText().toString();
                String password = editTextPassword.getText().toString();

                // Perform login validation
                if (validateLogin(matricul, password)) {
                    // Successful login
                    Toast.makeText(login.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(login.this, Home.class);
                    startActivity(intent);
                    // Proceed to the next activity or perform necessary actions
                } else {
                    // Invalid credentials
                    errmsg.setText("Matricule ou mot de passe incorrect");
                }
            }
        });
    }

    private boolean validateLogin(String matricul, String password) {
        // Retrieve the list of users from the User class
        List<User> usersList = User.getUsersList();
        for (User user : usersList) {
            // Check if input matches any user's credentials
            if (user.getMatricul().equals(matricul) && user.getPassword().equals(password)) {
                return true; // Login successful
            }
        }
        return false; // Login failed
    }
}
