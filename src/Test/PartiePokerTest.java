package Test;

import fr.lm.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PartiePokerTest {

    private PartiePoker partie = new PartiePoker();
    private PartiePoker partie2 = new PartiePoker();

    @Test
    void testPartie() {

        Joueur joueur1 = new Joueur("Joueur 1");
        Joueur joueur2 = new Joueur("Joueur 2");
        Joueur joueur3 = new Joueur("Joueur 3");

        List<Joueur> joueurs = new ArrayList<>();
        joueurs.add(joueur1);
        joueurs.add(joueur2);
        joueurs.add(joueur3);

        JeuDeCarte jeuDeCarte = partie.lancerPartie(joueurs);

        assertEquals(5, joueur1.getMain().size());
        assertEquals(5, joueur2.getMain().size());

        for (int i = 0; i < joueur1.getMain().size(); i++) {
            assertNotEquals(joueur1.getMain().get(i), joueur2.getMain().get(i));
        }

        assertEquals(37, jeuDeCarte.getCartesRestantes().size());


        Couleur coeur = new Couleur("Coeur");
        Couleur pique = new Couleur("Pique");
        Couleur trefle = new Couleur("Trèfle");
        Couleur carreau = new Couleur("Carreau");
        Hauteur roi = new Hauteur("Roi");
        Hauteur valet = new Hauteur("Valet");
        Hauteur trois = new Hauteur("3");
        Hauteur huit = new Hauteur("8");
        Hauteur six = new Hauteur("6");

        Carte carte1 = new Carte(coeur, roi);
        Carte carte2 = new Carte(pique, roi);
        Carte carte3 = new Carte(trefle, valet);
        Carte carte4 = new Carte(trefle, trois);
        Carte carte5 = new Carte(carreau, huit);

        List <Carte> main = new ArrayList<>();
        main.add(carte1);
        main.add(carte2);
        main.add(carte3);
        main.add(carte4);
        main.add(carte5);

        assertTrue(partie2.aUnePaire(main));

        Carte carte6 = new Carte(coeur, roi);
        Carte carte7 = new Carte(pique, huit);
        Carte carte8 = new Carte(trefle, huit);
        Carte carte9 = new Carte(carreau, valet);
        Carte carte10 = new Carte(carreau, trois);

        List <Carte> main2 = new ArrayList<>();
        main2.add(carte6);
        main2.add(carte7);
        main2.add(carte8);
        main2.add(carte9);
        main2.add(carte10);

        assertTrue(partie2.aUnePaire(main2));

        Carte carte11 = new Carte(coeur, roi);
        Carte carte12 = new Carte(pique, huit);
        Carte carte13 = new Carte(trefle, valet);
        Carte carte14 = new Carte(carreau, six);
        Carte carte15 = new Carte(carreau, trois);

        List <Carte> main3 = new ArrayList<>();
        main3.add(carte11);
        main3.add(carte12);
        main3.add(carte13);
        main3.add(carte14);
        main3.add(carte15);

        assertFalse(partie2.aUnePaire(main3));

        Carte carte16 = new Carte(coeur, roi);
        Carte carte17 = new Carte(pique, roi);
        Carte carte18 = new Carte(trefle, huit);
        Carte carte19 = new Carte(carreau, huit);
        Carte carte20 = new Carte(carreau, trois);

        List <Carte> main4 = new ArrayList<>();
        main4.add(carte16);
        main4.add(carte17);
        main4.add(carte18);
        main4.add(carte19);
        main4.add(carte20);

        assertTrue(partie2.aDeuxPaires(main4));

    }



}