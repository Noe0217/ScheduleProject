package com.example.scheduleproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView ScheduleListView;

    Button btnAddSchedule = (Button) findViewById(R.id.btn_addSchedule);

    public MainActivity(ListView scheduleListView) {
        ScheduleListView = scheduleListView;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}