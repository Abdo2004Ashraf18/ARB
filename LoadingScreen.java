package com.asat.arb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoadingScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_screen);

        Thread thread = new Thread(){
            public void run(){
                try {
                    super.run();
                    sleep(2000);
                }catch (Exception e){

                }finally {
                    Intent intent = new Intent(LoadingScreen.this , MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        thread.start();
    }
}
