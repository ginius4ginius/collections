package com.ginius.collections;

public class Main {

    public static void main (String[] args){

        //enumerationTests();
        //iteratorTests();
        //listeWithSublistTests();
        listeCopyTest();

    }

    /**
     * Interface TestsEnumeration
     */
    public static void enumerationTests(){

        TestsEnumeration enumeration = new TestsEnumeration();
        enumeration.afficheEnumerationElement();
        System.out.println();
        enumeration.transmettreVectorDansList();
    }

    /**
     * Interface TestIterator
     */
    public static void iteratorTests(){

        TestIterator iterator = new TestIterator();
        iterator.afficheIteratorElement();
        System.out.println();
        iterator.transmettreVectorDansList();
    }


    /**
     * Classe list et impact avec subList
     */
    public static void listeWithSublistTests(){

        TestList testList = new TestList();

        testList.creerSousListe();
        testList.afficherListe("liste",testList.liste);
        testList.afficherListe("sousListe",testList.sousliste);

        testList.modifierSousListe();
        testList.afficherListe("liste",testList.liste);
        testList.afficherListe("sousListe",testList.sousliste);

        testList.modifierListe();
        testList.afficherListe("liste",testList.liste);
        testList.afficherListe("sousListe",testList.sousliste);

    }

    /**
     * Classe list et impact avec copies
     */
    public static void listeCopyTest(){
        System.out.println("****Modification d'une liste liée ou non par un tableau****");

        TestList testList = new TestList();

        System.out.println("Sans la liaison");
        testList.copierCollectionsAddAll();
        //testList.modifierListe2Tab(testList.listeTableau2,testList.tab);
        testList.modifierTab2List(testList.listeTableau2,testList.tab);

        System.out.println("Avec la liaison");
        testList.copierArraysAsList();
        //testList.modifierListe2Tab(testList.listeTableau,testList.tab);
        testList.modifierTab2List(testList.listeTableau,testList.tab);




    }







}
