
package com.mycompany.zambabol;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class MenuEquipos extends javax.swing.JFrame {

    
    ArchivoPlano archivo = new ArchivoPlano();
    
    public ArrayList<Object[]> Equipos=archivo.leer();
    
    
    
    
    public MenuEquipos() {
        initComponents();
         this.setLocationRelativeTo(null);
        LlenarCombobox();
        LlenarTablaScore();
        LlenarSpiners();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ComboBoxEquipos1 = new javax.swing.JComboBox<>();
        ComboBoxEquipos2 = new javax.swing.JComboBox<>();
        SpinerLocal = new javax.swing.JSpinner();
        SpinerVisitante = new javax.swing.JSpinner();
        BotonGuardarEquipos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaScore = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ComboBoxEquipos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxEquipos1ActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBoxEquipos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 158, 134, -1));

        getContentPane().add(ComboBoxEquipos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 198, 134, -1));
        getContentPane().add(SpinerLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 158, -1, -1));
        getContentPane().add(SpinerVisitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 198, -1, -1));

        BotonGuardarEquipos.setText("Guardar");
        BotonGuardarEquipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonGuardarEquiposMouseClicked(evt);
            }
        });
        getContentPane().add(BotonGuardarEquipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, 80, 30));

        TablaScore.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Fecha", "E.Local", "Gol(Local)", "Gol(Vista)", "E.Visitan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaScore);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 158, -1, 309));

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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 520, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("REGISTRO DE PARTIDOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Informacion del partido");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 121, -1, -1));

        jCalendar1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendar1PropertyChange(evt);
            }
        });
        getContentPane().add(jCalendar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 278, 394, 221));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Equipos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 121, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Goles");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 121, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Fecha");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 239, -1, -1));
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 238, 142, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\abedu\\Desktop\\Proyect prueba\\src\\main\\java\\Imagenes\\imagen-de-destaque-que-es-el-futbol1.jpg")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void LlenarSpiners(){
        SpinnerNumberModel spinnerModel1 = new SpinnerNumberModel(0, 0, null, 1);
         SpinnerNumberModel spinnerModel2 = new SpinnerNumberModel(0, 0, null, 1);
        SpinerLocal.setModel(spinnerModel1);
        SpinerVisitante.setModel(spinnerModel2);
   
    }
    
    public void LlenarTablaScore(){
ArrayList<Object[]> DatosTabla = archivo.LeerPartidos();
    DefaultTableModel modeloTabla = (DefaultTableModel) TablaScore.getModel();
    modeloTabla.setNumRows(0);

    // Ordenar los datos en base a la fecha
    DatosTabla.sort(new Comparator<Object[]>() {
        private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        @Override
        public int compare(Object[] linea1, Object[] linea2) {
            String fecha1 = linea1[0].toString(); // Consideramos que la fecha se encuentra en la primera columna
            String fecha2 = linea2[0].toString();

            try {
                Date date1 = dateFormat.parse(fecha1);
                Date date2 = dateFormat.parse(fecha2);
                return -date1.compareTo(date2); // Invertimos el resultado para tener la fecha más reciente en la parte superior
            } catch (ParseException e) {
                e.printStackTrace();
            }

            return 0;
        }
    });

    // Agregar los datos ordenados a la tabla
    for (Object[] linea : DatosTabla) {
        modeloTabla.addRow(linea);
    }
}

// Comparador personalizado para fechas en formato "dd/MM/yyyy"
class FechaComparator implements Comparator<Object> {
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public int compare(Object o1, Object o2) {
        String fecha1 = o1.toString();
        String fecha2 = o2.toString();

        try {
            Date date1 = dateFormat.parse(fecha1);
            Date date2 = dateFormat.parse(fecha2);
            return date1.compareTo(date2);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return 0;
    }  
}
    public void LlenarCombobox(){
        ArrayList<Object[]> ComboBoxTabla = archivo.leer();
        
DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
DefaultComboBoxModel<String> comboBoxModel2 = new DefaultComboBoxModel<>();
for(Object[] i: ComboBoxTabla){
    // Accede a la propiedad "nombre" del objeto y conviértela a cadena
    String item = i[1].toString(); // Suponiendo que la propiedad se encuentra en la posición 0 del array de objetos
    comboBoxModel.addElement(item);
    comboBoxModel2.addElement(item);
}
ComboBoxEquipos1.setModel(comboBoxModel);
ComboBoxEquipos2.setModel(comboBoxModel2);
     }
    
    
    private void ComboBoxEquipos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxEquipos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxEquipos1ActionPerformed

    private void BotonGuardarEquiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarEquiposMouseClicked
        // TODO add your handling code here:
    String equipoVisitante = (String) ComboBoxEquipos2.getSelectedItem();
    String equipoLocal = (String) ComboBoxEquipos1.getSelectedItem();
    // Verificar si los equipos seleccionados son iguales
    if (equipoVisitante.equals(equipoLocal)) {
        JOptionPane.showMessageDialog(null, "No se pueden seleccionar el mismo Equipo.");
        return;  // Salir del método sin guardar el partido
    }
    
    Partido par1 = new Partido();
  
    par1.setEquipovisitante(equipoVisitante);
    par1.setEquipolocal(equipoLocal);
    par1.setPuntajelocal((Integer) SpinerLocal.getValue());
    par1.setPuntajevisitante((Integer) SpinerVisitante.getValue());
    par1.setFecha((String)txt1.getText());
    //pide fecha
    JOptionPane.showMessageDialog(null, "Partido registrado");
    //Añade la fecha al principio!
    String DatosPartido = par1.getFecha()+";"+
                          par1.getEquipolocal() + ";" + par1.getPuntajelocal() + ";" +
                          par1.getPuntajevisitante() + ";" + par1.getEquipovisitante() + "\n";
                          
    System.out.println(par1.getFecha()+";"+
                       par1.getEquipovisitante() + ";" + par1.getEquipolocal() + ";" +
                       par1.getPuntajelocal() + ";" + par1.getPuntajevisitante());
                       
    archivo.guardarPartido(DatosPartido);
    LlenarTablaScore();
    }//GEN-LAST:event_BotonGuardarEquiposMouseClicked

    
    
    
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        MenuPrincipal frame=new MenuPrincipal();
        
        frame.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCalendar1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendar1PropertyChange
        if (evt.getOldValue()!= null ){
            SimpleDateFormat ff = new SimpleDateFormat("dd/MM/yyyy");
            txt1.setText(ff.format(jCalendar1.getCalendar().getTime()));

        }
    }//GEN-LAST:event_jCalendar1PropertyChange
    
    
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
            java.util.logging.Logger.getLogger(MenuEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuEquipos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGuardarEquipos;
    private javax.swing.JComboBox<String> ComboBoxEquipos1;
    private javax.swing.JComboBox<String> ComboBoxEquipos2;
    private javax.swing.JSpinner SpinerLocal;
    private javax.swing.JSpinner SpinerVisitante;
    private javax.swing.JTable TablaScore;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt1;
    // End of variables declaration//GEN-END:variables
}
