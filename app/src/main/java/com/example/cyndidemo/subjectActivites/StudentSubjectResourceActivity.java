package com.example.cyndidemo.subjectActivites;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.cyndidemo.R;
import com.example.cyndidemo.StudentAllSubjectListActivity;
import com.example.cyndidemo.adapters.StudentAllSubjectAdapter;
import com.example.cyndidemo.adapters.StudentSubjectResourceAdapter;
import com.example.cyndidemo.model.StudentSubjectModel;
import com.example.cyndidemo.model.StudentSubjectResourceModel;

import java.util.ArrayList;

public class StudentSubjectResourceActivity extends AppCompatActivity {
    private ArrayList<StudentSubjectResourceModel> studentSubjectResourceModelArrayList;
    private StudentSubjectResourceAdapter studentSubjectResourceAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_content);

        studentSubjectResourceModelArrayList = new ArrayList<>();

        studentSubjectResourceModelArrayList.add(new StudentSubjectResourceModel("File.apk", "9.2 MB", "APK", "06/08/2020", System.currentTimeMillis()));
        studentSubjectResourceModelArrayList.add(new StudentSubjectResourceModel("Maths.pdf", "2.3 MB", "PDF", "06/07/2020", System.currentTimeMillis()));
        studentSubjectResourceModelArrayList.add(new StudentSubjectResourceModel("Passwords.pdf", "2.6 MB", "PDF", "06/07/2020", System.currentTimeMillis()));
        studentSubjectResourceModelArrayList.add(new StudentSubjectResourceModel("Debug.apk", "7.6 MB", "APK", "06/06/2020", System.currentTimeMillis()));
        studentSubjectResourceModelArrayList.add(new StudentSubjectResourceModel("Cyndi.apk", "8.0 MB", "APK", "06/05/2020", System.currentTimeMillis()));
        studentSubjectResourceModelArrayList.add(new StudentSubjectResourceModel("Physics.pdf", "0.4 MB", "PDF", "06/03/2020", System.currentTimeMillis()));
        studentSubjectResourceModelArrayList.add(new StudentSubjectResourceModel("Calculator.apk", "90.4 MB", "APK", "06/02/2020", System.currentTimeMillis()));
        studentSubjectResourceModelArrayList.add(new StudentSubjectResourceModel("DBMS.pdf", "2.7 MB", "PDF", "06/01/2020", System.currentTimeMillis()));
        studentSubjectResourceModelArrayList.add(new StudentSubjectResourceModel("Show.xlsx", "0.4 MB", "XLSX", "05/29/2020", System.currentTimeMillis()));
        studentSubjectResourceModelArrayList.add(new StudentSubjectResourceModel("Data.apk", "0.2 MB", "APK", "05/27/2020", System.currentTimeMillis()));
        studentSubjectResourceModelArrayList.add(new StudentSubjectResourceModel("DS.xlsx", "0.3 MB", "XLSX", "05/23/2020", System.currentTimeMillis()));
        studentSubjectResourceModelArrayList.add(new StudentSubjectResourceModel("Charts.apk", "0.9 MB", "APK", "05/18/2020", System.currentTimeMillis()));
        studentSubjectResourceModelArrayList.add(new StudentSubjectResourceModel("OOPS.docx", "2.4 MB", "DOCX", "05/15/2020", System.currentTimeMillis()));
        studentSubjectResourceModelArrayList.add(new StudentSubjectResourceModel("Formula.apk", "3.4 MB", "APK", "05/10/2020", System.currentTimeMillis()));

        RecyclerView studentSubjectResourceRV = findViewById(R.id.rv_subject_resource_files);
        studentSubjectResourceRV.setLayoutManager(new LinearLayoutManager(this));

        studentSubjectResourceAdapter = new StudentSubjectResourceAdapter(studentSubjectResourceModelArrayList, StudentSubjectResourceActivity.this);
        studentSubjectResourceRV.setAdapter(studentSubjectResourceAdapter);
    }
}