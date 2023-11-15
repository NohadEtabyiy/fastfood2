package com.example.fastfood2;

import android.annotation.SuppressLint;

import java.util.ArrayList;
import java.util.List;

public class Personne {
    private String nom;
    private String prenom;
    private int image;
    private String matrécule;
    private String date_naiss;
   private String filier;

   private String group;


    @SuppressLint("NotConstructor")
    public Personne(String nom, String prenom, int image, String matrécule,String date_naiss,String filier,String group){
        this.nom=nom;
        this.prenom=prenom;
        this.image=image;
        this.matrécule=matrécule;
        this.date_naiss=date_naiss;
        this.filier=filier;
        this.group=group;
    }
    public String getDate_naiss(){
        return date_naiss;
    }
    public String getFilier(){
        return filier;
    }

    public String getGroup(){
        return group;
    }
    public String getnom(){

        return nom;
    }
    public String getPrenom(){
        return prenom;
    }

    public int getimage(){
        return image;
    }

    public String getmatrécule(){
        return  matrécule;
    }

}
