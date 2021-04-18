package com.example.kkndr131;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Pendidikan extends AppCompatActivity {

    RecyclerView recyclerView_pend;
    ArrayList<SetterGetter_pend> dataMenu_pend;
    GridLayoutManager gridLayoutManager_pend;
    PendidikanAdapter adapter_pend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pendidikan);

        recyclerView_pend = findViewById(R.id.rv_pendidikan);
        add_data_pend();
        gridLayoutManager_pend = new GridLayoutManager(this,1);
        recyclerView_pend.setLayoutManager(gridLayoutManager_pend);
        adapter_pend = new PendidikanAdapter(dataMenu_pend,getApplicationContext());
        recyclerView_pend.setAdapter(adapter_pend);
    }

    private void add_data_pend() {
        dataMenu_pend = new ArrayList<>();
        dataMenu_pend.add(new SetterGetter_pend("Belajar Tauhid"));
        dataMenu_pend.add(new SetterGetter_pend("Rukun Islam"));
        dataMenu_pend.add(new SetterGetter_pend("Rukun Iman"));
        dataMenu_pend.add(new SetterGetter_pend("Kosa Kata Bahasa Arab"));
        dataMenu_pend.add(new SetterGetter_pend("Pendidikan Anak"));
    }
}