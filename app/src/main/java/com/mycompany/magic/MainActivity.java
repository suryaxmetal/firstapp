package com.mycompany.magic;

import android.app.*;
import android.os.*;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.*;
import android.view.View;


public class MainActivity extends Activity 
{
	Button b;
	EditText e;
	EditText j;
	TextView text;
	Random r = new Random();
	int magic;
	int jvmn;
	//Toast t;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		
		Toast.makeText(getApplicationContext(),"Welcome to kids fun",Toast.LENGTH_LONG).show();
		
		
    }
	
	public void press(View v){
	
		e = (EditText) findViewById(R.id.edit);
		
		String texti = e.getText().toString();
		
		int un = Integer.parseInt(texti);
		
		text = (TextView) findViewById(R.id.user);
		text.setText("Your guess: " + texti);
		
		TextView j = (TextView) findViewById(R.id.jvm);
		
		j.setText("My number is: " + magic);
		// random
		
		magic = r.nextInt(200);
		
		if(un == magic){
			
			Toast.makeText(getApplicationContext(),"You win !!!",Toast.LENGTH_SHORT).show();
			
			
			
		}else{
			
			Toast.makeText(getApplicationContext(),"You lose !!!",Toast.LENGTH_SHORT).show();
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
