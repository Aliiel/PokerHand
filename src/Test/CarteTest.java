package Test;

import fr.lm.Carte;
import fr.lm.Couleur;
import fr.lm.Hauteur;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarteTest {

    Couleur couleur = new Couleur("Coeur");
    Hauteur hauteur = new Hauteur("As");
    Carte carteTest = new Carte(couleur, hauteur);
    Couleur couleur1 = new Couleur("Coeur");
    Hauteur hauteur1 = new Hauteur("Roi");
    Carte carteTest1 = new Carte(couleur1, hauteur1);

    @Test
    void testCarte() {

        assertEquals(couleur, carteTest.getCouleur());
        assertEquals(hauteur, carteTest.getHauteur());
        assertEquals("As de Coeur\nvaleur de la carte : 13", carteTest.toString());

        assertTrue(carteTest.compareTo(carteTest1) > 0);
        assertFalse(carteTest.compareTo(carteTest1) < 0);




    }

}