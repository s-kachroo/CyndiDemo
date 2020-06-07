package com.example.cyndidemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView courseContentCardView, assignmentsCardView, attendanceCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        courseContentCardView = findViewById(R.id.cv_course_content);
        assignmentsCardView = findViewById(R.id.cv_assignments);
        attendanceCardView = findViewById(R.id.cv_attendance);

        courseContentCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, StudentAllSubjectListActivity.class);
                i.putExtra("screen","course");
                startActivity(i);
            }
        });

        assignmentsCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, StudentAllSubjectListActivity.class);
                i.putExtra("screen","assignment");
                startActivity(i);
            }
        });

        attendanceCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, StudentAttendanceReportActivity.class);
                startActivity(i);
            }
        });
    }
}