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
public class kruskal {

    //Grafo arbol = new Grafo();
    ArrayList<Nodo> visitados= new ArrayList<>();
    Float[][] trans;
    public Grafo aplicarKruskal(Grafo grafo) {
        Grafo T = new Grafo();
        ArrayList<Arco> L=new ArrayList<>();
        Arco tem;
        for (Nodo n : grafo.nodos) {
            T.nodos.add(n);
        }
        for (Arco a : grafo.arcos) {
            L.add(a);
        }
        L=sort(L);
        while (!(L.isEmpty())) {            
            tem=L.get(0);
            ArrayList<Nodo> v1= new ArrayList<>();
            v1= nIntento(tem.inicio,v1);
            ArrayList<Nodo> v2= new ArrayList<>();
            v2= nIntento(tem.fin,v2);
            if(compararVisita(v1, v2)){
                L.remove(tem);
            }else{
                T.arcos.add(tem);
                tem.inicio.camino.add(tem.fin);
                tem.fin.camino.add(tem.inicio);                
                L.remove(tem);
            }
        }
        return T;
    }
   
    public ArrayList<Arco> sort(ArrayList<Arco> arcos){
        Arco a;
        for (int i = 0; i < arcos.size()-1; i++) {
            for (int j = i+1; j < arcos.size(); j++) {
                if (arcos.get(i).peso>arcos.get(j).peso) {
                    a=arcos.get(i);
                    arcos.set(i, arcos.get(j));
                    arcos.set(j,a);
                }
            }
        }
        for (Arco ar : arcos) {
            System.out.println(ar.inicio.nombre+"->"+ar.fin.nombre+" : "+ar.peso);
        }
        return arcos;
    }
    
    public ArrayList<Nodo> nIntento(Nodo root, ArrayList<Nodo> visitados){
        visitados.add(root);
        for (Nodo n : root.camino) {
            if ( visitados.indexOf(n)==-1 ) {
                nIntento(n,visitados);  
            }
        }
        return visitados;
    }
    
    public boolean compararVisita(ArrayList<Nodo> a, ArrayList<Nodo> b){
        for (Nodo n : a) {
            for (Nodo m : b) {
                if (n==m) {
                    return true;
                }
            }
        }
        return false;
    }
}
