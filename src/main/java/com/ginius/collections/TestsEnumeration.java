package com.ginius.collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

/**
 * L'interface TestsEnumeration permet de parcourir des collections:
 * Vector, Array, Stack, Hashtable, Properties avant l'implémentation de l'API collections
 * Une énumération ne peut être utilisée qu'une seule foi.
 */
public class TestsEnumeration {

    Enumeration<String> enumeration, enumeration2;
    Vector<String> vector;
    List<String> list;

    public TestsEnumeration() {

        vector = new Vector();
        vector.add("lundi");
        vector.add("mardi");
        vector.add("mercredi");
        vector.add("jeudi");
        vector.add("vendredi");
        vector.add("samedi");
        vector.add("dimanche");
    }

    public void afficheEnumerationElement() {

        enumeration = vector.elements();
        System.out.println("***TestsEnumeration***");
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }

    public void transmettreVectorDansList() {

        enumeration2 = vector.elements();
        list = new ArrayList();
        while (enumeration2.hasMoreElements()) {
            list.add(enumeration2.nextElement().toString());
        }

        System.out.println("***Liste***");
        for (String s : list) {
            System.out.println(s);
        }
    }

}
