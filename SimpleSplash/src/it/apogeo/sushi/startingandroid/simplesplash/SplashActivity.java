package it.apogeo.sushi.startingandroid.simplesplash;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

public class SplashActivity extends Activity {
	
	/*
	 * Value that identifier the message for going to MainActivity
	 */
	private final static int GO_TO_MAIN_WHAT = 1;
	
	/*
	 * The delay to wait before going to MainActivity
	 */
	private long mDelay;
	
	/*
	 * Tells if the SplashActivity is finished or not
	 */
	private boolean mSplashFinished;
	
	private Handler myHandler = new Handler(){
		@Override
		public void handleMessage(Message msg) {
			if(!mSplashFinished){
				goToMain();
			}
		}
	};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        // We read time to wait before going to MainActivity
        mDelay = getResources().getInteger(R.integer.splash_timeout);
        myHandler.sendEmptyMessageDelayed(GO_TO_MAIN_WHAT, mDelay);
    }
    
    @Override
    protected void onDestroy() {
    	super.onDestroy();
    	// If we're exiting we check for finishing and fix the Splash as finished
    	if(isFinishing()){
    		mSplashFinished = true;
    	}
    }
    
    /*
     * Utility nethod for going to the second Activity
     */
    private void goToMain(){
    	
    }

}
