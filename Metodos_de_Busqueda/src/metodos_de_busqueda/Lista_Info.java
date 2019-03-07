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
public class Lista_Info {
public Nodo inicio;
   public Nodo ultimo;   
   public int tam;
   public Lista_Info(){
      
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
   
   public Nodo buscar(String nombre){//true si esta, false no esta
      
      Nodo busq=inicio;
      boolean ban=false;
      
      while(busq!=null && ban==false){
         if(busq.getInfo().equals(nombre)){
            ban=true;
         }
         else{
            busq=busq.siguiente;
         }
      }
      return busq;     
   }
   
   public void imprimir(){
   
      Nodo n=inicio;
      
      if(n!=null){         
      while(n!=null){
         System.out.println(n+"\t\t"+n.informacion+"\t\t"+n.peso+"\t\t "+n.val_heur+"\t\t "+n.siguiente+" \t\t"+n.adyacente);
         n=n.siguiente;
      }
         
      }
      else System.out.println("Ningun nodo agregado");
      
   }
   
   
   
   
   
   
}
