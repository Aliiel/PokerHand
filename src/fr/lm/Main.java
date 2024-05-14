package fr.lm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<Carte> mainJoueur = new ArrayList<Carte>();
        Joueur joueur1 = new Joueur("Joueur 1");
        Joueur joueur2 = new Joueur("Joueur 2");
        Joueur joueur3 = new Joueur("Joueur 3");
        Joueur joueur4 = new Joueur("Joueur 4");
        List<Joueur> joueurs = Arrays.asList(joueur1, joueur2, joueur3, joueur4);

        PartiePoker partiePoker = new PartiePoker();
        JeuDeCarte jeuDeCarte = partiePoker.lancerPartie(joueurs);

        joueur1.afficherJeu();
        joueur2.afficherJeu();
        joueur3.afficherJeu();
        joueur4.afficherJeu();

        System.out.println("Nombre de cartes : " + jeuDeCarte.getCartesRestantes().size());
        System.out.println("Présence d'une paire pour le joueur 1 : " + partiePoker.aUnePaire(joueur1.getMain()));
        System.out.println("Présence d'une paire pour le joueur 2 : " + partiePoker.aUnePaire(joueur2.getMain()));
        System.out.println("Présence d'une paire pour le joueur 3 : " + partiePoker.aUnePaire(joueur3.getMain()));
        System.out.println("Présence d'une paire pour le joueur 4 : " + partiePoker.aUnePaire(joueur4.getMain()));

    }
}