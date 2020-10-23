package com.example.whatsappdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class directedActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    ImageView imageMonth;
    TextView month,textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.directed_layout);

        imageMonth=findViewById(R.id.monthImage);
        month=(TextView)findViewById(R.id.month);
        textView=(TextView)findViewById(R.id.information);

        Intent intent=getIntent();
       month.setText( intent.getStringExtra("name"));
       imageMonth.setImageResource(intent.getIntExtra("imageMonth",0));

        Spinner spinner=findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.spinner_values,android.R.layout.simple_selectable_list_item);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(this);
       }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text=parent.getItemAtPosition(position).toString();

        textView.setText("It is a "+text+" month!!");
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
