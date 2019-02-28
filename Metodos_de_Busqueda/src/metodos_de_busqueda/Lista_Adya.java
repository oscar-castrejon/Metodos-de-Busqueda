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
public class Lista_Adya {
    private Nodo inicio;
   private Nodo ultimo;   
   private int tam;
   public Lista_Adya(){      
      inicio=null;
      ultimo=null;
      tam=0;      
   }
   
   public void agregar_nodo (String info){
       Nodo nuevo= new Nodo(info,0,0,null,null);
      if(tam==0){
         inicio=nuevo;
      }
      else{
       ultimo.siguiente=nuevo;
      }
      
      ultimo=nuevo;
      tam++;
   }
   
}
