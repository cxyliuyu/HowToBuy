package com.cxyliuyu.www.howtobuy.adapter;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.ProgressBar;

import com.cxyliuyu.www.howtobuy.R;

public class BaseWebActivity extends Activity {

	protected ProgressWebView mWebView;
	private ProgressBar web_progressbar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_baseweb);

		mWebView = (ProgressWebView) findViewById(R.id.baseweb_webview);
		mWebView.getSettings().setJavaScriptEnabled(true);
		initData();
	}

	protected void initData() {
		Intent intent = getIntent();
		Bundle bundle = intent.getExtras();
		String url = bundle.getString("url");

		// if(!TextUtils.isEmpty(url)&&TextUtils.isEmpty(title)){
		mWebView.loadUrl(url);

		// }

	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		mWebView = null;

	}

}