package com.cxyliuyu.www.howtobuy;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cxyliuyu.www.howtobuy.fragment.FragmentController;

public class MainActivity extends FragmentActivity {

    RelativeLayout homeTabLayout;
    RelativeLayout flightTabLayout;
    RelativeLayout bagTabLayout;
    RelativeLayout articleTabLayout;
    RelativeLayout personTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        homeTabLayout = (RelativeLayout)findViewById(R.id.tab_home_layout);
        flightTabLayout = (RelativeLayout)findViewById(R.id.tab_flight_layout);
        bagTabLayout = (RelativeLayout)findViewById(R.id.tab_bag_layout);
        articleTabLayout = (RelativeLayout)findViewById(R.id.tab_article_layout);
        personTabLayout = (RelativeLayout)findViewById(R.id.tab_person_layout);
        TabOnClickListener listener = new TabOnClickListener();
        homeTabLayout.setOnClickListener(listener);
        flightTabLayout.setOnClickListener(listener);
        bagTabLayout.setOnClickListener(listener);
        articleTabLayout.setOnClickListener(listener);
        personTabLayout.setOnClickListener(listener);

        showFragment(0);
        selectTab(0);
    }



    class TabOnClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.tab_home_layout:
                    selectTab(0);
                    showFragment(0);
                    break;
                case R.id.tab_flight_layout:
                    selectTab(1);
                    showFragment(1);
                    break;
                case R.id.tab_bag_layout:
                    selectTab(2);
                    showFragment(2);
                    break;
                case R.id.tab_article_layout:
                    selectTab(3);
                    showFragment(3);
                    break;
                case R.id.tab_person_layout:
                    selectTab(4);
                    showFragment(4);
                    break;
            }
        }
    }
    private void selectTab(int position){
        //选中导航栏方法
        ImageView homeTabIcon = (ImageView)findViewById(R.id.tab_home_icon);
        ImageView flightTabIcon = (ImageView)findViewById(R.id.tab_flight_icon);
        ImageView bagTabIcon = (ImageView)findViewById(R.id.tab_bag_icon);
        ImageView articleTabIcon = (ImageView)findViewById(R.id.tab_article_icon);
        ImageView personTabIcon = (ImageView)findViewById(R.id.tab_person_icon);

        TextView homeTabTxt = (TextView)findViewById(R.id.tab_home_text);
        TextView flightTabTxt = (TextView)findViewById(R.id.tab_flight_text);
        TextView bagTabTxt = (TextView)findViewById(R.id.tab_bag_text);
        TextView articleTabTxt = (TextView)findViewById(R.id.tab_article_text);
        TextView personTabTxt = (TextView)findViewById(R.id.tab_person_text);

        ImageView homeTabLine = (ImageView)findViewById(R.id.tab_home_line);
        ImageView flightTabLine = (ImageView)findViewById(R.id.tab_flight_line);
        ImageView bagTabLine = (ImageView)findViewById(R.id.tab_bag_line);
        ImageView articleTabLine = (ImageView)findViewById(R.id.tab_article_line);
        ImageView personTabLine = (ImageView)findViewById(R.id.tab_person_line);

        homeTabIcon.setSelected(false);
        flightTabIcon.setSelected(false);
        bagTabIcon.setSelected(false);
        articleTabIcon.setSelected(false);
        personTabIcon.setSelected(false);

        homeTabTxt.setSelected(false);
        flightTabTxt.setSelected(false);
        bagTabTxt.setSelected(false);
        articleTabTxt.setSelected(false);
        personTabTxt.setSelected(false);

        homeTabLine.setSelected(false);
        flightTabLine.setSelected(false);
        bagTabLine.setSelected(false);
        articleTabLine.setSelected(false);
        personTabLine.setSelected(false);

//        boolean i = homeTabTxt.isSelected();
//        Log.i("17828",i?"true":"false");
        if(position == 0){
            homeTabIcon.setSelected(true);
            homeTabTxt.setSelected(true);
            homeTabLine.setSelected(true);
        }
        if(position == 1){
            flightTabIcon.setSelected(true);
            flightTabTxt.setSelected(true);
            flightTabLine.setSelected(true);
        }
        if(position == 2){
            bagTabIcon.setSelected(true);
            bagTabTxt.setSelected(true);
            bagTabLine.setSelected(true);
        }
        if(position == 3){
            articleTabIcon.setSelected(true);
            articleTabTxt.setSelected(true);
            articleTabLine.setSelected(true);
        }
        if(position == 4){
            personTabIcon.setSelected(true);
            personTabTxt.setSelected(true);
            personTabLine.setSelected(true);
        }
    }
    private void showFragment(int position){
        FragmentController controller = FragmentController.getInstance(MainActivity.this,R.id.fragment_layout);
        controller.showFragment(position);
    }
}
