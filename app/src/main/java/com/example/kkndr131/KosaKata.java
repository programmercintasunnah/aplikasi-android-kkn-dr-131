package com.example.kkndr131;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class KosaKata extends AppCompatActivity {

    RecyclerView recyclerView_ba;
    ArrayList<SetterGetter_ba> data_ba;
    GridLayoutManager gridLayoutManager_ba;
    BAAdapter adapter_ba;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kosa_kata);

        recyclerView_ba = findViewById(R.id.rv_ba);
        add_data_ba();
        gridLayoutManager_ba = new GridLayoutManager(this,2);
        recyclerView_ba.setLayoutManager(gridLayoutManager_ba);
        adapter_ba = new BAAdapter(data_ba,getApplicationContext());
        recyclerView_ba.setAdapter(adapter_ba);
    }

    private void add_data_ba() {
        data_ba = new ArrayList<>();
        data_ba.add(new SetterGetter_ba("اللغة العربية","Bahasa Arab"));
        data_ba.add(new SetterGetter_ba("رَأْسٌ","Kepala"));
        data_ba.add(new SetterGetter_ba("شَعْرٌ","Rambut"));
        data_ba.add(new SetterGetter_ba("عَيْنٌ","Mata"));
        data_ba.add(new SetterGetter_ba("أُذُنٌ","Telinga"));
        data_ba.add(new SetterGetter_ba("أَنْفٌ","Hidung"));

        data_ba.add(new SetterGetter_ba("مِرْوَحَةٌ","Kipas Angin"));
        data_ba.add(new SetterGetter_ba("مُكَيِّفٌ","AC"));
        data_ba.add(new SetterGetter_ba("خِزَانَةٌ","Lemari"));
        data_ba.add(new SetterGetter_ba("وِسَادَةٌ","Bantal"));
        data_ba.add(new SetterGetter_ba("مِحْفَظَةٌ","Dompet"));

        data_ba.add(new SetterGetter_ba("رَقَبَةٌ","Leher"));
        data_ba.add(new SetterGetter_ba("شَفَةٌ","Bibir"));
        data_ba.add(new SetterGetter_ba("صَدْرٌ","Dada"));
        data_ba.add(new SetterGetter_ba("بَطْنٌ","Perut"));
        data_ba.add(new SetterGetter_ba("أَصْبُعٌ","Jari"));

        data_ba.add(new SetterGetter_ba("سَرِيْرٌ","Ranjang"));
        data_ba.add(new SetterGetter_ba("فِرَاشٌ","Kasur"));
        data_ba.add(new SetterGetter_ba("لِحَافٌ","Selimut"));
        data_ba.add(new SetterGetter_ba("أَزْرَقُ","Biru"));
        data_ba.add(new SetterGetter_ba("أَحْمَرُ","Merah"));

        data_ba.add(new SetterGetter_ba("وَرْدِيٌّ","Pink"));
        data_ba.add(new SetterGetter_ba("أَصْفَرُ","Kuning"));
        data_ba.add(new SetterGetter_ba("بَنَفْسَجِيٌّ","Ungu"));
        data_ba.add(new SetterGetter_ba("أَبْيَضُ","Putih"));
        data_ba.add(new SetterGetter_ba("أَسْوَدُ","Hitam"));

        data_ba.add(new SetterGetter_ba("مَوْزٌ","Pisang"));
        data_ba.add(new SetterGetter_ba("بُرْتُقَالِيٌّ","Orange"));
    }
}