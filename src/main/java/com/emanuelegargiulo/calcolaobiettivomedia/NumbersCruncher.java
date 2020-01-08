/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emanuelegargiulo.calcolaobiettivomedia;

/**
 * Gestisce l'unico vero calcolo necessario all'applicazione.
 *
 * @author emanuelegargiulo
 */
public class NumbersCruncher {

    public static double getTargetAvg(Carriera car) {
        double puntiTarget = car.CFUtotali * car.getMediaDesiderata();
        double puntiRimanenti = puntiTarget - (car.getCFUconseguti() * car.getMediaPonderata());
        double mediaNecessaria = puntiRimanenti / (car.CFUtotali - car.CFUconseguti);

        return mediaNecessaria;
    }

    public static int getStartVote(double mediaPonderata) {
        int votoPartenza = (int) Math.round(mediaPonderata * 110 / 30);
        return votoPartenza;
    }
    
    
    public static int mpFromStartingVote() {
        return 0;
    }

}
