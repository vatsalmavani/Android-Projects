package com.example.bmicalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_result);

        TextView res = findViewById(R.id.res);
        Button back = findViewById(R.id.back);
        Intent goToPrevActivity = new Intent(Result.this, MainActivity.class);
        Intent prevActivity = getIntent(); // this will automatically get the intent from which this activity was called

        float bmi = prevActivity.getFloatExtra("bmi", -1);

        if (bmi > 25) {
            res.setText("Overweight");
        } else if (bmi < 15) {
            res.setText("Underweight");
        } else {
            res.setText("Healthy");
        }


            back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(goToPrevActivity);
            }
        });
    }
}