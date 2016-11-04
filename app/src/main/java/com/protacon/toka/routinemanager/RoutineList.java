package com.protacon.toka.routinemanager;

import android.content.Context;

import com.protacon.toka.routinemanager.models.Routine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * Created by toka on 4.11.2016.
 */

public class RoutineList {

    private static RoutineList routineList;

    public List<Routine> getRoutines() {
        return routines;
    }

    private List<Routine> routines;

    public static RoutineList get(Context context) {
        if (routineList == null) {
            routineList = new RoutineList(context);
        }

        return routineList;
    }

    private RoutineList(Context context) {
        routines = generateTestData();
    }

    private ArrayList<Routine> generateTestData() {
        return new ArrayList<>(Arrays.asList(
                new Routine("Test 1"),
                new Routine("Test 2"),
                new Routine("Test 3"),
                new Routine("Test 4"),
                new Routine("Test 5"),
                new Routine("Test 6"),
                new Routine("Test 7"),
                new Routine("Test 8"),
                new Routine("Test 9"),
                new Routine("Test 10"),
                new Routine("Test 11"),
                new Routine("Test 12"),
                new Routine("Test 13"),
                new Routine("Test 14"),
                new Routine("Test 15"),
                new Routine("Test 16"),
                new Routine("Test 17"),
                new Routine("Test 18"),
                new Routine("Test 19"),
                new Routine("Test 20")
        ));
    }

    /**
     * Todo: replace with return routines.stream().filter(r-> r.getId().equals(id)).findAny().orElse(null); when support is ready
     */
    private Routine getRoutine(UUID id) {
        for (Routine routine : routines) {
            if (routine.getId() == id) {
                return routine;
            }
        }

        return null;
    }

}
