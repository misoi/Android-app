package com.example.cynthia.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by cynthia on 5/25/16.
 */
public class WhatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     setContentView(R.layout.what);
        String[] candidates = {
                "Jane kimani",
                "John karani",
                "Charles Ketwony",
                "Betty Kirui",
                "Elizabeth Mwangi",
                "John Butere",
                "William Henry",
                "Brian jackson",
                "Millard Fillmore",
                "Brillian Chebet"};

       ListAdapter adapter = new ArrayAdapter<String>(this,R.layout.row_layout,candidates);


        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 String Itempicked = "You selected" + String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(WhatActivity.this, Itempicked, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
