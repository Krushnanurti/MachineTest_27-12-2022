package com.example.datacommunicationapp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    ImageView imageView;
    String virat1,virat2,virat3,virat4;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        extras();
    }
    public void extras()
    {
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        virat1=bundle.getString("Virat1");
        virat2=bundle.getString("Virat2");
        virat3=bundle.getString("Virat3");
        virat4=bundle.getString("Virat4");
        if (virat1.equals("Virat1"))
        {
            imageView.setImageResource();
        }

    }
}
