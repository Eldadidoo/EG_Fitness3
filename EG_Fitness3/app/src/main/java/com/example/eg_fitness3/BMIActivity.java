package com.example.eg_fitness3;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class BMIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView BmiCalcTV;
        String SWeight, SHeight;
        String Text=null;
        Integer Weight, Height;
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bmiactivity);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        BmiCalcTV=findViewById(R.id.BmiCalc);
        SWeight=UserService.myUser.getWeight();
        SHeight=UserService.myUser.getHeight();
        Weight = Integer.parseInt(SWeight);
        Height = Integer.parseInt(SHeight);
        if ((Weight/(Height*Height))<18.5){
            Text="You are underweight";
        }
        else if ((Weight/(Height*Height))>18.5 && (Weight/(Height*Height))<24.9){
            Text="You are normal weight";
        }
        else if ((Weight/(Height*Height))>25 && (Weight/(Height*Height))<29.9){
            Text="You are overweight";
        } else if ((Weight/(Height*Height))>29.9) {
            Text="You are obese";
        }
        BmiCalcTV.setText("Your BMI is:" + Weight/(Height*Height) + "," + Text);
    }
}