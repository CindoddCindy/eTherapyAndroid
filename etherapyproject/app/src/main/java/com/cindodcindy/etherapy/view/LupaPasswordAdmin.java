package com.cindodcindy.etherapy.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.cindodcindy.etherapy.R;
import com.cindodcindy.etherapy.shared_pref.SharedPrefHandle;

public class LupaPasswordAdmin extends AppCompatActivity {

    private TextView textView_lp_pass;
    private Button button_back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupa_password_admin);


        textView_lp_pass=findViewById(R.id.tv_admin_isi_password);
        button_back=findViewById(R.id.btn_back_admin_ps);


        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LupaPasswordAdmin.this, LoginAdmin.class);
                startActivity(intent);
            }
        });
    }
}