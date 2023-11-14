package com.example.fastfood2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class listNote extends AppCompatActivity {
    ListView listView;
    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_note);

        listView = (ListView) findViewById(R.id.listviewnote);

        // Adding some values to our list
        Note.addNote(new Note( "Java", "13/20", "23/24"));
        Note.addNote(new Note( "Kotlin", "15/20", "23/24"));
        Note.addNote(new Note( "Php", "18/20", "23/24"));
        Note.addNote(new Note( "Python", "13,75/20", "23/24"));
        Note.addNote(new Note( "Javascript", "20/20", "23/24"));
        Note.addNote(new Note( "base android", "18/20", "23/24"));
        Note.addNote(new Note( "Decipline", "18/20", "23/24"));







        AdapterNote adapter = new AdapterNote(this, R.layout.activity_adapter_note, Note.getNotes());

        // Attaching adapter to the listView
        listView.setAdapter(adapter);
    }
}
