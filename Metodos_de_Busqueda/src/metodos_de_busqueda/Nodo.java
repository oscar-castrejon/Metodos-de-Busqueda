/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_de_busqueda;

/**
 *
 * @author Oscar
 */
public class Nodo {
    
    public String informacion;
    public int peso;
    public int val_heur;
    public Nodo siguiente;
    public Nodo adyacente;
    
    public Nodo(String info,int peso,int val_heur,Nodo sig,Nodo ady){
        this.informacion=info;
        this.peso=peso;
        this.val_heur=val_heur;
        this.siguiente=sig;
        this.adyacente=ady;
    }
    
    public String getInfo(){
        return informacion;
    }
    //public Nodo inicio=
    
    
    
    
}
