package com.protacon.toka.routinemanager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;

import com.protacon.toka.routinemanager.fragments.RoutineFragment;

public class ListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new RoutineFragment();
    }
}
