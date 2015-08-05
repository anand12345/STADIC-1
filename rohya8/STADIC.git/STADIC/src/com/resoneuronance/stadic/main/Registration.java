package com.resoneuronance.stadic.main;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;

import com.resoneuronance.stadic.R;

public class Registration extends Activity  implements OnItemSelectedListener{
	private Spinner SpinnerYear;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_registration);
		initialise();
		spinnerdata();
	}

	private void spinnerdata() {

		List<String> spcollegename=new ArrayList<String>();
		spcollegename.add(" College Name ");
		spcollegename.add(" Modern College Of Engineering ");
		spcollegename.add(" P.V.G  ");
		spcollegename.add(" FC ");
		spcollegename.add(" College Of Engineering ");
		spcollegename.add(" Modern College Of Engineering ");
		spcollegename.add(" P.V.G  ");
		spcollegename.add(" FC ");
		spcollegename.add(" College Of Engineering ");


		//setspinnerdata(SpinnerYear,spcollegename);
		System.out.println("list "+spcollegename);

		ArrayAdapter <String> adapter1= new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,spcollegename);
		//adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
		SpinnerYear.setAdapter(adapter1);	

	}


	private void initialise() {

		SpinnerYear=(Spinner) findViewById(R.id.registration_spinnergroup_collegenm);

		
	}

	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub

	}



}
