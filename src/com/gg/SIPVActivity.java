/*
 * SIPV:     sip audio video call test.
 */
package com.gg;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class SIPVActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public boolean onCreateOptionsMenu(Menu menu)
    {
    	boolean result = super.onCreateOptionsMenu(menu);
    	
    	return result;
    }
}