package fr.lm;

import java.util.ArrayList;
import java.util.List;

public class Joueur {

    private String nom;
    private List<Carte> main;

    public Joueur(String nom) {

        this.nom = nom;
        setMain(new ArrayList<Carte>());
    }

    public String getNom() {
        return nom;
    }

    public List<Carte> getMain() {
        return main;
    }


    public List<Carte> addCarte(Carte carte) {

        main.add(carte);
        return main;
    }


    public void setMain(List<Carte> main) {
        this.main = main;
    }

    public void afficherJeu() {

        System.out.println("Jeu du joueur " + this.nom + " : ");

        for (Carte carte : main) {

            System.out.println(carte);
        }
    }

}
