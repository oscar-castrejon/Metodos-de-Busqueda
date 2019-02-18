package metodos_de_busqueda;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ModificarNombres extends JFrame {
    JButton salir = new JButton("Salir");
    JButton bt_modificarInfo = new JButton("Guardar Cambios");
    GridLayout grid;
    
    public static int matriz[][];
    
    //public static Metodos_de_Busqueda metodos=new Metodos_de_Busqueda();
    public static String nodos[];
    
    public static ModificarNombres frame;
    
    public ModificarNombres() {
        
        setResizable(false);
    }
    
    public void initGaps() {
    }
    
    public void addComponentsToPane(final Container pane) {
        initGaps();
        final JPanel compsToExperiment = new JPanel();
        new GridLayout(0,2);
        nodos=Crear.metodos.getNodos();
        int cantidad=nodos.length;
        grid= new GridLayout(cantidad+2,cantidad+1);
        compsToExperiment.setLayout(grid);
        int total=cantidad*cantidad;
        int p=0;
        TextField tf[][]=new TextField[cantidad][cantidad];
        //Crear.metodos.matriz = new int [cantidad][cantidad];
        //compsToExperiment.add(new JLabel(""));
        matriz=Crear.metodos.getMatriz();
        
        TextField tf_nodos[]=new TextField[cantidad];
        
        for(int x=0;x<cantidad;x++){
            tf_nodos[x] = new TextField(""+nodos[x]);
            compsToExperiment.add(tf_nodos[x]);
        }
        for(int x=0;x<cantidad;x++){
            
            //compsToExperiment.add(new JLabel(""+nodos[x]));
            for(int y=0;y<cantidad;y++){
                //compsToExperiment.add(tf[p]);
                //tf[p].setText(x+","+y);
                //p++;
                tf[x][y]=new TextField(""+matriz[x][y]);                
                tf[x][y].setEnabled(false);
                compsToExperiment.add(tf[x][y]);
            }
        }
        
        compsToExperiment.add(bt_modificarInfo);
        compsToExperiment.add(salir);
        
        //Process the Apply gaps button press
        salir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //Get the horizontal gap value
                //Set up the layout of the buttons
                grid.layoutContainer(compsToExperiment);
                
                    Crear.metodos.abrir();
                    frame.dispose();
                }
        });
        bt_modificarInfo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //Get the horizontal gap value
                //Set up the layout of the buttons
                        for(int y=0;y<cantidad;y++){
                            nodos[y]=tf_nodos[y].getText();
                        }
                    grid.layoutContainer(compsToExperiment);
                    Crear.metodos.abrir();
                    frame.dispose();
                }
        });
        pane.add(compsToExperiment, BorderLayout.NORTH);
    }
    
     static void abrir() {
         frame = new ModificarNombres();
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
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                abrir();
            }
        });
    }
}
