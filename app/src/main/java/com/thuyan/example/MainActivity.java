package com.thuyan.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private CustomListAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list);
        ArrayList<ListString> stringList = new ArrayList<>();
        stringList.add(new ListString("String1" , "String2","String3","String4","String5","String6","String7","String8",R.drawable.image1,R.drawable.image2));


        mAdapter = new CustomListAdapter(this,stringList);
        listView.setAdapter((ListAdapter) mAdapter);
    }
}
