package com.thoughtworks.xstream;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Note> notes;

    public Student(String name, ArrayList<Note> notes) {
        this.name = name;
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }
}
