package com.example.fastfood2;

import java.util.ArrayList;
import java.util.List;

public class Note {
    private String Module;
    private String Note;
    private String Annee;

    // Constructor
    public Note(String Module,String Note, String Annee) {
        this.Module = Module;
        this.Note = Note;
        this.Annee = Annee;
    }

    public String getModule() {
        return Module;
    }

    public String getNote() {
        return Note;
    }

    public String getAnnee() {
        return Annee;
    }

    static List<Note> noteList = new ArrayList<>();

    public static void addNote(Note N) {
        noteList.add(N);
    }

    public static List<Note> getNotes() {
        return noteList;
    }


}
