package com.example.ydt_is_sb;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.os.Build;
import android.provider.DocumentsContract.Root;

public class MainActivity extends ActionBarActivity {

	private static Button btn1;
	private static TextView nullstring;
	//private static AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);
     
        nullstring = (TextView)findViewById(R.id.textView1);
        nullstring.setTextSize(20);
        if(nullstring != null) nullstring.setText("is ydt sb?");
        
        /*AlertDialog.Builder alertDialog  = new  AlertDialog.Builder(this); 
        AlertDialog alertDialogs = alertDialog.create();
        alertDialogs.dismiss(); 
        AlertDialog.setView(rootView);  
        alertDialogs= AlertDialog.create();*/
        btn1 = (Button)findViewById(R.id.button1);
        btn1.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		new AlertDialog.Builder(MainActivity.this)
    			.setTitle("标题")
    			.setMessage("内容")
    			.setPositiveButton("确定",null)
    			.show();
        	}
        });
        //btn2 = (Button)findViewById(R.id.button2);
        
        
    }

    private View.OnClickListener onClick = new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			new AlertDialog.Builder(MainActivity.this)
			.setTitle("标题")
			.setMessage("内容")
			.setPositiveButton("确定",null)
			.show();
		}
	};
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */

}
