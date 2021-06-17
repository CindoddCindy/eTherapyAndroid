package com.cindodcindy.etherapy.view;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.cindodcindy.etherapy.R;

import java.io.IOException;

public class PlayMusicActivity extends AppCompatActivity {

    MediaPlayer bed, forever, listen, love, sleeping;
    String [] lagu = {"Daftar Lagu","Bed of Roses", "Forever & One",
            "Listen To Your Heart","Love of My Life", "Sleeping Child"};
    int urutanDiPilih;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_music);


        bed = MediaPlayer.create(this, R.raw.music_a);
        forever = MediaPlayer.create(this, R.raw.music_b);
        listen = MediaPlayer.create(this, R.raw.music_c);
        love = MediaPlayer.create(this, R.raw.music_d);
        sleeping = MediaPlayer.create(this, R.raw.music_e);

        Spinner spinLagu = findViewById(R.id.spinnerLagu);
        ArrayAdapter ada = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_dropdown_item, lagu);
        spinLagu.setDropDownWidth(350);
        spinLagu.setAdapter(ada);

        spinLagu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int urutan, long id) {
                urutanDiPilih = urutan;
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        Button play = findViewById(R.id.btnPlay);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (urutanDiPilih) {
                    case 1 :
                        bed.start();
                        break;
                    case 2 :
                        forever.start();
                        break;
                    case 3 :
                        listen.start();
                        break;
                    case 4 :
                        love.start();
                        break;
                    case 5 :
                        sleeping.start();
                        break;
                }
            }
        });
        Button stop = findViewById(R.id.btnStop);
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (urutanDiPilih) {
                    case 1 :
                        bed.pause();
                        bed.seekTo(0);
                        break;
                    case 2 :
                        forever.pause();
                        forever.seekTo(0);
                        break;
                    case 3 :
                        listen.pause();
                        listen.seekTo(0);
                        break;
                    case 4 :
                        love.pause();
                        love.seekTo(0);
                        break;
                    case 5 :
                        sleeping.pause();
                        sleeping.seekTo(0);
                        break;
                }
            }
        });

           }


}