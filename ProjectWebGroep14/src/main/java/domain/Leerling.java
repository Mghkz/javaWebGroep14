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
public class Leerling {

    private Integer id;
    private String voornaam;
    private String familienaam;
    private List<Toets> toetsen;

    public Leerling() {
        toetsen = new LinkedList<>();
    }

    public Leerling(Integer id,String voornaam, String familienaam) {
        this.id = id;
        this.voornaam = voornaam;
        this.familienaam = familienaam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getFamilienaam() {
        return familienaam;
    }

    public void setFamilienaam(String familienaam) {
        this.familienaam = familienaam;
    }

    public List<Toets> getToetsen() {
        return toetsen;
    }

    public void setToetsen(List<Toets> toetsen) {
        this.toetsen = toetsen;
    }

    public Integer getId() {
        return id;
    }
    

}
