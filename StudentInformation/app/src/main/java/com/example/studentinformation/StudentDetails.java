package com.example.studentinformation;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class StudentDetails extends AppCompatActivity {

    private ImageView profile;
    private TextView name, details, details2;

    @SuppressLint({"SetTextI18n", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_student_details);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        profile = findViewById(R.id.profile);
        name = findViewById(R.id.name);
        details = findViewById(R.id.details);
        details2 = findViewById(R.id.details2);

        Bundle bundle = getIntent().getExtras();
        assert bundle != null;
        String title = bundle.getString("student");

        assert title != null;

        if(title.equals("fahim")){
            profile.setImageResource(R.drawable.fahim);
            name.setText("Mazhar Uddin Fahim");
            details.setText("University: DIU\nDepartment: SWE\nCGPA: 3.24\nHome town: Narsingdi");
            details2.setText(R.string.fahim);
        }
        else if (title.equals("zarrin")){
            profile.setImageResource(R.drawable.zarrin);
            name.setText("Zarrin Tasmin Khan");
            details.setText("University: DIU\nDepartment: CSE\nCGPA: 3.34\nHome town: Rangpur");
            details2.setText(R.string.zarrin);
        }
        else if (title.equals("atik")){
            profile.setImageResource(R.drawable.atik);
            name.setText("Atikur Rahman Atik");
            details.setText("University: IUBAT\nDepartment: CSE\nCGPA: 3.16\nHome town: Narsingdi");
            details2.setText(R.string.atik);
        }
        else if (title.equals("sakib")){
            profile.setImageResource(R.drawable.sakib);
            name.setText("Sadekul Hasan Sakib");
            details.setText("University: DIU\nDepartment: CSE\nCGPA: 3.58\nHome town: Munshiganj");
            details2.setText(R.string.sakib);
        }
        else if (title.equals("likhon")){
            profile.setImageResource(R.drawable.likhon);
            name.setText("Rafi Al Islam");
            details.setText("University: NSU\nDepartment: CSE\nCGPA: 2.95\nHome town: Narsingdi");
            details2.setText(R.string.likhon);
        }

    }
}