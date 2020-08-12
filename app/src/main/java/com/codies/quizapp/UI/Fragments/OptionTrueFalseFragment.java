package com.codies.quizapp.UI.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.codies.quizapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class OptionTrueFalseFragment extends Fragment {

    static OptionTrueFalseFragment optionTrueFalseFragment;
    public static OptionTrueFalseFragment newInstance() {
        // Required empty public constructor
        if (optionTrueFalseFragment == null) {
            optionTrueFalseFragment = new OptionTrueFalseFragment();
        }
        return optionTrueFalseFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.truefalselayout, container, false);
        Button trueBt = view.findViewById(R.id.option1BTFib);
        Button falseBt = view.findViewById(R.id.option2BTFib);

        trueBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "False", Toast.LENGTH_SHORT).show();
            }
        });
        falseBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "True", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

}
