package com.example.dontwastefood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ViewAllFood extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_all_food);
        listView = findViewById(R.id.listView);
        ListAdapter adapter = new ListAdapter(this, MainActivity.listOfFood);
        listView.setAdapter(adapter);
    }
}
