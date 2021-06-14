package com.cindodcindy.etherapy.view.fragment_admin;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.cindodcindy.etherapy.R;
import com.cindodcindy.etherapy.shared_pref.SharedPrefHandle;
import com.cindodcindy.etherapy.view.LoginAdmin;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfileAdminFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfileAdminFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private Button button_admin_logout;

    private TextView textView_email_admin, textView_password_admin;

    private SharedPrefHandle sharedPrefHandle;

    public ProfileAdminFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ProfileAdminFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ProfileAdminFragment newInstance(String param1, String param2) {
        ProfileAdminFragment fragment = new ProfileAdminFragment();
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
         View view = inflater.inflate(R.layout.fragment_profile_admin, container, false);

         sharedPrefHandle=new SharedPrefHandle(getContext());

         textView_email_admin=view.findViewById(R.id.tv_admin_email);
         textView_password_admin=view.findViewById(R.id.tv_admin_password);

         button_admin_logout=view.findViewById(R.id.btn_admin_logout);

         textView_email_admin.setText(sharedPrefHandle.getSPEmail());
         textView_password_admin.setText(sharedPrefHandle.getSpPassword());

         button_admin_logout.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 sharedPrefHandle.saveSPBoolean(SharedPrefHandle.SP_SUDAH_LOGIN, false);
                 startActivity(new Intent(getActivity(), LoginAdmin.class)
                         .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK));

             }
         });

        return view;
    }
}