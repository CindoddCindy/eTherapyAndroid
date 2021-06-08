package com.cindodcindy.etherapy.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.cindodcindy.etherapy.R;
import com.cindodcindy.etherapy.model.MusicClass;
import com.cindodcindy.etherapy.view.adapter_user.UserAdapterKristen;

import java.util.ArrayList;
import java.util.List;

public class UserKristenMotivasi extends AppCompatActivity {

    private List<MusicClass> modelSementaraList ;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager_dua;
    private UserAdapterKristen userAdapterKristen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_kristen_motivasi);

        recyclerView =findViewById(R.id.rv_user_kristen_motivasi);
        // recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));

        // LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(UserKristenMotivasi.this));
        //recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        //


        modelSementaraList = new ArrayList<>();
        modelSementaraList.add(new MusicClass("Anda akan kesepian jika membangun tembok, bukan jembatan"));
        modelSementaraList.add(new MusicClass("Kesempatan terbaik adalah melakukan hal yang baik untuk orang lain"));
        modelSementaraList.add(new MusicClass("Motivation Title"));
        modelSementaraList.add(new MusicClass("Motivation Title"));
        modelSementaraList.add(new MusicClass("Motivation Title"));
        modelSementaraList.add(new MusicClass("Motivation Title"));
        modelSementaraList.add(new MusicClass("Motivation Title"));
        modelSementaraList.add(new MusicClass("Motivation Title"));
        modelSementaraList.add(new MusicClass("Motivation Title"));
        modelSementaraList.add(new MusicClass("Motivation Title"));


        userAdapterKristen= new UserAdapterKristen(UserKristenMotivasi.this,modelSementaraList);
        recyclerView.setAdapter(userAdapterKristen);

    }
}