package fr.lm;

import java.util.ArrayList;
import java.util.List;

public class Joueur {

    private String nom;
    private List<Carte> main;

    public Joueur(String nom, List<Carte> main) {
        this.nom = nom;
        this.main = main;
    }

    public void afficherJeu() {

        System.out.println("Jeu du joueur " + this.nom + " : ");

        for (Carte carte : main) {

            System.out.println(carte);
        }
    }

}
