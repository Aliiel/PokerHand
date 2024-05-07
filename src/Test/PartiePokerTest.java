package Test;

import fr.lm.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PartiePokerTest {

    private PartiePoker partie = new PartiePoker();

    @Test
    void testPartie() {

        Joueur joueur1 = new Joueur("Joueur 1");
        Joueur joueur2 = new Joueur("Joueur 2");

        List<Joueur> joueurs = new ArrayList<>();
        joueurs.add(joueur1);
        joueurs.add(joueur2);

        partie.lancerPartie(joueurs);

        assertEquals(5, joueur1.getMain().size());
        assertEquals(5, joueur2.getMain().size());

        for (int i = 0; i < joueur1.getMain().size(); i++) {
            assertNotEquals(joueur1.getMain().get(i), joueur2.getMain().get(i));
        }


    }

}