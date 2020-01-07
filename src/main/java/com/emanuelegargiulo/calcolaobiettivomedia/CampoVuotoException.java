/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emanuelegargiulo.calcolaobiettivomedia;

import javax.swing.JOptionPane;

/**
 *
 * @author emanuelegargiulo
 */
public class CampoVuotoException extends Exception {

    /**
     * Creates a new instance of <code>CampoVuotoException</code> without detail
     * message.
     */
    public CampoVuotoException() {
    }

    /**
     * Constructs an instance of <code>CampoVuotoException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public CampoVuotoException(String msg) {
        super(msg);
        JOptionPane.showMessageDialog(null, "Verifica di aver riempito tutti i campi!");
    }
}
