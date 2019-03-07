/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_de_busqueda;

import java.util.ArrayList;

/**
 *
 * @author Oscar
 */
public class Lista_Adya {
    public Nodo inicio;
   public Nodo ultimo;   
   public int tam;
   public Nodo linea[];
   
   
    
   public Lista_Adya(){      
      inicio=null;
      ultimo=null;
      tam=0;      
   }
   
   public void agregar_nodo_i (String nombre,int valor, int h, Nodo viene){
       Nodo nuevo= new Nodo(nombre,valor,h,viene,null);
      if(tam==0){
         inicio=nuevo;
      }
      else{
       ultimo.adyacente=nuevo;
       
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
            busq=busq.adyacente;
         }
      }
      return busq;     
   }
   
   
   
   /*
   public Nodo buscar(Nodo direccion, Nodo linea){//true si esta, false no esta
      
       
      Nodo busq=linea;
      boolean ban=false;
      
      while(busq!=null && ban==false){
         if(busq.getInfo().equals(direccion)){
            ban=true;
         }
         else{
            busq=busq.adyacente;
         }
      }
      return busq;     
   }
   */
   public void reset (){
       inicio=null;
      ultimo=null;
      tam=0;     
   }

 
   
    public void imprimir(int cantidad){
   
        
   for(int k=0;k<cantidad;k++){
        Nodo end =Crear.metodos.L_Info.buscar(Crear.metodos.ndos.get(k));
        /*
        Nodo aux=null;
        Nodo n;
        for(int x=0;x<Crear.metodos.ndos.size();x++){
            n=buscar(end,Crear.metodos.L_Adya.linea[x]);
            if(n!=null)aux=n;
        }
        n=aux;
        */
        Nodo n=end;
        
        System.out.println(n+"\t\t"+n.informacion+"\t\t"+n.peso+"\t\t "+n.val_heur+"\t\t "+n.siguiente+" \t\t"+n.adyacente);
        n=n.adyacente;
      
      if(n!=null){         
      while(n!=null){
         System.out.println(n+"\t\t"+n.informacion+"\t\t"+n.peso+"\t\t "+n.val_heur+"\t\t "+n.siguiente+" \t\t"+n.adyacente);
         n=n.adyacente;
      }
         
      }
      else System.out.println("Ningun nodo agregado");
      }
   }
                      
    
    public ArrayList<String> adyacentes(String inicial){
   
        ArrayList<String> adyas = new ArrayList<String>();
        Nodo n;
         n=Crear.metodos.L_Info.buscar(inicial); 
         
        n=n.adyacente;
              
      while(n!=null){
          adyas.add(n.informacion);
         n=n.adyacente;
      }
         
      
   return adyas;
   }
    
    
                        
                        
                        
                   
}


