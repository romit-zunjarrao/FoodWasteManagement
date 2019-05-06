package com.example.dontwastefood;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {

    Context context;
    ArrayList list;

    public ListAdapter(Context context, ArrayList list)
    {
        this.context = context;
        this.list = list;
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if(convertView == null)
        {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_view_row, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        FoodItemInfoPojo object = (FoodItemInfoPojo)list.get(position) ;
        viewHolder.itemName.setText(object.foodItemName);
        viewHolder.itemQuantity.setText(object.foodItemQuantity);
        viewHolder.itemPrice.setText(object.foodItemPrice);
        viewHolder.contactNo.setText(object.contactNo);
        viewHolder.addressPoint.setText(object.addressPoint);
        return convertView;


    }

    public class ViewHolder
    {
        TextView itemName,itemQuantity, itemPrice, contactNo, addressPoint;

        public ViewHolder(View view)
        {
            itemName = view.findViewById(R.id.itemName);
            itemQuantity = view.findViewById(R.id.itemQuantity);
            itemPrice = view.findViewById(R.id.itemPrice);
            contactNo = view.findViewById(R.id.contactNo);
            addressPoint = view.findViewById(R.id.addressPoint);

        }
    }
}
