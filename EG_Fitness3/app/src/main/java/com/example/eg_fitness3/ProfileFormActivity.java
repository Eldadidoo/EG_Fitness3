package com.example.eg_fitness3;

import static android.widget.Toast.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProfileFormActivity extends AppCompatActivity {
    String[] gender = {"נקבה", "זכר"};
    Button continueButton;
    EditText firstnameet, lastnameet, weightet, heightet, birthdateet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_form);
        firstnameet = findViewById(R.id.firstNameEditText);
        lastnameet = findViewById(R.id.lastNameEditText);
        weightet = findViewById(R.id.weightEditText);
        heightet = findViewById(R.id.heightEditText);
        birthdateet = findViewById(R.id.editTextDate);
        Spinner spinner = findViewById(R.id.genderSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.genderspinner, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                String value = parent.getItemAtPosition(i).toString();
                Toast.makeText(ProfileFormActivity.this, value, LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        continueButton = findViewById(R.id.finishButton); // Replace with your Button ID
        continueButton.setOnClickListener(v -> {
            SimpleDateFormat sdf= new SimpleDateFormat("yyyy-dd-MM");
            String birthdate=sdf.format(new Date());
            String firstName = firstnameet.getText().toString();
            String lastName = lastnameet.getText().toString();
            String weight = weightet.getText().toString();
            String height= heightet.getText().toString();
            Date birthDate = (Date) birthdateet.getText();
            String gender = spinner.getSelectedItem().toString();
            UserProfile userProfile = new UserProfile(firstName, lastName, weight, height, birthDate, gender);
            UserService.setMyUser(userProfile).addOnCompleteListener(task -> {
                if (task.isSuccessful()) {
                    startActivity(new Intent(ProfileFormActivity.this, HomeActivity.class));
                } else {
                    Toast.makeText(ProfileFormActivity.this, "Error: " + task.getException().getLocalizedMessage(), Toast.LENGTH_LONG).show();
                }
            });
        });
    }
}