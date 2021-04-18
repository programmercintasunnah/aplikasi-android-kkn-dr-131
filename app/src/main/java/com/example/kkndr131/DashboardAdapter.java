package com.example.kkndr131;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DashboardAdapter extends RecyclerView.Adapter<DashboardAdapter.DashboardHolder> {

    private ArrayList<SetterGetter> listdata;
    Context context1;

    public DashboardAdapter(ArrayList<SetterGetter> listdata,Context context){
        this.listdata = listdata;
        this.context1 = context;
    }
    @NonNull
    @Override
    public DashboardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dashboard,parent,false);
        DashboardHolder holder = new DashboardHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull DashboardHolder holder, int position) {

        final SetterGetter getData = listdata.get(position);
        String titlemenu = getData.getTitle();
        String logomenu = getData.getImg();

        holder.titleMenu.setText(titlemenu);
        if(logomenu.equals("logo1")){
            holder.imgMenu.setImageResource(R.drawable.pendidikan);
        }else if(logomenu.equals("logo2")){
            holder.imgMenu.setImageResource(R.drawable.baca);
        }else if(logomenu.equals("logo3")){
            holder.imgMenu.setImageResource(R.drawable.uin);
        }else if(logomenu.equals("logo4")){
            holder.imgMenu.setImageResource(R.drawable.kkn1);
        }else if(logomenu.equals("logo5")){
            holder.imgMenu.setImageResource(R.drawable.app);
        }else if(logomenu.equals("logo6")){
            holder.imgMenu.setImageResource(R.drawable.about);
        }
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public class DashboardHolder extends RecyclerView.ViewHolder {
        TextView titleMenu;
        ImageView imgMenu;
        public DashboardHolder(@NonNull View itemView) {
            super(itemView);

            titleMenu = itemView.findViewById(R.id.tv_title_menu);
            imgMenu = itemView.findViewById(R.id.logo_menu);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
//                    Toast.makeText(view.getContext(),"Click "+getAdapterPosition(),Toast.LENGTH_LONG).show();
                    if(getAdapterPosition()==0){
                        Intent i = new Intent(view.getContext(),Pendidikan.class);
                        view.getContext().startActivity(i);
                    }else if(getAdapterPosition()==1){
                        Intent i = new Intent(view.getContext(),Dakwah.class);
                        view.getContext().startActivity(i);
                    }else if(getAdapterPosition()==2){
                        Intent i = new Intent(view.getContext(),Uin.class);
                        view.getContext().startActivity(i);
                    }else if(getAdapterPosition()==3){
                        Intent i = new Intent(view.getContext(),Kkn.class);
                        view.getContext().startActivity(i);
                    }else if(getAdapterPosition()==4){
                        Intent i = new Intent(view.getContext(),App.class);
                        view.getContext().startActivity(i);
                    }else if(getAdapterPosition()==5){
                        Intent i = new Intent(view.getContext(),About.class);
                        view.getContext().startActivity(i);
                    }
                }
            });
        }
    }
}
