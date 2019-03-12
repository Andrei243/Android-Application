package com.example.mandelsapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.util.Pair;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private RecyclerView recyclerView;
    private EditText editText;
    List<Pair<String,String>> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar=(Toolbar) findViewById(R.id.main_toolbar);
        setSupportActionBar(myToolbar);

       /* JSONObject jsonObject=new JSONObject();
        try {
            jsonObject.put("email", "andrei243.nma@gmail.com");
        }
        catch(Exception e){
            Log.d(TAG,"Nu s-a creat obiectul Json");
        }
        String data=jsonObject.toString();
        //recyclerView = (RecyclerView)findViewById(R.id.recycle);

        list = new ArrayList<Pair<String, String>>();
        URL url;
        HttpsURLConnection connection=null;
       try {
            url = new URL("https://internship-2019.herokuapp.com/api-user-get");
            connection= (HttpsURLConnection) url.openConnection();
           connection.setRequestProperty("Content-Type","application/json");

           connection.setRequestMethod("POST");
           connection.setDoOutput(true);
       }
       catch(Exception e){
           Log.d("URL gresit",e.toString());


       }

        DataOutputStream wr=null;
       try{
           wr=new DataOutputStream(connection.getOutputStream());
           wr.writeBytes(data);
         //  wr.flush();
         //  wr.close();

       }catch(Exception e){

           StackTraceElement[] stackTraceElement=e.getStackTrace();
           for (StackTraceElement stk:stackTraceElement){
               Log.d(TAG,stk.toString());
           }
           //Log.wtf(TAG,"Nu s-a trimis mesajul");

       }
       //finally {
          // try {


          // if(connection!=null) {
          //     wr.close();
          // }
          // }catch(Exception e){


          // }
      // }
        InputStream inputStream=null;
       try {
           inputStream = connection.getInputStream();
       }catch(Exception e){
          //  Log.wtf(TAG,"Nu s-a primit mesajul");
       }

        BufferedReader in=null;
       String inputLine;
       StringBuilder body=new StringBuilder();
       try{
           in=new BufferedReader(new InputStreamReader(inputStream));
           body=new StringBuilder();
           while( (inputLine=in.readLine())!=null ){
               body.append(inputLine);

           }
           in.close();
       }
       catch(Exception e){
        //Log.wtf(TAG,"Nu s-a rescris mesajul ");


       }*/

        TextView textView=(TextView)findViewById(R.id.textView);
       textView.setText("ABSFAJFSAGF");
//       ImageButton imageButton = (ImageButton)findViewById(R.id.imageButton3);
//
//       imageButton.setOnClickListener(new View.OnClickListener() {
//           @Override
//           public void onClick(View v) {
//               Intent i =new Intent(getApplicationContext(),FILTER.class);
//               startActivity(i);
//
//           }
//       });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.imageButton3:
                Intent i =new Intent(getApplicationContext(),FILTER.class);
                startActivity(i);
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }

    }

}
