package com.cindodcindy.etherapy.view.adapter_admin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cindodcindy.etherapy.R;
import com.cindodcindy.etherapy.model.MusicClass;
import com.cindodcindy.etherapy.view.adapter_user.UserAdapterMusic;

import java.util.List;

public class AdminMusicAdapter extends RecyclerView.Adapter<AdminMusicAdapter.MusicAdapterChild> {
    public Context context;

    public List<MusicClass> modelSementaras;

    public UserAdapterMusic(Context context, List<MusicClass> modelSementaras){
        this.context=context;
        this.modelSementaras=modelSementaras;
    }
    @NonNull
    @Override
    public MusicAdapterChild onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View views= layoutInflater.inflate(R.layout.music_adapter_list_user, parent, false);
        UserAdapterMusic.MusicChild sellerDoneChild=new UserAdapterMusic.MusicChild(views);

        return sellerDoneChild;
        return null;
    }

    @Override
    public void onBindViewHolder( AdminMusicAdapter.MusicAdapterChild holder, int position) {
        holder.textView_music_title.setText(modelSementaras.get(position).getTitle());


    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MusicAdapterChild extends RecyclerView.ViewHolder{

        public MusicAdapterChild( View itemView) {
            super(itemView);
        }
    }
}
