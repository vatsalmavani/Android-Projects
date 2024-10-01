package com.example.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    ArrayList<Person> arrayList;

    MyAdapter(Context context, ArrayList<Person> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name, number;
        ImageView image;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            this.name = itemView.findViewById(R.id.name);
            this.number = itemView.findViewById(R.id.number);
            this.image = itemView.findViewById(R.id.image);
        }
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        Person person = arrayList.get(position);
        holder.image.setImageResource(person.image);
        holder.name.setText(person.name);
        holder.number.setText(person.number);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
