package com.example.eg_fitness3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    Button btnExc, btnVid, btnLog, btnret, btnRun, btnInfo, btnBMI;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnExc = findViewById(R.id.btnExc);
        btnVid = findViewById(R.id.btnVid);
        btnLog = findViewById(R.id.btnLog);
        btnret = findViewById(R.id.btnret);
        btnRun = findViewById(R.id.btnRun);
        btnInfo = findViewById(R.id.btnInfo);
        btnBMI = findViewById(R.id.btnBMI);

        // Set click listeners for each button
        btnExc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click event for "תרגילים" button (Exercises)
                // You can add your desired action here, like opening a new activity
                // or performing some logic related to exercises.
                Toast.makeText(HomeActivity.this, "Exercises button clicked!", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(HomeActivity.this, ExerciseActivity.class);
                startActivity(intent);
            }
        });

        btnVid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click event for "צילום סרטון אישי" button (Personal Video Recording)
                // You can add your desired action here, like opening the camera or
                // handling video recording logic.
                Toast.makeText(HomeActivity.this, "Personal Video Recording button clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        // Implement similar click listeners for the remaining buttons
        // following the same pattern

        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click event for "הזנת נתונים" button (Data Entry)
                Toast.makeText(HomeActivity.this, "Data Entry button clicked!", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(HomeActivity.this, DataInsertActivity.class);
                startActivity(intent);
            }
        });

        btnret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click event for "חזור" button (Back)
                Toast.makeText(HomeActivity.this, "Back button clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click event for "הזנת ריצה/הליכה" button (Running/Walking Entry)
                Toast.makeText(HomeActivity.this, "Running/Walking Entry button clicked!", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(HomeActivity.this, Run_Activity.class);
                startActivity(intent);
            }
        });

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click event for "דוח מידע" button (Information Report)
                Toast.makeText(HomeActivity.this, "Information Report button clicked!", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(HomeActivity.this, ActivityLog.class);
                startActivity(intent);
            }
        });

        btnBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click event for "מחשבון BMI" button (BMI Calculator)
                Toast.makeText(HomeActivity.this, "BMI Calculator button clicked!", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(HomeActivity.this, BMIActivity.class);
                startActivity(intent);
            }
        });
    }
}