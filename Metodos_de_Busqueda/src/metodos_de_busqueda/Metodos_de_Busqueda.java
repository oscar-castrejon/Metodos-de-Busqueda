/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_de_busqueda;

import javax.swing.JFrame;

/**
 *
 * @author Oscar
 */
public class Metodos_de_Busqueda {

    
    public static JFrame principal=new Principal();
    public static String nodos[];
    public static boolean creado=false;
    public static int matriz[][];
    
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
    public static void setMatriz(int z[][]){
        for(int x=0;x<z.length;x++){
            for(int y=0;y<z.length;y++){
                matriz[x][y]=z[x][y];
            }
        }
    }
    public static int[][] getMatriz(){
        return matriz;
    }
    
    
}
