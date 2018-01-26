package com.example.angoo.list;

import android.app.Activity;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;


import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by angoo on 2018/1/24.
 */

public class Fragment4 extends Fragment {

    public Fragment4() {
        // Required empty public constructor

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setHasOptionsMenu(true);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //((MainActivity) getActivity()).setTitle("Team B");
        View v = inflater.inflate(R.layout.fragment4, container, false);
        ((AppCompatActivity)getActivity()).setSupportActionBar((Toolbar)v.findViewById(R.id.toolbar3));
        return v;

    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

        inflater.inflate(R.menu.logout, menu);
        super.onCreateOptionsMenu(menu, inflater);


    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.logout:
                //TODO search
                break;
        }
        return super.onOptionsItemSelected(item);
    }


}
