package com.appmasters.stresstips;

//import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import in.digitechlab.stresstips.R;


public class StressActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stress);
        
        
        Button exit = (Button)findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {
          	Intent intent = new Intent(getApplicationContext(), Stsplash.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.putExtra("EXIT", true);
            startActivity(intent);
            finish();
            System.exit(0);
            }
          });
        
        Button tips = (Button)findViewById(R.id.tips);

        tips.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        	Intent intent = new Intent(getApplicationContext(), Tips4.class);
			startActivity(intent);
        }
    });
        
        
        Button strategies = (Button)findViewById(R.id.strategies);

        strategies.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        	Intent intent = new Intent(getApplicationContext(), Tips1.class);
			startActivity(intent);
        }
    });
        
        Button go_about = (Button)findViewById(R.id.go_about);

        go_about.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        	Intent intent = new Intent(getApplicationContext(), AboutActivity.class);
			startActivity(intent);
        }
    });
        
        
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        getMenuInflater().inflate(R.menu.stress, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
