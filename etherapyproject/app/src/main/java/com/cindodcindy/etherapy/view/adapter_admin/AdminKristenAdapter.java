package com.cindodcindy.etherapy.view.adapter_admin;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdminKristenAdapter extends RecyclerView.Adapter<AdminKristenAdapter.KristenAdapterChild> {

    @NonNull
    @Override
    public KristenAdapterChild onCreateViewHolder( ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder( AdminKristenAdapter.KristenAdapterChild holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class KristenAdapterChild extends RecyclerView.ViewHolder{

        public KristenAdapterChild( View itemView) {
            super(itemView);
        }
    }
}
