package com.example.fastfood2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class ListDisipline extends AppCompatActivity {
    ListView list;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_disipline);
        list = (ListView) findViewById(R.id.listViewDis);

        Disipline.addDisipline(new Disipline("Date : 12/2/2023" ,"Observation : paresseux","Jurys : Aziza , Sara","Conseil : Améliorez votre comportement \n"));
        Disipline.addDisipline(new Disipline("Date : 1/4/2023"  , "Observation : émeutier","Jurys : Aziza , Sara","Conseil : Améliorez votre comportement \n"));
        Disipline.addDisipline(new Disipline("Date : 1/6/2023"  ,"Observation : paresseux","Jurys : Aziza , Sara","Conseil : Améliorez votre comportement \n" ));
        Disipline.addDisipline(new Disipline("Date : 6/7/2023"  ,"Observation : émeutier","Jurys : Aziza , Sara","Conseil : Améliorez votre comportement \n"));



        AdapterDisipline adapter = new AdapterDisipline(this, R.layout.activity_adapter_disipline, Disipline.getDisi());


        list.setAdapter(adapter);
    }
}