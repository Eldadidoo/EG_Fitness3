package com.example.eg_fitness3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;
import android.app.Activity;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ExerciseActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        Button btnret=findViewById(R.id.btnreturn);
        Button btnChest = findViewById(R.id.btnchest);
        Button btnBack = findViewById(R.id.btnback);
        Button btnTricep = findViewById(R.id.btntri);
        Button btnBicep = findViewById(R.id.btnbi);
        Button btnLeg = findViewById(R.id.btnleg);
        Button btnAbs = findViewById(R.id.btnabs);
        Button btnShoulder = findViewById(R.id.btnshoulder);

        WebView webView= findViewById(R.id.webView);
        String vidChest="<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/4Y2ZdHCOXok?si=FeDPm2-3N-igC1If\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        String vidBack="<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/CAwf7n6Luuc?si=fO4qVKBMGbdWqq4q\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        String vidTri="<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/-zLyUAo1gMw?si=int-IbrnwmS3AOvL\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        String vidBi="<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ykJmrZ5v0Oo?si=_nzcG42i8tqbhEZx\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        String vidLeg="<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ljO4jkwv8wQ?si=ILqRfX9SlUWiMSgQ\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        String vidAbs="<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/5ER5Of4MOPI?si=IdBhyezWF2BWe27C\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        String vidSho="<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/0JfYxMRsUCQ?si=22mroXIRvXzbkpBj\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());

        btnChest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ExerciseActivity.this, "Chest Exercises Selected", Toast.LENGTH_SHORT).show();
                webView.loadData(vidChest, "text/html", "utf-8");
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ExerciseActivity.this, "Back Exercises Selected", Toast.LENGTH_SHORT).show();
                webView.loadData(vidBack, "text/html", "utf-8");
            }
        });

        btnTricep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ExerciseActivity.this, "Tricep Exercises Selected", Toast.LENGTH_SHORT).show();
                webView.loadData(vidTri, "text/html", "utf-8");
            }
        });
        btnBicep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ExerciseActivity.this, "Bicep Exercises Selected", Toast.LENGTH_SHORT).show();
                webView.loadData(vidBi, "text/html", "utf-8");
            }
        });
        btnLeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ExerciseActivity.this, "Leg Exercises Selected", Toast.LENGTH_SHORT).show();
                webView.loadData(vidLeg, "text/html", "utf-8");
            }
        });
        btnAbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ExerciseActivity.this, "ABS Exercises Selected", Toast.LENGTH_SHORT).show();
                webView.loadData(vidAbs, "text/html", "utf-8");
            }
        });
        btnShoulder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ExerciseActivity.this, "Shoulder Exercises Selected", Toast.LENGTH_SHORT).show();
                webView.loadData(vidSho, "text/html", "utf-8");
            }
        });
        btnret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ExerciseActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}