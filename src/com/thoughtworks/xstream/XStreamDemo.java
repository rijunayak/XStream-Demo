// XStream Demo demonstrates the basic working of the XStream library
package com.thoughtworks.xstream;

import com.thoughtworks.xstream.io.xml.DomDriver;

public class XStreamDemo {

    public static void main(String[] args) {
        XStream xStream = new XStream(new DomDriver());
        Person person = new Person("Chris", "Christie");
        xStream.autodetectAnnotations(true);
        xStream.registerConverter(new PersonConverter());
        Person person1 = new Person("Chris", "Christie");
        System.out.println(xStream.toXML(person).equals(xStream.toXML(person1)));

    }
}
