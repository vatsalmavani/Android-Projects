package com.example.bmicalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText weight = findViewById(R.id.weight);
        EditText height = findViewById(R.id.height);
        Button btn = findViewById(R.id.btn);
//        TextView res = findViewById(R.id.res);

        Intent goToNextActivity = new Intent(MainActivity.this, Result.class);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int w = Integer.parseInt(weight.getText().toString());
                int h = Integer.parseInt(height.getText().toString());
                float bmi = (float)w/h;

//                if (bmi > 25) {
//                    res.setText("Overweight");
//                } else if (bmi < 15) {
//                    res.setText("Underweight");
//                } else {
//                    res.setText("Healthy");
//                }

                goToNextActivity.putExtra("bmi", bmi);

                startActivity(goToNextActivity);
            }
        });
    }
}