/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Jeroen
 */
public class Toets {

    private String naam;
    private Double totaal;
    private Double behaald = 0.00;

    public Toets() {
    }

    public Toets(String naam, double totaal) {
        this.naam = naam;
        this.totaal = totaal;
    }

    public Toets(String naam, double totaal, double behaald) {
        this(naam, totaal);
        this.behaald = behaald;
    }

    public Double getTotaal() {
        return totaal;
    }

    public void setTotaal(double totaal) {
        this.totaal = totaal;
    }

    public Double getBehaald() {
        return behaald;
    }

    public void setBehaald(double behaald) {
        this.behaald = behaald;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

}
