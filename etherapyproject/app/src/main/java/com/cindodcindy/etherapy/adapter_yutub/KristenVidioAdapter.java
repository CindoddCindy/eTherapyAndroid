package com.cindodcindy.etherapy.adapter_yutub;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import androidx.recyclerview.widget.RecyclerView;

import com.cindodcindy.etherapy.R;
import com.cindodcindy.etherapy.model.YutubModel;

import java.util.List;

public class KristenVidioAdapter extends RecyclerView.Adapter<KristenVidioAdapter.VideoViewHolder> {

    public List<YutubModel> youtubeVideoList;
    public Context context;
    public KristenVidioAdapter(List<YutubModel> youtubeVideoList,Context context) {
        this.youtubeVideoList = youtubeVideoList;
        this.context=context;
    }
    @Override
    public VideoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( parent.getContext()).inflate(R.layout.vidio_view, parent, false);
        return new VideoViewHolder(view);
    }
    @Override
    public void onBindViewHolder(VideoViewHolder holder, int position) {
        holder.videoWeb.loadData( youtubeVideoList.get(position).getVideoUrl(), "text/html" , "utf-8");
    }
    @Override
    public int getItemCount() {
        return youtubeVideoList.size();
    }
    class VideoViewHolder extends RecyclerView.ViewHolder{
        WebView videoWeb;
        VideoViewHolder(View itemView) {
            super(itemView);
            videoWeb = itemView.findViewById(R.id.web_view_test);
            videoWeb.getSettings().setJavaScriptEnabled(true);
            videoWeb.setWebChromeClient(new WebChromeClient() {
            } );
        }
    }
}
