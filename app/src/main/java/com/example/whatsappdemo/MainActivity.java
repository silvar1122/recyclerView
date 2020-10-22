package com.example.whatsappdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    GridView gridView;
    String[]months={"January","February","March","April","May","June","July","August","September","October","November","December"};
    int[]monthImage={R.drawable.january,R.drawable.february,R.drawable.march,R.drawable.april,R.drawable.may,R.drawable.june,R.drawable.july
    ,R.drawable.august,R.drawable.september,R.drawable.october,R.drawable.november,R.drawable.december};


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.customaction,menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView=(GridView) findViewById(R.id.grid_view);

        customAdapter adapter=new customAdapter(getApplicationContext(),months,monthImage);
        gridView.setAdapter(adapter);












    }

}