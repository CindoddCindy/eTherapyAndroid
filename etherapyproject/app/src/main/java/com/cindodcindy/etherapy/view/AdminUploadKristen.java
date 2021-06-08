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
import com.cindodcindy.etherapy.model.post_mot_kris.PostMotivasiKristen;
import com.cindodcindy.etherapy.retrofit.MethodsFactory;
import com.cindodcindy.etherapy.retrofit.RetrofitHandle;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AdminUploadKristen extends AppCompatActivity {

    private TextView textView_lihat_rate_kristen;
    private EditText editText_title, editText_description, editText_content;
    private Button button_upload_kristen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_upload_kristen);
        textView_lihat_rate_kristen=findViewById(R.id.tv_admin_lihat_kristen_list);

       editText_title=findViewById(R.id.edit_text_admin_upload_title_kristen);
       editText_description=findViewById(R.id.edit_text_admin_upload_description_kristen);
       editText_content=findViewById(R.id.edit_text_admin_upload_kristen_content);

        button_upload_kristen=findViewById(R.id.btn_admin_upload_kristen_motivasi);

        textView_lihat_rate_kristen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminUploadKristen.this,UserKristenMotivasi.class);
                startActivity(intent);
                finish();
            }
        });

        button_upload_kristen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   // uploadMotivation();

                Toast.makeText(AdminUploadKristen.this, "Berhasil Upload", Toast.LENGTH_SHORT).show();            }
        });
    }

//bisa di panggil nnti kalau sdh di server db nya
    public void uploadMotivation(){


            String et_title=editText_title.getText().toString();
            String et_desc=editText_content.getText().toString();
            String et_content=editText_description.getText().toString();

            JsonObject jsonObject = new JsonObject();

            jsonObject.addProperty("title", et_title);
            jsonObject.addProperty("description",et_desc);
            jsonObject.addProperty("content", et_content);

            MethodsFactory methodsFactory =  RetrofitHandle.getRetrofitLink().create(MethodsFactory.class);
            Call<PostMotivasiKristen> call= methodsFactory.postChMotivation(jsonObject);
            call.enqueue(new Callback<PostMotivasiKristen>() {
                @Override
                public void onResponse(Call<PostMotivasiKristen> call, Response<PostMotivasiKristen> response) {
                    if(response.isSuccessful()){

                        Toast.makeText(AdminUploadKristen.this, " Post Successfully", Toast.LENGTH_SHORT).show();


                    }

                    else {
                        // error case
                        switch (response.code()) {
                            case 404:
                                Toast.makeText(AdminUploadKristen.this, " not found", Toast.LENGTH_SHORT).show();
                                break;
                            case 500:
                                Toast.makeText(AdminUploadKristen.this, "server error", Toast.LENGTH_SHORT).show();
                                break;
                            case 401:
                                Toast.makeText(AdminUploadKristen.this, " sorry can't authenticated, try again", Toast.LENGTH_SHORT).show();
                                break;

                            default:
                                Toast.makeText(AdminUploadKristen.this, "unknown error ", Toast.LENGTH_SHORT).show();
                                break;
                        }
                    }

                }

                @Override
                public void onFailure(Call<PostMotivasiKristen> call, Throwable t) {
                    Toast.makeText(AdminUploadKristen.this, "network failure :( inform the user and possibly retry ", Toast.LENGTH_SHORT).show();

                }
            });




    }
}