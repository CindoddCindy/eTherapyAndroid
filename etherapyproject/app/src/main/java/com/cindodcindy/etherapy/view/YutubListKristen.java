package com.cindodcindy.etherapy.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.cindodcindy.etherapy.R;
import com.cindodcindy.etherapy.adapter_yutub.KristenVidioAdapter;
import com.cindodcindy.etherapy.model.YutubModel;
import com.cindodcindy.etherapy.view.adapter_user.UserAdapterKristen;

import java.util.Vector;

public class YutubListKristen extends AppCompatActivity {

    RecyclerView recyclerView;
    Vector<YutubModel> youtubeVideos = new Vector<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yutub_list_kristen);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager( new LinearLayoutManager(YutubListKristen.this));
        youtubeVideos.add( new YutubModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www" + ".youtube.com/embed/eWEF1Zrmdow\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YutubModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www" +".youtube.com/embed/KyJ71G2UxTQ\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YutubModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www" +".youtube.com/embed/y8Rr39jKFKU\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YutubModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www" +".youtube.com/embed/8Hg1tqIwIfI\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YutubModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www" +".youtube.com/embed/uhQ7mh_o_cM\" frameborder=\"0\" allowfullscreen></iframe>") );



        KristenVidioAdapter videoAdapter = new KristenVidioAdapter(youtubeVideos,YutubListKristen.this);
        recyclerView.setAdapter(videoAdapter);
    }
}