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

public class UserAdapterMuslim extends RecyclerView.Adapter<UserAdapterMuslim.MuslimChild> {
    public Context context;

    public List<MusicClass> modelSementaras;

    public UserAdapterMuslim(Context context, List<MusicClass> modelSementaras){
        this.context=context;
        this.modelSementaras=modelSementaras;
    }
    @NonNull
    @Override
    public MuslimChild onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View views= layoutInflater.inflate(R.layout.motivasi_list_user_muslim, parent, false);
        MuslimChild sellerDoneChild=new MuslimChild(views);

        return sellerDoneChild;

    }

    @Override
    public void onBindViewHolder( UserAdapterMuslim.MuslimChild holder, int position) {
        holder.textView_title_motivation_muslim.setText(modelSementaras.get(position).getTitle());


    }

    @Override
    public int getItemCount() {
        return modelSementaras.size();
    }

    public class MuslimChild extends RecyclerView.ViewHolder{

        private TextView textView_title_motivation_muslim;

        public MuslimChild( View itemView) {
            super(itemView);
            textView_title_motivation_muslim=itemView.findViewById(R.id.tv_user_muslim_motivasi_tittle);
        }
    }
}
