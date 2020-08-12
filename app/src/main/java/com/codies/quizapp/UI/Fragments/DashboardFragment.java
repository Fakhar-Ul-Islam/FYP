package com.codies.quizapp.UI.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codies.quizapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DashboardFragment extends Fragment {

    static DashboardFragment dashboardFragment;

    public static DashboardFragment getInstance() {
        if (dashboardFragment == null) {
            dashboardFragment = new DashboardFragment();
        }
        return dashboardFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dashboard, container, false);
    }

}
