/*
 * SIPV:     sip audio video call test.
 */
package com.gg;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class SIPVActivity extends Activity {
	
	/* Following the menu item constants which will be used for menu creation */
	public static final int FIRST_MENU_ID = Menu.FIRST;
	public static final int CONFIGURE_MENU_ITEM = FIRST_MENU_ID + 1;
	public static final int ABOUT_MENU_ITEM = FIRST_MENU_ID + 2;
	public static final int EXIT_MENU_ITEM = FIRST_MENU_ID + 3;	
		
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public boolean onCreateOptionsMenu(Menu menu)
    {
    	boolean result = super.onCreateOptionsMenu(menu);
    	MenuItem m = menu.add(0,ABOUT_MENU_ITEM, 0, R.string.menu_about);
    	m.setIcon(android.R.drawable.ic_menu_info_details);
    	m = menu.add(0, EXIT_MENU_ITEM, 0, R.string.menu_exit);
    	m.setIcon(android.R.drawable.ic_menu_close_clear_cancel);
    	m = menu.add(0,CONFIGURE_MENU_ITEM, 0, R.string.menu_settings);
    	m.setIcon(android.R.drawable.ic_menu_preferences);
    	
    	return result;
    }
}



