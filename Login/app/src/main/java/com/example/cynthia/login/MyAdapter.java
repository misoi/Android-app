package com.example.cynthia.login;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by cynthia on 5/29/16.
 */
public class MyAdapter extends ArrayAdapter<String> {

    public MyAdapter(Context context,String[]values) {
        super(context,R.layout.row_layout);
    }
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        LayoutInflater theInflater = LayoutInflater.from(getContext());
//        View theView = theInflater.inflate(R.layout.row_layout, parent, false);
//        String candidate = getItem(position);

//        TextView textView = (TextView) candidate.findViewById(R.id.textView);
//        theView.setText(candidate);
    }


