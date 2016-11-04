package com.protacon.toka.routinemanager.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.protacon.toka.routinemanager.R;
import com.protacon.toka.routinemanager.RoutineList;
import com.protacon.toka.routinemanager.models.Routine;

import java.util.List;

/**
 * Created by toka on 4.11.2016.
 */

public class RoutineListFragment extends Fragment {

    private RecyclerView routineRecyclerView;
    private RoutineAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_routine_list, container, false);

        routineRecyclerView = (RecyclerView) view.findViewById(R.id.routine_recycler_view);
        routineRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();

        return view;
    }

    private void updateUI() {
        RoutineList routineList = RoutineList.get(getActivity());
        List<Routine> routines = routineList.getRoutines();

        adapter = new RoutineAdapter(routines);

        routineRecyclerView.setAdapter(adapter);
    }

    private class RoutineHolder extends RecyclerView.ViewHolder {

        public TextView titleTextView;

        public RoutineHolder(View itemView) {
            super(itemView);

            titleTextView = (TextView) itemView;
        }
    }

    private class RoutineAdapter extends RecyclerView.Adapter<RoutineHolder> {

        private List<Routine> routineList;

        public RoutineAdapter(List<Routine> routines) {
            routineList = routines;
        }

        @Override
        public RoutineHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());

            View view = layoutInflater.inflate(android.R.layout.simple_list_item_1, parent, false);

            return new RoutineHolder(view);
        }

        @Override
        public void onBindViewHolder(RoutineHolder holder, int position) {
            Routine routine = routineList.get(position);

            holder.titleTextView.setText(routine.getTitle());
        }

        @Override
        public int getItemCount() {
            return routineList.size();
        }
    }
}
