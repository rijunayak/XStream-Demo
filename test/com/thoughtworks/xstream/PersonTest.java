package com.thoughtworks.xstream;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void shouldGetFirstName() {
        Person person = new Person("Chris", "Christie");

        assertEquals("Chris", person.getFirstName());
    }

    @Test
    public void shouldGetLastName() {
        Person person = new Person("Chris", "Christie");

        assertEquals("Christie", person.getLastName());
    }
}
