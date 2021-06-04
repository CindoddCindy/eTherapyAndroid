package com.cindodcindy.etherapy.view.adapter_admin;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdminMusicAdapter extends RecyclerView.Adapter<AdminMusicAdapter.MusicAdapterChild> {

    @NonNull
    @Override
    public MusicAdapterChild onCreateViewHolder( ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder( AdminMusicAdapter.MusicAdapterChild holder, int position) {

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
