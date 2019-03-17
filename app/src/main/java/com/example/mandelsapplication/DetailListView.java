package com.example.mandelsapplication;

import android.app.ListActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class DetailListView extends ListActivity {
    static ArrayList<Pair<String,String>> elemente;


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        elemente=new ArrayList<>();

        setListAdapter(new DetailArrAdapter(this,elemente));

    }

    @Override
    protected void onListItemClick(ListView listView, View v,int position,long id){

        Pair<String,String> selectedValue=(Pair<String,String>)getListAdapter().getItem(position);
        Toast.makeText(this,selectedValue.first,Toast.LENGTH_SHORT).show();
    }

}
