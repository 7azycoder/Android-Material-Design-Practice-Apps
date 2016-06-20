package com.devlovepreet.recyclerviewdemo;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by devlovepreet on 17/6/16.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {
    String[] country_names, country_capitals;

    public RecyclerAdapter(String[] country_names, String[] country_capitals){
        this.country_names = country_names;
        this.country_capitals = country_capitals;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.Tx_Country.setText(country_names[position]);
        holder.Tx_Capital.setText(country_capitals[position]);

    }

    @Override
    public int getItemCount() {
        return country_names.length;
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder{
        TextView Tx_Country, Tx_Capital;
        public RecyclerViewHolder(View view){
            super(view);
            Tx_Country = (TextView) view.findViewById(R.id.tx_country_name);
            Tx_Capital = (TextView) view.findViewById(R.id.tx_capital_name);
        }
    }
}
