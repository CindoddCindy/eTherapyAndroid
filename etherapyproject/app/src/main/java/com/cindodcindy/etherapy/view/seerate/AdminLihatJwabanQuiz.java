package com.cindodcindy.etherapy.view.seerate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.cindodcindy.etherapy.R;
import com.cindodcindy.etherapy.model.MusicClass;
import com.cindodcindy.etherapy.view.UserMuslimMotivasi;
import com.cindodcindy.etherapy.view.adapter_admin.AdminGameAdapter;
import com.cindodcindy.etherapy.view.adapter_user.UserAdapterKristen;
import com.cindodcindy.etherapy.view.adapter_user.UserAdapterMuslim;

import java.util.ArrayList;
import java.util.List;

public class AdminLihatJwabanQuiz extends AppCompatActivity {

    private List<MusicClass> modelSementaraList ;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager_dua;
    private AdminGameAdapter adminGameAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_lihat_jwaban_quiz);

        recyclerView =findViewById(R.id.rv_admin_lihat_quiz);
        // recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));

        // LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(AdminLihatJwabanQuiz.this));
        //recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        //


        modelSementaraList = new ArrayList<>();
        modelSementaraList.add(new MusicClass("Quiz Title"));
        modelSementaraList.add(new MusicClass("Quiz Title"));
        modelSementaraList.add(new MusicClass("Quiz Title"));
        modelSementaraList.add(new MusicClass("Quiz Title"));
        modelSementaraList.add(new MusicClass("Quiz Title"));
        modelSementaraList.add(new MusicClass("Quiz Title"));
        modelSementaraList.add(new MusicClass("Quiz Title"));
        modelSementaraList.add(new MusicClass("Quiz Title"));
        modelSementaraList.add(new MusicClass("Quiz Title"));
        modelSementaraList.add(new MusicClass("Quiz Title"));
        modelSementaraList.add(new MusicClass("Quiz Title"));
        modelSementaraList.add(new MusicClass("Quiz Title"));


        adminGameAdapter= new AdminGameAdapter(AdminLihatJwabanQuiz.this,modelSementaraList);
        recyclerView.setAdapter(adminGameAdapter);
    }
}