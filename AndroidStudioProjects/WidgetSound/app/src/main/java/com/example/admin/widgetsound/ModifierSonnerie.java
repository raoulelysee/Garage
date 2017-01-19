package com.example.admin.widgetsound;

import android.app.Activity;
import android.app.IntentService;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.util.Log;
import android.widget.RemoteViews;

public class ModifierSonnerie extends IntentService{

	public ModifierSonnerie() {
		super("gestion sonnerie");
		// TODO Auto-generated constructor stub
	}
	
	public ModifierSonnerie(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onHandleIntent(Intent intent) {
		Log.v("aud", "handle intent");
		ComponentName name = new ComponentName(this, SuperWidgetProvider.class);
		AppWidgetManager mgr = AppWidgetManager.getInstance(this);
		mgr.updateAppWidget(name,  buildUpdate(this));
		
	}

	private RemoteViews buildUpdate(Context context) {
		RemoteViews rv = new 
				RemoteViews(context.getPackageName(), R.layout.widget1);
		AudioManager audioMgr =(AudioManager) context.getSystemService(Activity.AUDIO_SERVICE);
		//vérifier le mode de sonnerie
		Log.v("aud", "remote");
		if (audioMgr.getRingerMode() == AudioManager.RINGER_MODE_SILENT){//mettre la sonnerie
		rv.setImageViewResource(R.id.sonnerie, R.drawable.sonnerie);
		audioMgr.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
		}else{//couper la sonnerie
			rv.setImageViewResource(R.id.sonnerie, R.drawable.sonnerieoff);
			audioMgr.setRingerMode(AudioManager.RINGER_MODE_SILENT);	
		}
 		Intent intention = new Intent(this, SuperWidgetProvider.class);
 		short requestCode = 100;
 		PendingIntent pi = PendingIntent.getBroadcast(context, requestCode, intention, 0);
 		rv.setOnClickPendingIntent(R.id.sonnerie, pi);
		return rv;
		}
		
	

}
