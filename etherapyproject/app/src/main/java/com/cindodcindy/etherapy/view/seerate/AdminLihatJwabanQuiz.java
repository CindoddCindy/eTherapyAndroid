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
        modelSementaraList.add(new MusicClass("Siapa Presiden Indonesia saat ini", "jokowidodo","megawati","sby","susi"));
        modelSementaraList.add(new MusicClass("Apa Warna Semangka","Merah","biru","putih","kuning"));
        modelSementaraList.add(new MusicClass("Indonesia Merdeka pada", "17 Agustus","2 Mey","28 Oktober","17 Febuari"));
        modelSementaraList.add(new MusicClass("Waktu Di Indonesia Di bagi menjadi", "Tiga","dua","satu","empat"));

        modelSementaraList.add(new MusicClass("Covid adalah", "bakteri","zat","unsur","virus"));
        modelSementaraList.add(new MusicClass("Ibu Kota indonesia adalah","Bali","Bandung","Ambon","Jakarta"));
        modelSementaraList.add(new MusicClass("Beda waktu WIB dan WIT adalah", "5","7","10","2"));
        modelSementaraList.add(new MusicClass("Matahari Terbit dari", "Tengah","Selatan","kiri","timur"));


/*
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

 */


        adminGameAdapter= new AdminGameAdapter(AdminLihatJwabanQuiz.this,modelSementaraList);
        recyclerView.setAdapter(adminGameAdapter);
    }
}