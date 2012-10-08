package com.saicheems.projects.easy.button;

import android.media.AudioManager;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

public class EasyButtonActivity extends Activity {

	private MediaHandler mMediaHandler;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);        
        setContentView(R.layout.activity_easy_button);
             
        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        
        ImageButton easyButton = (ImageButton) findViewById(R.id.easy_button);
        
        mMediaHandler = new MediaHandler(this);
		
        easyButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				mMediaHandler.playSound();
			}
		});
    }

    public void onResume() {
    	super.onResume();
    	
    	mMediaHandler.onResume();
    }
    
    public void onPause() {
    	super.onPause();
    	
    	mMediaHandler.onPause();
    }
}
