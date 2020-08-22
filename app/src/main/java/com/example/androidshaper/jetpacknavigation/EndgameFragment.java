package com.example.androidshaper.jetpacknavigation;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class EndgameFragment extends Fragment {



    public EndgameFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_endgame, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final NavController navController= Navigation.findNavController(view);
        Button buttonStart=view.findViewById(R.id.endButton);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               navController.navigate(R.id.action_endgameFragment_to_startFragment);
//                NavOptions navOptions=new NavOptions.Builder().setPopUpTo(R.id.gameFragment,true).build();
//                navController.navigate(R.id.action_endgameFragment_to_startFragment,null,navOptions);
            }
        });
    }
}