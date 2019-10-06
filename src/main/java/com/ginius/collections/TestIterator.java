package com.ginius.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * Cette interface est une nouvelle interface par rapport à celle de l'énumération par l'ajout
 * de la fonctionnalité de suppression et de la réduction des noms de méthode.
 */
public class TestIterator {


    Iterator<String> iterator, iterator2;
    Vector<String> vector;
    List<String> list;

    public TestIterator() {

        vector = new Vector();
        vector.add("lundi");
        vector.add("mardi");
        vector.add("mercredi");
        vector.add("jeudi");
        vector.add("vendredi");
        vector.add("samedi");
        vector.add("dimanche");
    }

    public void afficheIteratorElement() {

        iterator = vector.iterator();
        System.out.println("***Iteration***");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void transmettreVectorDansList() {

        iterator2 = vector.iterator();
        list = new ArrayList();
        while (iterator2.hasNext()) {
            list.add(iterator2.next().toString());
        }

        System.out.println("***Liste***");
        for (String s : list) {
            System.out.println(s);
        }
    }

}
