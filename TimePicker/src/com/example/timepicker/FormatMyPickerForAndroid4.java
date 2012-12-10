package com.example.timepicker;

import android.content.Context;
import android.util.Log;
import android.widget.EditText;

	public class FormatMyPickerForAndroid4
	{
		
		private int mStringLength=0;
		private EditText curTime;
		private CustomNumberPickerForAndroid4 mNumber;
		//Constructor
		public FormatMyPickerForAndroid4(CustomNumberPickerForAndroid4 number,final String []TimeStrings,Context context) 
		{
			mStringLength=TimeStrings.length;
			mNumber=number;
			mNumber.setMinValue(0);
	        mNumber.setMaxValue(mStringLength-1);
	        mNumber.setWrapSelectorWheel(false);
	        mNumber.setDisplayedValues(TimeStrings);
	        curTime=(EditText)mNumber.getChildAt(0);
	        mNumber.getChildAt(0).setEnabled(false);
	        mNumber.getChildAt(0).setFocusable(false);
	        Log.i("check",mNumber.getValue()+"");
	        
		}
		//Constructor Ends Here
		public String getCurrentTime()
		{
			return curTime.getText()+"";
		}
		
	}

