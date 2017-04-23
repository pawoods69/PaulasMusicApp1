package com.example.android.paulasmusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the listen now category
        TextView now = (TextView) findViewById(R.id.now);

        // Set a click listener on that View
        now.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the now category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NowActivity}
                Intent nowIntent = new Intent(MainActivity.this, NowActivity.class);

                // Start the new activity
                startActivity(nowIntent);
            }
        });

        // Find the View that shows the history category
        TextView history = (TextView) findViewById(R.id.history);

        // Set a click listener on that View
        history.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the history category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link HistoryActivity}
                Intent historyIntent = new Intent(MainActivity.this, HistoryActivity.class);

                // Start the new activity
                startActivity(historyIntent);
            }
        });

        // Find the View that shows the lyrics category
        TextView lyrics = (TextView) findViewById(R.id.lyrics);

        // Set a click listener on that View
        lyrics.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the lyrics category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link LyricsActivity}
                Intent lyricsIntent = new Intent(MainActivity.this, LyricsActivity.class);

                // Start the new activity
                startActivity(lyricsIntent);
            }
        });

        // Find the View that shows the video category
        TextView video = (TextView) findViewById(R.id.video);

        // Set a click listener on that View
        video.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the video category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link VideoActivity}
                Intent videoIntent = new Intent(MainActivity.this, VideoActivity.class);

                // Start the new activity
                startActivity(videoIntent);
            }
        });
        // Find the View that shows the buy category
        TextView buy = (TextView) findViewById(R.id.buy);

        // Set a click listener on that View
        buy.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the buy category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link BuyActivity}
                Intent buyIntent = new Intent(MainActivity.this, BuyActivity.class);

                // Start the new activity
                startActivity(buyIntent);
            }
        });
    }
}
