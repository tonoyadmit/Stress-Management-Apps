package com.appmasters.stressquotations;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import in.digitechlab.stressquotations.R;


public class Stsplash extends Activity {
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_stsplash);
		
        
        if( getIntent().getBooleanExtra("EXIT", false)){
            finish();
            System.exit(0);
        }
		
		Thread t = new Thread(){
			
		public void run(){
		
			try{
				sleep(3000);
			}catch (InterruptedException e){
		}
			finally{
				Intent i = new Intent ("com.appmasters.stressquotations.STRESSACTIVITY");
				startActivity(i);
			}
			
		}
};
t.start();
}
	
	   @SuppressWarnings("deprecation")
	   @Override
	      protected void onDestroy() {
	   	   super.onDestroy();
	   	   System.runFinalizersOnExit(true);
	      }
}