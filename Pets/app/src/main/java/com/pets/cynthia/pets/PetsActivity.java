package com.pets.cynthia.pets;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by cynthia on 5/29/16.
 */
public class PetsActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pets);
        addButtonOnClickListener1();
        addTextnClickListener1();
    }

        public void addButtonOnClickListener1(){ //links to cats page
           TextView textView;

           textView= (TextView)findViewById(R.id.textView3);
          textView.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PetsActivity.this,CatsActivity.class);
                    startActivity(intent);
                }
            });
        }
    public void addTextnClickListener1(){ //links to cats page
        TextView textView;

        textView = (TextView) findViewById(R.id.textView4);
        textView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PetsActivity.this,DogsActivity.class);
                startActivity(intent);
            }
        });
    }
}