package com.example.jakeg.navigationdrawer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * Created by jakeg on 5/12/2016.
 */


public class SecondFragment extends android.support.v4.app.Fragment {


    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.social_media, container, false);
        return myView;


    }

}





