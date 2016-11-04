package com.protacon.toka.routinemanager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;

import com.protacon.toka.routinemanager.fragments.RoutineFragment;

public class ListActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            fragment = new RoutineFragment();
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }
    }
}
