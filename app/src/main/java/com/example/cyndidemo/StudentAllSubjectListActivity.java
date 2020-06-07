package com.example.cyndidemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cyndidemo.adapters.StudentAllSubjectAdapter;
import com.example.cyndidemo.model.StudentSubjectModel;

import java.util.ArrayList;

public class StudentAllSubjectListActivity extends AppCompatActivity {
    private ArrayList<StudentSubjectModel> studentSubjectModelArrayList;
    private StudentAllSubjectAdapter studentAllSubjectAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_all_subject_list);

        studentSubjectModelArrayList = new ArrayList<>();

        studentSubjectModelArrayList.add(new StudentSubjectModel("Data Structure", "CE-401C", "Mr. Cornell Steve", true, System.currentTimeMillis()));
        studentSubjectModelArrayList.add(new StudentSubjectModel("Operating System", "CE-414C", "Mr. Bill Gates", false, System.currentTimeMillis()));
        studentSubjectModelArrayList.add(new StudentSubjectModel("Human Values", "HR-201C", "Mr. Donald Trump", false, System.currentTimeMillis()));
        studentSubjectModelArrayList.add(new StudentSubjectModel("System Design", "SE-701C", "Mr. Dennis Rich", true, System.currentTimeMillis()));
        studentSubjectModelArrayList.add(new StudentSubjectModel("Database Management", "CE-471C", "Mr. Steve Johnson", false, System.currentTimeMillis()));
        studentSubjectModelArrayList.add(new StudentSubjectModel("Mathematics", "GEN-627C", "Mr. Ramanujan", false, System.currentTimeMillis()));
        studentSubjectModelArrayList.add(new StudentSubjectModel("Machine Learning", "ML-476C", "Mr. Andrew NG", true, System.currentTimeMillis()));
        studentSubjectModelArrayList.add(new StudentSubjectModel("Statistics", "ML-370D", "Mr. Andrew NG", false, System.currentTimeMillis()));
        studentSubjectModelArrayList.add(new StudentSubjectModel("OOPS", "IT-400C", "Mr. Robert Jamey", false, System.currentTimeMillis()));

        RecyclerView studentAllSubjectsListRecyclerView = findViewById(R.id.rv_student_all_subjects_list);
        studentAllSubjectsListRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        studentAllSubjectAdapter = new StudentAllSubjectAdapter(studentSubjectModelArrayList, StudentAllSubjectListActivity.this);
        studentAllSubjectsListRecyclerView.setAdapter(studentAllSubjectAdapter);
    }
}