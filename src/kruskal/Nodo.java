/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kruskal;

import java.util.ArrayList;

/**
 *
 *  
 */
public class Nodo {
    public String nombre;
    public int x,y;
    public ArrayList<Arco> arcos=new ArrayList<>();
    
    public ArrayList<Nodo> camino=new ArrayList<>();
    public int radio=15;
    
    public Nodo(String nombre,int x, int y){
        this.nombre= nombre;
        this.x=x;
        this.y=y;
    }    
    public boolean mouseEntered(java.awt.event.MouseEvent evt){
        double dis;
        dis =  Math.pow((Math.pow(evt.getX()-x,2)+Math.pow(evt.getY()-y,2)),0.5);
        return dis<radio;
    }
    
    public void agregarArco(Arco a){
        if (arcos.indexOf(a)!=-1) {
            this.arcos.add(a);
            if (a.inicio==null) {
                a.inicio=this;
            }else{
                a.inicio=this;
            }                
        }
    }
    public void quitarArco(Arco a){
        if (arcos.indexOf(a)!=-1) {
            this.arcos.remove(a);
            if (a.inicio==this) {
                a.inicio=null;
            }else{
                a.inicio=null;
            }
        }
    }
    
}
