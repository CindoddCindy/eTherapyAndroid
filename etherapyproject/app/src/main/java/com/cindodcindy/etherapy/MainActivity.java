package com.cindodcindy.etherapy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.cindodcindy.etherapy.view.SelectLoginActivity;

public class MainActivity extends AppCompatActivity {
    private int waktu_loading=5000;

    //4000=4 detik
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke home activity
                Intent intent=new Intent(MainActivity.this, SelectLoginActivity.class);
                startActivity(intent);
                finish();

            }
        },waktu_loading);
    }
}