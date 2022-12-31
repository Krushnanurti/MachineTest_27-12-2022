package com.example.datacommunicationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button Button1,Button2,Button3,Button4;
TextView textView1,textView2,textView3,textView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initListener();

    }
    public void initViews()
    {
        Button1=findViewById(R.id.Button1);
        Button2=findViewById(R.id.Button2);
        Button3=findViewById(R.id.Button3);
        Button4=findViewById(R.id.Button4);
        textView1=findViewById(R.id.Virat1);
        textView2=findViewById(R.id.Virat2);
        textView3=findViewById(R.id.Button3);
        textView4=findViewById(R.id.Virat4);

    }
    public void initListener()
    {
        //Functional interfaces are those interfaces which have only one abstract method;
        //Obviously View.onClickListener is a functional interface
        Button1.setOnClickListener(view -> {
            Intent i=new Intent(MainActivity.this,SecondActivity.class);
            i.putExtra("Virat1",textView1.getText().toString());
        });
        Button2.setOnClickListener(view -> {
            Intent i=new Intent(MainActivity.this,SecondActivity.class);
            i.putExtra("Virat2",textView2.getText().toString());
        });
        Button3.setOnClickListener(view -> {
            Intent i=new Intent(MainActivity.this,SecondActivity.class);
            i.putExtra("Virat3",textView3.getText().toString());
        });
        Button4.setOnClickListener(view -> {
            Intent i=new Intent(MainActivity.this,SecondActivity.class);
            i.putExtra("Virat4",textView4.getText().toString());
        });
    }
}