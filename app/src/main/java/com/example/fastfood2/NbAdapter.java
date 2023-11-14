package com.example.fastfood2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NbAdapter extends ArrayAdapter<NbAbsence> {
    List<NbAbsence> NbAbsence;


    Context context;


    int resource;


    public NbAdapter(Context context, int resource, List<NbAbsence> NbAbsenceList) {
        super(context, resource, NbAbsenceList);
        this.context = context;
        this.resource = resource;
        this.NbAbsence = NbAbsenceList;
    }



    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {


        LayoutInflater layoutInflater = LayoutInflater.from(context);


        View view = layoutInflater.inflate(resource, null, false);



        TextView textViewDate = view.findViewById( R.id.date);
        TextView textViewSalle = view.findViewById( R.id.salle);
        TextView textViewTime = view.findViewById( R.id.time);
        TextView textViewModule = view.findViewById( R.id.module);




        NbAbsence hero = NbAbsence.get(position);



        textViewDate.setText(hero.getDate());
        textViewSalle.setText(hero.getSalle());
        textViewTime.setText(hero.getTime());
        textViewModule.setText(hero.getModule());



        return view;
    }
}
