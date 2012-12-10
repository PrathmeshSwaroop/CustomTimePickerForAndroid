package com.example.timepicker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class TimePicker extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);
       
        String oSVersion=android.os.Build.VERSION.RELEASE;
        Log.i("check",oSVersion.substring(0,1));
        if(oSVersion.substring(0,1 ).equalsIgnoreCase("4")||oSVersion.substring(0,1 ).equalsIgnoreCase("3"))
        {
        	Intent timeForAndroid4=new Intent(getApplicationContext(),timePickForAndroid4.class);
        	startActivity(timeForAndroid4);
        	
        }
        else
        {
        	Intent timeForAndroid2=new Intent(getApplicationContext(),timePickForAndroid2.class);
        	startActivity(timeForAndroid2);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_time_picker, menu);
        return true;
    }
    @Override
    protected void onResume() {
    	
    	// TODO Auto-generated method stub
    	super.onResume();
    
    	
    }
    @Override
    protected void onStop() {
    	// TODO Auto-generated method stub
    	super.onStop();
    }
    
}
