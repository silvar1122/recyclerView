package com.example.whatsappdemo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class customAdapter extends BaseAdapter {

    private Context context;
    private String[]months;
    private  int[]monthImages;

    public customAdapter(Context context, String[] months, int[] monthImages) {
        this.context = context;
        this.months = months;
        this.monthImages = monthImages;
    }

    @Override
    public int getCount() {
        return monthImages.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=LayoutInflater.from(context);
        convertView=inflater.inflate(R.layout.rowitem,null);
        CircleImageView imageView=(CircleImageView)convertView.findViewById(R.id.monthImage);
        TextView month=(TextView)convertView.findViewById(R.id.name);

        imageView.setImageResource(monthImages[position]);
        month.setText(months[position]);
        return convertView;
    }
}
