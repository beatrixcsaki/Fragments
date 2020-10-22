package com.example.fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class TopFragment extends Fragment {
    private Inter implementor;
    public interface Inter{
        void press(String text);
        void press();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Activity activity = null;
        if(context instanceof Activity)
            activity=(Activity) context;
        this.implementor=(Inter)activity;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //fragment.getRootView().setBackgroundColor(Color.WHITE);
        return inflater.inflate(R.layout.top_fragment,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button buttona = (Button)getActivity().findViewById(R.id.button);
        Button buttonb = getActivity().findViewById(R.id.button2);
        Button buttonc = getActivity().findViewById(R.id.button3);
        buttona.setOnClickListener(v -> implementor.press(buttona.getText().toString()));
        buttonb.setOnClickListener(v -> implementor.press(buttonb.getText().toString()));
        buttonc.setOnClickListener(v-> implementor.press());
    }
}
