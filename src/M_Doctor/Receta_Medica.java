/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M_Doctor;

import Comportamientos.IgresarMedicamentos;
import M_Recepcionista.Menu_Doctor;
import M_Recepcionista.Menu_Recepcionista;
import clases.Medicamentos;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class Receta_Medica extends javax.swing.JFrame {
   
    DefaultTableModel model;
    IgresarMedicamentos ingresoMe = new IgresarMedicamentos();
    String cod_medicamento = "";

    /**
     * Creates new form Receta_Medica
     */
    public Receta_Medica() {
        initComponents();
        cargarTablaMedicamento();
    }
    
    public void cargarTablaMedicamento() {
        DefaultTableModel tblModelo = (DefaultTableModel) TablaVisualizar.getModel();

        tblModelo.setNumRows(0);
        List<Medicamentos> listapacientes = ingresoMe.ListMedicamentos();

        listapacientes.stream().forEach(p -> {

            p.getCantidad();
            String can = String.valueOf(p.getCantidad());
            String[] persona = {p.getCodigoM(), p.getNombreM(), can};
            tblModelo.addRow(persona);
        });
       
    }
    
    public void Busqueda_Medicamento() {
        DefaultTableModel tblModelo = (DefaultTableModel) TablaVisualizar.getModel();

        tblModelo.setNumRows(0);
        List<Medicamentos> listaMedicamentos = ingresoMe.consulta_Medicamento(TxtBuscarMedicamentosLista.getText());

        listaMedicamentos.stream().forEach(p -> {
            p.getCantidad();
            String cant = String.valueOf(p.getCantidad());
            String[] persona = {p.getCodigoM(), p.getNombreM(),cant};
            tblModelo.addRow(persona);
        });
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        TxtCedulaPaciente = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        TxtNombreMedico = new javax.swing.JTextField();
        TxtIDdoctor = new javax.swing.JTextField();
        DateRecetaPa = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        BtnGuardarReceta = new javax.swing.JButton();
        BtnCancelarReceta = new javax.swing.JButton();
        BtnRegresarReceta = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaVisualizar = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        TxtBuscarMedicamentosLista = new javax.swing.JTextField();
        BtnBuscarPaLista = new javax.swing.JButton();
        BtnEliminarTurno = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Receta Medica", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Cedula Paciente:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 75, -1, -1));
        jPanel2.add(TxtCedulaPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 25, 179, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Fecha:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 163, -1, -1));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Medicamentos: ");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Prescripcion: ");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 369, -1, -1));
        jPanel2.add(TxtNombreMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 73, 179, -1));
        jPanel2.add(TxtIDdoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 118, 179, -1));
        jPanel2.add(DateRecetaPa, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 163, 179, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 214, 348, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 334, 348, -1));

        BtnGuardarReceta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnGuardarReceta.setText("Guardar");
        BtnGuardarReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarRecetaActionPerformed(evt);
            }
        });
        jPanel2.add(BtnGuardarReceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 438, -1, -1));

        BtnCancelarReceta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnCancelarReceta.setForeground(new java.awt.Color(255, 0, 0));
        BtnCancelarReceta.setText("Cancelar");
        BtnCancelarReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarRecetaActionPerformed(evt);
            }
        });
        jPanel2.add(BtnCancelarReceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 438, -1, -1));

        BtnRegresarReceta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnRegresarReceta.setText("Regresar");
        jPanel2.add(BtnRegresarReceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 438, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Nombre Paciente: ");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 120, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Nombre Medico: ");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 27, -1, -1));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Medicamentos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        TablaVisualizar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Cantidad"
            }
        ));
        jScrollPane3.setViewportView(TablaVisualizar);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Ingrese la Nombre: ");

        TxtBuscarMedicamentosLista.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtBuscarMedicamentosListaKeyTyped(evt);
            }
        });

        BtnBuscarPaLista.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnBuscarPaLista.setText("Buscar");
        BtnBuscarPaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarPaListaActionPerformed(evt);
            }
        });

        BtnEliminarTurno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnEliminarTurno.setText("Visualizar ");
        BtnEliminarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarTurnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(TxtBuscarMedicamentosLista, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(BtnBuscarPaLista)
                .addGap(18, 18, 18)
                .addComponent(BtnEliminarTurno)
                .addContainerGap(76, Short.MAX_VALUE))
            .addComponent(jScrollPane3)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(TxtBuscarMedicamentosLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscarPaLista)
                    .addComponent(BtnEliminarTurno))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel13.setFont(new java.awt.Font("Bell MT", 3, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Receta Medica");

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(465, 465, 465)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCancelarRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarRecetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCancelarRecetaActionPerformed

    private void BtnEliminarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarTurnoActionPerformed
        cargarTablaMedicamento();
    }//GEN-LAST:event_BtnEliminarTurnoActionPerformed

    private void BtnBuscarPaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarPaListaActionPerformed
           if (!(TxtBuscarMedicamentosLista.getText().equals(""))) {
            Busqueda_Medicamento();
        } else {
            JOptionPane.showMessageDialog(null, "Por favor debe ingresar la cedula en el campo, para realizar la consulta.", "Precaución  ", JOptionPane.WARNING_MESSAGE);
        }
        TxtBuscarMedicamentosLista.setText("");
    }//GEN-LAST:event_BtnBuscarPaListaActionPerformed

    private void BtnGuardarRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarRecetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnGuardarRecetaActionPerformed

    private void TxtBuscarMedicamentosListaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtBuscarMedicamentosListaKeyTyped
        
    }//GEN-LAST:event_TxtBuscarMedicamentosListaKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu_Doctor md=new Menu_Doctor();
        md.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Receta_Medica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Receta_Medica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Receta_Medica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Receta_Medica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Receta_Medica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscarPaLista;
    private javax.swing.JButton BtnCancelarReceta;
    private javax.swing.JButton BtnEliminarTurno;
    private javax.swing.JButton BtnGuardarReceta;
    private javax.swing.JButton BtnRegresarReceta;
    private com.toedter.calendar.JDateChooser DateRecetaPa;
    private javax.swing.JTable TablaVisualizar;
    private javax.swing.JTextField TxtBuscarMedicamentosLista;
    private javax.swing.JTextField TxtCedulaPaciente;
    private javax.swing.JTextField TxtIDdoctor;
    private javax.swing.JTextField TxtNombreMedico;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
