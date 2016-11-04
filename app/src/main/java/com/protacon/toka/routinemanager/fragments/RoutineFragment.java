package com.protacon.toka.routinemanager.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.protacon.toka.routinemanager.R;
import com.protacon.toka.routinemanager.models.Routine;

import java.text.SimpleDateFormat;

/**
 * Created by toka on 4.11.2016.
 */

public class RoutineFragment extends Fragment {
    private Routine routine;

    private EditText titleField;

    private Button startTimeField;
    private Button endTimeField;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        routine = new Routine();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_routine, container, false);

        initializeFields(v);

        return v;
    }

    private void initializeFields(View view) {
        titleField = (EditText)view.findViewById(R.id.routine_title);

        titleField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {
                //Intentionally left blank
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                routine.setTitle(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {
                //Intentionally left blank
            }
        });

        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");

        startTimeField = (Button) view.findViewById(R.id.startTime);
        startTimeField.setText(dateFormat.format(routine.getStartTime()));

        endTimeField = (Button) view.findViewById(R.id.endTime);
        endTimeField.setText(dateFormat.format(routine.getEndTime()));
    }
}
