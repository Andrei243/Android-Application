package com.example.mandelsapplication;

import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomArrAdapter extends ArrayAdapter<Pair<String,String>> {
    private final Context context;
    private final ArrayList<Pair<String,String>> elemente;
    private ArrayList <Boolean> elementeBool;
    public CustomArrAdapter(Context _context,ArrayList<Pair<String,String>> _elemente,ArrayList<Boolean> elemente_bool){
        super(_context,R.layout.customlistviewelement,_elemente);
        context=_context;
        elemente=_elemente;
        elementeBool=elemente_bool;
    }


    @Override
    public View getView(final int position, View convertView, ViewGroup parent){
        final ViewGroup v2=parent;
        LayoutInflater inflater=(LayoutInflater)context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowview=inflater.inflate(R.layout.customlistviewelement,parent,false);
        TextView texttitlu=(TextView)rowview.findViewById(R.id.titluel);
        TextView textdescriere=(TextView)rowview.findViewById(R.id.descel);
        texttitlu.setText(elemente.get(position).first);
        textdescriere.setText(elemente.get(position).second);

        if(elementeBool.get(position)){
            ImageButton imageButton=(ImageButton)rowview.findViewById(R.id.imageButton);
            imageButton.setImageResource(R.drawable.star_on);
        }else{
            ImageButton imageButton=(ImageButton)rowview.findViewById(R.id.imageButton);
            imageButton.setImageResource(R.drawable.star_off);
        }

        final ImageButton imageButton=(ImageButton)rowview.findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((ListView) v2).performItemClick(v,position,0);
            }
        });


        return rowview;

    }


}
