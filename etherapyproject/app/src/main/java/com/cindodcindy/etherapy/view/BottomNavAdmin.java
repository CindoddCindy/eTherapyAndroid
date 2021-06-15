package com.cindodcindy.etherapy.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.cindodcindy.etherapy.R;
import com.cindodcindy.etherapy.view.fragment_admin.FrAdminLaporan;
import com.cindodcindy.etherapy.view.fragment_admin.FrAdminUploadGame;
import com.cindodcindy.etherapy.view.fragment_admin.FrAdminUploadMotivasi;
import com.cindodcindy.etherapy.view.fragment_admin.FrAdminUploadMusic;
import com.cindodcindy.etherapy.view.fragment_admin.ProfileAdminFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nav_admin);

        //Menampilkan halaman Fragment yang pertama kali muncul
        getFragmentPage(new FrAdminUploadMusic());

        /*Inisialisasi BottomNavigationView beserta listenernya untuk
         *menangkap setiap kejadian saat salah satu menu item diklik
         */
        BottomNavigationView bottomNavigation = findViewById(R.id.bottomNavigationViewAdmin);
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment fragment = null;

                //Menantukan halaman Fragment yang akan tampil
                switch (item.getItemId()){
                    case R.id.music_admin:
                        fragment = new FrAdminUploadMusic();
                        break;

                    case R.id.motivation_admin:
                        fragment = new FrAdminUploadMotivasi();
                        break;

                    case R.id.quiz_admin:
                        fragment = new FrAdminUploadGame();
                        break;

                    case R.id.laporan_admin:
                        fragment = new FrAdminLaporan();
                        break;


                    case R.id.profile_admin:
                        fragment = new ProfileAdminFragment();
                        break;
                }
                return getFragmentPage(fragment);
            }
        });
    }

    //Menampilkan halaman Fragment
    private boolean getFragmentPage(Fragment fragment){
        if (fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.page_container_admin, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}