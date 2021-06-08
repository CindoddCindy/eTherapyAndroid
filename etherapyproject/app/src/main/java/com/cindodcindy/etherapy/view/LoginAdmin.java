package com.cindodcindy.etherapy.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.cindodcindy.etherapy.R;
import com.cindodcindy.etherapy.shared_pref.SharedPrefHandle;

public class LoginAdmin extends AppCompatActivity {

    private Button button_admin_login;

    private SharedPrefHandle sharedPrefHandle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_admin);
        sharedPrefHandle=new SharedPrefHandle(LoginAdmin.this);

        if (sharedPrefHandle.getSPSudahLogin()){
            startActivity(new Intent(LoginAdmin.this, BottomNavAdmin.class)
                    .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK));
            finish();
        }

        button_admin_login=findViewById(R.id.btn_admin_login);
        button_admin_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginAdmin.this, BottomNavAdmin.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void loginAdmin(){


    }
}