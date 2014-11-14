package com.example.runningservice;




import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;




public class MainActivity extends BroadcastReceiver
{
	public void onReceive(Context context, Intent intent)
	{
		Intent i = new Intent("com.example.MyService");
		i.setClass(context, MyService.class);
		context.startService(i);
	}
}
