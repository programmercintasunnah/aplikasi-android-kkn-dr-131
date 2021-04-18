package com.example.kkndr131;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Group131Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Group131Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Group131Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Group131Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Group131Fragment newInstance(String param1, String param2) {
        Group131Fragment fragment = new Group131Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    RecyclerView recyclerView_group;
    ArrayList<SetterGetter_group> data_group;
    GridLayoutManager gridLayoutManager_group;
    Group131Adapter adapter_group;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_group131, container, false);

        recyclerView_group = view.findViewById(R.id.rv_group);
        add_data_group();
        gridLayoutManager_group = new GridLayoutManager(getContext(),2);
        recyclerView_group.setLayoutManager(gridLayoutManager_group);
        adapter_group = new Group131Adapter(data_group,getContext());
        recyclerView_group.setAdapter(adapter_group);

        return view;
    }
    private void add_data_group() {
        data_group = new ArrayList<>();
        data_group.add(new SetterGetter_group("lk","Muhammad Zakie","Teknik Informatika"));
        data_group.add(new SetterGetter_group("pr","Dina Islami","Pendidikan Agama Islam"));
        data_group.add(new SetterGetter_group("pr","Fitri Ayu Lestari","Ilmu Komunikasi"));
        data_group.add(new SetterGetter_group("lk","Rian Bastian","Administrasi Negara"));

        data_group.add(new SetterGetter_group("lk","M Ilham Hidayatullah","Perbandingan Madzhab"));
        data_group.add(new SetterGetter_group("pr","Yeni Efrianti","Pendidikan Bahasa Inggris"));
        data_group.add(new SetterGetter_group("pr","Suci Darma Yanti","Pendidikan Bahasa Inggris"));
        data_group.add(new SetterGetter_group("lk","Abdul Mutoyib","Ilmu Komunikasi"));

        data_group.add(new SetterGetter_group("lk","Fadil Kurniawan","Ilmu Hukum"));
        data_group.add(new SetterGetter_group("pr","Halimah Tun Satdiah","Matematika"));
        data_group.add(new SetterGetter_group("pr","Wiji Astuti","Pendidikan Bahasa Inggris"));
        data_group.add(new SetterGetter_group("lk","Gusri Yonaldi","Sistem Informasi"));

        data_group.add(new SetterGetter_group("lk","MHD Arif Fadilah","Pendidikan Bahasa Inggris"));
        data_group.add(new SetterGetter_group("pr","Nurul Fatimah","Pendidikan Agama Islam"));
        data_group.add(new SetterGetter_group("pr","Nurhayani Br Ritonga","Manajemen Dakwah"));
        data_group.add(new SetterGetter_group("lk","Prastya Nanda Nurfajri","Pendidikan Bahasa Arab"));

        data_group.add(new SetterGetter_group("lk","R Ihsanullah Zhaputra","Agroteknologi"));
        data_group.add(new SetterGetter_group("pr","Nurhayati","Ilmu Al-Qur'an dan Tafsir"));
        data_group.add(new SetterGetter_group("lk","M Taufiq Farhan","Hukum Keluarga"));
        data_group.add(new SetterGetter_group("lk","MHD Rizal Helmi","Ilmu Komunikasi"));
    }
}