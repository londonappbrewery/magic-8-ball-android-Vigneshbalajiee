package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Ask;
        Ask = findViewById(R.id.ask_button);
        final ImageView eight = findViewById(R.id.image_eightball);
        final int[] ball ={
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };
        Ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random num = new Random();
                int r = num.nextInt(5);
                Log.d("magic-eight-ball","rand is"+r);
                eight.setImageResource(ball[r]);
            }
        });
    }
}
