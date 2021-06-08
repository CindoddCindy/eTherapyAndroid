package com.cindodcindy.etherapy.view;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.cindodcindy.etherapy.R;

public class PlayMusicActivity extends AppCompatActivity {

    MediaPlayer mp;

    private Button button_play, button_pause, button_stop;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_music);

        mp=MediaPlayer.create(this, R.raw.file_example_);

        button_play=findViewById(R.id.btnPlay);

        button_pause=findViewById(R.id.btnPause);

        button_stop=findViewById(R.id.btnStop);

        button_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp.start();

            }
        });

        button_pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();

            }
        });

        button_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.stop();
               // mp=MediaPlayer.create(this, R.raw.file_example_);

            }
        });
    }
}