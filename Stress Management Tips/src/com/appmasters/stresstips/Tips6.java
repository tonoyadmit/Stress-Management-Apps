package com.appmasters.stresstips;

import com.facebook.android.DialogError;
import com.facebook.android.Facebook;
import com.facebook.android.FacebookError;
import com.facebook.android.Facebook.DialogListener;
import com.facebook.android.Util;
import in.digitechlab.stresstips.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Tips6 extends Activity {
	
	Facebook fb;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tips6);
		
        Button next6 = (Button)findViewById(R.id.next6);

        next6.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        	Intent intent = new Intent(getApplicationContext(), Tips7.class);
			startActivity(intent);
        }
    });
        
		String APP_ID = getString(R.string.app_id);
		
	    fb = new Facebook(APP_ID);
	    
        Button back6 = (Button)findViewById(R.id.back6);

        back6.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        	
      		
      		
       		Bundle params = new Bundle();
       		
       	

       		params.putString("picture", "https://www.facebook.com/TheStressManagement/photos/a.933982080018493.1073741827.121505604599482/933982636685104/?type=3&theater");
        		
        		fb.dialog(Tips6.this, "feed", params, new DialogListener() {

    				@Override
    				public void onComplete(Bundle values) {
    					
    					Toast.makeText(Tips6.this, "Successfully Shared in Facebook", Toast.LENGTH_LONG).show();
    					
    				}

    				@Override
    				public void onFacebookError(FacebookError e) {
    					// TODO Auto-generated method stub
    					
    				}

    				@Override
    				public void onError(DialogError e) {
    					// TODO Auto-generated method stub
    					
    				}

    				@Override
    				public void onCancel() {
    					// TODO Auto-generated method stub
    					
    				}
        			
        			
        		});
        }
    });
        
        
        Button home = (Button)findViewById(R.id.home);

        home.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        	Intent intent = new Intent(getApplicationContext(), StressActivity.class);
			startActivity(intent);
        }
    });
		
		
		
		
	
}
	
	   @SuppressWarnings("deprecation")
	   @Override
	      protected void onDestroy() {
	   	   super.onDestroy();
	   	   System.runFinalizersOnExit(true);
	      }
}