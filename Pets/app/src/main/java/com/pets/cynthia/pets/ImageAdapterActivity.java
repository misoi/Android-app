package com.pets.cynthia.pets;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by cynthia on 5/29/16.
 */
public class ImageAdapterActivity extends BaseAdapter {
    private Context mContext;
    // Constructor
    public ImageAdapterActivity(Context c) {
        mContext = c;
    }
    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        }
        else
        {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }
    // Keep all Images in array
    public Integer[] mThumbIds = {
            R.drawable.cat1, R.drawable.cat2,
            R.drawable.cat3, R.drawable.cat4,
            R.drawable.cat5, R.drawable.cat6
    };
}