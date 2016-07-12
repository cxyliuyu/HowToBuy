package com.cxyliuyu.www.howtobuy.fragment;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.cxyliuyu.www.howtobuy.R;
import com.cxyliuyu.www.howtobuy.adapter.ImagePagerAdapter;
import com.cxyliuyu.www.howtobuy.adapter.ViewFlow;
import com.cxyliuyu.www.howtobuy.adapter.ViewPagerAdapter;
import com.cxyliuyu.www.howtobuy.uiti.CircleFlowIndicator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ly on 2016/7/7.
 */
public class HomeFragment extends BaseFragment{

    private View view;

    private ViewFlow mViewFlow;
    private CircleFlowIndicator mFlowIndicator;
    private ArrayList<String> imageUrlList = new ArrayList<String>();
    ArrayList<String> linkUrlArray= new ArrayList<String>();
    ArrayList<String> titleList= new ArrayList<String>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = View.inflate(activity, R.layout.fragment_home,null);
        initView();
        imageUrlList.add("http://eimg.smzdm.com/201607/10/5782475f938b67883.jpg");
        imageUrlList.add("http://eimg.smzdm.com/201607/11/57833011472386812.png");
        imageUrlList.add("http://eimg.smzdm.com/201607/10/5782432f10b461626.png");
        imageUrlList.add("http://eimg.smzdm.com/201607/11/57838e654947b2300.png");
        linkUrlArray.add("http://m.smzdm.com");
        linkUrlArray.add("http://m.smzdm.com");
        linkUrlArray.add("http://m.smzdm.com");
        linkUrlArray.add("http://m.smzdm.com");

        titleList.add("Android开发面试经——4.常见Android进阶笔试题（更新中...）");
        titleList.add("Android控件GridView之仿支付宝钱包首页带有分割线的GridView九宫格的完美实现");
        titleList.add("Android动画之仿美团加载数据等待时，小人奔跑进度动画对话框（附顺丰快递员奔跑效果)");
        initBanner(imageUrlList);
        return view;
    }

    private void initView(){

        mViewFlow = (ViewFlow) view.findViewById(R.id.homefragment_viewflow);
        mFlowIndicator = (CircleFlowIndicator) view.findViewById(R.id.homefragment_viewflowindic);

//        LayoutInflater inflater = LayoutInflater.from(getActivity());
//        views = new ArrayList<View>();
//        View view1 = inflater.inflate(R.layout.viewpaper_item, null);
//        ImageView imageView1 =(ImageView) view1.findViewById(R.id.viewpager_item);
//        imageView1.setImageResource(R.drawable.viewpageritem1);
//        views.add(view1);
//        View view2 = inflater.inflate(R.layout.viewpaper_item, null);
//        ImageView imageView2 =(ImageView) view2.findViewById(R.id.viewpager_item);
//        imageView2.setImageResource(R.drawable.viewpageritem2);
//        views.add(view2);
//        View view3 = inflater.inflate(R.layout.viewpaper_item, null);
//        ImageView imageView3 =(ImageView) view3.findViewById(R.id.viewpager_item);
//        imageView3.setImageResource(R.drawable.viewpageritem3);
//        views.add(view3);
//        View view4 = inflater.inflate(R.layout.viewpaper_item, null);
//        ImageView imageView4 =(ImageView) view4.findViewById(R.id.viewpager_item);
//        imageView4.setImageResource(R.drawable.viewpageritem4);
//        views.add(view4);
//        View view5 = inflater.inflate(R.layout.viewpaper_item, null);
//        ImageView imageView5 =(ImageView) view5.findViewById(R.id.viewpager_item);
//        imageView5.setImageResource(R.drawable.viewpageritem5);
//        views.add(view5);
//
//        vpAdapter = new ViewPagerAdapter(views,getActivity());
//        vp = (ViewPager)view.findViewById(R.id.viewpager_home);
//        vp.setAdapter(vpAdapter);
//
//        //设置导航点
//        ImageView redDot = (ImageView)view.findViewById(R.id.homefragment_viewpager_dot_red);
//        ImageView whiteDot1 = (ImageView)view.findViewById(R.id.homefragment_viewpager_dot1);

    }
    private void initBanner(ArrayList<String> imageUrlList) {

        mViewFlow.setAdapter(new ImagePagerAdapter(getActivity(), imageUrlList,
                linkUrlArray, titleList).setInfiniteLoop(true));
        mViewFlow.setmSideBuffer(imageUrlList.size()); // 实际图片张数，
        // 我的ImageAdapter实际图片张数为3

        mViewFlow.setFlowIndicator(mFlowIndicator);
        mViewFlow.setTimeSpan(4500);
        mViewFlow.setSelection(imageUrlList.size() * 1000); // 设置初始位置
        mViewFlow.startAutoFlowTimer(); // 启动自动播放
    }
}
