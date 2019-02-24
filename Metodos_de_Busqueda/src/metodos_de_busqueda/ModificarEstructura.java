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
        ok2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        eliminar = new javax.swing.JCheckBox();
        lista_nodos = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Añadir Nodo:");

        jButton1.setText("Añadir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        lista_nodos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        lista_nodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lista_nodosActionPerformed(evt);
            }
        });

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
                            .addComponent(nombre_nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(lista_nodos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(ok2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(eliminar)
                        .addComponent(lista_nodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addComponent(jButton3)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
        if(eliminar.isSelected()){
            lista_nodos.setEnabled(true);
            
            String[] nombres=new String[Crear.metodos.ndos.size()];
            for(int x=0; x<Crear.metodos.ndos.size();x++){
                nombres[x]=Crear.metodos.ndos.get(x);
            }
            lista_nodos.setModel(new javax.swing.DefaultComboBoxModel<>(nombres));
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

    
    /*
    for (int i=0; i < Crear.metodos.ndos.size(); i++) {
lista_nodos.add(Crear.metodos.ndos.get(i));
}
    
    
    */
    private void ok2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok2ActionPerformed
        // TODO add your handling code here:
        int borrar=-1;
        boolean brr=false;
        String nombre=(String)lista_nodos.getSelectedItem();
        for(int x=0;x<Crear.metodos.ndos.size();x++){
            if(nombre==Crear.metodos.ndos.get(x)){
                borrar=x;
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

    private void lista_nodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lista_nodosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lista_nodosActionPerformed

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
         
              
        frame.pack();
        frame.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox eliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> lista_nodos;
    private javax.swing.JTextField nombre_nuevo;
    private javax.swing.JButton ok2;
    // End of variables declaration//GEN-END:variables
}
