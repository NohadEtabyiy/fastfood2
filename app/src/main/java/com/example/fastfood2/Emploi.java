package com.example.fastfood2;

import java.util.ArrayList;
import java.util.List;

public class Emploi {
    String date;
    String heure;
    String formateur;
    String salle;
    String module;
    public Emploi(String date, String heure, String formateur, String salle, String module) {
        this.date = date;
        this.heure = heure;
        this.formateur = formateur;
        this.salle = salle;
        this.module = module;
    }
    public String getDate() {
        return date;
    }

    public String getHeure() {
        return heure;
    }

    public String getFormateur() {
        return formateur;
    }

    public String getSalle() {
        return salle;
    }

    public String getModule() {
        return module;
    }
    static List<Emploi> EmploiList = new ArrayList<>();
    public  static  void addEmploi(Emploi e)
    {
        EmploiList.add(e);
    }
    public static List<Emploi> getE()
    {
        return  EmploiList;
    }

}
