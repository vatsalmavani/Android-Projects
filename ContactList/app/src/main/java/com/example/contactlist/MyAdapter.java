package com.example.contactlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {

    ArrayList<Person> arr;
    LayoutInflater inflater;

    MyAdapter(Context context, ArrayList<Person> arr) {
        this.arr = arr;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return arr.size();
    }

    @Override
    public Object getItem(int i) {
        return arr.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.item_layout, null);
        ImageView image = view.findViewById(R.id.image);
        TextView name = view.findViewById(R.id.name);
        TextView number = view.findViewById(R.id.number);
        Person person = arr.get(i);
        image.setImageResource(person.getImage());
        name.setText(person.getName());
        number.setText(person.getNumber());
        return view;
    }
}
