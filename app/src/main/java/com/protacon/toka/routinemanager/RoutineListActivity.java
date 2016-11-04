package com.protacon.toka.routinemanager;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.protacon.toka.routinemanager.fragments.RoutineListFragment;

public class RoutineListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new RoutineListFragment();
    }
}
