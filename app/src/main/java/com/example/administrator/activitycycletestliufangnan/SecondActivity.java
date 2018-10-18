package com.example.administrator.activitycycletestliufangnan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    private Button button2;
    private static final String LIFETA="SecondActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(LIFETA,"creat");
        button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(LIFETA,"start");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(LIFETA,"resume");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(LIFETA,"restart");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(LIFETA,"pause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d(LIFETA,"stop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(LIFETA,"destroy");
    }
}
