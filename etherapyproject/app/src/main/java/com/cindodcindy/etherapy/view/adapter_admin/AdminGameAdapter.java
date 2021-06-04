package com.cindodcindy.etherapy.view.adapter_admin;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdminGameAdapter extends RecyclerView.Adapter<AdminGameAdapter.GameAdapterChild> {

    @NonNull
    @Override
    public GameAdapterChild onCreateViewHolder( ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder( AdminGameAdapter.GameAdapterChild holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class GameAdapterChild extends RecyclerView.ViewHolder{

        public GameAdapterChild( View itemView) {
            super(itemView);
        }
    }
}
