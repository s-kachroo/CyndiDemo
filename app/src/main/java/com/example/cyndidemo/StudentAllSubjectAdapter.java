package com.example.cyndidemo;

import android.content.Context;
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

    public StudentAllSubjectAdapter(ArrayList<StudentSubjectModel> studentSubjectArrayList, Context context) {
        this.studentSubjectArrayList = studentSubjectArrayList;
        this.context = context;
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
                    Toast.makeText(context, "" + getAdapterPosition(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
