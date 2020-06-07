package com.example.cyndidemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class StudentSubjectCourseContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_content);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String subjectName = extras.getString("subjectname");
            Toast.makeText(this, subjectName, Toast.LENGTH_SHORT).show();
        }

    }
}