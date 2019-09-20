package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        RecyclerView recyclelist = findViewById(R.id.recyclelist);
        recyclelist.setLayoutManager(new LinearLayoutManager(this));
        String[] Languages = {"java", "c", "busaina", "ketan"};
        recyclelist.setAdapter(new data(Languages));
    }
}
