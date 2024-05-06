package Test;

import fr.lm.Hauteur;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HauteurTest {

    Hauteur hauteur1 = new Hauteur("Valet");

    @Test
    void testHauteur() {

        assertEquals(10, hauteur1.getValeur());
        assertNotEquals(4, hauteur1.getValeur());
        assertThrows(IllegalArgumentException.class, () -> {
            new Hauteur("Bleu");
        });
        assertEquals("Valet", hauteur1.getNom());
    }

}