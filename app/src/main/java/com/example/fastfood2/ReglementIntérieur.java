package com.example.fastfood2;

import java.util.ArrayList;
import java.util.List;

public class ReglementIntérieur {
    private String régles;
    static List<ReglementIntérieur> reglementList = new ArrayList<>();

    public ReglementIntérieur(String régles){
        this.régles=régles;
    }
    public String getRégles(){
        return régles;
    }
    public static void addReg(ReglementIntérieur R){
        reglementList.add(R);
    }
    public static List<ReglementIntérieur> getRe(){
        return reglementList;
    }
}
