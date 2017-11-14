package com.appmasters.stresstips;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import in.digitechlab.stresstips.R;

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
				Intent intent = new Intent(getApplicationContext(), AboutActivity.class);
				startActivity(intent);
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