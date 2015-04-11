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

    private Double totaal;
    private Double behaald;

    public Toets() {
    }

    public Toets(double totaal, double behaald) {
        this.totaal = totaal;
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

}
