package com.cindodcindy.etherapy.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.cindodcindy.etherapy.R;
import com.cindodcindy.etherapy.shared_pref.SharedPrefHandle;
import com.cindodcindy.etherapy.shared_pref.SharedPrefUser;

public class LoginUser extends AppCompatActivity {

    private Button button_user_login;

    private TextView textView_lupa_password;
    private EditText editText_nama, editText_email, editText_password;

    private SharedPrefUser sharedPrefUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_user);


        sharedPrefUser=new SharedPrefUser(LoginUser.this);

        textView_lupa_password=findViewById(R.id.tv_user_lupa_password);
        editText_nama=findViewById(R.id.et_user_name);
        editText_email=findViewById(R.id.et_user_email);
        editText_password=findViewById(R.id.et_user_password);

        textView_lupa_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(LoginUser.this,LupaPasswordUser.class);
                startActivity(intent);
            }
        });

        if (sharedPrefUser.getSPSudahLogin()){
            startActivity(new Intent(LoginUser.this, BottomNavUser.class)
                    .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK));
            finish();
        }


        button_user_login=findViewById(R.id.btn_login_user);

        button_user_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText_nama.getText().toString().isEmpty()&&editText_email.getText().toString().isEmpty()&&editText_password.getText().toString().isEmpty()){
                    editText_nama.setError("nama belum diisi");
                    editText_email.setError("Email belum diisi");
                    editText_password.setError("password belum diisi");


                }else {
                    loginUser();


                }
            }
        });
    }


    private void loginUser(){

        String nama = editText_nama.getText().toString();
        String email= editText_email.getText().toString();
        String password=editText_password.getText().toString();

        Toast.makeText(getApplicationContext(), "BERHASIL LOGIN", Toast.LENGTH_SHORT).show();
        sharedPrefUser.setSpNama(SharedPrefHandle.SP_NAMA, nama);
        sharedPrefUser.setSpEmail(SharedPrefHandle.SP_EMAIL,email);
        sharedPrefUser.setSpPassword(SharedPrefHandle.SP_PASSWORD,password);
        // Shared Pref ini berfungsi untuk menjadi trigger session login
        sharedPrefUser.saveSPBoolean(SharedPrefHandle.SP_SUDAH_LOGIN, true);
        startActivity(new Intent(getApplicationContext(), BottomNavUser.class)
                .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK));
        finish();
    }
}