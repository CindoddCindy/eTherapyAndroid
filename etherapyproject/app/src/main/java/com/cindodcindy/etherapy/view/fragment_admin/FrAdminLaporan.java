package com.cindodcindy.etherapy.view.fragment_admin;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cindodcindy.etherapy.R;
import com.cindodcindy.etherapy.view.AdminUploadKristen;
import com.cindodcindy.etherapy.view.AdminUploadMuslim;
import com.cindodcindy.etherapy.view.GameLaporan;
import com.cindodcindy.etherapy.view.KristenLaporan;
import com.cindodcindy.etherapy.view.MusicLaporan;
import com.cindodcindy.etherapy.view.MuslimLaporan;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FrAdminLaporan#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FrAdminLaporan extends Fragment {

    private TextView textView_lihat_laporan_music;
    private TextView  textView_btn_admin_lihat_chart;
    private TextView textView_btn_lihat_laporan;
    private TextView textView_lihat_chart;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";



    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FrAdminLaporan() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FrAdminLaporan.
     */
    // TODO: Rename and change types and number of parameters
    public static FrAdminLaporan newInstance(String param1, String param2) {
        FrAdminLaporan fragment = new FrAdminLaporan();
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
         View view = inflater.inflate(R.layout.fragment_fr_admin_laporan, container, false);
        textView_lihat_laporan_music=view.findViewById(R.id.tv_btn_lihat_laporan_music);

        textView_btn_admin_lihat_chart=view.findViewById(R.id.tv_btn_lihat_laporan_game);

        textView_lihat_laporan_music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MusicLaporan.class);
                startActivity(intent);
            }
        });

        textView_btn_admin_lihat_chart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), GameLaporan.class);
                startActivity(intent);
            }
        });

        textView_btn_lihat_laporan=view.findViewById(R.id.tv_btn_lihat_laporan_kirsten);

        textView_btn_lihat_laporan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), KristenLaporan.class);
                startActivity(intent);
            }
        });

        textView_lihat_chart=view.findViewById(R.id.tv_btn_lihat_laporan_muslim);

        textView_lihat_chart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MuslimLaporan.class);
                startActivity(intent);
            }
        });
        return view;
    }
}