package com.example.cyndidemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.cyndidemo.subjectActivites.StudentSubjectAssessmentActivity;
import com.example.cyndidemo.subjectActivites.StudentSubjectAssignmentActivity;
import com.example.cyndidemo.subjectActivites.StudentSubjectClassScheduleActivity;
import com.example.cyndidemo.subjectActivites.StudentSubjectLiveClassActivity;
import com.example.cyndidemo.subjectActivites.StudentSubjectResourceActivity;

public class StudentEachSubjectActivity extends AppCompatActivity {
    private String subjectName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_each_subject);

        TextView subjectNameTV = findViewById(R.id.tv_single_subject_name);
        CardView subjectResourceCV = findViewById(R.id.cv_subject_resource);
        CardView subjectAssessmentCV = findViewById(R.id.cv_subject_assessments);
        CardView subjectAssignmentsCV = findViewById(R.id.cv_subject_assignments);
        CardView classScheduleCV = findViewById(R.id.cv_subject_class_schedule);
        CardView liveClassCV = findViewById(R.id.cv_subject_live_class);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            subjectName = extras.getString("subjectName");
        }
        subjectNameTV.setText(subjectName);

        subjectResourceCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(StudentEachSubjectActivity.this, StudentSubjectResourceActivity.class);
                i.putExtra("subjectName", subjectName);
                startActivity(i);
            }
        });

        subjectAssignmentsCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(StudentEachSubjectActivity.this, StudentSubjectAssignmentActivity.class);
                i.putExtra("subjectName", subjectName);
                startActivity(i);
            }
        });

        subjectAssessmentCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(StudentEachSubjectActivity.this, StudentSubjectAssessmentActivity.class);
                i.putExtra("subjectName", subjectName);
                startActivity(i);
            }
        });

        classScheduleCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(StudentEachSubjectActivity.this, StudentSubjectClassScheduleActivity.class);
                i.putExtra("subjectName", subjectName);
                startActivity(i);
            }
        });

        liveClassCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(StudentEachSubjectActivity.this, StudentSubjectLiveClassActivity.class);
                i.putExtra("subjectName", subjectName);
                startActivity(i);
            }
        });
    }
}