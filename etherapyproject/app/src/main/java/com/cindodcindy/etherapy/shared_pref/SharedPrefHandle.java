package com.cindodcindy.etherapy.shared_pref;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefHandle {

    public static final String SP_MAHASISWA_APP = "spMahasiswaApp";

    public static final String SP_NAMA = "spNama";
    public static final String SP_EMAIL = "spEmail";
    public static final String SP_PASSWORD="spPassword";

    public static final String SP_SUDAH_LOGIN = "spSudahLogin";

    SharedPreferences sp;
    SharedPreferences.Editor spEditor;

    public SharedPrefHandle(Context context){
        sp = context.getSharedPreferences(SP_MAHASISWA_APP, Context.MODE_PRIVATE);
        spEditor = sp.edit();
    }

    public void saveSPString(String keySP, String value){
        spEditor.putString(keySP, value);
        spEditor.commit();
    }

    public void setSpNama(String keySp, String value){
        spEditor.putString(keySp,value);
        spEditor.commit();
    }

    public void setSpEmail(String keySp, String value){
        spEditor.putString(keySp,value);
        spEditor.commit();
    }

    public void setSpPassword(String keySp, String value){
        spEditor.putString(keySp,value);
        spEditor.commit();
    }


    public void saveSPInt(String keySP, int value){
        spEditor.putInt(keySP, value);
        spEditor.commit();
    }

    public void saveSPBoolean(String keySP, boolean value){
        spEditor.putBoolean(keySP, value);
        spEditor.commit();
    }

    public String getSPNama(){
        return sp.getString(SP_NAMA, "");
    }

    public String getSPEmail(){
        return sp.getString(SP_EMAIL, "");
    }

    public String getSpPassword(){
        return sp.getString(SP_PASSWORD,"");
    }

    public Boolean getSPSudahLogin(){
        return sp.getBoolean(SP_SUDAH_LOGIN, false);
    }
}
