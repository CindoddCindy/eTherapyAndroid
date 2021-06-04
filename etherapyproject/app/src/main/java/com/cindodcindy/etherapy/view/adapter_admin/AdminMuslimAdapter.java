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

public class AdminMuslimAdapter extends RecyclerView.Adapter<AdminMuslimAdapter.MuslimAdapterChild> {
    public Context context;

    public List<MusicClass> modelSementaras;

    public UserAdapterMusic(Context context, List<MusicClass> modelSementaras){
        this.context=context;
        this.modelSementaras=modelSementaras;
    }
    @NonNull
    @Override
    public MuslimAdapterChild onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View views= layoutInflater.inflate(R.layout.music_adapter_list_user, parent, false);
        UserAdapterMusic.MusicChild sellerDoneChild=new UserAdapterMusic.MusicChild(views);

        return sellerDoneChild;
        return null;
    }

    @Override
    public void onBindViewHolder( AdminMuslimAdapter.MuslimAdapterChild holder, int position) {
        holder.textView_music_title.setText(modelSementaras.get(position).getTitle());


    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MuslimAdapterChild extends RecyclerView.ViewHolder{

        public MuslimAdapterChild( View itemView) {
            super(itemView);
        }
    }
}
