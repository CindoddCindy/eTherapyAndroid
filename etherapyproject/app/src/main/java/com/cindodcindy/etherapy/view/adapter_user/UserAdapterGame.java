package com.cindodcindy.etherapy.view.adapter_user;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserAdapterGame extends RecyclerView.Adapter<UserAdapterGame.UserAdapterChild> {

    @NonNull
    @Override
    public UserAdapterChild onCreateViewHolder( ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder( UserAdapterGame.UserAdapterChild holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class UserAdapterChild extends RecyclerView.ViewHolder{

        public UserAdapterChild(@NonNull  View itemView) {
            super(itemView);
        }
    }
}
