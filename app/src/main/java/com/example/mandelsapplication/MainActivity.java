package com.example.mandelsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.util.Log;
import android.util.Pair;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private ListView listView;
    private CustomArrAdapter listAdapter;
    private ArrayList<Boolean> elementeBool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG,"Merg");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.main_toolbar);
        setSupportActionBar(myToolbar);

        listView=(ListView)findViewById(R.id.listdim);
       ArrayList <Pair<String,String>> elemente=new ArrayList<>();
       elementeBool=new ArrayList<>();
       elemente.add(new Pair<String, String>("New York","Tenerife"));
       elementeBool.add(true);

        elemente.add(new Pair<String, String>("Washington","DC"));
        elementeBool.add(false);
       listAdapter = new CustomArrAdapter(this, elemente,elementeBool);
        listView.setClickable(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              long viewID=view.getId();
              if(viewID == R.id.imageButton){
                  ImageButton imageButton=(ImageButton)view;

                  if(elementeBool.get(position)){
                      elementeBool.set(position,false);
                      imageButton.setImageResource(R.drawable.star_off);

                  }else{
                      elementeBool.set(position,true);
                      imageButton.setImageResource(R.drawable.star_on);

                  }

              }else {
                  Log.d(TAG,"Am ajuns");

                  Intent i = new Intent(view.getContext(), DETAILS.class);
                  MainActivity.this.startActivity(i);
              }
            }
        });
       listView.setAdapter(listAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.imageButtonMain:
                Intent i =new Intent(getApplicationContext(),FILTER.class);
                startActivity(i);
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }

    }

}
