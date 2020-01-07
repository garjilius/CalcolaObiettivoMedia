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
public class NumbersCruncher {
    
    public static double getTargetAvg(Carriera car) {
        double puntiTarget = car.CFUtotali * car.getMediaDesiderata();
        double puntiRimanenti = puntiTarget - (car.getCFUconseguti() * car.getMediaPonderata());
        double mediaNecessaria = puntiRimanenti / (car.CFUtotali - car.CFUconseguti);
        
        return mediaNecessaria;
    }
   
    
    
}
