/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_de_busqueda;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LlenarCampos extends JFrame {
    JButton Aceptar = new JButton("Aceptar");
    GridLayout grid;
    
    
    public static Metodos_de_Busqueda metodos=new Metodos_de_Busqueda();
    public static String nodos[];
    
    public LlenarCampos() {
        
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
        grid= new GridLayout(cantidad,cantidad);
        compsToExperiment.setLayout(grid);
        
        //Set up components preferred size
        
        //Add buttons to experiment with Grid Layout
        compsToExperiment.add(new JButton("Boton1"));
        compsToExperiment.add(new JButton("Boton1 2"));
        compsToExperiment.add(new JButton("Boton1 3"));
        compsToExperiment.add(new JButton("5"));
        
        compsToExperiment.add(Aceptar);
        
        //Process the Apply gaps button press
        Aceptar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //Get the horizontal gap value
                //Set up the layout of the buttons
                grid.layoutContainer(compsToExperiment);
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
        //Create and set up the window.
        LlenarCampos frame = new LlenarCampos();
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