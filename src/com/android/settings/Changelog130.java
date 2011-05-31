package com.android.settings;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Changelog130 extends Activity {
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       TextView tv = new TextView(this);
       tv.setText("-Rebuilt from scratch yet again...again. Hopefully for the last time." + "\n-Updated to android 2.3.4" + "\n-Add Hero to list of supported devices." + "\n-Add FM Radio app" + "\n-Debut the Addons app writen by r2DoesInc and DavidJr." + "\n-Welcom DavidJr to the T3hh4xx0r team." + "\n-Enable endless looping in the launcher." + "\n-Return of the old centered lockscreen and LCD clock font." + "\n-Enabled scrollable widgets in stock Launcher2." + "\n-Enabled fully remappable hotseat keys." + "\n-Added overscroll weight and style options to God Mode." + "\n-Long press on music control toggle brings you to the music application." + "\n-SMS shortcut added to the lockscreen." + "\n-Rearranged the God Mode layouts." + "\n-Enabled quick uninstall of apps from stock Launcher2.");
       setContentView(tv);
   }
}
