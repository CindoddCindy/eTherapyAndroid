package com.cindodcindy.etherapy.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.cindodcindy.etherapy.R;
import com.cindodcindy.etherapy.view.fragment_admin.FrAdminUploadGame;
import com.cindodcindy.etherapy.view.fragment_admin.FrAdminUploadMotivasi;
import com.cindodcindy.etherapy.view.fragment_admin.FrAdminUploadMusic;
import com.cindodcindy.etherapy.view.fragment_user.FrUserGame;
import com.cindodcindy.etherapy.view.fragment_user.FrUserMotivasi;
import com.cindodcindy.etherapy.view.fragment_user.FrUserMusic;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nav_user);

        //Menampilkan halaman Fragment yang pertama kali muncul
        getFragmentPage(new FrUserMusic());

        /*Inisialisasi BottomNavigationView beserta listenernya untuk
         *menangkap setiap kejadian saat salah satu menu item diklik
         */
        BottomNavigationView bottomNavigation = findViewById(R.id.bottomNavigationViewUser);
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment fragment = null;

                //Menantukan halaman Fragment yang akan tampil
                switch (item.getItemId()){
                    case R.id.music_user:
                        fragment = new FrUserMusic();
                        break;

                    case R.id.motivation_user:
                        fragment = new FrUserMotivasi();
                        break;

                    case R.id.quiz_user:
                        fragment = new FrUserGame();
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
                    .replace(R.id.page_container_user, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}