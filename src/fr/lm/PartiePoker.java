package fr.lm;

import java.util.ArrayList;
import java.util.List;

public class PartiePoker {

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



}
