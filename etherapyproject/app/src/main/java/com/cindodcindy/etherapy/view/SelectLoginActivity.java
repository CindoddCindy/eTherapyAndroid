package com.cindodcindy.etherapy.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.cindodcindy.etherapy.R;

public class SelectLoginActivity extends AppCompatActivity {

    private Button button_admin, button_user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_login);

        button_admin=findViewById(R.id.btn_admin);
        button_user=findViewById(R.id.btn_user);

        button_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectLoginActivity.this, LoginAdmin.class);
                startActivity(intent);
                finish();

            }
        });

        button_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SelectLoginActivity.this, LoginUser.class);
                startActivity(intent);
                finish();


            }
        });
    }
}