package com.android.settings;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ThanksJb413 extends Activity {
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       TextView tv = new TextView(this);
       tv.setText("-Provided us with a fully working Hero setup. This allowed us to add the Hero to our list of supported devices!");
       setContentView(tv);
   }
}
