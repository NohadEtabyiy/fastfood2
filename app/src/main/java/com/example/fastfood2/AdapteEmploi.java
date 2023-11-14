package com.example.fastfood2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class AdapteEmploi extends ArrayAdapter<Emploi> {

    //the list values in the List of type hero
    List<Emploi> EmploiList;

    //activity context
    Context context;

    //the layout resource file for the list items
    int resource;

    //constructor initializing the values
    public AdapteEmploi(Context context, int resource, List<Emploi> EmploiList) {
        super(context, resource, EmploiList);
        this.context = context;
        this.resource = resource;
        this.EmploiList = EmploiList;
    }

    //this will return the ListView Item as a View

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        // Check if convertView is null
        if (convertView == null) {
            // we need to get the view of the xml for our list item
            // And for this, we need a layoutinflater
            LayoutInflater layoutInflater = LayoutInflater.from(context);

            // getting the view
            convertView = layoutInflater.inflate(resource, null, false);
        }


        //we need to get the view of the xml for our list item
        //And for this we need a layoutinflater
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        //getting the view
        View view = layoutInflater.inflate(resource, null, false);

        //getting the view elements of the list from the view
        // getting the view elements of the list from the convertView
        TextView textViewName = convertView.findViewById(R.id.text_date);
        TextView textViewName1 = convertView.findViewById(R.id.text_heure);
        TextView textViewName2 = convertView.findViewById(R.id.text_formateur);
        TextView textViewName3 = convertView.findViewById(R.id.text_module);
        TextView textViewName4 = convertView.findViewById(R.id.text_salle);

        // getting the hero of the specified position
        Emploi emp = EmploiList.get(position);

        // adding values to the list item
        textViewName.setText(emp.getDate());
        textViewName1.setText(emp.getHeure());
        textViewName2.setText(emp.getFormateur());
        textViewName3.setText(emp.getSalle());
        textViewName4.setText(emp.getModule());

        return convertView;
    }
}