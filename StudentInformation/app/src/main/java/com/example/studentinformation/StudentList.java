package com.example.studentinformation;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class StudentList extends AppCompatActivity {

    private Button atik, fahim, sakib, likhon, zarrin;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_student_list);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        atik = findViewById(R.id.atik);
        sakib = findViewById(R.id.sakib);
        fahim = findViewById(R.id.fahim);
        likhon = findViewById(R.id.likhon);
        zarrin = findViewById(R.id.zarrin);

        atik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudentList.this, StudentDetails.class);
                intent.putExtra("student", "atik");
                startActivity(intent);
            }
        });

        sakib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudentList.this, StudentDetails.class);
                intent.putExtra("student", "sakib");
                startActivity(intent);
            }
        });

        fahim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudentList.this, StudentDetails.class);
                intent.putExtra("student", "fahim");
                startActivity(intent);
            }
        });

        likhon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudentList.this, StudentDetails.class);
                intent.putExtra("student", "likhon");
                startActivity(intent);
            }
        });

        zarrin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudentList.this, StudentDetails.class);
                intent.putExtra("student", "zarrin");
                startActivity(intent);
            }
        });


    }
}