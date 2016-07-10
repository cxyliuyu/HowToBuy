package com.cxyliuyu.www.howtobuy.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cxyliuyu.www.howtobuy.R;

/**
 * Created by ly on 2016/7/10.
 */
public class BagFragment extends BaseFragment{

    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = View.inflate(activity, R.layout.fragment_bag,null);
        return view;
    }
}
