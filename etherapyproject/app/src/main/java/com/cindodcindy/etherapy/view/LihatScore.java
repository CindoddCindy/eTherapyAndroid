package com.cindodcindy.etherapy.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.cindodcindy.etherapy.R;

public class LihatScore extends AppCompatActivity {

    private TextView textView_hasil_quiz;
   // private Button cek_score_quiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_score);

        textView_hasil_quiz=findViewById(R.id.tv_hasil_quiz);

        cekHasilScore();
        /*
        cek_score_quiz=findViewById(R.id.btn_cek_hasil_quiz);

        cek_score_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cekHasilScore();
                textView_hasil_quiz.setText("Hore Nilai Kamu 100");
            }

        });


         */

    }

    public void cekHasilScore(){

        if(getIntent().getExtras()!=null){
            /**
             * Jika Bundle ada, ambil data dari Bundle
             */
            Bundle bundle = getIntent().getExtras();
            //textView_jenis_makanan.setText(bundle.getString("jm"));

            textView_hasil_quiz.setText(bundle.getString("score_a","Terimah Kasih Telah Menjawab"));
            textView_hasil_quiz.setText(bundle.getString("score_d", "Terimah Kasih Telah Menjawab"));

        }
    }
}