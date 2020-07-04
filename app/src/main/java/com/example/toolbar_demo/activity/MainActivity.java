package com.example.toolbar_demo.activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.toolbar_demo.R;
import com.example.toolbar_demo.adapter.RecyclerViewadapter;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mrecyclerview;
    private Toolbar mtoolbar;
    private RecyclerViewadapter viewadapter;
    private LinearLayoutManager linearLayoutManager;
    private DrawerLayout mdrawerlayout;
    private TextView tv_clove;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    public void initview() {
      //  mrecyclerview = findViewById(R.id.recyclerview);
        mtoolbar = findViewById(R.id.toolbar);
        mtoolbar.setTitle("Toolbar");
        mtoolbar.setSubtitle("副标题");
        mtoolbar.setSubtitleTextColor(getResources().getColor(R.color.colorPrimary));
        mtoolbar.setNavigationIcon(R.mipmap.ic_launcher_round);
        setSupportActionBar(mtoolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_launcher_background);
        mtoolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action_setting:
                        Toast.makeText(MainActivity.this,"action_setting",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_share:
                        Toast.makeText(MainActivity.this, "action_share", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
                return true;
            }
        });
        mdrawerlayout=findViewById(R.id.id_drawerlayout);
        ActionBarDrawerToggle mdrawertoggle = new ActionBarDrawerToggle(this, mdrawerlayout, mtoolbar, R.string.drawer_close, R.string.drawer__open);
        mdrawertoggle.syncState();
        mdrawerlayout.addDrawerListener(mdrawertoggle);
        tv_clove=findViewById(R.id.tv_close);
        tv_clove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mdrawerlayout.closeDrawer(Gravity.LEFT);
            }
        });
    }

}
