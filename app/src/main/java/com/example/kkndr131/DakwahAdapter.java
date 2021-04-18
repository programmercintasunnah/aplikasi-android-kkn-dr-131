package com.example.kkndr131;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DakwahAdapter extends RecyclerView.Adapter<DakwahAdapter.DakwahHolder> {

    private ArrayList<SetterGetter_dakwah> listdata;
    Context context1;

    public DakwahAdapter(ArrayList<SetterGetter_dakwah> listdata, Context context){
        this.listdata = listdata;
        this.context1 = context;
    }
    @NonNull
    @Override
    public DakwahHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dakwah,parent,false);
        DakwahHolder holder = new DakwahHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull DakwahHolder holder, int position) {

        final SetterGetter_dakwah getData = listdata.get(position);
        String gambar = getData.getGambar();
        String judul = getData.getJudul();
        String pemateri = getData.getPemateri();
        String tgl = getData.getTgl();

        holder.Judul.setText(judul);
        holder.Pemateri.setText(pemateri);
        holder.Tgl.setText(tgl);
        if(gambar.equals("g1")){
            holder.Gambar.setImageResource(R.drawable.covid19);
        }else if(gambar.equals("g2")){
            holder.Gambar.setImageResource(R.drawable.birrul);
        }else if(gambar.equals("g3")){
            holder.Gambar.setImageResource(R.drawable.qurban);
        }else if(gambar.equals("g4")){
            holder.Gambar.setImageResource(R.drawable.puasa);
        }else if(gambar.equals("g5")){
            holder.Gambar.setImageResource(R.drawable.nikah);
        }else if(gambar.equals("g6")){
            holder.Gambar.setImageResource(R.drawable.anak);
        }else if(gambar.equals("g7")){
            holder.Gambar.setImageResource(R.drawable.adab);
        }
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public class DakwahHolder extends RecyclerView.ViewHolder {
        public static final String PESAN_EXTRA = "AaMm24";
        TextView Judul,Pemateri,Tgl;
        ImageView Gambar;
        public DakwahHolder(@NonNull View itemView) {
            super(itemView);

            Judul = itemView.findViewById(R.id.judul_dakwah);
            Pemateri = itemView.findViewById(R.id.pemateri_dakwah);
            Tgl = itemView.findViewById(R.id.tgl_dakwah);
            Gambar = itemView.findViewById(R.id.gambar_dakwah);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
//                    Toast.makeText(view.getContext(),"Click "+getAdapterPosition(),Toast.LENGTH_LONG).show();
                    Intent i = new Intent(view.getContext(),Webview.class);
                    if(getAdapterPosition()==0){
                        i.putExtra(PESAN_EXTRA,"https://muslim.or.id/56994-penjelasan-ulama-seputar-konspirasi-wabah-covid19.html");
                    }else if(getAdapterPosition()==1){
                        i.putExtra(PESAN_EXTRA,"https://rumaysho.com/11752-cara-berbakti-pada-orang-tua-setelah-mereka-tiada.html");
                    }else if(getAdapterPosition()==2){
                        i.putExtra(PESAN_EXTRA,"https://almanhaj.or.id/1844-wajibkah-melaksanakan-ibadah-kurban.html");
                    }else if(getAdapterPosition()==3){
                        i.putExtra(PESAN_EXTRA,"https://firanda.com/1254-kapan-puasa-arofah.html");
                    }else if(getAdapterPosition()==4){
                        i.putExtra(PESAN_EXTRA,"https://muslimah.or.id/8825-nikah-muda-atau-mengejar-obsesi.html");
                    }else if(getAdapterPosition()==5){
                        i.putExtra(PESAN_EXTRA,"https://konsultasisyariah.com/469-mendidik-anak-dengan-sunnah.html");
                    }else if(getAdapterPosition()==6){
                        i.putExtra(PESAN_EXTRA,"https://firanda.com/3789-kitabul-jami-hadits-15-adab-makan-makan-minum-dengan-tangan-kanan.html");
                    }
                    view.getContext().startActivity(i);
                }
            });
        }
    }
}
