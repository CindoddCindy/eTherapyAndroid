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

public class AdminGameAdapter extends RecyclerView.Adapter<AdminGameAdapter.GameAdapterChild> {
    public Context context;

    public List<MusicClass> modelSementaras;

    public AdminGameAdapter(Context context, List<MusicClass> modelSementaras){
        this.context=context;
        this.modelSementaras=modelSementaras;
    }
    @NonNull
    @Override
    public GameAdapterChild onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View views= layoutInflater.inflate(R.layout.admin_lihat_jwaban_quiz, parent, false);
        GameAdapterChild sellerDoneChild=new GameAdapterChild(views);

        return sellerDoneChild;

    }

    @Override
    public void onBindViewHolder( AdminGameAdapter.GameAdapterChild holder, int position) {
        holder.textView_admin_lihat_isi_quis.setText(modelSementaras.get(position).getTitle());


    }

    @Override
    public int getItemCount() {
        return modelSementaras.size();
    }

    public class GameAdapterChild extends RecyclerView.ViewHolder{

        private TextView textView_admin_lihat_isi_quis;

        public GameAdapterChild( View itemView) {
            super(itemView);
            textView_admin_lihat_isi_quis=itemView.findViewById(R.id.tv_admin_lihat_quiz);
        }
    }
}
