package com.example.kkndr131;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Group131Adapter extends RecyclerView.Adapter<Group131Adapter.Group131Holder> {
    private ArrayList<SetterGetter_group> listdata;
    Context context;
    public Group131Adapter(ArrayList<SetterGetter_group> listdata,Context context){
        this.listdata = listdata;
        this.context = context;
    }
    @NonNull
    @Override
    public Group131Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mhs,parent,false);
        Group131Adapter.Group131Holder holder = new Group131Adapter.Group131Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Group131Holder holder, int position) {
        final SetterGetter_group getData = listdata.get(position);
        String foto = getData.getFoto();
        String nama = getData.getNama();
        String jurusan = getData.getJurusan();

        holder.namaKu.setText(nama);
        holder.jurusanKu.setText(jurusan);
        if(foto.equals("lk")){
            holder.fotoKu.setImageResource(R.drawable.ikhwan_ori);
        }else if(foto.equals("pr")){
            holder.fotoKu.setImageResource(R.drawable.akhwat_ori);
        }
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public class Group131Holder extends RecyclerView.ViewHolder {
        TextView namaKu, jurusanKu;
        ImageView fotoKu;

        public Group131Holder(@NonNull View itemView) {
            super(itemView);

            fotoKu = itemView.findViewById(R.id.foto);
            namaKu = itemView.findViewById(R.id.nama);
            jurusanKu = itemView.findViewById(R.id.jurusan);
        }
    }
}
