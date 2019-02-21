/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_de_busqueda;

import java.awt.Choice;
import static metodos_de_busqueda.ModificarNombres.frame;

/**
 *
 * @author Oscar
 */
public class ModificarEstructura extends javax.swing.JFrame {

    /**
     * Creates new form ModificarEstructura
     */
    
    
    
      public static ModificarEstructura frame;
    public ModificarEstructura() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nombre_nuevo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lista_nodos = new java.awt.Choice();
        ok2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        eliminar = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Añadir Nodo:");

        jButton1.setText("Añadir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lista_nodos.setEnabled(false);
        lista_nodos = new Choice();
        lista_nodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lista_nodosMouseClicked(evt);
            }
        });

        ok2.setText("Eliminar");
        ok2.setEnabled(false);
        ok2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok2ActionPerformed(evt);
            }
        });

        jButton3.setText("Continuar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar Nodo");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        for (int i=0; i < Crear.metodos.ndos.size(); i++) {
            lista_nodos.add(Crear.metodos.ndos.get(i));
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(eliminar))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombre_nuevo)
                            .addComponent(lista_nodos, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(ok2))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombre_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lista_nodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ok2)
                    .addComponent(eliminar))
                .addGap(55, 55, 55)
                .addComponent(jButton3)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
        if(eliminar.isSelected()){
            lista_nodos.setEnabled(true);
            
            lista_nodos = new Choice();
for (int i=0; i < Crear.metodos.ndos.size(); i++) {
lista_nodos.add(Crear.metodos.ndos.get(i));
}
            ok2.setEnabled(true);
        }
        else{
            
            lista_nodos.setEnabled(false);
            ok2.setEnabled(false);
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Crear.metodos.ndos.add(nombre_nuevo.getText());
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ok2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok2ActionPerformed
        // TODO add your handling code here:
        int borrar=-1;
        boolean brr=false;
        String nombre=lista_nodos.getSelectedItem();
        
        for(int x=0;x<Crear.metodos.ndos.size();x++){
            if(nombre==Crear.metodos.ndos.get(x)){
                borrar=x;
                System.out.println(nombre);
                brr=true;
            }
        }
        if(brr)Crear.metodos.ndos.remove(borrar);
    }//GEN-LAST:event_ok2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Crear.campos.abrir();
                    this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void lista_nodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lista_nodosMouseClicked
        // TODO add your handling code here:
        System.out.println(lista_nodos.getSelectedItem());
    }//GEN-LAST:event_lista_nodosMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModificarEstructura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarEstructura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarEstructura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarEstructura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarEstructura().setVisible(true);
            }
        });
    }

    static void abrir() {
         frame = new ModificarEstructura();
         
                    lista_nodos = new Choice();
for (int i=0; i < Crear.metodos.ndos.size(); i++) {
lista_nodos.add(Crear.metodos.ndos.get(i));
}
        frame.pack();
        frame.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox eliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    public static java.awt.Choice lista_nodos;
    private javax.swing.JTextField nombre_nuevo;
    private javax.swing.JButton ok2;
    // End of variables declaration//GEN-END:variables
}
