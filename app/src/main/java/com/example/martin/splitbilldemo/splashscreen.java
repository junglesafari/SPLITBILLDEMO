package com.example.martin.splitbilldemo;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class splashscreen extends AppCompatActivity {
Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        requestWindowFeature( Window.FEATURE_NO_TITLE );
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView( R.layout.activity_splashscreen );
        handler=new Handler(  );
        handler.postDelayed( new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent( splashscreen.this,MainActivity.class );
                startActivity( intent );
                finish();
            }
        },2000 );
    }
}
