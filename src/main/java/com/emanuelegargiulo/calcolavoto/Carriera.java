/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emanuelegargiulo.calcolavoto;

/**
 *
 * @author emanuelegargiulo
 */
public class Carriera {
    public double mediaPonderata;
    public double mediaAritmetica;
    public double mediaDesiderata;
    public int CFUtotali;
    public int CFUconseguti;
    
    public Carriera(double mediaPonderata, double mediaAritmetica, double mediaDesiderata, int CFUtotali, int CFUconseguti) {
        this.mediaPonderata = mediaPonderata;
        this.mediaAritmetica = mediaAritmetica;
        this.mediaDesiderata = mediaDesiderata;
        this.CFUtotali = CFUtotali;
        this.CFUconseguti = CFUconseguti;
    }
    
        public Carriera(double mediaPonderata, double mediaDesiderata, int CFUtotali, int CFUconseguti) {
        this.mediaPonderata = mediaPonderata;
        this.mediaDesiderata = mediaDesiderata;
        this.CFUtotali = CFUtotali;
        this.CFUconseguti = CFUconseguti;
    }

    public double getMediaPonderata() {
        return mediaPonderata;
    }

    public void setMediaPonderata(double mediaPonderata) {
        this.mediaPonderata = mediaPonderata;
    }

    public double getMediaAritmetica() {
        return mediaAritmetica;
    }

    public void setMediaAritmetica(double mediaAritmetica) {
        this.mediaAritmetica = mediaAritmetica;
    }

    public double getMediaDesiderata() {
        return mediaDesiderata;
    }

    public void setMediaDesiderata(double mediaDesiderata) {
        this.mediaDesiderata = mediaDesiderata;
    }

    public int getCFUtotali() {
        return CFUtotali;
    }

    public void setCFUtotali(int CFUtotali) {
        this.CFUtotali = CFUtotali;
    }

    public int getCFUconseguti() {
        return CFUconseguti;
    }

    public void setCFUconseguti(int CFUconseguti) {
        this.CFUconseguti = CFUconseguti;
    }
    
    
    
    
}
