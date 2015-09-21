package com.thoughtworks.xstream;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NoteTest {

    @Test
    public void shouldSuccessfullyGetTitle() {
        Note note = new Note("First Day", "Orientation");

        assertEquals("First Day", note.getTitle());
    }

    @Test
    public void shouldSuccesfullyGetDescription() {
        Note note = new Note("Second Day", "More Orientation");

        assertEquals("More Orientation Stuff", note.getDescription());
    }
}
