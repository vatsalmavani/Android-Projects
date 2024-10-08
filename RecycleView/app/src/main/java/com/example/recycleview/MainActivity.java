package com.example.recycleview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ArrayList<Person> arr = new ArrayList<Person>();

        arr.add(new Person(R.drawable.ic_launcher_background, "Vatsal", "xxx222xxx0"));
        arr.add(new Person(R.drawable.ic_launcher_background, "Vat", "xxx22454x0"));
        arr.add(new Person(R.drawable.ic_launcher_foreground, "sal", "xxx455xxx0"));
        arr.add(new Person(R.drawable.ic_launcher_background, "Nameless", "xx4522xxx0"));
        arr.add(new Person(R.drawable.ic_launcher_background, "Name", "xxx200xx0"));
        arr.add(new Person(R.drawable.ic_launcher_foreground, "Hello", "xx5222xxx0"));
        arr.add(new Person(R.drawable.ic_launcher_foreground, "Ramesh", "xxx552xxx0"));
        arr.add(new Person(R.drawable.ic_launcher_background, "Suresh", "xxx112xxx0"));
        arr.add(new Person(R.drawable.ic_launcher_background, "Prathamesh", "xxx222xxx0"));
        arr.add(new Person(R.drawable.ic_launcher_foreground, "Rajesh", "xxx552xxx0"));

        RecyclerView recyclerView = findViewById(R.id.main);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        MyAdapter adapter = new MyAdapter(getApplicationContext(), arr);
        recyclerView.setAdapter(adapter);
    }
}