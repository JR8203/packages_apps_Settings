package com.android.settings;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ThanksIrc extends Activity {
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       TextView tv = new TextView(this);
       tv.setText("-Regularly test builds for me." + "\n-Basically run a 24/7 help center for anything t3hh4xx0r related. Love you guys.");
       setContentView(tv);
   }
}
