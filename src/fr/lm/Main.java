package fr.lm;

public class Main {


    public static void main(String[] args) {

        JeuDeCarte jeuDeCarte = new JeuDeCarte();
        Joueur joueur1 = new Joueur("Joueur 1", jeuDeCarte.distribuerMain());
        joueur1.afficherJeu();
        Joueur joueur2 = new Joueur("Joueur 2", jeuDeCarte.distribuerMain());
        joueur2.afficherJeu();
        Joueur joueur3 = new Joueur("Joueur 3", jeuDeCarte.distribuerMain());
        joueur3.afficherJeu();
    }
}