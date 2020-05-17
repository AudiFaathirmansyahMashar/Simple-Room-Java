package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder> {
    private ArrayList<Entitas> entitas;
    private Context context;

    public static class MahasiswaViewHolder extends RecyclerView.ViewHolder{
        private TextView id, name, stambuk;

        public MahasiswaViewHolder(@NonNull View itemView) {
            super(itemView);

            id = itemView.findViewById(R.id.mhsId);
            name = itemView.findViewById(R.id.mhsName);
            stambuk = itemView.findViewById(R.id.mhsStb);
        }
    }

    public MahasiswaAdapter(ArrayList<Entitas> entitas, Context context){
        this.entitas = entitas;
        this.context = context;
    }

    @NonNull
    @Override
    public MahasiswaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_view, parent, false);
        MahasiswaViewHolder viewHolder = new MahasiswaViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MahasiswaViewHolder holder, int position) {
        holder.id.setText(Integer.toString(entitas.get(position).getId()));
        holder.name.setText(entitas.get(position).getNama());
        holder.stambuk.setText(entitas.get(position).getStambuk());
    }

    @Override
    public int getItemCount() {
        return entitas.size();
    }
}
