package fr.lm;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<Carte> mainJoueur = new ArrayList<Carte>();
        JeuDeCarte jeuDeCarte = new JeuDeCarte();
        Joueur joueur1 = new Joueur("Joueur 1");
        Joueur joueur2 = new Joueur("Joueur 2");
        Joueur joueur3 = new Joueur("Joueur 3");
        jeuDeCarte.melangerJeuDeCarte();

        for (int i = 0; i < 5; i++) {
            Carte carte = jeuDeCarte.distribuerCarte();
            joueur1.addCarte(carte);

            Carte carteJoueur2;
            do {
                carteJoueur2 = jeuDeCarte.distribuerCarte();
            } while (joueur1.getMain().contains(carteJoueur2));
            joueur2.addCarte(carteJoueur2);
        }

        joueur1.afficherJeu();
        joueur2.afficherJeu();

    }
}