package com.android.tabs;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.view.Menu;

public class MainActivity extends FragmentActivity {
	private FragmentTabHost mTabHost;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mTabHost = (FragmentTabHost)findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);
        mTabHost.addTab(mTabHost.newTabSpec("tag1").setIndicator(("Usuario"),
                getResources().getDrawable(android.R.drawable.ic_popup_sync)),
                Tab1.class, null);
        
        mTabHost.addTab(mTabHost.newTabSpec("tag2").setIndicator(("Usuario"),
                getResources().getDrawable(android.R.drawable.ic_popup_sync)),
                Fragment2.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("tag3").setIndicator(("Usuario"),
                getResources().getDrawable(android.R.drawable.ic_popup_sync)),
                Fragment3.class, null);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
