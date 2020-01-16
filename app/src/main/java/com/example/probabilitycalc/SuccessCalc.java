package com.example.probabilitycalc;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.nio.file.attribute.GroupPrincipal;

/**
 * A simple {@link Fragment} subclass.
 */
public class SuccessCalc extends Fragment {
    private EditText SuccessA;
    private EditText SuccessB;
    private EditText Result;
    private Button GoCalc;

    public SuccessCalc() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_success_calc, container, false);

        SuccessA = view.findViewById(R.id.editText3);
        SuccessB = view.findViewById(R.id.editText4);
        Result = view.findViewById(R.id.editText5);
        GoCalc = view.findViewById(R.id.button);

        GoCalc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String value1 = SuccessA.getText().toString();
                String value2 = SuccessB.getText().toString();
                float A = Float.parseFloat(value1);
                float B = Float.parseFloat(value2);

                Result.setText(Float.toString(A/(A+B)));
            }
        });

        return view;
    }
}
