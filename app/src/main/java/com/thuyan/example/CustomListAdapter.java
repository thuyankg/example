package com.thuyan.example;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomListAdapter {

    private Context mContext;
    private List<ListString> stringList = new ArrayList<>();

    public CustomListAdapter(@NonNull Context context, ArrayList<ListString> list) {

        mContext = context;
        stringList = list;
    }


    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item,parent,false);

        ListString currentString = stringList.get(position);

        ImageView image1 = (ImageView)listItem.findViewById(R.id.imageView1);
        image1.setImageResource(currentString.getmImageDrawable1());

        ImageView image2 = (ImageView)listItem.findViewById(R.id.imageView2);
        image2.setImageResource(currentString.getmImageDrawable2());

        TextView string1 = (TextView) listItem.findViewById(R.id.String1);
        string1.setText(currentString.getString1());

        TextView string2 = (TextView) listItem.findViewById(R.id.String2);
        string2.setText(currentString.getString2());

        TextView string3 = (TextView) listItem.findViewById(R.id.String3);
        string3.setText(currentString.getString3());

        TextView string4 = (TextView) listItem.findViewById(R.id.String4);
        string4.setText(currentString.getString4());

        TextView string5 = (TextView) listItem.findViewById(R.id.String5);
        string5.setText(currentString.getString5());

        TextView string6 = (TextView) listItem.findViewById(R.id.String6);
        string6.setText(currentString.getString6());

        TextView string7 = (TextView) listItem.findViewById(R.id.String7);
        string7.setText(currentString.getString7());

        TextView string8 = (TextView) listItem.findViewById(R.id.String8);
        string8.setText(currentString.getString8());
        return listItem;
    }
}
