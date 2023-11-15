package com.example.fastfood2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainPersonnel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_personnel);

        Personne personne = new Personne("soufiane", "zqaqi", R.drawable.use4, "12345","25/01/2005","DEVOAM","2001");

        ImageView gridImage = findViewById(R.id.grid_image);

        gridImage.setImageResource(personne.getimage());

        TextView nomTextView = findViewById(R.id.nom);

        nomTextView.setText("Nom: "+personne.getnom());

        TextView prenomTextView = findViewById(R.id.prenom);
        prenomTextView.setText("Prenom: "+personne.getPrenom());

        TextView matreculeTextView = findViewById(R.id.matrecule);
        matreculeTextView.setText("Matrécule: "+personne.getmatrécule());

        TextView datenaissonceTextView =findViewById(R.id.datenaissone);
        datenaissonceTextView.setText("Date de Naissance: "+personne.getDate_naiss());

        TextView filierTextView =findViewById(R.id.fillier);
        filierTextView.setText("Filier: "+personne.getFilier());

        TextView GroupTextView =findViewById(R.id.Group);
        GroupTextView.setText("Group: "+personne.getGroup());
    }
}