package com.ps.libpro;

import android.content.Context;
import android.content.SharedPreferences;

public class MyPref {

    SharedPreferences preferences;

    public MyPref(Context context) {
        preferences = context.getSharedPreferences("mypref", Context.MODE_PRIVATE);
    }

    public void saveToken(String token) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("token", token);
        editor.commit();
    }

    public String getToken() {
        return preferences.getString("token", null);
    }
}
