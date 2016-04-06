/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kruskal;

/**
 *
 *  
 */
public class Arco {
   public Nodo inicio;
   public Nodo fin;
   public float peso;

    public Arco(Nodo inicio, Nodo fin, float peso) {
        this.inicio = inicio;
        this.fin = fin;
        this.peso = peso;
    }
}
