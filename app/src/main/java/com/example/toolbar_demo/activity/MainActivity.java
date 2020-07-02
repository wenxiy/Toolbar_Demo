package com.example.toolbar_demo.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.toolbar_demo.R;
import com.example.toolbar_demo.adapter.RecyclerViewadapter;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mrecyclerview;
    private Toolbar mtoolbar;
    private RecyclerViewadapter viewadapter;
    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
    }

    public void initview() {
        mrecyclerview = findViewById(R.id.recyclerview);
        mtoolbar = findViewById(R.id.toolbar);
        mtoolbar.setTitle("Toolbar");
        setSupportActionBar(mtoolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_launcher_background);
        mtoolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return false;
            }
        });

    }

}
