package Test;

import fr.lm.Carte;
import fr.lm.Couleur;
import fr.lm.Hauteur;
import fr.lm.Joueur;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JoueurTest {

    List<Carte> main = new ArrayList<Carte>();
    List<Carte> mainVide = new ArrayList<>();
    Couleur couleur1 = new Couleur("Pique");
    Hauteur hauteur1 = new Hauteur("Valet");
    Carte carte1 = new Carte(couleur1, hauteur1);
    Couleur couleur2 = new Couleur("Trèfle");
    Hauteur hauteur2 = new Hauteur("6");
    Carte carte2 = new Carte(couleur2, hauteur2);



    @Test
    void testJoueur() {

        main.add(carte1);
        main.add(carte2);
        String nom = "Lala";
        Joueur joueur1 = new Joueur(nom);
        Joueur joueur2 = new Joueur(nom);
        joueur1.addCarte(carte1);
        joueur1.addCarte(carte2);

        List <Carte> mainJoueur = joueur1.getMain();

        assertEquals(nom, joueur1.getNom());
        assertEquals(main, joueur1.getMain());
        assertEquals("Lala", joueur1.getNom());

        for (int i = 0; i < main.size(); i++) {
            assertEquals(main.get(i), mainJoueur.get(i));
        }

    }

}