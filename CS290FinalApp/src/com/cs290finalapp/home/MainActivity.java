package com.cs290finalapp.home;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TabHost;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);
		TabHost tabHost = (TabHost)findViewById(R.id.home_tabhost);
		
		//tabHost.addTab(tabHost.newTabSpec("tab_test1").setIndicator("TAB 1").setContent(R.id.Info));
		//tabHost.addTab(tabHost.newTabSpec("tab_test2").setIndicator("TAB 2").setContent(R.id.Billing));
		//tabHost.addTab(tabHost.newTabSpec("tab_test3").setIndicator("TAB 3").setContent(R.id.Student));
	    
		tabHost.setCurrentTab(0);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
