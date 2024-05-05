package com.example.eg_fitness3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class SignupActivity extends AppCompatActivity {
    EditText emailEditText, passwordEditText;
    Button continueButton, loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emailEditText=findViewById(R.id.emailEditText);
        passwordEditText=findViewById(R.id.passwordEditText);
        continueButton=findViewById(R.id.continueButton);
        loginButton=findViewById(R.id.openloginButton);
        loginButton.setOnClickListener(view -> {
            Intent intent=new Intent(SignupActivity.this,LoginActivity.class);
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
        FirebaseAuth.getInstance().createUserWithEmailAndPassword(email,
                        password)
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        Toast.makeText(this,
                                "User created successfully",
                                Toast.LENGTH_LONG).show();
                        startActivity(new Intent(SignupActivity.this, SplashActivity.class));
                    } else {
                        Toast.makeText( this,
                                "Error: "+ task.getException().getLocalizedMessage(), Toast.LENGTH_LONG).show();
                    }
                });
    }
}