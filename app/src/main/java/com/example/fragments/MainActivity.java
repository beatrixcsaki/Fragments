package com.example.fragments;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements TopFragment.Inter{
    @Override
    public void press(String text) {
        BottomFragment bot = (BottomFragment) getSupportFragmentManager().findFragmentById(R.id.botFragment);
        bot.display(text);
    }
    @Override
    public void press(){
        BottomFragment bot = (BottomFragment) getSupportFragmentManager().findFragmentById(R.id.botFragment);
        bot.displayURL();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getSupportActionBar().hide();
    }
}