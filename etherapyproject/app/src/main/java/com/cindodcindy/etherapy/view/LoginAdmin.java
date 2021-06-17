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

public class LoginAdmin extends AppCompatActivity {

    private Button button_admin_login;

    private TextView textView_lupa_password;

    private SharedPrefHandle sharedPrefHandle;

    private EditText editText_nama, editText_email, editText_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_admin);
        sharedPrefHandle=new SharedPrefHandle(LoginAdmin.this);

        editText_nama=findViewById(R.id.et_admin_nama);
        editText_email=findViewById(R.id.et_admin_email);
        textView_lupa_password=findViewById(R.id.tv_admin_lupa_password);

        textView_lupa_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginAdmin.this,LupaPasswordAdmin.class);
                startActivity(intent);
            }
        });
        editText_password=findViewById(R.id.et_admin_password);

        if (sharedPrefHandle.getSPSudahLogin()){
            startActivity(new Intent(LoginAdmin.this, BottomNavAdmin.class)
                    .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK));
            finish();
        }

        button_admin_login=findViewById(R.id.btn_admin_login);
        button_admin_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText_nama.getText().toString().isEmpty()&&editText_email.getText().toString().isEmpty()&&editText_password.getText().toString().isEmpty()){
                    editText_nama.setError("nama belum diisi");
                    editText_email.setError("Email belum diisi");
                    editText_password.setError("password belum diisi");


                }else {
                    loginAdmin();


                }
            }
        });
    }

    private void loginAdmin(){

        String nama = editText_nama.getText().toString();
        String email= editText_email.getText().toString();
        String password=editText_password.getText().toString();

        if (nama=="febyriwindi09@gmail.com") {

            Toast.makeText(getApplicationContext(), "BERHASIL LOGIN", Toast.LENGTH_SHORT).show();
            sharedPrefHandle.setSpNama(SharedPrefHandle.SP_NAMA, nama);
            sharedPrefHandle.setSpEmail(SharedPrefHandle.SP_EMAIL, email);
            sharedPrefHandle.setSpPassword(SharedPrefHandle.SP_PASSWORD, password);
            // Shared Pref ini berfungsi untuk menjadi trigger session login
            sharedPrefHandle.saveSPBoolean(SharedPrefHandle.SP_SUDAH_LOGIN, true);
            startActivity(new Intent(getApplicationContext(), BottomNavAdmin.class)
                    .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK));
            finish();
        }

        else {
            Toast.makeText(getApplicationContext(), "Email Tidak Cocok", Toast.LENGTH_SHORT).show();

        }
    }
}