/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Jeroen
 */
public class Resultaat {

    private String voornaam;
    private String familienaam;
    private List<Toets> toetsen;
    private Toets min;
    private Toets max;
    private Double gemiddelde = 0.00;
    private final Comparator<Toets> byBehaald = (x, y) -> Double.compare((x.getBehaald() / x.getTotaal()), (y.getBehaald() / y.getTotaal()));

    public Resultaat(Leerling l) {

        voornaam = l.getVoornaam();
        familienaam = l.getFamilienaam();
        toetsen = l.getToetsen();
        berekenMin();
        berekenMax();
        berekenGemiddelde();

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
        gemiddelde = (gemiddelde / toetsen.size()) * 10;

    }

    public List<Toets> getToetsen() {
        return toetsen;
    }

    public void setToetsen(List<Toets> toetsen) {
        this.toetsen = toetsen;
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

}
