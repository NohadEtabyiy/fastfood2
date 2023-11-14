package com.example.fastfood2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class AdapterNote extends ArrayAdapter<Note> {

    List<Note> noteList;
    Context context;
    int resource;

    public AdapterNote(Context context, int resource, List<Note> noteList) {
        super(context, resource, noteList);
        this.context = context;
        this.resource = resource;
        this.noteList = noteList;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);


        View view = layoutInflater.inflate(resource, null, false);

        TextView moduleTextView = view.findViewById(R.id.module);
        TextView noteTextView = view.findViewById(R.id.note);
        TextView anneeTextView = view.findViewById(R.id.annee);


        Note currentNote = noteList.get(position);


        moduleTextView.setText(currentNote.getModule());
        noteTextView.setText(currentNote.getNote());
        anneeTextView.setText(currentNote.getAnnee());

        return view;
    }
}
