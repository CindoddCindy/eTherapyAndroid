package com.cindodcindy.etherapy.view.fragment_user;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.cindodcindy.etherapy.R;
import com.cindodcindy.etherapy.shared_pref.SharedPrefUser;
import com.cindodcindy.etherapy.view.LoginUser;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfileUserFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfileUserFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private TextView textView_email_user, textView_password_user;

    private Button button_logout_user;

    private SharedPrefUser sharedPrefUser;

    public ProfileUserFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ProfileUserFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ProfileUserFragment newInstance(String param1, String param2) {
        ProfileUserFragment fragment = new ProfileUserFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view =inflater.inflate(R.layout.fragment_profile_user, container, false);

       sharedPrefUser= new SharedPrefUser(getContext());

       textView_email_user=view.findViewById(R.id.tv_user_email);
       textView_password_user=view.findViewById(R.id.tv_user_password);

       button_logout_user=view.findViewById(R.id.btn_user_logout);

       button_logout_user.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               sharedPrefUser.saveSPBoolean(SharedPrefUser.SP_SUDAH_LOGIN, false);
               startActivity(new Intent(getActivity(), LoginUser.class)
                       .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK));

           }
       });

       getDataSharedPref();
        return view;
    }

    public void getDataSharedPref(){
        textView_email_user.setText(sharedPrefUser.getSPEmail());
        textView_password_user.setText(sharedPrefUser.getSpPassword());


    }
}