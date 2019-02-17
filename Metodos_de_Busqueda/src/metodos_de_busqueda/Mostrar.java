/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_de_busqueda;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Mostrar extends JFrame {
    JButton salir = new JButton("Salir");
    GridLayout grid;
    
    public static int matriz[][];
    
    
    public static Metodos_de_Busqueda metodos=new Metodos_de_Busqueda();
    public static String nodos[];
    
      public static LlenarCampos frame;
    
    public Mostrar() {
        
        setResizable(false);
    }
    
    public void initGaps() {
    }
    
    public void addComponentsToPane(final Container pane) {
        initGaps();
        final JPanel compsToExperiment = new JPanel();
        new GridLayout(0,2);
        nodos=metodos.getNodos();
        int cantidad=nodos.length;
        grid= new GridLayout(cantidad+2,cantidad+1);
        compsToExperiment.setLayout(grid);
        int total=cantidad*cantidad;
        int p=0;
        TextField tf[][]=new TextField[cantidad][cantidad];
        int matriz[][]=metodos.getMatriz();
        
        
        
            compsToExperiment.add(new JLabel(""));
        
        for(int x=0;x<cantidad;x++){
            compsToExperiment.add(new JLabel(""+nodos[x]));
        }
        for(int x=0;x<cantidad;x++){
            compsToExperiment.add(new JLabel(""+nodos[x]));
            for(int y=0;y<cantidad;y++){
                //compsToExperiment.add(tf[p]);
                //tf[p].setText(x+","+y);
                //p++;
                tf[x][y]=new TextField(""+matriz[x][y]);
                tf[x][y].setEnabled(false);
                compsToExperiment.add(tf[x][y]);
            }
        }
        
        compsToExperiment.add(salir);
        
        //Process the Apply gaps button press
        salir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //Get the horizontal gap value
                //Set up the layout of the buttons
                grid.layoutContainer(compsToExperiment);
                
                    metodos.abrir();
                    frame.dispose();
                }
        });
        pane.add(compsToExperiment, BorderLayout.NORTH);
    }
    
    /**
     * Create the GUI and show it.  For thread safety,
     * this method is invoked from the
     * event dispatch thread.
     */
     static void abrir() {
         frame = new LlenarCampos();
        //Create and set up the window.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set up the content pane.
        frame.addComponentsToPane(frame.getContentPane());
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        /* Use an appropriate Look and Feel */
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        /* Turn off metal's use of bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                abrir();
            }
        });
    }
}