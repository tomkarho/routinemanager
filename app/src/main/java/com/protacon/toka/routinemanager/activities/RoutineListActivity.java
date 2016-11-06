package com.protacon.toka.routinemanager.activities;

import android.support.v4.app.Fragment;
import com.protacon.toka.routinemanager.fragments.RoutineListFragment;

public class RoutineListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new RoutineListFragment();
    }
}
