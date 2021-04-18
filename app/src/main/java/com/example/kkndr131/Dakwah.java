package com.example.kkndr131;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Dakwah extends AppCompatActivity {

    RecyclerView recyclerView_dakwah;
    ArrayList<SetterGetter_dakwah> data_dakwah;
    GridLayoutManager gridLayoutManager_dakwah;
    DakwahAdapter adapter_dakwah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dakwah);

        recyclerView_dakwah = findViewById(R.id.rv_dakwah);
        add_data_dakwah();
        gridLayoutManager_dakwah = new GridLayoutManager(this,1);
        recyclerView_dakwah.setLayoutManager(gridLayoutManager_dakwah);
        adapter_dakwah = new DakwahAdapter(data_dakwah,getApplicationContext());
        recyclerView_dakwah.setAdapter(adapter_dakwah);
    }

    private void add_data_dakwah() {
        data_dakwah = new ArrayList<>();
        data_dakwah.add(new SetterGetter_dakwah("g1","Penjelasan Ulama Seputar Konspirasi Wabah Covid19","dr. Raehanul Bahraen, M.Sc, Sp.PK","Posted by muslim.or.id on June 11, 2020"));
        data_dakwah.add(new SetterGetter_dakwah("g2","Cara Berbakti pada Orang Tua Setelah Mereka Tiada","Muhammad Abduh Tuasikal, M.Sc","Posted by rumaysho.com on August 30, 2015"));
        data_dakwah.add(new SetterGetter_dakwah("g3","Wajibkah Melaksanakan Ibadah Kurban?","Syaikh Muhammad bin Shalih Al-Utsaimin","Posted by almanhaj.or.id"));
        data_dakwah.add(new SetterGetter_dakwah("g4","Kapan Puasa Arofah?","Ustadz Dr Firanda Andirja, MA","Posted by firanda.com on September 28, 2014"));
        data_dakwah.add(new SetterGetter_dakwah("g5","Nikah Muda atau Mengejar Obsesi?","Isruwanti Ummu Nashifa","Posted by muslimah.or.id on August 16, 2016"));
        data_dakwah.add(new SetterGetter_dakwah("g6","Mendidik Anak dengan Sunnah","Ustadz Muhammad Arifin Badri","Posted by konsultasisyariah.com on December 28, 2009"));
        data_dakwah.add(new SetterGetter_dakwah("g7","Adab Makan (Makan & Minum dengan Tangan Kanan)","Ustadz Dr Firanda Andirja, MA","Posted by firanda.com on June 27, 2020"));
    }
}