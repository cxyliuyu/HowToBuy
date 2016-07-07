package com.cxyliuyu.www.howtobuy.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cxyliuyu.www.howtobuy.R;

/**
 * Created by ly on 2016/7/7.
 */
public class HomeFragment extends BaseFragment{

    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = View.inflate(activity, R.layout.fragment_home,null);
        return view;
    }
}
