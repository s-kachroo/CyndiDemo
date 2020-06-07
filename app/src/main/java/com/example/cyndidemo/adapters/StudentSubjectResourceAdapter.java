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
import com.example.cyndidemo.model.StudentSubjectModel;
import com.example.cyndidemo.model.StudentSubjectResourceModel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class StudentSubjectResourceAdapter extends RecyclerView.Adapter<StudentSubjectResourceAdapter.MySubjectResourceHolder> {
    private ArrayList<StudentSubjectResourceModel> studentSubjectResourceModelArrayList;
    private Context context;

    public StudentSubjectResourceAdapter(ArrayList<StudentSubjectResourceModel> studentSubjectResourceModelArrayList, Context context) {
        this.studentSubjectResourceModelArrayList = studentSubjectResourceModelArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public StudentSubjectResourceAdapter.MySubjectResourceHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).
                inflate(R.layout.single_subject_resource_layout, parent, false);
        return new MySubjectResourceHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentSubjectResourceAdapter.MySubjectResourceHolder holder, int position) {
        StudentSubjectResourceModel ssrm = studentSubjectResourceModelArrayList.get(position);

        holder.fileNameTV.setText(ssrm.getFileName());
        holder.fileSizeTV.setText(ssrm.getFileSize());
        holder.fileTypeTV.setText(ssrm.getFileFormat());

        String dateString = new SimpleDateFormat("MM/dd/yyyy", Locale.US).format(new Date(ssrm.getFileDate()));
        holder.fileDateTV.setText(dateString);
    }

    @Override
    public int getItemCount() {
        return studentSubjectResourceModelArrayList.size();
    }

    public class MySubjectResourceHolder extends RecyclerView.ViewHolder {
        ImageView fileIconIV;
        TextView fileNameTV, fileTypeTV, fileSizeTV, fileDateTV;

        public MySubjectResourceHolder(@NonNull View itemView) {
            super(itemView);

            fileNameTV = itemView.findViewById(R.id.tv_file_name);
            fileTypeTV = itemView.findViewById(R.id.tv_file_format);
            fileSizeTV = itemView.findViewById(R.id.tv_file_size);
            fileDateTV = itemView.findViewById(R.id.tv_file_date);
            fileIconIV = itemView.findViewById(R.id.iv_file_type_icon);
        }
    }
}
