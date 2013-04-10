package com.cs290finalapp.student;


import com.cs290finalapp.home.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class activity_student_info extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.student_info);
	}

	/** Go back to the main activity screen */
	public void goBack(View view){
		//Note: Replace HelloWorldActivity with activity that holds the Student Tab
		Intent intent = new Intent(this, activity_student.class);
		startActivity(intent);
	}
}
