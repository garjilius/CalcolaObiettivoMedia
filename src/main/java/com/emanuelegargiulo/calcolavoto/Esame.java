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
public class Esame {

    private int voto;
    private int cfu;
    private String nome;

    public Esame(int voto, int cfu, String nome) {
        this.voto = voto;
        this.cfu = cfu;
        this.nome = nome;
    }

    public Esame(int voto, int cfu) {
        this.voto = voto;
        this.cfu = cfu;
    }

    public Esame(int cfu) {
        this.cfu = cfu;
    }

    public Esame() {
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public int getCfu() {
        return cfu;
    }

    public void setCfu(int cfu) {
        this.cfu = cfu;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    

}
