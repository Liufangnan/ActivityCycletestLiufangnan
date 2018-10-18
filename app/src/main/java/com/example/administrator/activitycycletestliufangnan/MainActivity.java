package com.example.administrator.activitycycletestliufangnan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button1;
private static final String LIFETAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(LIFETAG,"creat");
        button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(LIFETAG,"start");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(LIFETAG,"resume");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(LIFETAG,"restart");
    }
    @Override
    protected  void onPause(){
        super.onPause();
        Log.d(LIFETAG,"Pause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d(LIFETAG,"stop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(LIFETAG,"destroy");
    }
}
