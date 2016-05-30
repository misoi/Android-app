package com.pets.cynthia.pets;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

/**
 * Created by cynthia on 5/29/16.
 */
public class DogsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dog);

    GridView gridview = (GridView) findViewById(R.id.gridView);
    gridview.setAdapter(new ImageAdapter(this));
}
}
