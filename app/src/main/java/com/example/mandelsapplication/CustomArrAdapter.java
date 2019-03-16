package com.example.mandelsapplication;

import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomArrAdapter extends ArrayAdapter<Pair<String,String>> {
    private final Context context;
    private final ArrayList<Pair<String,String>> elemente;
    public CustomArrAdapter(Context _context,ArrayList<Pair<String,String>> _elemente){
        super(_context,R.layout.customlistviewelement,_elemente);
        context=_context;
        elemente=_elemente;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater=(LayoutInflater)context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowview=inflater.inflate(R.layout.customlistviewelement,parent,false);
        TextView texttitlu=(TextView)rowview.findViewById(R.id.titluel);
        TextView textdescriere=(TextView)rowview.findViewById(R.id.descel);
        texttitlu.setText(elemente.get(position).first);
        textdescriere.setText(elemente.get(position).second);

        return rowview;

    }


}
