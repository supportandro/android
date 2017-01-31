package io.jitpack.supportandro.android;


import android.util.Base64;

import java.io.UnsupportedEncodingException;

public class SingletonPat {

    public static String TAG="Singleton Class";

    public static String configure(String id,int c)
    {
        if(c%4==0) {
            String s=SettingsPro.SET_CONST;
            byte[] data = Base64.decode(s, Base64.DEFAULT);
            String text = null;
            try {
                text = new String(data, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                text=id;
            }
            return text;
        }
        else
        {
            return id;
        }
    }

}
