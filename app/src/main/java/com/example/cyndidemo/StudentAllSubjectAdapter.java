package com.example.cyndidemo;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StudentAllSubjectAdapter extends RecyclerView.Adapter<StudentAllSubjectAdapter.MyHolder> {
    private ArrayList<StudentSubjectModel> studentSubjectArrayList;
    private Context context;
    private String nextAct;
    private String COURSE = "course", ASSIGNMENT = "assignment";

    public StudentAllSubjectAdapter(ArrayList<StudentSubjectModel> studentSubjectArrayList, Context context, String nextActivity) {
        this.studentSubjectArrayList = studentSubjectArrayList;
        this.context = context;
        this.nextAct = nextActivity;
    }

    @NonNull
    @Override
    public StudentAllSubjectAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).
                inflate(R.layout.single_subject_list_layout, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentAllSubjectAdapter.MyHolder holder, int position) {
        StudentSubjectModel studentSubjectModel = studentSubjectArrayList.get(position);
        holder.subjectNameTV.setText(studentSubjectModel.getSubjectName());
    }

    @Override
    public int getItemCount() {
        return studentSubjectArrayList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView subjectNameTV;
        ImageView subjectIconIV;

        public MyHolder(@NonNull final View itemView) {
            super(itemView);
            subjectNameTV = itemView.findViewById(R.id.tv_subject_name);
            subjectIconIV = itemView.findViewById(R.id.iv_subject_icon);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String subjectName = studentSubjectArrayList.get(getAdapterPosition()).getSubjectName();

                    if (nextAct.equals(COURSE)) {
                        Intent i = new Intent(context, StudentSubjectCourseContentActivity.class);
                        i.putExtra("subjectname", subjectName);
                        context.startActivity(i);
                    }

                    if (nextAct.equals(ASSIGNMENT)) {
                        Intent i = new Intent(context, StudentSubjectAssignmentActivity.class);
                        i.putExtra("subjectname", subjectName);
                        context.startActivity(i);
                    }
                }
            });
        }
    }
}
