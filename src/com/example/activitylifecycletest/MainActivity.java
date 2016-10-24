package com.example.activitylifecycletest;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	private Button second,third;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		second=(Button)findViewById(R.id.second);
		third=(Button)findViewById(R.id.third);
		second.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				Intent intent=new Intent(MainActivity.this,SecondActivity.class);
				startActivity(intent);
			}
		});
		third.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				Intent intent=new Intent(MainActivity.this,ThirdActivity.class);
				startActivity(intent);
			}
		});
		System.out.println("MainActivity's onCreate");
	}
	protected void onStart(){
		super.onStart();
		System.out.println("MainActivity's onStart");
	}
	protected void onRestart(){
		super.onRestart();
		System.out.println("MainActivity's onRestart");
	}
	protected void onResume(){
		super.onStart();
		System.out.println("MainActivity's onResume");
    }
	protected void onStop(){
		super.onStop();
		System.out.println("MainActivity's onStop");
	}
	protected void onDestroy(){
		super.onStop();
		System.out.println("MainActivity's onDestroy");
	}
	protected void onPause(){
		super.onStop();
		System.out.println("MainActivity's onPause");
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
