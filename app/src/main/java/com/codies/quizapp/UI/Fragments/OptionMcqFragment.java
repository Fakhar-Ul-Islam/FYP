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
public class OptionMcqFragment extends Fragment {


    static OptionMcqFragment optionMcqFragment;

    public static OptionMcqFragment newInstance() {
        if (optionMcqFragment == null) {
            optionMcqFragment = new OptionMcqFragment();
        }
        return optionMcqFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.mcqqlayout, container, false);
        Button option1 = view.findViewById(R.id.option1BTQuiz);
        Button option2 = view.findViewById(R.id.option2BTQuiz);
        Button option3 = view.findViewById(R.id.option3BTQuiz);
        Button option4 = view.findViewById(R.id.option4BTQuiz);

        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Clicked", Toast.LENGTH_SHORT).show();

            }
        });

        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Clicked", Toast.LENGTH_SHORT).show();

            }
        });

        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Clicked", Toast.LENGTH_SHORT).show();

            }
        });


        return view;
    }

}
