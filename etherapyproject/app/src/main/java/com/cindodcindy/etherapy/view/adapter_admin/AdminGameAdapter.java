package com.cindodcindy.etherapy.view.adapter_admin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
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
        final MusicClass musicClass = modelSementaras.get(position);
        holder.textView_admin_lihat_isi_quis.setText(modelSementaras.get(position).getTitle());
        holder.radioButton_a.setText(modelSementaras.get(position).getJawabA());
        holder.radioButton_b.setText(modelSementaras.get(position).getJawabB());
        holder.radioButton_c.setText(modelSementaras.get(position).getJawabC());
        holder.radioButton_d.setText(modelSementaras.get(position).getJawabD());



    }

    @Override
    public int getItemCount() {
        return modelSementaras.size();
    }

    public class GameAdapterChild extends RecyclerView.ViewHolder{

        private TextView textView_admin_lihat_isi_quis;
        private RadioButton radioButton_a, radioButton_b, radioButton_c, radioButton_d;

        public GameAdapterChild( View itemView) {
            super(itemView);
            textView_admin_lihat_isi_quis=itemView.findViewById(R.id.tv_admin_lihat_quiz);
            radioButton_a=itemView.findViewById(R.id.rb_admin_a);
            radioButton_b=itemView.findViewById(R.id.rb_admin_b);
            radioButton_c=itemView.findViewById(R.id.rb_admin_c);
            radioButton_d=itemView.findViewById(R.id.rb_admin_d);
        }
    }
}
