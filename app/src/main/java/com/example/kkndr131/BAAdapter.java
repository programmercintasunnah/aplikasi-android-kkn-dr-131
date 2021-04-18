package com.example.kkndr131;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BAAdapter extends RecyclerView.Adapter<BAAdapter.BAHolder> {

    private ArrayList<SetterGetter_ba> listdata;
    Context context1;

    public BAAdapter(ArrayList<SetterGetter_ba> listdata, Context context){
        this.listdata = listdata;
        this.context1 = context;
    }
    @NonNull
    @Override
    public BAHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ba,parent,false);
        BAHolder holder = new BAHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull BAHolder holder, int position) {

        final SetterGetter_ba getData = listdata.get(position);
        String b_a = getData.getBa();
        String a_r = getData.getArti();

        holder.Ba.setText(b_a);
        holder.Ar.setText(a_r);

    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public class BAHolder extends RecyclerView.ViewHolder {
        TextView Ba,Ar;
        public BAHolder(@NonNull View itemView) {
            super(itemView);

            Ba = itemView.findViewById(R.id.ba);
            Ar = itemView.findViewById(R.id.terjemahan);
        }
    }
}
