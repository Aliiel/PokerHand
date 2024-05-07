package fr.lm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<Carte> mainJoueur = new ArrayList<Carte>();
        JeuDeCarte jeuDeCarte = new JeuDeCarte();
        Joueur joueur1 = new Joueur("Joueur 1");
        Joueur joueur2 = new Joueur("Joueur 2");
        Joueur joueur3 = new Joueur("Joueur 3");
        List<Joueur> joueurs = Arrays.asList(joueur1, joueur2, joueur3);
        jeuDeCarte.melangerJeuDeCarte();

        PartiePoker partiePoker = new PartiePoker();
        partiePoker.lancerPartie(joueurs);


        joueur1.afficherJeu();
        joueur2.afficherJeu();
        joueur3.afficherJeu();

    }
}