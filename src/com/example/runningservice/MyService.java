package com.example.runningservice;

import java.io.IOException;


import android.app.Service;
import android.content.Intent;
import android.os.IBinder;


public class MyService extends Service
{
	Process x;
	
	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void onCreate()
	{
		
	}
	
	public void onStart(Intent intent)
	{
		try {
			x = Runtime.getRuntime().exec("which yes|yes");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
