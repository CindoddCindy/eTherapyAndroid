package com.cindodcindy.etherapy.view;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.cindodcindy.etherapy.R;

import java.io.IOException;

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

        stateAwal();

        button_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                play();
                button_play.setEnabled(false);
                button_pause.setEnabled(true);
                button_stop.setEnabled(true);
                //mp.start();

            }
        });

        button_pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // mp.pause();
                pause();

            }
        });

        button_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stop();
               // mp.stop();
               // mp=MediaPlayer.create(this, R.raw.file_example_);

            }
        });
    }


    /** State Awal / Pertama Dijalankan */
    public void stateAwal(){
        button_play.setEnabled(true);
        button_pause.setEnabled(false);
        button_stop.setEnabled(false);
    }

    /** Dijalankan Oleh Tombol Play */
    private void play() {
        /** Memanggil File MP3 "indonesiaraya.mp3" */
        mp = MediaPlayer.create(this, R.raw.file_example_);

        try {
            mp.prepare();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /** Menjalankan Audio */
        mp.start();

        /** Penanganan Ketika Suara Berakhir */
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stateAwal();
            }
        });
    }

    /** Dijalankan Oleh Tombol Pause */
    public void pause(){
        if(mp.isPlaying()){
            if(mp!=null){
                mp.pause();

            }
        } else {
            if(mp!=null){
                mp.start();

            }
        }
    }

    /** Dijalankan Oleh Tombol Stop */
    public void stop(){
        mp.stop();

        try{
            mp.prepare();
            mp.seekTo(0);
        }catch (Throwable t) {
            t.printStackTrace();
        }

        stateAwal();
    }

}