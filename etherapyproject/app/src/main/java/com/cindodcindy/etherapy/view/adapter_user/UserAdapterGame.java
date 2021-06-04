package com.cindodcindy.etherapy.view.adapter_user;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cindodcindy.etherapy.R;
import com.cindodcindy.etherapy.model.MusicClass;
import com.cindodcindy.etherapy.view.LihatScore;

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
        final MusicClass musicClass = modelSementaras.get(position);
        holder.textView_user_quiz.setText(modelSementaras.get(position).getTitle());
        holder.radioButton_a.setText(modelSementaras.get(position).getJawabA());
        holder.radioButton_b.setText(modelSementaras.get(position).getJawabB());
        holder.radioButton_c.setText(modelSementaras.get(position).getJawabC());
        holder.radioButton_d.setText(modelSementaras.get(position).getJawabD());
        holder.radioGroup_user.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rb_a:

                        Bundle bundle = new Bundle();
                        bundle.putString("score_a",musicClass.getScore());

                        Intent intent = new Intent(context, LihatScore.class);
                        intent.putExtras(bundle);
                        context.startActivity(intent);

                        break;
                    case R.id.rb_b:

                        Bundle bundles = new Bundle();
                        bundles.putString("score_b",musicClass.getScore_tiga());

                        Intent intents = new Intent(context, LihatScore.class);
                        intents.putExtras(bundles);
                        context.startActivity(intents);

                        break;

                }
            }
        });

        holder.radioGroup_user_dua.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId){
                    case R.id.rb_c:
                        Bundle bundle = new Bundle();
                        bundle.putString("score_c",musicClass.getScore_empat());

                        Intent intent = new Intent(context, LihatScore.class);
                        intent.putExtras(bundle);
                        context.startActivity(intent);

                        break;
                    case R.id.rb_d:
                        Bundle bundlle = new Bundle();
                        bundlle.putString("score_d",musicClass.getScore_empat());

                        Intent inntent = new Intent(context, LihatScore.class);
                        inntent.putExtras(bundlle);
                        context.startActivity(inntent);

                        break;
                }

            }
        });


    }

    @Override
    public int getItemCount() {
        return modelSementaras.size();
    }

    public class UserAdapterChild extends RecyclerView.ViewHolder{
        private TextView textView_user_quiz;
        private RadioGroup radioGroup_user , radioGroup_user_dua;
        private RadioButton radioButton_a, radioButton_b, radioButton_c, radioButton_d;

        public UserAdapterChild(@NonNull  View itemView) {
            super(itemView);
            textView_user_quiz=itemView.findViewById(R.id.tv_user_quiz);
            radioGroup_user=itemView.findViewById(R.id.radio_grup_user);
            radioGroup_user_dua=itemView.findViewById(R.id.radio_grup_user_dua);
            radioButton_a=itemView.findViewById(R.id.rb_a);
            radioButton_b=itemView.findViewById(R.id.rb_b);
            radioButton_c=itemView.findViewById(R.id.rb_c);
            radioButton_d=itemView.findViewById(R.id.rb_d);
        }
    }
}
