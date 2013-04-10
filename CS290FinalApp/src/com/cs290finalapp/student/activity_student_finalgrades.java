package com.cs290finalapp.student;

import com.cs290finalapp.home.R;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.support.v4.app.NavUtils;

public class activity_student_finalgrades extends Activity implements OnItemSelectedListener {
	private TextView textView;
	private static final String[] ITEMS = {"FALL 2012", "SPRI 2013"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.student_finalgrades);
		textView = (TextView)findViewById(R.id.grades);
		Spinner semester = (Spinner)findViewById(R.id.ScheduleSemester);
		semester.setOnItemSelectedListener(this);
		ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, ITEMS);
		aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		semester.setAdapter(aa);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	/** Go back to the main activity screen */
	public void goBack(View view){
		//Note: Replace HelloWorldActivity with activity that holds the Student Tab
		Intent intent = new Intent(this, activity_student.class);
		startActivity(intent);
	}

	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int pos,
			long arg3) {
		if(ITEMS[pos]=="FALL 2012"){
			textView.setText("Schedule for Fall 2012\n" +
					"CS 253: B+\n" +
					"CS 153: B");
		}
		else if(ITEMS[pos]=="SPRI 2013"){
			textView.setText("Schedule for Spring 2013\n" +
					"CS 462: B\n");
		}
		
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		textView.setText("");
	}
}
