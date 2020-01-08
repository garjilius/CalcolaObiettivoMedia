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
    
    
    public static double mpFromStartingVote(int sv) {  
        double startingVote = sv;
        double mediaP = (startingVote * 30) / 110;
        
        while ((Math.round((mediaP*110)/30)) >= startingVote) {
           // System.out.println((Math.round(mediaP *110) / 30));
            mediaP -= 0.01;
            //System.out.println(mediaP);
        }
        return mediaP+0.01;
    }

}
