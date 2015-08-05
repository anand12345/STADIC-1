package com.resoneuronance.stadic.main;

import com.resoneuronance.stadic.R;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class LoginMain extends TabActivity {

	private TabHost tabHost;
	private TabSpec tabAdmin,tabStudent,tabTeacher;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login_main);

		initialise();

		logintab();

	}

	private void logintab() {

		tabAdmin = tabHost.newTabSpec("First Tab");
		tabStudent = tabHost.newTabSpec("Second Tab");
		tabTeacher = tabHost.newTabSpec("Third Tab");

		// Set the Tab name and Activity
		// that will be opened when particular Tab will be selected
		Log.d("abc","xyz");

		tabAdmin.setIndicator("Admin");
		tabAdmin.setContent(new Intent(LoginMain.this,AdminLoginTab.class));

		tabStudent.setIndicator("Student");
		tabStudent.setContent(new Intent(LoginMain.this,StudentloginTab.class));

		tabTeacher.setIndicator("Teacher");
		tabTeacher.setContent(new Intent(LoginMain.this,TeacherLoginTab.class));


		/** Add the tabs  to the TabHost to display. */
		tabHost.addTab(tabAdmin);
		tabHost.addTab(tabStudent);
		tabHost.addTab(tabTeacher);

	}

	private void initialise() {

		tabHost = (TabHost)findViewById(android.R.id.tabhost);
	}

}





