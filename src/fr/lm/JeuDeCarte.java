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


    public Carte distribuerCarte() {
        if (cartes.isEmpty()) {
            throw new IllegalStateException("Le jeu de cartes est vide.");
        }
        return cartes.removeFirst();
    }

    public List<Carte> getCartesRestantes() {
        return cartes;
    }
}
