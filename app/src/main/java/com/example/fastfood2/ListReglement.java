package com.example.fastfood2;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class ListReglement extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_reglement);
        listView =(ListView) findViewById(R.id.listviewRegles);

        ReglementIntérieur.addReg(new ReglementIntérieur("- de respecter le personnel de l'établissement"));
        ReglementIntérieur.addReg(new ReglementIntérieur("- d'être correctement vêtus et coiffés de porter la tenue réglementaire."));
        ReglementIntérieur.addReg(new ReglementIntérieur("- d'être correctement vêtus et coiffés de porter la tenue réglementaire de ne pas utiliser d'apparei"));
        ReglementIntérieur.addReg(new ReglementIntérieur("- de ne pas utiliser d'appareils de radiocommunication dans les espaces d formation"));
        ReglementIntérieur.addReg(new ReglementIntérieur("- de ne pas fumer dans l'enceinte de l'établissement, les couloirs, les salles et les ateliers."));
        ReglementIntérieur.addReg(new ReglementIntérieur("- de respecter l'horaire figurant dans l'emploi du temps."));

        listAdapter3 adapter3 = new listAdapter3(this, R.layout.activity_list_adapter3,ReglementIntérieur.getRe());

        listView.setAdapter(adapter3);
    }
}