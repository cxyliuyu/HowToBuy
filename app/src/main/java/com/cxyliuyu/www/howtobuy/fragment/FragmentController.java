package com.cxyliuyu.www.howtobuy.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.cxyliuyu.www.howtobuy.MainActivity;

import java.util.ArrayList;

/**
 * Created by ly on 2016/7/9.
 */
public class FragmentController {


    private int containerId;
    private FragmentManager fm;
    private ArrayList<Fragment> fragments;

    private static FragmentController fragmentController;

    public static FragmentController getInstance(MainActivity activity,int container){
        if(fragmentController == null){
            fragmentController = new FragmentController(activity,container);
        }
        return fragmentController;
    }

    private FragmentController(MainActivity activity,int containerId){
        this.fm = activity.getSupportFragmentManager();
        this.containerId = containerId;
        initFragment();
    }

    private void initFragment(){
        fragments = new ArrayList<Fragment>();
        fragments.add(new HomeFragment());
        fragments.add(new HomeFragment());
        fragments.add(new HomeFragment());
        fragments.add(new HomeFragment());
        fragments.add(new HomeFragment());

        FragmentTransaction ft = fm.beginTransaction();
        for(Fragment fragment :fragments){
            ft.add(containerId,fragment);
        }
        ft.commit();
    }

    public void showFragment(int position){
        hideFragments();
        Fragment fragment = fragments.get(position);
        FragmentTransaction ft = fm.beginTransaction();
        ft.show(fragment);
        ft.commit();
    }

    public void hideFragments(){
        FragmentTransaction ft = fm.beginTransaction();
        for(Fragment fragment:fragments){
            if (fragment != null){
                ft.hide(fragment);
            }
        }
        ft.commit();
    }

    public Fragment getFragment(int position){
        return fragments.get(position);
    }
}
