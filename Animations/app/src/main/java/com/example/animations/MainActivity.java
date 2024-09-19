package com.example.animations;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ImageView image = findViewById(R.id.image);
        Button btn_translate = findViewById(R.id.translate);
        Button btn_rotate = findViewById(R.id.rotate);
        Button btn_scale = findViewById(R.id.scale);
        Button btn_alpha = findViewById(R.id.alpha);

        Animation anim_translate = AnimationUtils.loadAnimation(this, R.anim.translate);
        Animation anim_rotate = AnimationUtils.loadAnimation(this, R.anim.rotate);
        Animation anim_scale = AnimationUtils.loadAnimation(this, R.anim.scale);
        Animation anim_alpha = AnimationUtils.loadAnimation(this, R.anim.alpha);

        btn_translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.startAnimation(anim_translate);
            }
        });

        btn_rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.startAnimation(anim_rotate);
            }
        });

        btn_scale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.startAnimation(anim_scale);
            }
        });

        btn_alpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.startAnimation(anim_alpha);
            }
        });
    }
}