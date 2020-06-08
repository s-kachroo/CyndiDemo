package com.example.cyndidemo.subjectActivites;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cyndidemo.R;
import com.example.cyndidemo.adapters.StudentSubjectAssignmentAdapter;
import com.example.cyndidemo.adapters.StudentSubjectResourceAdapter;
import com.example.cyndidemo.model.StudentSubjectAssignmentModel;
import com.example.cyndidemo.model.StudentSubjectResourceModel;

import java.util.ArrayList;

public class StudentSubjectAssignmentActivity extends AppCompatActivity {
    private ArrayList<StudentSubjectAssignmentModel> studentSubjectAssignmentModelArrayList;
    private StudentSubjectAssignmentAdapter studentSubjectAssignmentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_subject_assignment);

        TextView headingTextView = findViewById(R.id.tv_student_subject_assignment_heading);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String subjectName = extras.getString("subjectName");
        }

        studentSubjectAssignmentModelArrayList = new ArrayList<>();

        studentSubjectAssignmentModelArrayList.add(new StudentSubjectAssignmentModel("DS 1", "No Due", "07/15/2020", System.currentTimeMillis(), true));
        studentSubjectAssignmentModelArrayList.add(new StudentSubjectAssignmentModel("Tracker 1", "Due 08/15/2020", "07/20/2020", System.currentTimeMillis(), false));
        studentSubjectAssignmentModelArrayList.add(new StudentSubjectAssignmentModel("Weekly 1", "Due 08/27/2020", "07/20/2020", System.currentTimeMillis(), false));
        studentSubjectAssignmentModelArrayList.add(new StudentSubjectAssignmentModel("Weekly 2", "Due 08/18/2020", "07/22/2020", System.currentTimeMillis(), true));
        studentSubjectAssignmentModelArrayList.add(new StudentSubjectAssignmentModel("DS 2", "No Due", "07/23/2020", System.currentTimeMillis(), true));
        studentSubjectAssignmentModelArrayList.add(new StudentSubjectAssignmentModel("Tracker 2", "No Due", "07/24/2020", System.currentTimeMillis(), false));
        studentSubjectAssignmentModelArrayList.add(new StudentSubjectAssignmentModel("Weekly 3", "08/12/2020", "07/24/2020", System.currentTimeMillis(), false));
        studentSubjectAssignmentModelArrayList.add(new StudentSubjectAssignmentModel("End Semester Practice", "Due 08/18/2020", "07/25/2020", System.currentTimeMillis(), true));
        studentSubjectAssignmentModelArrayList.add(new StudentSubjectAssignmentModel("Tracker 3", "Due 08/10/2020", "07/25/2020", System.currentTimeMillis(), false));
        studentSubjectAssignmentModelArrayList.add(new StudentSubjectAssignmentModel("End Semester Practice", "Due 09/17/2020", "07/26/2020", System.currentTimeMillis(), true));
        studentSubjectAssignmentModelArrayList.add(new StudentSubjectAssignmentModel("Tracker 4", "Due 09/01/2020", "07/27/2020", System.currentTimeMillis(), false));
        studentSubjectAssignmentModelArrayList.add(new StudentSubjectAssignmentModel("DS 3", "Due 08/28/2020", "07/29/2020", System.currentTimeMillis(), true));
        studentSubjectAssignmentModelArrayList.add(new StudentSubjectAssignmentModel("Weekly 4", "Due 08/23/2020", "08/01/2020", System.currentTimeMillis(), true));
        studentSubjectAssignmentModelArrayList.add(new StudentSubjectAssignmentModel("Tracker 5", "Due 09/15/2020", "08/02/2020", System.currentTimeMillis(), false));
        studentSubjectAssignmentModelArrayList.add(new StudentSubjectAssignmentModel("Weekly 5", "No Due", "08/02/2020", System.currentTimeMillis(), false));
        studentSubjectAssignmentModelArrayList.add(new StudentSubjectAssignmentModel("DS 4", "Due 08/16/2020", "08/03/2020", System.currentTimeMillis(), true));
        studentSubjectAssignmentModelArrayList.add(new StudentSubjectAssignmentModel("Tracker 7", "No Due", "08/05/2020", System.currentTimeMillis(), false));
        studentSubjectAssignmentModelArrayList.add(new StudentSubjectAssignmentModel("Weekly 6", "Due 08/12/2020", "08/07/2020", System.currentTimeMillis(), false));
        studentSubjectAssignmentModelArrayList.add(new StudentSubjectAssignmentModel("Tracker 8", "No Due", "08/08/2020", System.currentTimeMillis(), true));

        RecyclerView studentAssignmentsListRV = findViewById(R.id.rv_subject_assignments_list);
        studentAssignmentsListRV.setLayoutManager(new LinearLayoutManager(this));

        studentSubjectAssignmentAdapter = new StudentSubjectAssignmentAdapter(studentSubjectAssignmentModelArrayList, StudentSubjectAssignmentActivity.this);
        studentAssignmentsListRV.setAdapter(studentSubjectAssignmentAdapter);
    }
}