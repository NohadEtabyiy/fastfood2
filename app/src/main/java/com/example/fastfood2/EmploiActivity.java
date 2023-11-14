package com.example.fastfood2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class EmploiActivity extends AppCompatActivity {
    ListView lt;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emploi);

        lt = findViewById(R.id.listeViewAdapterEmploi);

        //adding some values to our list
        Emploi.addEmploi(new Emploi("13/11/2023", "11:00-13:30", "Formateur : BERJAOUI JAMAL \n ", "Salle : 02 \n","Module : Competence comportementaires \n"));
        Emploi.addEmploi(new Emploi("13/11/2023", "13:30-16:00", "Formateur : AMRANI AZIZA\n ", "Salle : NT1 \n","Module : Programation en KOTLIN \n"));
        Emploi.addEmploi(new Emploi("13/11/2023", "16:30-18:30", "Formateur : HANOUZE MOHAMED \n \n", "Salle : 13 \n","Module : Anglais Technique \n"));

        Emploi.addEmploi(new Emploi("14/11/2023", "13:30-16:00", "Formateur : ELMOTAWAKIL ABDESSAMAD \n ", "Salle : NT1 \n","Module : Gestion de projet \n"));
        Emploi.addEmploi(new Emploi("14/11/2023", "16:00-18:30", "Formateur : ELMOTAWAKIL ABDESSAMAD\n \n", "Salle : NT1 \n","Module : Gestion de projet \n"));

        Emploi.addEmploi(new Emploi("15/11/2023", "11:00-13:30", "Formateur : AMRANI AZIZA\n ", "Salle : NT1 \n","Module : Programation en KOTLIN \n"));
        Emploi.addEmploi(new Emploi("15/11/2023", "16:00-18:30", "Formateur : ABOULAS FATIMA-ZAHRAE \n \n", "Salle : 17 \n","Module : Francais \n"));

        Emploi.addEmploi(new Emploi("16/11/2023", "13:30-16:00", "Formateur : ELMOTAWAKIL ABDESSAMAD \n ", "Salle : NT1 \n","Module : Gestion de projet \n"));
        Emploi.addEmploi(new Emploi("16/11/2023", "16:00-18:30", "Formateur : ELMOTAWAKIL ABDESSAMAD\n \n", "Salle : NT1 \n","Module : Gestion de projet \n"));

        Emploi.addEmploi(new Emploi("17/11/2023", "08:30-10:30", "Formateur : AMRANI AZIZA\n ", "Salle : NT1 \n","Module : Programation en KOTLIN \n"));
        Emploi.addEmploi(new Emploi("17/11/2023", "10:30-12:30", "Formateur : AMRANI AZIZA\n ", "Salle : NT1 \n","Module : Programation en KOTLIN \n"));
        Emploi.addEmploi(new Emploi("17/11/2023", "14:30-16:30", "Formateur : ELMOTAWAKIL ABDESSAMAD \n ", "Salle : NT1 \n","Module : Gestion de projet \n"));
        Emploi.addEmploi(new Emploi("17/11/2023", "16:30-18:30", "Formateur : ELMOTAWAKIL ABDESSAMAD\n \n", "Salle : NT1 \n","Module : Gestion de projet \n"));

        //creating the adapter
        AdapteEmploi adapter = new AdapteEmploi(this, R.layout.activity_main2, Emploi.getE());

        //attaching adapter to the listview
        lt.setAdapter(adapter);
    }
}