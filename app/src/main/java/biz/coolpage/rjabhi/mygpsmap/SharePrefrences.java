package biz.coolpage.rjabhi.mygpsmap;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.renderscript.Long2;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by WARRIOR on 8/22/2016.
 */
public class SharePrefrences {
    public static final String LAST_LAT="mygpsmap.last_lat";
    public static final String LAST_LON="mygpsmap.last_lon";
    double lati,longti;

    public double getLat(Context context) {
        SharedPreferences sharedPreferenceslat= PreferenceManager.getDefaultSharedPreferences(context);


            return Double.valueOf(sharedPreferenceslat.getFloat(LAST_LAT,-1));


    }
    public double getLon(Context context)
    {
        SharedPreferences sharedPreferenceslon= PreferenceManager.getDefaultSharedPreferences(context);
        return Double.valueOf(sharedPreferenceslon.getFloat(LAST_LON,0));
           // return Double.valueOf(sharedPreferenceslon.getString(LAST_LON,null));

    }

    public void setLocation(Context context,double lat,double lon) {
        float latitutde= (float)lat;
        float longtitude= (float)lat;
        PreferenceManager.getDefaultSharedPreferences(context).edit()
                .putFloat(LAST_LAT,latitutde).putFloat(LAST_LON,longtitude).apply();
    }
}
