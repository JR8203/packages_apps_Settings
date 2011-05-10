package com.android.settings;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ThanksSteve extends Activity {
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       TextView tv = new TextView(this);
       tv.setText("Designed and created my website for free, and still maintains it." + "\n-OMFGB bootanimation." + "\n-God Mode icon");
       setContentView(tv);
   }
}
