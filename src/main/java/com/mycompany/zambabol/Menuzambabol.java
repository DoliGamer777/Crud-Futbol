
package com.mycompany.zambabol;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josej
 */
public class Menuzambabol extends javax.swing.JFrame {
    
    ArchivoPlano archivo = new ArchivoPlano();
    

    /**
     * Creates new form Menuzambabol
     */
    public  Menuzambabol() {
            initComponents();
             this.setLocationRelativeTo(null);
            LlenarTabla();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        varNombre = new javax.swing.JTextField();
        varCodigo = new javax.swing.JTextField();
        varEntrenador = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEquipo = new javax.swing.JTable();
        varGuardar = new javax.swing.JButton();
        txtEliminarCodigo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        EliminarButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Entrenador");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(varNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 126, -1));
        getContentPane().add(varCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 126, -1));
        getContentPane().add(varEntrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 126, -1));

        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        tablaEquipo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Entrenador"
            }
        ));
        tablaEquipo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                tablaEquipoAncestorRemoved(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEquipo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 343, 102));

        varGuardar.setText("Guardar");
        varGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(varGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        txtEliminarCodigo.setForeground(new java.awt.Color(0, 0, 0));
        txtEliminarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEliminarCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(txtEliminarCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 90, -1));

        jButton1.setText("Regresar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 30));

        EliminarButton.setText("Borrar");
        EliminarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarButtonMouseClicked(evt);
            }
        });
        getContentPane().add(EliminarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Entrenador");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Codigo");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nombre");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("(Ingrese ID)");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\abedu\\Desktop\\Proyect prueba\\src\\main\\java\\Imagenes\\Ios_14_app_icon_kawaii-removebg-preview (1).png")); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 50, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("REGISTRO EQUIPO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 6, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Datos de equipos");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ingresar datos");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Eliminar equipos");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\abedu\\Desktop\\Proyect prueba\\src\\main\\java\\Imagenes\\fondo-futbol-degradado-dinamico_23-2149007789.jpg")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void LlenarTabla(){
        ArrayList<Object[]> DatosTabla = archivo.leer();
        DefaultTableModel modeloTabla= (DefaultTableModel)tablaEquipo.getModel();
        modeloTabla.setNumRows(0);
        
        for (Object[] linea : DatosTabla) {
            modeloTabla.addRow(linea);
            
        }
         
    }                                        

    private void tablaEquipoAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tablaEquipoAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaEquipoAncestorRemoved

    private void varGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varGuardarActionPerformed
       if (varCodigo.getText().isEmpty()||varNombre.getText().isEmpty()||varEntrenador.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Campo Vacio");
        }
       else{
        Equipo equ1=new Equipo();  
        equ1.setId(varCodigo.getText());
        equ1.setNombre(varNombre.getText());
        equ1.setEntrenador(varEntrenador.getText());
        varNombre.setText("");
        varCodigo.setText("");
        varEntrenador.setText("");
        JOptionPane.showMessageDialog(null, "Equipo registrado");
        
        String DatosEquipo= equ1.getId()+";"+equ1.getNombre()+";"+equ1.getEntrenador()+"\n";
        System.out.println(equ1.getId()+";"+equ1.getNombre()+";"+equ1.getEntrenador()+"\n");
        archivo.guardar(DatosEquipo);
        LlenarTabla();
       }
    }//GEN-LAST:event_varGuardarActionPerformed

    private void txtEliminarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEliminarCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEliminarCodigoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        MenuPrincipal frame=new MenuPrincipal();
        
        frame.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void EliminarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarButtonMouseClicked
        if (txtEliminarCodigo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "el codigo esta vacio!");
        }
        else{
            boolean encontrado = archivo.eliminarEquipo(txtEliminarCodigo.getText());
            if (encontrado){
                LlenarTabla();
                JOptionPane.showMessageDialog(null, "Equipo eliminado");
                txtEliminarCodigo.setText("");
            
            }else{
                JOptionPane.showMessageDialog(null, "Equipo no encontrado");
            }
        }
    }//GEN-LAST:event_EliminarButtonMouseClicked

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
            java.util.logging.Logger.getLogger(Menuzambabol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menuzambabol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menuzambabol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menuzambabol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Menuzambabol().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EliminarButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEquipo;
    private javax.swing.JTextField txtEliminarCodigo;
    private javax.swing.JTextField varCodigo;
    private javax.swing.JTextField varEntrenador;
    private javax.swing.JButton varGuardar;
    private javax.swing.JTextField varNombre;
    // End of variables declaration//GEN-END:variables
}
