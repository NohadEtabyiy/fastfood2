package com.example.fastfood2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class listAdapter3 extends ArrayAdapter<ReglementIntérieur> {
    List<ReglementIntérieur> reglementlist;
    //activity context
    Context context;

    //the layout resource file for the list items
    int resource;

    public listAdapter3(Context context, int resource, List<ReglementIntérieur> reglementIntérieurslist) {
        super(context, resource, reglementIntérieurslist);
        this.context = context;
        this.resource = resource;
        this.reglementlist= reglementIntérieurslist;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        //we need to get the view of the xml for our list item
        //And for this we need a layoutinflater
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        //getting the view
        View view = layoutInflater.inflate(resource, null, false);

        //getting the view elements of the list from the view
        TextView textViewName = view.findViewById(R.id.item_régles);
        //getting the hero of the specified position
        ReglementIntérieur régles = reglementlist.get(position);

        textViewName.setText(régles.getRégles());

        return view;
    }
}