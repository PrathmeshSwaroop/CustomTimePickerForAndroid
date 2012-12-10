package com.example.timepicker;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class FormatMyPickerForAndroid2
{
	
	private int mIndex=0;
	private int mStringLength=0;
	private String mAMPM="PM";
	private  String mCurtime="00:00";
	//Constructor
	public FormatMyPickerForAndroid2(CustomTimeForAndroid2 time,final String []TimeStrings,Context context) 
	{
		
		mStringLength=TimeStrings.length;
		Log.i("check",mStringLength+"");
        LinearLayout lay=(LinearLayout)time.getChildAt(0);
        lay.getChildAt(1).setVisibility(View.GONE);
        LinearLayout numberPicker=(LinearLayout)lay.getChildAt(0);
        ImageButton increBtn=(ImageButton)numberPicker.getChildAt(0);
        ImageButton decreBtn=(ImageButton)numberPicker.getChildAt(2);
        final Button aMPM=(Button)lay.getChildAt(2);
        mAMPM=aMPM.getText()+"";
        final EditText timeText=(EditText)numberPicker.getChildAt(1);
        Log.i("check","ch");
        final EditText newTime=new EditText(context);
        newTime.setEnabled(false);
        newTime.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT));
        ((LinearLayout)timeText.getParent()).removeView(timeText);
        numberPicker.addView(newTime, 1);
        newTime.setText(TimeStrings[0]);
        //incrementing
        increBtn.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View v)
			{
				
				if(mIndex<mStringLength-1)
				{
					newTime.setText("");
					newTime.setText(TimeStrings[++mIndex]);
					mCurtime=TimeStrings[mIndex];
					newTime.invalidate();
				}
				
			}
		});
        //decrementing
        decreBtn.setOnClickListener(new OnClickListener()
        {
			
			@Override
			public void onClick(View v) 
			{
				if(mIndex>0)
				{
					newTime.setText("");
					newTime.setText(TimeStrings[--mIndex]);
					mCurtime=TimeStrings[mIndex];
					newTime.invalidate();
				}
			}
		});
        //AM-PM
        
        aMPM.setOnClickListener(new OnClickListener()
        {
			
			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				if(aMPM.getText().toString().equalsIgnoreCase("AM"))
				{
					aMPM.setText("PM");
					mAMPM=aMPM.getText().toString();
					aMPM.invalidate();
				}
				else
				{
					aMPM.setText("AM");
					mAMPM=aMPM.getText().toString();
					aMPM.invalidate();
					
				}
				
			}
		});
	}
	//Constructor Ends Here
	public String getCurrentTime()
	{
		return mCurtime+" "+mAMPM;
	}
	
}
