package com.example.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class HomepageFragment extends Fragment {

    public HomepageFragment()
    {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_homepage, container, false);

        Button btnOpen = (Button) view.findViewById(R.id.btnOpen);

        btnOpen.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent in = new Intent (getActivity(), MenuActivity.class);
                in.putExtra("FOOD", "Chose Your");
                startActivity(in);
            }

        });
        return view;
    }
}
