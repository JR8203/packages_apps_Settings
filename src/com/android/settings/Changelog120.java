package com.android.settings;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Changelog120 extends Activity {
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       TextView tv = new TextView(this);
       tv.setText("-Rebuilt from scratch yet again." + "\n-Updated to android 2.3.3." + "\n-New Lockscreen music controls." + "\n-New features for the toggle widgets from cm." + "\n-Integration of the theme engine from Tmobile." + "\n-About OMFGB mod added to Settings menu." + "\n-Wimax enabled for applicable devices"+ "\n-Add Eris to list of supported devices.");
       setContentView(tv);
   }
}
