package com.cindodcindy.etherapy.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.cindodcindy.etherapy.R;

public class AdminUploadKristen extends AppCompatActivity {

    private TextView textView_lihat_rate_kristen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_upload_kristen);
        textView_lihat_rate_kristen=findViewById(R.id.tv_admin_lihat_kristen_list);

        textView_lihat_rate_kristen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminUploadKristen.this,UserKristenMotivasi.class);
                startActivity(intent);
                finish();
            }
        });
    }
}