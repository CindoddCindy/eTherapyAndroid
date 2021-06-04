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

public class UserAdapterGame extends RecyclerView.Adapter<UserAdapterGame.UserAdapterChild> {

    public Context context;

    public List<MusicClass> modelSementaras;

    public UserAdapterGame(Context context, List<MusicClass> modelSementaras){
        this.context=context;
        this.modelSementaras=modelSementaras;
    }
    @NonNull
    @Override
    public UserAdapterChild onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View views= layoutInflater.inflate(R.layout.quiz_user_list, parent, false);
        UserAdapterChild sellerDoneChild=new UserAdapterChild(views);

        return sellerDoneChild;

    }

    @Override
    public void onBindViewHolder( UserAdapterGame.UserAdapterChild holder, int position) {
        holder.textView_user_quiz.setText(modelSementaras.get(position).getTitle());


    }

    @Override
    public int getItemCount() {
        return modelSementaras.size();
    }

    public class UserAdapterChild extends RecyclerView.ViewHolder{
        private TextView textView_user_quiz;

        public UserAdapterChild(@NonNull  View itemView) {
            super(itemView);
            textView_user_quiz=itemView.findViewById(R.id.tv_user_quiz);
        }
    }
}
