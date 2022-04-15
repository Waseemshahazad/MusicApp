package com.codewithcoffee.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgPlay;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgPlay = findViewById(R.id.imgPlay);

        mediaPlayer = MediaPlayer.create(this,R.raw.one);
        imgPlay.setImageResource(R.drawable.ic_baseline_play_circle_filled_24);

        imgPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    imgPlay.setImageResource(R.drawable.ic_baseline_play_circle_filled_24);
                }
                else {
                   mediaPlayer.start();
                    imgPlay.setImageResource(R.drawable.ic_baseline_pause_circle_outline_24);

                }
            }
        });
    }
}