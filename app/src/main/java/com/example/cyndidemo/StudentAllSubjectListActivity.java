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

        studentSubjectModelArrayList.add(new StudentSubjectModel("Data Structure", "CE-401C", "Mr. Cornell Steve","08/05/2020 8:30 AM" , true, System.currentTimeMillis()));
        studentSubjectModelArrayList.add(new StudentSubjectModel("Operating System", "CE-414C", "Mr. Bill Gates", "08/03/2020 11:30 AM", false, System.currentTimeMillis()));
        studentSubjectModelArrayList.add(new StudentSubjectModel("Human Values", "HR-201C", "Mr. Donald Trump", "08/05/2020 4:30 PM",false, System.currentTimeMillis()));
        studentSubjectModelArrayList.add(new StudentSubjectModel("System Design", "SE-701C", "Mr. Dennis Rich", "08/06/2020 10:30 AM",true, System.currentTimeMillis()));
        studentSubjectModelArrayList.add(new StudentSubjectModel("Database Management", "CE-471C", "Mr. Steve Johnson", "08/04/2020 12:30 PM",false, System.currentTimeMillis()));
        studentSubjectModelArrayList.add(new StudentSubjectModel("Mathematics", "GEN-627C", "Mr. Ramanujan", "07/29/2020 7:30 PM", false, System.currentTimeMillis()));
        studentSubjectModelArrayList.add(new StudentSubjectModel("Machine Learning", "ML-476C", "Mr. Andrew NG", "08/06/2020 3:00 PM", true, System.currentTimeMillis()));
        studentSubjectModelArrayList.add(new StudentSubjectModel("Statistics", "ML-370D", "Mr. Andrew NG", "08/06/2020 9:30 AM", false, System.currentTimeMillis()));
        studentSubjectModelArrayList.add(new StudentSubjectModel("OOPS", "IT-400C", "Mr. Robert Jamey", "08/04/2020 8:30 PM", false, System.currentTimeMillis()));

        RecyclerView studentAllSubjectsListRecyclerView = findViewById(R.id.rv_student_all_subjects_list);
        studentAllSubjectsListRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        studentAllSubjectAdapter = new StudentAllSubjectAdapter(studentSubjectModelArrayList, StudentAllSubjectListActivity.this);
        studentAllSubjectsListRecyclerView.setAdapter(studentAllSubjectAdapter);
    }
}