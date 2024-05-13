package fr.lm;

import java.util.List;

public interface Combinaisons {

    boolean aUnePaire(List<Carte> main);

    boolean aDeuxPaires(List<Carte> main);

    boolean aUnBrelan(List<Carte> main);

    boolean aUneQuinte(List<Carte> main);

    boolean aUneCouleur(List<Carte> main);

    boolean aUnFull(List<Carte> main);

    boolean aUnCarre(List<Carte> main);

    boolean aUneQuinteFlush(List<Carte> main);

    boolean aUneQuinteFlushRoyale(List<Carte> main);


}
