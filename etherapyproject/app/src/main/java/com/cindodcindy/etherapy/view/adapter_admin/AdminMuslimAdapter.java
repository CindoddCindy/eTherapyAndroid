package com.cindodcindy.etherapy.view.adapter_admin;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdminMuslimAdapter extends RecyclerView.Adapter<AdminMuslimAdapter.MuslimAdapterChild> {

    @NonNull
    @Override
    public MuslimAdapterChild onCreateViewHolder( ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder( AdminMuslimAdapter.MuslimAdapterChild holder, int position) {

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
