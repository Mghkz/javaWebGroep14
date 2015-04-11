/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Jeroen
 */
public class SimpleKlasManager implements KlasManager {

    private List<Klas> klassen;
    private List<Leerling> leerlingen;

    public SimpleKlasManager() {
        leerlingen = new LinkedList<>();
    }

    @Override
    public List<Klas> getItems() {
        return klassen;
    }

    public List<Klas> getKlassen() {
        return klassen;
    }

    public void setKlassen(List<Klas> klassen) {
        this.klassen = klassen;
        klassen.forEach(k -> {
            k.getLeerlingen().forEach(l -> {
                leerlingen.add(l);
            });
        });

    }

    @Override
    public Leerling getLeerling(int id) {
        final int idf = id;
        return leerlingen.stream().filter(l -> l.getId().intValue() == idf).findFirst().get();
    }

}
