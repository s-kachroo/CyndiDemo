package com.example.cyndidemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.cyndidemo.messagingActivities.MessagingLoginActivity;

public class MainActivity extends AppCompatActivity {
    CardView mySubjectsContentCardView, messageCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySubjectsContentCardView = findViewById(R.id.cv_my_subject);
        messageCardView = findViewById(R.id.cv_messaging);

        mySubjectsContentCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, StudentAllSubjectListActivity.class);
                startActivity(i);
            }
        });

        messageCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MessagingLoginActivity.class);
                startActivity(i);
            }
        });

    }
}