package com.android.settings;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ThanksPeter extends Activity {
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       TextView tv = new TextView(this);
       tv.setText("-Allowed us to use both his device and vendore setup for gingerbread OG Droid.");
       setContentView(tv);
   }
}
