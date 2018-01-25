package com.example.angoo.list;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by angoo on 2018/1/24.
 */

public class Fragment1 extends Fragment {

    public Fragment1() {
        // Required empty public constructor

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    //第一次顯示區塊會呼叫的，利用LayoutInflater產生畫面元件回傳
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment1, container, false);
    }

}

