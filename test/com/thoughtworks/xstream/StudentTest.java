package com.thoughtworks.xstream;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class StudentTest {

    @Test
    public void shouldSuccessfullyGetStudentName() {
        ArrayList<Note> notes = mock(new ArrayList<Note>().getClass());
        Student student = new Student("Chris", notes);

        assertEquals("Chris", student.getName());
    }

    @Test
    public void shouldSuccessfullyGetNotes() {
        ArrayList<Note> notes = mock(new ArrayList<Note>().getClass());
        Student student = new Student("Chris", notes);

        assertEquals(notes, student.getNotes());
    }
}
