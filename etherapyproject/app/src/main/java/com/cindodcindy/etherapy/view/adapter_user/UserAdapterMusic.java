package com.cindodcindy.etherapy.view.adapter_user;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cindodcindy.etherapy.R;
import com.cindodcindy.etherapy.model.MusicClass;

import java.util.List;

public class UserAdapterMusic extends RecyclerView.Adapter<UserAdapterMusic.MusicChild> {

    public Context context;

    public List<MusicClass> modelSementaras;

    public UserAdapterMusic(Context context, List<MusicClass> modelSementaras){
        this.context=context;
        this.modelSementaras=modelSementaras;
    }


    @NonNull
    @Override
    public MusicChild onCreateViewHolder( ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View views= layoutInflater.inflate(R.layout.music_adapter_list_user, parent, false);
        MusicChild sellerDoneChild=new MusicChild(views);

        return sellerDoneChild;


    }

    @Override
    public void onBindViewHolder( UserAdapterMusic.MusicChild holder, int position) {

        holder.textView_music_title.setText(modelSementaras.get(position).getTitle());


    }

    @Override
    public int getItemCount() {
        return modelSementaras.size();
    }

    public  class MusicChild extends RecyclerView.ViewHolder{

        private TextView textView_music_title;

        public MusicChild( View itemView) {
            super(itemView);
            textView_music_title=itemView.findViewById(R.id.tv_user_music_title);
        }
    }
}
