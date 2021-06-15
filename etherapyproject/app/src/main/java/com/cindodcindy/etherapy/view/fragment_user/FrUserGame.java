package com.cindodcindy.etherapy.view.fragment_user;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cindodcindy.etherapy.R;
import com.cindodcindy.etherapy.model.MusicClass;
import com.cindodcindy.etherapy.view.adapter_user.UserAdapterGame;
import com.cindodcindy.etherapy.view.adapter_user.UserAdapterMusic;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FrUserGame#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FrUserGame extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private List<MusicClass> modelSementaraList ;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager_dua;
    private UserAdapterGame userAdapterGame;


    public FrUserGame() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FrUserGame.
     */
    // TODO: Rename and change types and number of parameters
    public static FrUserGame newInstance(String param1, String param2) {
        FrUserGame fragment = new FrUserGame();
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
         View view = inflater.inflate(R.layout.fragment_fr_user_game, container, false);

        recyclerView =view.findViewById(R.id.rv_user_game);
        // recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));

        // LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        //recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        //


        modelSementaraList = new ArrayList<>();
        modelSementaraList.add(new MusicClass("Sewaktu Anda Terkena Covid Apakah Anda Merasa Cemas", "Sangat Cemas","Cemas","Tidak Peduli","Tidak Sama Sekali"));
        modelSementaraList.add(new MusicClass("ApaKah Anda Lakukan Jika Tetangga Anda Positiv Covid","Marah","Pindah Tempat Tinggal","Jaga Jarak","Membantu"));
        modelSementaraList.add(new MusicClass("Apakah Anda Merasa Cemas Jika Merasa Kurang Sehat", "Memeriksakan Diri","Cemas (Mungkin saya covid)","Tidak Peduli","Memakai Masker"));
        modelSementaraList.add(new MusicClass("Apakah Anda Sering Menggunakan Masker", "Selalu","Kadang lupa","Tidak Pernah","Tidak Punya Masker"));

        modelSementaraList.add(new MusicClass("Covid adalah", "bakteri","zat","unsur","virus"));
        modelSementaraList.add(new MusicClass("Apakah Anda Rajin Mencuci Tangan Akhir Akhir Ini","Ya","Setiap Satu Jam","Kadang","Tidak Pernah"));
        modelSementaraList.add(new MusicClass("Apakah Anda Membawa Handsanitizer Setiap Bepergian", "Ya","Kadang","Meminta Punya Orang","Tidak Pernah"));
        modelSementaraList.add(new MusicClass("Apakah Ada Orang Terdekatmu Yang Positiv Covid", "Ya Beberapa","Ya Tapi Berbeda Daerah Dengan Saya","Ada Serumah Dengan Saya","Tidak Ada"));


        userAdapterGame= new UserAdapterGame(getActivity(),modelSementaraList);
        recyclerView.setAdapter(userAdapterGame);

        return view;

    }
}