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

public class ProfileFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        Button btn_message = (Button) view.findViewById(R.id.btn_message);

        btn_message.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent in = new Intent (getActivity(), MenuActivity.class);
                in.putExtra("hi", "hello");
                startActivity(in);
            }

        });

        return view;
    }
}
