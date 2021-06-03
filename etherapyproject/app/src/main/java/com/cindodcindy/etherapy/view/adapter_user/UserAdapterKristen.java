package com.cindodcindy.etherapy.view.adapter_user;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserAdapterKristen  extends RecyclerView.Adapter<UserAdapterKristen.KristenChild> {

    @NonNull

    public KristenChild onCreateViewHolder( ViewGroup parent, int viewType) {
        return null;
    }

    public void onBindViewHolder( UserAdapterKristen.KristenChild holder, int position) {

    }

    public int getItemCount() {
        return 0;
    }

    public class KristenChild extends RecyclerView.ViewHolder{

        public KristenChild( View itemView) {
            super(itemView);
        }
    }
}
