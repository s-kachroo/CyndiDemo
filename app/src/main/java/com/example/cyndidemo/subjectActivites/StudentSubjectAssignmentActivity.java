package com.example.cyndidemo.subjectActivites;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cyndidemo.R;

public class StudentSubjectAssignmentActivity extends AppCompatActivity {
    private String subjectName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_subject_assignment);

        TextView headingTextView = findViewById(R.id.tv_student_subject_assignment_heading);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            subjectName = extras.getString("subjectName");
        }
    }
}