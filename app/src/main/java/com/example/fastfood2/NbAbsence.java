package com.example.fastfood2;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NbAbsence {
    String Date;
    String Time;
    String Salle;
    String module;

    public NbAbsence(String date, String time, String salle, String module) {
        Date = date;
        Time = time;
        Salle = salle;
        this.module = module;
    }

    public String getDate() {
        return Date;
    }

    public String getTime() {
        return Time;
    }

    public String getSalle() {
        return Salle;
    }

    public String getModule() {
        return module;
    }

    static List<NbAbsence> NbAbsence = new ArrayList<>();
    public  static  void addEmp(NbAbsence N)
    {
        NbAbsence.add(N);
    }
    public static List<NbAbsence> getN ()
    {
        return  NbAbsence;
    }
}
