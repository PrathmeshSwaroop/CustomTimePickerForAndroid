package com.example.timepicker;



import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class timePickForAndroid4 extends Activity
{

	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.time_pick_android_4);
		String []TimeStrings=getResources().getStringArray(R.array.time_picker_values);
		CustomNumberPickerForAndroid4 number1=(CustomNumberPickerForAndroid4)findViewById(R.id.numberpicker1);
		CustomNumberPickerForAndroid4 number2=(CustomNumberPickerForAndroid4)findViewById(R.id.numberpicker2);
        
		final FormatMyPickerForAndroid4 picker1=new FormatMyPickerForAndroid4(number1, TimeStrings, getApplicationContext());
		final FormatMyPickerForAndroid4 picker2=new FormatMyPickerForAndroid4(number2, TimeStrings, getApplicationContext());
		
		Button get1=(Button)findViewById(R.id.getTime1);
		Button get2=(Button)findViewById(R.id.getTime2);
		
		get1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				Log.i("check","pick1: "+picker1.getCurrentTime());
			}
		});
		get2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			Log.i("check","pick2 :"+picker2.getCurrentTime());	
			}
		});
	
	}

	
}
