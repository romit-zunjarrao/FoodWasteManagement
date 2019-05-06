package com.example.dontwastefood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.InputStreamReader;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

    }

    public void lookForFood(View view) {
        Intent intent = new Intent(this, ViewAllFood.class);
        startActivity(intent);
    }

    public void donateOrSell(View view) {
        Intent intent = new Intent(this, SellOrDonateForm.class);
        startActivity(intent);
    }
}
