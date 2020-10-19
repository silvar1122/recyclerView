package com.example.whatsappdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    recyclerAdapter recycleradapter;
    List<currentMonth>currentMonthList;


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

        recyclerView=(RecyclerView)findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager manager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);



        currentMonthList=new ArrayList<>();

        currentMonthList.add(
                new currentMonth(R.drawable.january,"January",1));
        currentMonthList.add(
                new currentMonth(R.drawable.february,"February",2));
        currentMonthList.add(
                new currentMonth(R.drawable.march,"March",3));
        currentMonthList.add(
                new currentMonth(R.drawable.april,"April",4));
        currentMonthList.add(
                new currentMonth(R.drawable.may,"May",5));
        currentMonthList.add(
                new currentMonth(R.drawable.june,"June",6));
        currentMonthList.add(
                new currentMonth(R.drawable.july,"July",7));
        currentMonthList.add(
                new currentMonth(R.drawable.august,"August",8));
        currentMonthList.add(
                new currentMonth(R.drawable.september,"September",9));
        currentMonthList.add(
                new currentMonth(R.drawable.october,"October",10));
        currentMonthList.add(
                new currentMonth(R.drawable.november,"November",11));
        currentMonthList.add(
                new currentMonth(R.drawable.december,"December",12));




        recycleradapter=new recyclerAdapter(this,currentMonthList);
        recyclerView.setAdapter(recycleradapter);


    }

}