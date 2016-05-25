package com.example.cynthia.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }
    public void onButtonTap(View v){
        Toast myToast =Toast.makeText(getApplicationContext(),"HAH!",Toast.LENGTH_LONG);
        myToast.show();

    }
}
