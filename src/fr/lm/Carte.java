package fr.lm;

public class Carte implements Comparable<Carte> {
    private Couleur couleur;
    private Hauteur hauteur;

    public Carte(Couleur couleur, Hauteur hauteur) {
        this.couleur = couleur;
        this.hauteur = hauteur;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public Hauteur getHauteur() {
        return hauteur;
    }

    @Override
    public String toString() {
        return hauteur.getNom() + " de " + couleur.getNom() + "\nvaleur de la carte : " + hauteur.getValeur();
    }

    @Override
    public int compareTo(Carte autreCarte) {

        return Integer.compare(this.hauteur.getValeur(), autreCarte.getHauteur().getValeur());
    }

    public boolean equals(Carte autreCarte) {

        if (this.getCouleur().equals(autreCarte.getCouleur())) {

            return true;
        }

        return false;
    }

}
