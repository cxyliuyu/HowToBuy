package com.cxyliuyu.www.howtobuy.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.cxyliuyu.www.howtobuy.MainActivity;

/**
 * Created by ly on 2016/7/7.
 */
public class BaseFragment extends Fragment {
    protected MainActivity activity;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = (MainActivity)getActivity();
    }
}
