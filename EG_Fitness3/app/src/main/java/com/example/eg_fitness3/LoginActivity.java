package com.example.eg_fitness3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {
    EditText emailEditText, passwordEditText;
    Button continueButton, loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        emailEditText=findViewById(R.id.emailEditText);
        passwordEditText=findViewById(R.id.passwordEditText);
        continueButton=findViewById(R.id.continueButton);
        loginButton=findViewById(R.id.openSignupButton);
        loginButton.setOnClickListener(view -> {
            Intent intent=new Intent(LoginActivity.this, SignupActivity.class);
            startActivity(intent);
        });
        continueButton.setOnClickListener(view -> signUp());
    }

    private void signUp() {
        String email=emailEditText.getText().toString();
        String password=passwordEditText.getText().toString();
        if (email.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "please enter email and password", Toast.LENGTH_SHORT).show();
            return;
        }
        FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(task2 -> {
                    if (task2.isSuccessful()) {
                        Toast.makeText(this,
                                "User logged in successfully",
                                Toast.LENGTH_LONG).show();
                        startActivity(new Intent(LoginActivity.this, HomeActivity.class));
                    } else {
                        Toast.makeText( this,
                                "Error: "+ task2.getException().getLocalizedMessage(), Toast.LENGTH_LONG).show();
                    }
                });
    }
}