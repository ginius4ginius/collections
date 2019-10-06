package com.ginius.collections;

import javax.print.attribute.IntegerSyntax;
import java.util.*;

public class TestList {

    public List<Integer> liste;
    public List<Integer> sousliste;
    public List<Integer> listeTableau;
    public List<Integer> listeTableau2;
    private Iterator<Integer> iterator;
    public Integer[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


    TestList() {

        liste = new ArrayList();
        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        liste.add(50);

    }

    /**
     * Affiche l'énumération de la liste
     * Il est préférable d'utiliser un iterator plutot que de faire une boucle sur une liste.
     *
     * @param nomListe
     * @param liste
     */
    public void afficherListe(String nomListe, final List<Integer> liste) {

        int position = 0;

        iterator = liste.iterator();
        while (iterator.hasNext()) {
            System.out.format("%s %2d %s\n", nomListe, position, iterator.next());
            position++;
        }


    }

    /**
     * Liste qui est un sublist de la liste de la classe ( éléments 1 à 4  non inclus de la liste
     *
     * @return
     */
    public void creerSousListe() {

        sousliste = liste.subList(1, 4);
    }

    /**
     * supprimer un élément de la sousLIste supprime également un élément de la liste
     */
    public void modifierSousListe() {
        sousliste.remove(1);
    }

    /**
     * Supprimer un élément de la liste empeche l'affichage de la sous liste
     * car une exception sera levée ( concurrentModificationException)
     */
    public void modifierListe() {
        liste.remove(1);
    }

    /**
     * Méthode qui copie les éléments d'un tableau dans une liste.
     * un lien reste entre ces 2 objets. Si un est modifié, l'autre sera impacté
     */
    public void copierArraysAsList() {
        listeTableau = new ArrayList();
        listeTableau = Arrays.asList(tab);
    }

    /**
     * Méthode qui copy les éléments d'un tableau dans la liste sans concerver le lien
     */
    public void copierCollectionsAddAll() {
        listeTableau2 = new ArrayList();
        Collections.addAll(listeTableau2, tab);
    }

    /**
     * Modifie la liste
     * Modifier une liste liée à un tableau lève l'exception UnsuportedOperationException lors de la
     * lecture de la liste ou du tableau
     *
     * @param list
     * @param tab
     */
    public void modifierListe2Tab(List<Integer> list, Integer[] tab) {
        list.add(100);
        modifierListe(list, tab);
    }

    public void modifierTab2List(List<Integer> list, Integer[] tab) {
        tab[0] = 200;
        modifierListe(list, tab);
    }


    public void modifierListe(List<Integer> list, Integer[] tab) {

        Iterator<Integer> iterator = list.iterator();

        System.out.println("**Tableau**");
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

        System.out.println("**Liste**");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }


}