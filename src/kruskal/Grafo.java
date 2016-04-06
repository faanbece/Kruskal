/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kruskal;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 *  
 */
public class Grafo {
    ArrayList <String> nombres;
    ArrayList <Arco>   arcos;
    ArrayList <Nodo>   nodos;
    public Grafo()
    {
        nombres=new ArrayList<String>();
        nodos=new ArrayList<Nodo>();
        arcos=new ArrayList <Arco>();
    }
    public void ingresarNodo(Nodo n)
    {
        nombres.add(n.nombre);
        nodos.add(n);
    }
    public void adicionarEnlace(Arco arco)
    {
        arcos.add(arco);
    }
}
