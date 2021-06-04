package com.cindodcindy.etherapy.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.cindodcindy.etherapy.R;
import com.cindodcindy.etherapy.model.MusicClass;
import com.cindodcindy.etherapy.view.adapter_user.UserAdapterMuslim;

import java.util.ArrayList;
import java.util.List;

public class UserMuslimMotivasi extends AppCompatActivity {
    private List<MusicClass> modelSementaraList ;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager_dua;
    private UserAdapterMuslim userAdapterMuslim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_muslim_motivasi);

        recyclerView =findViewById(R.id.rv_muslim_motivation);
        // recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));

        // LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(UserMuslimMotivasi.this));
        //recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        //


        modelSementaraList = new ArrayList<>();
        modelSementaraList.add(new MusicClass("Motivation Title"));
        modelSementaraList.add(new MusicClass("Motivation Title"));
        modelSementaraList.add(new MusicClass("Motivation Title"));
        modelSementaraList.add(new MusicClass("Motivation Title"));
        modelSementaraList.add(new MusicClass("Motivation Title"));
        modelSementaraList.add(new MusicClass("Motivation Title"));
        modelSementaraList.add(new MusicClass("Motivation Title"));
        modelSementaraList.add(new MusicClass("Motivation Title"));
        modelSementaraList.add(new MusicClass("Motivation Title"));
        modelSementaraList.add(new MusicClass("Motivation Title"));
        modelSementaraList.add(new MusicClass("Motivation Title"));


        userAdapterMuslim= new UserAdapterMuslim(UserMuslimMotivasi.this,modelSementaraList);
        recyclerView.setAdapter(userAdapterMuslim);
    }
}