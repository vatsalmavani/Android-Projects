package com.example.listapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.editText);
        Button submit = findViewById(R.id.submit);
        TextView textView = findViewById(R.id.textView);

        Intent intent = new Intent(MainActivity.this, ShowListActivity.class);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText.getText().toString();
                if (!str.isEmpty()) {
                    editText.setText("");
                    textView.setText("");
                    intent.putExtra("data", str);
                    startActivity(intent);
                } else {
                    textView.setText("Please enter a non-empty data");
                }
            }
        });
    }
}