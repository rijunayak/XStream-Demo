package com.thoughtworks.xstream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class StudentTest {

    @Test
    public void shouldSuccessfullyGetStudentName() {
        ArrayList<Note> notes = mock(new ArrayList<Note>().getClass());
        Student student = new Student("Chris", notes);

        assertEquals("Chris", student.getStudentName());
    }

    @Test
    public void shouldSuccessfullyGetNotes() {
        ArrayList<Note> notes = mock(new ArrayList<Note>().getClass());
        Student student = new Student("Chris", notes);

        assertEquals(notes, student.getNotes());
    }

    @Test
    public void shouldSuccessfullyShowNotes() {
        Note note1 = new Note("First Day", "Orientation");
        Note note2 = new Note("Second Day", "More Orientation");
        ArrayList<Note> notes = new ArrayList<>(Arrays.asList(note1, note2));
        Student student = new Student("Chris", notes);

        assertEquals(String.format("%20s%20s\n", "First Day", "Orientation") +
                String.format("%20s%20s\n", "Second Day", "More Orientation"), student.notes());
    }
}
