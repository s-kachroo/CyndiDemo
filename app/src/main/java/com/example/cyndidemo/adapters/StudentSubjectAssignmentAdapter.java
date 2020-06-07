package com.example.cyndidemo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cyndidemo.R;
import com.example.cyndidemo.model.StudentSubjectAssignmentModel;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class StudentSubjectAssignmentAdapter extends RecyclerView.Adapter<StudentSubjectAssignmentAdapter.MyAssignmentHolder> {
    private ArrayList<StudentSubjectAssignmentModel> studentSubjectAssignmentModelArrayList;
    private Context context;

    public StudentSubjectAssignmentAdapter(ArrayList<StudentSubjectAssignmentModel> studentSubjectAssignmentModelArrayList, Context context) {
        this.studentSubjectAssignmentModelArrayList = studentSubjectAssignmentModelArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public StudentSubjectAssignmentAdapter.MyAssignmentHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).
                inflate(R.layout.single_subject_assignment_layout, parent, false);
        return new MyAssignmentHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentSubjectAssignmentAdapter.MyAssignmentHolder holder, int position) {
        StudentSubjectAssignmentModel ssam = studentSubjectAssignmentModelArrayList.get(position);

        holder.assignmentName.setText(ssam.getAssignmentName());
        holder.assignmentSubmissionTime.setText(ssam.getAssignmentSubmissionTime());

        String dateString = new SimpleDateFormat("MM/dd/yyyy", Locale.US).format(new Date(ssam.getAssignmentPostedTime()));
        String textForPostedDate = "Posted " + dateString;
        holder.assignmentPostedTime.setText(textForPostedDate);

        if(ssam.getAssignmentCompleted())
            holder.assignmentIcon.setImageResource(R.drawable.vector_asset_assignment_done);
        else
            holder.assignmentIcon.setImageResource(R.drawable.vector_asset_assignment_due);
    }

    @Override
    public int getItemCount() {
        return studentSubjectAssignmentModelArrayList.size();
    }

    public static class MyAssignmentHolder extends RecyclerView.ViewHolder {
        ImageView assignmentIcon;
        TextView assignmentName, assignmentPostedTime, assignmentSubmissionTime;

        public MyAssignmentHolder(@NonNull View itemView) {
            super(itemView);

            assignmentIcon = itemView.findViewById(R.id.iv_assignment_icon);
            assignmentName = itemView.findViewById(R.id.tv_assignment_name);
            assignmentPostedTime = itemView.findViewById(R.id.tv_assignment_posted_date);
            assignmentSubmissionTime = itemView.findViewById(R.id.tv_assignment_submission_date);
        }
    }
}
