/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_de_busqueda;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Oscar
 */
public class Metodos_de_Busqueda {

    
    public static JFrame principal=new Principal();
    public static String nodos[];
    
    public static ArrayList<String> ndos ;
    public static boolean creado=false;
    public static int matriz[][];
    public static boolean peso=false;
    public static Lista_Info L_Info=new Lista_Info();
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        principal.setVisible(true);
    }
    public static void creado(){
        principal.setVisible(true);
        creado=true;
    }
    public static void abrir(){
        principal.setVisible(true);
    }
    public static void setNodos(String z[]){
        for(int y=0;y<z.length;y++){
                nodos[y]=z[y];
            }
    }
    public static String[] getNodos(){
        return nodos;
    }
    
    public static void setNdos(ArrayList<String> z){
        ndos=z;
    }
    public static ArrayList<String> getNdos(){
        return ndos;
    }
    public static void setMatriz(int z[][],int c){
        matriz=z;
        
    }
    public static int[][] getMatriz(){
        return matriz;
    }
    
    public static void Crear_Lista_Info(){
        for(int x=0;x<ndos.size();x++){
            L_Info.agregar_nodo(ndos.get(x));
        }
    }
    
    public static void Imprimir_Lista_Info(){
        L_Info.imprimir();
    }
    
    
}
