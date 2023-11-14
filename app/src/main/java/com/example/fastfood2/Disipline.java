package com.example.fastfood2;

import java.util.ArrayList;
import java.util.List;

public class Disipline {
    private String date;
    private String obsirvation;
    private String gerie;
    private String Conseil;
    public Disipline(String date,String obsirvation,String gerie,String Conseil){
        this.date=date;
        this.obsirvation=obsirvation;
        this.gerie=gerie;
        this.Conseil=Conseil;
    }
    public String getdate(){
        return date;
    }
    public String getobsirvation(){
        return obsirvation;
    }
    public String getgerie(){
        return gerie;
    }
    public String getConseil(){
        return Conseil;
    }
    private static ArrayList<Disipline>DisiplineList =new ArrayList<>();
    public  static  void addDisipline(Disipline D)
    {
        DisiplineList.add(D);
    }
    public static List<Disipline> getDisi ()
    {
        return  DisiplineList;
    }
}
