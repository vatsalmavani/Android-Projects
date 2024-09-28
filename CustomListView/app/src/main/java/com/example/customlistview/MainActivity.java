package com.example.customlistview;

import android.os.Bundle;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        int[] images = {R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground};
        String[] texts = {"image1", "image2"};

        MyAdapter adapter = new MyAdapter(getApplicationContext(), images, texts);
        GridView gridView = findViewById(R.id.gridView);
        gridView.setAdapter(adapter);
    }
}