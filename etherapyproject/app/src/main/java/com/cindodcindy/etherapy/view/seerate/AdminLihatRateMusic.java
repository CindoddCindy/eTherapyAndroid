package com.cindodcindy.etherapy.view.seerate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.cindodcindy.etherapy.R;
import com.cindodcindy.etherapy.model.MusicClass;
import com.cindodcindy.etherapy.view.UserMuslimMotivasi;
import com.cindodcindy.etherapy.view.adapter_admin.AdminMusicAdapter;
import com.cindodcindy.etherapy.view.adapter_user.UserAdapterKristen;
import com.cindodcindy.etherapy.view.adapter_user.UserAdapterMuslim;

import java.util.ArrayList;
import java.util.List;

public class AdminLihatRateMusic extends AppCompatActivity {
    private List<MusicClass> modelSementaraList ;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager_dua;
    private AdminMusicAdapter adminMusicAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_lihat_rate_music);

        recyclerView =findViewById(R.id.rv_admin_lihat_music);
        // recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));

        // LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(AdminLihatRateMusic.this));
        //recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        //


        modelSementaraList = new ArrayList<>();
        modelSementaraList.add(new MusicClass("Music Title"));
        modelSementaraList.add(new MusicClass("Music Title"));
        modelSementaraList.add(new MusicClass("Music Title"));
        modelSementaraList.add(new MusicClass("Music Title"));
        modelSementaraList.add(new MusicClass("Music Title"));
        modelSementaraList.add(new MusicClass("Music Title"));
        modelSementaraList.add(new MusicClass("Music Title"));
        modelSementaraList.add(new MusicClass("Music Title"));
        modelSementaraList.add(new MusicClass("Music Title"));
        modelSementaraList.add(new MusicClass("Music Title"));

        adminMusicAdapter= new AdminMusicAdapter(AdminLihatRateMusic.this,modelSementaraList);
        recyclerView.setAdapter(adminMusicAdapter);
    }
}