package com.cindodcindy.etherapy.view.adapter_admin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cindodcindy.etherapy.R;
import com.cindodcindy.etherapy.model.MusicClass;
import com.cindodcindy.etherapy.view.adapter_user.UserAdapterMusic;

import java.util.List;

public class AdminMusicAdapter extends RecyclerView.Adapter<AdminMusicAdapter.MusicAdapterChild> {
    public Context context;

    public List<MusicClass> modelSementaras;

    public AdminMusicAdapter(Context context, List<MusicClass> modelSementaras){
        this.context=context;
        this.modelSementaras=modelSementaras;
    }
    @NonNull
    @Override
    public MusicAdapterChild onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View views= layoutInflater.inflate(R.layout.admin_lihat_rate_music, parent, false);
        MusicAdapterChild sellerDoneChild=new MusicAdapterChild(views);

        return sellerDoneChild;

    }

    @Override
    public void onBindViewHolder( AdminMusicAdapter.MusicAdapterChild holder, int position) {
        holder.textView_admin_lihat_music_title.setText(modelSementaras.get(position).getTitle());


    }

    @Override
    public int getItemCount() {
        return modelSementaras.size();
    }

    public class MusicAdapterChild extends RecyclerView.ViewHolder{

        private TextView textView_admin_lihat_music_title;

        public MusicAdapterChild( View itemView) {
            super(itemView);

            textView_admin_lihat_music_title=itemView.findViewById(R.id.tv_admin_lihat_music);
        }
    }
}
