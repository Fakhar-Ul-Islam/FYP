package com.codies.quizapp.UI.Fragments;


import android.os.Bundle;

import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codies.quizapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class OptionFibFragment extends Fragment {


    static OptionFibFragment optionFibFragment;
    public static OptionFibFragment newInstance() {
        // Required empty public constructor
        if (optionFibFragment == null) {
            optionFibFragment = new OptionFibFragment();
        }
        return optionFibFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fiblayout, container, false);
        AppCompatEditText userInput = view.findViewById(R.id.fibUserInputFIB);
        String txt = userInput.getText().toString();
        return view;
    }

}
