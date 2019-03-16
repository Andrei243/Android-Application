package com.example.mandelsapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class FILTER extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.filter_toolbar);
        setSupportActionBar(myToolbar);

        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText countryinput=(EditText)findViewById(R.id.CountryEdit);
                EditText windinput=(EditText)findViewById(R.id.WindEdit);
                String country=countryinput.getText().toString();
                String windString=windinput.getText().toString();
                Integer wind= Integer.parseInt(windString);

                TextView textView=(TextView)findViewById(R.id.textView2);
                textView.setText((String)(country+" "+windString));

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.filter,menu);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.imageButtonFilter:
                Intent i =new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }

    }
}
