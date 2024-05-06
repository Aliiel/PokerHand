package Test;

import fr.lm.Couleur;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class CouleurTest {

    @Test
    void testCouleur() {

        List<String> couleursAttendues = Arrays.asList("Trèfle", "Carreau", "Pique", "Coeur");
        assertEquals(couleursAttendues, Couleur.getCouleurs());
        assertEquals(true, Couleur.getCouleurs().contains("Carreau"));
        assertEquals(false, Couleur.getCouleurs().contains("Orange"));
        assertThrows(IllegalArgumentException.class, () -> {
            new Couleur ("Bleu");
        });

    }

}