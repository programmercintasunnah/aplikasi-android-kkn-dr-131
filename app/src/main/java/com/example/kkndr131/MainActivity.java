package com.example.kkndr131;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<SetterGetter> dataMenu;
    GridLayoutManager gridLayoutManager;
    DashboardAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv1);
        add_data_menu();
        gridLayoutManager = new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(gridLayoutManager);
        adapter = new DashboardAdapter(dataMenu,getApplicationContext());
        recyclerView.setAdapter(adapter);

    }

    public void add_data_menu(){
        dataMenu = new ArrayList<>();
        dataMenu.add(new SetterGetter("Pendidikan","logo1"));
        dataMenu.add(new SetterGetter("Dakwah Keagamaan","logo2"));
        dataMenu.add(new SetterGetter("Tentang UIN SUSKA RIAU","logo3"));
        dataMenu.add(new SetterGetter("Tentang KKN-DR","logo4"));
        dataMenu.add(new SetterGetter("Tentang Aplikasi","logo5"));
        dataMenu.add(new SetterGetter("Group 131","logo6"));
    }
    public boolean doubleTapParam = false;
    @Override
    public void onBackPressed() {
        if (doubleTapParam) {
            super.onBackPressed();
            return;
        }

        this.doubleTapParam = true;
        Toast.makeText(this, "Tap sekali lagi untuk keluar", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleTapParam = false;
            }
        }, 2000);
    }
}