package fr.lm;

import java.util.ArrayList;
import java.util.List;

public class PartiePoker implements Combinaisons {

    private List<Joueur> joueurs;
    private JeuDeCarte jeuDeCarte;

    public PartiePoker() {

        this.joueurs = new ArrayList<Joueur>();
        this.jeuDeCarte = new JeuDeCarte();
    }


    public JeuDeCarte lancerPartie(List<Joueur> joueurs) {

        // mélange du jeu de carte
        jeuDeCarte.melangerJeuDeCarte();

        // boucle jusqu'à 5 pour distribuer 5 cartes différentes du même paquet selon le nombre de joueurs dans la partie
        for (int i = 0; i < 5 ; i++) {
            for (Joueur joueur : joueurs) {
                Carte carte;
                do {
                    carte = jeuDeCarte.distribuerCarte();
                } while (joueur.getMain().contains(carte));
                joueur.addCarte(carte);
            }
        }

        // retourne le jeu de carte sans les cartes qui ont été distribuées
        return jeuDeCarte;
    }

    @Override
    public boolean aUnePaire(List<Carte> main) {

        for (int i = 0; i < main.size(); i++) {
            Carte carte1 = main.get(i);
            // Parcours des cartes suivantes pour vérifier s'il y a une paire
            for (int j = i + 1; j < main.size(); j++) {
                Carte carte2 = main.get(j);
                // Appel de la méthode compareTo de la classe carte afin de vérifier que 2 cartes ont la même valeur
                if (carte1.compareTo(carte2) == 0) {
                    return true;
                }
            }
        }
        // Retourne false si après le parcours des cartes aucune paire n'est trouvée
        return false;
    }

    @Override
    public boolean aDeuxPaires(List<Carte> main) {

        int nombrePaires = 0; // Compteur de paires

        // Parcours chaque carte de la main
        for (int i = 0; i < main.size(); i++) {
            Carte carte1 = main.get(i);
            // Parcours les cartes suivantes pour vérifier si elles forment une paire avec la carte actuelle
            for (int j = i + 1; j < main.size(); j++) {
                Carte carte2 = main.get(j);
                // Si les deux cartes ont la même valeur, incrémentation du nombre de paires
                if (carte1.compareTo(carte2) == 0) {
                    nombrePaires++;
                    // Si deux paires sont trouvées, retourne true
                    if (nombrePaires == 2) {
                        return true;
                    }
                    // Sortie de la boucle pour passer à la carte suivante
                    break;
                }
            }
        }
        // Si deux paires n'ont pas été trouvées, retourne false
        return false;
    }

    public boolean aUnBrelan(List<Carte> main) {

        return false;
    }

    public boolean aUneQuinte(List<Carte> main) {

        return false;
    }

    public boolean aUneCouleur(List<Carte> main) {

        int couleurs = 0; // compteur de couleurs

        for (int i = 0; i < main.size(); i++) {
            Carte carte1 = main.get(i);

            // Parcours les cartes suivantes pour vérifier si elles ont la même couleur
            for (int j = i + 1; j < main.size(); j++) {
                Carte carte2 = main.get(j);

                // Si les deux cartes ont la même couleur, incrémentation de la variable couleur
                if (carte1.equals(carte2)) {
                    couleurs++;

                    // Si 5 cartes de même couleur sont trouvées, retourne true
                    if (couleurs == 4) {
                        return true;
                    }
                    // Sortie de la boucle pour passer à la carte suivante
                    break;
                }
            }
        }

        return false;
    }

    public boolean aUnFull(List<Carte> main) {

        return false;
    }

    public boolean aUnCarre(List<Carte> main) {

        return false;
    }

    public boolean aUneQuinteFlush(List<Carte> main) {

        return false;
    }

    public boolean aUneQuinteFlushRoyale(List<Carte> main) {

        return false;
    }

}
