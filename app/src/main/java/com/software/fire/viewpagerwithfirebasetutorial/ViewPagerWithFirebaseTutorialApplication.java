package com.software.fire.viewpagerwithfirebasetutorial;

import android.app.Application;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Brad on 12/20/2016.
 */

public class ViewPagerWithFirebaseTutorialApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //I recommend doing this whenever using the FirebaseDatabase. It stores are the data
        //pulled from firebase for you which persists data and reduces network cost
        if (!FirebaseApp.getApps(this).isEmpty()) {
            FirebaseDatabase.getInstance().setPersistenceEnabled(true);
        }
    }
}
