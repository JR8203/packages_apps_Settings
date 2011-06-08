package com.android.settings;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ThanksEvervolv extends Activity {
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       TextView tv = new TextView(this);
       tv.setText("-Originally the remappable hoseats mod was written by Preludedrew for Evervolv. He allowed us to modify it and use it in our build.");
       setContentView(tv);
   }
}
