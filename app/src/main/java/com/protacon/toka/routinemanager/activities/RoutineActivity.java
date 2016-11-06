package com.protacon.toka.routinemanager.activities;

import android.support.v4.app.Fragment;
import com.protacon.toka.routinemanager.fragments.RoutineFragment;

public class RoutineActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new RoutineFragment();
    }
}
