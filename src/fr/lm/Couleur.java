package fr.lm;

import java.util.Arrays;
import java.util.List;

public class Couleur {

    private static final List<String> couleursValides = Arrays.asList("Trèfle", "Carreau", "Pique", "Coeur");

    private String nom;

    public Couleur(String nom) {
        if (!couleursValides.contains(nom)) {
            throw new IllegalArgumentException("Couleur invalide : " + nom);
        }
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public static List<String> getCouleurs() {
        return couleursValides;
    }
}
