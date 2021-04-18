package com.example.kkndr131;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PendidikanAdapter extends RecyclerView.Adapter<PendidikanAdapter.PendidikanHolder> {

    private ArrayList<SetterGetter_pend> listdata;
    Context context1;

    public PendidikanAdapter(ArrayList<SetterGetter_pend> listdata, Context context){
        this.listdata = listdata;
        this.context1 = context;
    }
    @NonNull
    @Override
    public PendidikanHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pendidikan,parent,false);
        PendidikanHolder holder = new PendidikanHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull PendidikanHolder holder, int position) {

        final SetterGetter_pend getData = listdata.get(position);
        String titlemenu = getData.getTitle();

        holder.titleMenu.setText(titlemenu);

    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public class PendidikanHolder extends RecyclerView.ViewHolder {
        TextView titleMenu;
        public PendidikanHolder(@NonNull View itemView) {
            super(itemView);

            titleMenu = itemView.findViewById(R.id.judul_pend);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
//                    Toast.makeText(view.getContext(),"Click "+getAdapterPosition(),Toast.LENGTH_LONG).show();
                    if(getAdapterPosition()==0){
                        Intent i = new Intent(view.getContext(),Pendidikan_Tauhid.class);
                        view.getContext().startActivity(i);
                    }else if(getAdapterPosition()==1){
                        Intent i = new Intent(view.getContext(),Rukun_Islam.class);
                        view.getContext().startActivity(i);
                    }else if(getAdapterPosition()==2){
                        Intent i = new Intent(view.getContext(),Rukun_Iman.class);
                        view.getContext().startActivity(i);
                    }else if(getAdapterPosition()==3){
                        Intent i = new Intent(view.getContext(),KosaKata.class);
                        view.getContext().startActivity(i);
                    }else if(getAdapterPosition()==4){
                        Intent i = new Intent(view.getContext(),Pendidikan_Anak.class);
                        view.getContext().startActivity(i);
                    }
                }
            });
        }
    }
}
