package com.cindodcindy.etherapy.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.cindodcindy.etherapy.R;

public class LupaPasswordUser extends AppCompatActivity {

    private Button button_back_user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupa_password_user);
        button_back_user=findViewById(R.id.btn_back_user_ps);

        button_back_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(LupaPasswordUser.this,LoginUser.class);
                startActivity(intent);
            }
        });
    }
}