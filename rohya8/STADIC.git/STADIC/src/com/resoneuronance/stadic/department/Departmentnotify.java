package com.resoneuronance.stadic.department;

import java.util.ArrayList;

import com.resoneuronance.stadic.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

public class Departmentnotify extends Activity 
{

	private ListView lv;

	ArrayList<String> objArrayListName = new ArrayList<String>();

	ArrayList<String> objArrayListNotify_no = new ArrayList<String>();


	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_departmentnotify);

		initialise();


		objArrayListName.add("Computer");
		objArrayListName.add("Information Technology");
		objArrayListName.add("Electrical");
		objArrayListName.add("Mechanical");
		objArrayListName.add("ENTC");
		objArrayListName.add("Civil");
		objArrayListName.add("Instrumentaion");
		objArrayListName.add("Chemical");


		objArrayListNotify_no.add("1");
		objArrayListNotify_no.add("2");
		objArrayListNotify_no.add("3");
		objArrayListNotify_no.add("2");
		objArrayListNotify_no.add("2");
		objArrayListNotify_no.add("2");
		objArrayListNotify_no.add("2");
		objArrayListNotify_no.add("2");


		Department_Notify_customclass Adapter = new Department_Notify_customclass(this, objArrayListName,objArrayListNotify_no);
		lv.setAdapter(Adapter);



	}


	private void initialise() {
		// TODO Auto-generated method stub
		lv = (ListView)findViewById(R.id.department_notify_list_listview);
	}
}
