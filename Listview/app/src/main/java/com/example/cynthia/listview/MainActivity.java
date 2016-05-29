package com.example.cynthia.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.app.ListActivity;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {
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
            "Brillian Chebet"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        setContentView(R.layout.list);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, candidates));

    }
    public  void onListItemClick(ListView parent, View v, int position, long id){
        Toast.makeText(this, "You have selected" + candidates[position], Toast.LENGTH_SHORT).show();
    }
    public void addButtonOnClickListener(){ //links to list page
        Button button;

        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ListActivity.class);
                startActivity(intent);
            }
        });
    }


}