package com.appmasters.stressquotations;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.facebook.android.DialogError;
import com.facebook.android.Facebook;
import com.facebook.android.FacebookError;
import com.facebook.android.Facebook.DialogListener;
import com.facebook.android.Util;
import in.digitechlab.stressquotations.R;


public class Quot7 extends Activity {
	
	Facebook fb;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quot7);
		
        Button next1 = (Button)findViewById(R.id.next7);

        next1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        	Intent intent = new Intent(getApplicationContext(), Quot8.class);
			startActivity(intent);
        }
    });
        
		String APP_ID = getString(R.string.app_id);
		
	    fb = new Facebook(APP_ID);
	    
        Button back1 = (Button)findViewById(R.id.back7);

        back1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
      		
      		
       		Bundle params = new Bundle();
       		
       		

       		params.putString("picture", "https://www.facebook.com/TheStressManagement/photos/a.933978966685471.1073741825.121505604599482/937024673047567/?type=3&theater");

        		
        		fb.dialog(Quot7.this, "feed", params, new DialogListener() {

    				@Override
    				public void onComplete(Bundle values) {
    					
    					Toast.makeText(Quot7.this, "Successfully Shared in Facebook", Toast.LENGTH_LONG).show();
    					
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