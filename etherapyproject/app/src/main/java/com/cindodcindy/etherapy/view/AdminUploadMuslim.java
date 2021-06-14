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
import com.cindodcindy.etherapy.model.post_mot_mus.PostMotivasiMuslim;
import com.cindodcindy.etherapy.retrofit.MethodsFactory;
import com.cindodcindy.etherapy.retrofit.RetrofitHandle;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AdminUploadMuslim extends AppCompatActivity {

    private TextView textView_btn_lihat_muslim_list_rate;

    private TextView textView_lihat_chart;
    private EditText editText_title, editText_description, editText_content;
    private Button button_upload_motivation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_upload_muslim);
        textView_btn_lihat_muslim_list_rate=findViewById(R.id.tv_btn_admin_lihat_muslim_rate);

        textView_lihat_chart=findViewById(R.id.tv_btn_lihat_laporan_muslim);

        textView_lihat_chart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminUploadMuslim.this, MuslimLaporan.class);
                startActivity(intent);
            }
        });

        editText_title=findViewById(R.id.edit_text_admin_upload_title_muslim);
        editText_description=findViewById(R.id.edit_text_admin_upload_description_muslin);
        editText_content=findViewById(R.id.edit_text_admin_upload_content_muslin);

        button_upload_motivation=findViewById(R.id.btn_upload_motivation_muslim_activity);

        textView_btn_lihat_muslim_list_rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminUploadMuslim.this,UserMuslimMotivasi.class);
                startActivity(intent);
                finish();
            }
        });

        button_upload_motivation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //uploadMotivation();
                //Intent intent = new Intent(AdminUploadMuslim.this, MotivasiMuslim.class);
                //startActivity(intent);
                Toast.makeText(AdminUploadMuslim.this, "Berhasil Upload", Toast.LENGTH_SHORT).show();
            }
        });
    }

    //dipanggil ketika sudh upload di server
    public void uploadMotivation(){

        String et_title=editText_title.getText().toString();
        String et_desc=editText_content.getText().toString();
        String et_content=editText_description.getText().toString();

        JsonObject jsonObject = new JsonObject();

        jsonObject.addProperty("title", et_title);
        jsonObject.addProperty("description",et_desc);
        jsonObject.addProperty("content", et_content);

        MethodsFactory methodsFactory =  RetrofitHandle.getRetrofitLink().create(MethodsFactory.class);
        Call<PostMotivasiMuslim> call= methodsFactory.postMsMotivation(jsonObject);
        call.enqueue(new Callback<PostMotivasiMuslim>() {
            @Override
            public void onResponse(Call<PostMotivasiMuslim> call, Response<PostMotivasiMuslim> response) {
                if(response.isSuccessful()){

                    Toast.makeText(AdminUploadMuslim.this, " Post Successfully", Toast.LENGTH_SHORT).show();


                }

                else {
                    // error case
                    switch (response.code()) {
                        case 404:
                            Toast.makeText(AdminUploadMuslim.this, " not found", Toast.LENGTH_SHORT).show();
                            break;
                        case 500:
                            Toast.makeText(AdminUploadMuslim.this, "server error", Toast.LENGTH_SHORT).show();
                            break;
                        case 401:
                            Toast.makeText(AdminUploadMuslim.this, " sorry can't authenticated, try again", Toast.LENGTH_SHORT).show();
                            break;

                        default:
                            Toast.makeText(AdminUploadMuslim.this, "unknown error ", Toast.LENGTH_SHORT).show();
                            break;
                    }
                }

            }

            @Override
            public void onFailure(Call<PostMotivasiMuslim> call, Throwable t) {
                Toast.makeText(AdminUploadMuslim.this, "network failure :( inform the user and possibly retry ", Toast.LENGTH_SHORT).show();

            }
        });




    }
}