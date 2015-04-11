/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Jeroen
 */
public class Klas {

    private String naam;
    private List<Leerling> leerlingen;

    public Klas(String naam) {
        this.naam = naam;
        leerlingen = new LinkedList<>();
    }
    
    public void addLeerling(Leerling l)
    {
        leerlingen.add(l);
    }

    public List<Leerling> getLeerlingen() {
        return leerlingen;
    }

    public void setLeerlingen(List<Leerling> leerlingen) {
        this.leerlingen = leerlingen;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
    
    

}
