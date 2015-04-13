/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Comparator;
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
    private Toets min;
    private Toets max;
    private Double gemiddelde = 0.00;
    private final Comparator<Toets> byBehaald = (x, y) -> Double.compare((x.getBehaald() / x.getTotaal()), (y.getBehaald() / y.getTotaal()));

    public Leerling() {
        toetsen = new LinkedList<>();
    }

    public Leerling(Integer id, String voornaam, String familienaam) {
        this.id = id;
        this.voornaam = voornaam;
        this.familienaam = familienaam;
    }

    private void berekenMin() {

        min = toetsen.stream().min(byBehaald).get();
    }

    private void berekenMax() {
        max = toetsen.stream().max(byBehaald).get();
    }

    private void berekenGemiddelde() {
        toetsen.forEach(t -> {
            gemiddelde += (t.getBehaald() / t.getTotaal());
        });
        gemiddelde = (gemiddelde / toetsen.size());

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
        berekenMin();
        berekenMax();
        berekenGemiddelde();
    }

    public Integer getId() {
        return id;
    }

    public Toets getMin() {
        return min;
    }

    public void setMin(Toets min) {
        this.min = min;
    }

    public Toets getMax() {
        return max;
    }

    public void setMax(Toets max) {
        this.max = max;
    }

    public Double getGemiddelde() {
        return gemiddelde;
    }

    public void setGemiddelde(Double gemiddelde) {
        this.gemiddelde = gemiddelde;
    }
    

}
