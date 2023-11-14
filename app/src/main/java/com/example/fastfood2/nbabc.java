package com.example.fastfood2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

public class nbabc extends AppCompatActivity {
    ListView List;
    TextView nbA;
    TextView nbH;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_nbabc );
        List =  (ListView) findViewById(R.id.mylist);
        NbAbsence.addEmp(new NbAbsence("Date : 15/10/23","08:30 a 11","Salle : 15","Module : kotlin"));
        NbAbsence.addEmp(new NbAbsence("Date : 16/10/23","11:00 a 12:30","Salle : 16","Module : java"));
        NbAbsence.addEmp(new NbAbsence("Date : 17/10/23","08:30 a 11","Salle : 17","Module : android"));
        NbAbsence.addEmp(new NbAbsence("Date : 18/10/23","11:00 a 12:30","Salle : 18","Module : kotlin"));
        NbAbsence.addEmp(new NbAbsence("Date : 19/10/23","08:30 a 11","Salle : 20","Module : java"));
        NbAbsence.addEmp(new NbAbsence("Date : 20/10/23","11:00 a 12:30","Salle : 19","Module : kotlin"));
        NbAbsence.addEmp(new NbAbsence("Date : 21/10/23","08:30 a 11","Salle : 1","Module : python"));
        NbAbsence.addEmp(new NbAbsence("Date : 15/10/23","11:00 a 12:30","Salle : 15","Module : kotlin"));
        NbAbsence.addEmp(new NbAbsence("Date : 16/10/23","08:30 a 11","Salle : 16","Module : java"));
        NbAbsence.addEmp(new NbAbsence("Date : 17/10/23","11:00 a 12:30","Salle : 17","Module : android"));
        NbAbsence.addEmp(new NbAbsence("Date : 18/10/23","08:30 a 11","Salle : 18","Module : kotlin"));
        NbAbsence.addEmp(new NbAbsence("Date : 19/10/23","11:00 a 12:30","Salle : 20","Module : java"));
        NbAbsence.addEmp(new NbAbsence("Date : 20/10/23","08:30 a 11","Salle : 19","Module : kotlin"));
        NbAbsence.addEmp(new NbAbsence("Date : 21/10/23","11:00 a 12:30","Salle : 1","Module : python"));




        NbAdapter adapter = new NbAdapter(this, R.layout.mylist, NbAbsence.getN());
        List.setAdapter( adapter );

        nbA = (TextView) findViewById( R.id.nbA );
        nbH =(TextView) findViewById( R.id.nbH );
        nbA.setText("Nombre de seances d'absence : "+ NbAbsence.getN().size());
        nbH.setText("Nombre d'heures d'absence : "+ NbAbsence.getN().size()*2.5 +" h");

    }

}