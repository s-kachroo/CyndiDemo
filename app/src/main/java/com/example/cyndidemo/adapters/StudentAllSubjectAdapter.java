package com.example.cyndidemo.adapters;

import android.content.Context;
import android.content.Intent;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cyndidemo.R;
import com.example.cyndidemo.StudentEachSubjectActivity;
import com.example.cyndidemo.model.StudentSubjectModel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

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
        holder.subjectTeacherName.setText(studentSubjectModel.getTeacherName());
        holder.subjectCodeTV.setText(studentSubjectModel.getSubjectCode());

        long time = studentSubjectModel.getLastActivity();
        Calendar cal = Calendar.getInstance(Locale.ENGLISH);
        cal.setTimeInMillis(time * 1000L);
        String date = DateFormat.format("dd-MM-yyyy hh:mm:ss", cal).toString();

        String textForLastActivity = "Last Activity - " + studentSubjectModel.getTempLastActivity();
        holder.lastActivityTV.setText(textForLastActivity);

        if (studentSubjectModel.getThereNewNotification())
            holder.isThereNewNotificationIV.setImageResource(R.drawable.vector_asset_new_notification);
        else
            holder.isThereNewNotificationIV.setImageResource(R.drawable.vector_asset_no_notification);
    }

    @Override
    public int getItemCount() {
        return studentSubjectArrayList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView subjectNameTV, subjectCodeTV, subjectTeacherName, lastActivityTV;
        ImageView isThereNewNotificationIV;

        public MyHolder(@NonNull final View itemView) {
            super(itemView);
            subjectNameTV = itemView.findViewById(R.id.tv_subject_name);
            subjectCodeTV = itemView.findViewById(R.id.tv_subject_code);
            subjectTeacherName = itemView.findViewById(R.id.tv_teacher_name);
            lastActivityTV = itemView.findViewById(R.id.tv_last_Activity);
            isThereNewNotificationIV = itemView.findViewById(R.id.iv_is_there_new_notification);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String subName = studentSubjectArrayList.get(getAdapterPosition()).getSubjectName();

                    Intent i = new Intent(context, StudentEachSubjectActivity.class);
                    i.putExtra("subjectName", subName);
                    context.startActivity(i);
                }
            });
        }
    }
}
