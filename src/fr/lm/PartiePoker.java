package fr.lm;

import java.util.ArrayList;
import java.util.List;

public class PartiePoker implements Combinaisons {

    private List<Joueur> joueurs;
    private JeuDeCarte jeuDeCarte;

    public PartiePoker() {

        this.joueurs = new ArrayList<Joueur>();
        this.jeuDeCarte = new JeuDeCarte();
        this.lancerPartie(joueurs);
    }


    public JeuDeCarte lancerPartie(List<Joueur> joueurs) {

        jeuDeCarte.melangerJeuDeCarte();

        for (int i = 0; i < 5 ; i++) {
            for (Joueur joueur : joueurs) {
                Carte carte;
                do {
                    carte = jeuDeCarte.distribuerCarte();
                } while (joueur.getMain().contains(carte));
                joueur.addCarte(carte);
            }
        }

        return jeuDeCarte;
    }

    @Override
    public boolean aUnePaire(List<Carte> main) {

        for (int i = 0; i < main.size(); i++) {
            Carte carte1 = main.get(i);
            System.out.println(carte1);
            // On parcourt les cartes suivantes pour vérifier s'il y a une paire
            for (int j = i + 1; j < main.size(); j++) {
                Carte carte2 = main.get(j);
                System.out.println(carte2);
                // Si les deux cartes ont la même valeur, alors on a une paire
                if (carte1.getHauteur().getValeur() == carte2.getHauteur().getValeur()) {
                    return true;
                }
            }
        }
        // Si on a parcouru toutes les cartes sans trouver de paire, on retourne false
        return false;
    };

    public boolean aDeuxPaires(List<Carte> main) {

        return false;
    };

    public boolean aUnBrelan(List<Carte> main) {

        return false;
    };

    public boolean aUneQuinte(List<Carte> main) {

        return false;
    };

    public boolean aUneCouleur(List<Carte> main) {

        return false;
    };

    public boolean aUnFull(List<Carte> main) {

        return false;
    };

    public boolean aUnCarre(List<Carte> main) {

        return false;
    };

    public boolean aUneQuinteFlush(List<Carte> main) {

        return false;
    };

    public boolean aUneQuinteFlushRoyale(List<Carte> main) {

        return false;
    };






}
