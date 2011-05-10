package com.android.settings;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ThanksDonators extends Activity {
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       TextView tv = new TextView(this);
       tv.setText("-Bought me a developer Incredible, allowing me to sell my old one and buy a Thunderbolt as well. Thank you all so much.");
       setContentView(tv);
   }
}
