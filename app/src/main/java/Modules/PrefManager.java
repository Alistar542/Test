package Modules;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Alistar on 07-11-2016.
 */

public class PrefManager {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context con;

    int PRIVATE_MODE=0;

    private static final String IS_FIRST_TIME_LAUNCH="IsFirstTimeLaunch";


    public PrefManager(Context context)
    {
        this.con=context;
        pref=context.getSharedPreferences("New_preference",PRIVATE_MODE);
        editor=pref.edit();

    }

    public void setFirstTimeLaunch(boolean isFirstTime) {
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);
        editor.commit();
        }

    public boolean isFirstTimeLaunch() {
        return pref.getBoolean(IS_FIRST_TIME_LAUNCH, true);
        }
}
