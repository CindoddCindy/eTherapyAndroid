package com.cindodcindy.etherapy.view.adapter_user;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserAdapterMuslim extends RecyclerView.Adapter<UserAdapterMuslim.MuslimChild> {

    @NonNull
    @Override
    public MuslimChild onCreateViewHolder( ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder( UserAdapterMuslim.MuslimChild holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MuslimChild extends RecyclerView.ViewHolder{

        public MuslimChild( View itemView) {
            super(itemView);
        }
    }
}
