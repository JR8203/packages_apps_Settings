package com.android.settings;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ThanksCm extends Activity {
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       TextView tv = new TextView(this);
       tv.setText("Where to start? The CyanogenMod team makes AOSP possible. Without them, AOSP would be worthless, they've had a hand in basically everything across multiple versions of Android and a multitude of devices. Their contributions have lead to the functionality you expect in a stock rom, Camera, GPS, Video Recording, FM Radio, and so much more.");
       setContentView(tv);
   }
}
