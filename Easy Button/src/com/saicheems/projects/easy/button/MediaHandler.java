package com.saicheems.projects.easy.button;

import java.io.IOException;

import android.content.Context;
import android.media.MediaPlayer;

public class MediaHandler {

	private Context context;
	private MediaPlayer mPlayer;
	
	public MediaHandler(Context context) {
		this.context = context;
	}
	
	public void playSound() {
		if(!mPlayer.isPlaying())
			mPlayer.start();
	}
	
	public void onPause() {
		mPlayer.release();
	}
	
	public void onResume() {
		mPlayer = MediaPlayer.create(context, R.raw.that_was_easy);
		prepareSound();
	}
	
	private void prepareSound() {
		try {
			mPlayer.prepare();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
