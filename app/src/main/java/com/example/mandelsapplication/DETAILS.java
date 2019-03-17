package com.example.mandelsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

import androidx.appcompat.widget.Toolbar;

public class DETAILS extends AppCompatActivity {
    private String tara_actuala;
    private Boolean e_favorit;
    private Menu meniu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        tara_actuala="Romania";
        e_favorit=true;

        Toolbar myToolbar=(Toolbar)findViewById(R.id.detailToolbar);
        setSupportActionBar(myToolbar);
        myToolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        myToolbar.setTitle(tara_actuala);
        myToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });



       ListView myListView=(ListView)findViewById(R.id.listdetails);
       ArrayList<Pair<String,String>> elemente=new ArrayList<>();

       elemente.add(new Pair<String, String>("Tara","Romania"));
       elemente.add(new Pair<String, String>("Oras","Bucuresti"));

       DetailArrAdapter detailArrAdapter=new DetailArrAdapter(this,elemente);
        myListView.setAdapter(detailArrAdapter);




    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        meniu=menu;
        getMenuInflater().inflate(R.menu.detailmenu,menu);
        desenareStea();


        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.imageButtonDetail:
                schimbare_favorit();
                desenareStea();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }

    }

    private void schimbare_favorit(){
        if(e_favorit){
            e_favorit=false;
        }else{
            e_favorit=true;
        }

    }

    private void desenareStea(){
        if(e_favorit) {
            meniu.findItem(R.id.imageButtonDetail).setIcon(R.drawable.star_on);
        }else{
            meniu.findItem(R.id.imageButtonDetail).setIcon(R.drawable.star_off);

        }

    }


}
