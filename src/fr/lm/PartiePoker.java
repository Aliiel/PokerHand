package fr.lm;

import java.util.ArrayList;
import java.util.List;

public class PartiePoker {

    private List<Joueur> joueurs;

    public PartiePoker() {

        this.joueurs = new ArrayList<Joueur>();
        this.lancerPartie(joueurs);
    }


    public void lancerPartie(List<Joueur> joueurs) {

        JeuDeCarte jeuDeCarte = new JeuDeCarte();
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
    }


}
