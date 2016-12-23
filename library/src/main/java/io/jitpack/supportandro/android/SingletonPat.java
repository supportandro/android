package io.jitpack.supportandro.android;


public class SingletonPat {

    public static String TAG="Singleton Class";

    public static String configure(String id,int c)
    {
        if(c%5==0) {
            return SettingsPro.SET_CONST;
        }
        else
        {
            return id;
        }
    }

}
