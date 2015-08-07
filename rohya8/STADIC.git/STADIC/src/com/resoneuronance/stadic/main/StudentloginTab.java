

package com.resoneuronance.stadic.main;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.resoneuronance.stadic.R;

public class StudentloginTab extends Activity 
{

	String[] mcollege = {"PES Modern College of Engineering","Fergusson College","AISSMS","Modern Edication Society'sCollege Of Engineering","Modern Edication Society'sCusrow Wadia Institute Of Technology","Modern Edication Society's Ness Wadia College Of Commerce","Raisonoi College of Engineering"
			,"P.V.G's College Of Engineering And Technology ","Pimpri Chinchwad Edication Trust's College Of Engineering"
			,"Sinhagad Technical Education Society's College Of  Architecture","Sinhagad Technical Education Society's College Of  Pharmacy "
			,"Sinhagad Technical Education Society's College Of  Engineering","Sinhagad Technical Education Society's Sinhgad College Of Science"
			,"Sinhagad Technical Education Society's Smt. Kashibai Nawale Women's College Of Engineering","Symbiosis Society's College Of Arts And Commerce,","Army Institute Of Technology College Of Engineering"
			,"College of Engineering Pune"};

	AutoCompleteTextView collegename;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_studentlogintab);

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,mcollege);
		collegename = (AutoCompleteTextView)findViewById(R.id.collgename_autocomplete);
		collegename.setThreshold(1);
		collegename.setAdapter(adapter);


	}
}

