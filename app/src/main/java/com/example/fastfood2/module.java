package com.example.fastfood2;

import java.util.ArrayList;
import java.util.List;

public class module {

    int image;
    String name;
    static List<module> ModuleList = new ArrayList<>();
    public module(int image, String name) {
        this.image = image;
        this.name = name;

    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public  static  void addstagiaire(module s)
    {
        ModuleList.add(s);
    }

    public static  List<module> getS ()
    {
        return  ModuleList;
    }

}
