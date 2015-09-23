package com.thoughtworks.xstream;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public class PersonConverter implements Converter {

    @Override
    public void marshal(Object o, HierarchicalStreamWriter writer, MarshallingContext marshallingContext) {
        Person person = (Person) o;
        writer.startNode("name");
        writer.setValue(person.getLastName() + "," + person.getFirstName());
        writer.endNode();
    }

    @Override
    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext unmarshallingContext) {
        reader.moveDown();
        String[] nameParts = reader.getValue().split(",");
        Person person = new Person(nameParts[1], nameParts[0]);
        reader.moveUp();
        return person;
    }

    @Override
    public boolean canConvert(Class aClass) {
        return aClass == Person.class;
    }
}
