package fr.lm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hauteur {

    private static final List<String> hauteursValides = Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Dame", "Roi", "As");

    private String nom;
    private int valeur;

    public Hauteur(String nom) {

        if (!hauteursValides.contains(nom)) {
            throw new IllegalArgumentException("Hauteur invalide");
        }

        this.nom = nom;
        setValeur();
    }


    public String getNom() {
        return nom;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur() {
        valeur = hauteursValides.indexOf(nom) + 1;
    }

    public static List<String> getHauteurs() {
        return hauteursValides;
    }

}