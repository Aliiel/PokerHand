package fr.lm;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class JeuDeCarte {

    private List<Carte> cartes;

    public JeuDeCarte() {
        this.cartes = new ArrayList<>();
        genererJeu();
    }

    public List<Carte> genererJeu() {

        for (String couleur : Couleur.getCouleurs()) {

            for (String hauteur : Hauteur.getHauteurs()) {

                Couleur nouvelleCouleur = new Couleur(couleur);
                Hauteur nouvelleHauteur = new Hauteur(hauteur);

                cartes.add(new Carte(nouvelleCouleur, nouvelleHauteur));
            }
        }

        return cartes;
    }

    public void afficherJeuDeCarte() {

        for (Carte carte : cartes) {
            System.out.println(carte);
        }
    }

    public void melangerJeuDeCarte() {

        Collections.shuffle(cartes);
    }


    public List<Carte> distribuerMain() {

        List<Carte> main = new ArrayList<>();
        List<Carte> talon = new ArrayList<>();

        this.genererJeu();
        this.melangerJeuDeCarte();

        if (this.cartes.size() < 52) {

            talon.addAll(cartes);
        }

        for ( int i = 0; i < 5; i++ ) {

            Carte carte = talon.removeFirst();
            main.add(carte);
        }

        return main;
    }
}
