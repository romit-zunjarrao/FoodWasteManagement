package com.example.dontwastefood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    protected  static ArrayList<FoodItemInfoPojo> listOfFood;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listOfFood = new ArrayList<>();
    }

    public void goToDashboard(View view) {
        Intent intent = new Intent(this,Dashboard.class);
        startActivity(intent);
    }
}
