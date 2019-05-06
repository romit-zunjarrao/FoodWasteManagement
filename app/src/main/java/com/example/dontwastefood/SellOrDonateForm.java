package com.example.dontwastefood;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SellOrDonateForm extends AppCompatActivity {

    EditText  foodItemNameEditText, foodItemQuantityEditText, foodItemPriceEditText, contactNoEditText, addressPointExitText;
    String name,quantity,price,contactNo,addressPoint;
    SharedPreferences shared;
    ArrayList<FoodItemInfoPojo> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_or_donate_form);
        foodItemNameEditText = findViewById(R.id.foodItemNameEditText);
        foodItemQuantityEditText = findViewById(R.id.foodItemQuantityEditText);
        foodItemPriceEditText = findViewById(R.id.foodItemPriceEditText);
        contactNoEditText = findViewById(R.id.contactNoEditText);
        addressPointExitText = findViewById(R.id.addressPointEditText);

    }

    public void addItem(View view) {
        name = foodItemNameEditText.getText().toString();
        quantity = foodItemQuantityEditText.getText().toString();
        price = foodItemPriceEditText.getText().toString();
        contactNo = contactNoEditText.getText().toString();
        addressPoint = addressPointExitText.getText().toString();


        if(name != "" || quantity != "" || price != "" || contactNo != "" || addressPoint != "")
        {
            FoodItemInfoPojo pojo = new FoodItemInfoPojo(name,quantity,price,contactNo,addressPoint);
            MainActivity.listOfFood.add(pojo);
            Log.d("list",MainActivity.listOfFood.toString());
            clearAll();
        }

    }

    public void clearAll()
    {
        foodItemNameEditText.setText("");
        foodItemQuantityEditText.setText("");
        foodItemPriceEditText.setText("");
        contactNoEditText.setText("");
        addressPointExitText.setText("");
    }
}
