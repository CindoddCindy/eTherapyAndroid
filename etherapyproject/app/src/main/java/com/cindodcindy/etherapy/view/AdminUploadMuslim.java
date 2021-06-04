package com.cindodcindy.etherapy.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.cindodcindy.etherapy.R;

public class AdminUploadMuslim extends AppCompatActivity {

    private TextView textView_btn_lihat_muslim_list_rate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_upload_muslim);
        textView_btn_lihat_muslim_list_rate=findViewById(R.id.tv_btn_admin_lihat_muslim_rate);

        textView_btn_lihat_muslim_list_rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminUploadMuslim.this,UserMuslimMotivasi.class);
                startActivity(intent);
                finish();
            }
        });
    }
}