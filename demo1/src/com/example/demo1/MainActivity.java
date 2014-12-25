package com.example.demo1;

import android.R.string;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.AlertDialog;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.os.Build;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DisplayMetrics dm = new DisplayMetrics();  
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int dpi = dm.densityDpi;
        int width = dm.widthPixels;
        int heigth = dm.heightPixels;
        final String tmp = "dpi:" + String.valueOf(dpi) + "   pixel:"+ String.valueOf(width) + "*" +String.valueOf(heigth);
        TextView txt1 = (TextView)findViewById(R.id.textView1);
        txt1.setText("叶得挺是不是傻逼？"); txt1.setTextSize(30);
        
        Button btn1 = (Button)findViewById(R.id.button1);
        btn1.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		new AlertDialog.Builder(MainActivity.this)
    			.setTitle("你答对了！")
    			.setMessage("来玩个游戏吧!(To do)")
    			.setPositiveButton("确定",null)
    			.show();
        	}
        });
        Button btn2 = (Button)findViewById(R.id.button2);
        btn2.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		new AlertDialog.Builder(MainActivity.this)
    			.setTitle("你特么的在逗我！")
    			.setMessage("偷偷看看你的手机信息" + tmp)
    			.setPositiveButton("确定",null)
    			.show();
        	}
        });
    }


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
