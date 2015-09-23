package com.thoughtworks.xstream;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.ArrayList;

@XStreamAlias("student")
public class Student {

    @XStreamAlias("name")
    @XStreamAsAttribute
    private String studentName;

    @XStreamImplicit
    private ArrayList<Note> notes;

    public Student(String studentName, ArrayList<Note> notes) {
        this.studentName = studentName;
        this.notes = notes;
    }

    public String getStudentName() {
        return studentName;
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }

    public String notes() {
        String ret = "";
        for (Note note : notes) {
            ret += String.format("%20s%20s\n", note.getTitle(), note.getDescription());
        }
        return ret;
    }
}
