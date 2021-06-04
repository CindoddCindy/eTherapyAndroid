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

public class UserAdapterKristen  extends RecyclerView.Adapter<UserAdapterKristen.KristenChild> {

    public Context context;

    public List<MusicClass> modelSementaras;

    public UserAdapterKristen(Context context, List<MusicClass> modelSementaras){
        this.context=context;
        this.modelSementaras=modelSementaras;
    }
    @NonNull

    public KristenChild onCreateViewHolder( ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View views= layoutInflater.inflate(R.layout.motivation_list_user_kristen, parent, false);
        KristenChild sellerDoneChild=new KristenChild(views);

        return sellerDoneChild;

    }

    public void onBindViewHolder( UserAdapterKristen.KristenChild holder, int position) {
        holder.textView_title_motivation.setText(modelSementaras.get(position).getTitle());


    }

    public int getItemCount() {
        return modelSementaras.size();
    }

    public class KristenChild extends RecyclerView.ViewHolder{
        private TextView textView_title_motivation;

        public KristenChild( View itemView) {
            super(itemView);

            textView_title_motivation=itemView.findViewById(R.id.tv_user_kristen_list_motivation_title);
        }
    }
}
