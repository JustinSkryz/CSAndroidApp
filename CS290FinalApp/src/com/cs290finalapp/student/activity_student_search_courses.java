package com.cs290finalapp.student;


import com.cs290finalapp.home.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class activity_student_search_courses extends Activity implements OnItemSelectedListener {
	private TextView textView;
	private static final String[] ITEMS = {"FALL 2012", "SPRI 2013"};
	private static final String[] PROGRAMS = {"Computer Science", "History"};
	private String currentSemester = "FALL 2012";
	private String currentProgram = "Computer Science";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.student_registration_search_courses);
		
		textView = (TextView)findViewById(R.id.CoursesTextView);
		Spinner semester = (Spinner)findViewById(R.id.sele_seme);
		ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, ITEMS);
		aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		semester.setAdapter(aa);
		semester.setOnItemSelectedListener(this);
		
		Spinner courseProgram = (Spinner)findViewById(R.id.sele_prog);
		ArrayAdapter ab = new ArrayAdapter(this, android.R.layout.simple_spinner_item, PROGRAMS);
		ab.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		courseProgram.setAdapter(ab);
		courseProgram.setOnItemSelectedListener(this);
	}

	@Override
	public void onItemSelected(AdapterView<?> parent, View arg1, int pos,
			long arg3) {
		Spinner spinner = (Spinner) parent;
		
		if(spinner.getId() == R.id.sele_seme){
			currentSemester = (String)spinner.getItemAtPosition(pos);
		}
		else if(spinner.getId() == R.id.sele_prog){
			currentProgram = (String)spinner.getItemAtPosition(pos);
		}
		
		if(currentSemester=="FALL 2012"){
			if(currentProgram=="Computer Science"){
				textView.setText("Courses Available\n" +
						"Introduction to Computers\n" +
						"Computer Science I\n" +
						"Data Structures\n");
			}
			else if(currentProgram=="History"){
				textView.setText("Courses Available\n" +
						"World Civilization I\n" +
						"World Civilization II\n");
			}
		}
		
		else if(currentSemester=="SPRI 2013"){
			if(currentProgram=="Computer Science"){
				textView.setText("Courses Available\n" +
						"Introduction to Computers\n" +
						"Computer Science I\n" +
						"Assembly Language\n");
			}
			else if(currentProgram=="History"){
				textView.setText("Courses Available\n" +
						"US History I\n" +
						"US History II\n");
			}
		}
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}

	/** Go back to the main activity screen */
	public void goBack(View view){
		//Note: Replace HelloWorldActivity with activity that holds the Student Tab
		Intent intent = new Intent(this, activity_student.class);
		startActivity(intent);
	}
}
