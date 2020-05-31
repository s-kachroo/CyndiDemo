package com.example.cyndidemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class StudentAllSubjectListActivity extends AppCompatActivity {
    private ArrayList<StudentSubjectModel> studentSubjectModelArrayList;
    private StudentAllSubjectAdapter studentAllSubjectAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_all_subject_list);

        studentSubjectModelArrayList = new ArrayList<>();

        studentSubjectModelArrayList.add(new StudentSubjectModel("DATA STRUCTURES"));
        studentSubjectModelArrayList.add(new StudentSubjectModel("MATHEMATICS"));
        studentSubjectModelArrayList.add(new StudentSubjectModel("OPERATING SYSTEMS"));
        studentSubjectModelArrayList.add(new StudentSubjectModel("SYSTEM DESIGN"));
        studentSubjectModelArrayList.add(new StudentSubjectModel("COMPUTER NETWORKS"));
        studentSubjectModelArrayList.add(new StudentSubjectModel("DATABASES"));
        studentSubjectModelArrayList.add(new StudentSubjectModel("PHYSICS"));

        RecyclerView studentAllSubjectsListRecyclerView = findViewById(R.id.rv_student_all_subjects_list);
        studentAllSubjectsListRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        studentAllSubjectAdapter = new StudentAllSubjectAdapter(studentSubjectModelArrayList, StudentAllSubjectListActivity.this);
        studentAllSubjectsListRecyclerView.setAdapter(studentAllSubjectAdapter);
    }
}