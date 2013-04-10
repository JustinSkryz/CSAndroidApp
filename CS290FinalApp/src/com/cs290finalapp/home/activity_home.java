package com.cs290finalapp.home;

import com.cs290finalapp.student.activity_student;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class activity_home extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.student_info);
	}
	
	/** Go back to the main activity screen */
	public void goBack(View view){
		Intent intent = new Intent(this, activity_student.class);
		startActivity(intent);
	}

}
