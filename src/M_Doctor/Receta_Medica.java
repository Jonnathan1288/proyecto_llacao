/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M_Doctor;

import Comportamientos.IgresarMedicamentos;
import Comportamientos.Receta_medica;
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
            String[] persona = {p.getCodigoM(), p.getNombreM(), cant};
            tblModelo.addRow(persona);
        });
    }

    public void CrearRecetaMedica() {

        Receta_medica rm = new Receta_medica();
        rm.setApellido(Apellido_Pac.getText());
        rm.setNombre(Nombre_Pac.getText());
        rm.setId_diagnostico(Id_pac.getText());
        rm.setMedicamentos(TxtMedicamentos.getText());
        rm.setPrescripcion(TxtPrescripcion.getText());
        if (rm.IngreserRecetaMedica()) {
            System.out.println("Conexion Exitosa");
            JOptionPane.showMessageDialog(null, "La receta medica se cargo junto al diagnostico correctamente.");
        } else {
            System.out.println("Conexion Erronea");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Apellido_Pac = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtMedicamentos = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtPrescripcion = new javax.swing.JTextArea();
        BtnGuardarReceta = new javax.swing.JButton();
        BtnCancelarReceta = new javax.swing.JButton();
        BtnRegresarReceta = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Nombre_Pac = new javax.swing.JTextField();
        Id_pac = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaVisualizar = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        TxtBuscarMedicamentosLista = new javax.swing.JTextField();
        BtnBuscarPaLista = new javax.swing.JButton();
        BtnEliminarTurno = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Receta Medica", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Medicamentos: ");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Prescripcion: ");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 369, -1, -1));

        Apellido_Pac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Apellido_PacActionPerformed(evt);
            }
        });
        Apellido_Pac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Apellido_PacKeyTyped(evt);
            }
        });
        jPanel2.add(Apellido_Pac, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 179, -1));

        TxtMedicamentos.setColumns(20);
        TxtMedicamentos.setRows(5);
        jScrollPane1.setViewportView(TxtMedicamentos);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 214, 348, -1));

        TxtPrescripcion.setColumns(20);
        TxtPrescripcion.setRows(5);
        jScrollPane2.setViewportView(TxtPrescripcion);

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

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Apellido Paciente: ");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Id Diagnostico:");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        Nombre_Pac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nombre_PacActionPerformed(evt);
            }
        });
        Nombre_Pac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Nombre_PacKeyTyped(evt);
            }
        });
        jPanel2.add(Nombre_Pac, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 180, -1));

        Id_pac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Id_pacKeyTyped(evt);
            }
        });
        jPanel2.add(Id_pac, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 180, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Nombre Paciente:");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jButton1.setText("Diagnostico");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        jButton2.setText("Receta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Medicamentos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaVisualizar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Cantidad"
            }
        ));
        jScrollPane3.setViewportView(TablaVisualizar);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 99, 746, 377));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Ingrese la Nombre: ");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 38, -1, -1));

        TxtBuscarMedicamentosLista.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtBuscarMedicamentosListaKeyTyped(evt);
            }
        });
        jPanel4.add(TxtBuscarMedicamentosLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 38, 179, -1));

        BtnBuscarPaLista.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnBuscarPaLista.setText("Buscar");
        BtnBuscarPaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarPaListaActionPerformed(evt);
            }
        });
        jPanel4.add(BtnBuscarPaLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 34, -1, -1));

        BtnEliminarTurno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnEliminarTurno.setText("Visualizar ");
        BtnEliminarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarTurnoActionPerformed(evt);
            }
        });
        jPanel4.add(BtnEliminarTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 34, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel13.setFont(new java.awt.Font("Bell MT", 3, 36)); // NOI18N
        jLabel13.setText("Receta Medica");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(465, 465, 465)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        limpiar_datos();
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

        if (!(Apellido_Pac.getText().matches("^[A-Z].{3,25}$"))) {
            // !()
            JOptionPane.showMessageDialog(null, "Ingresa el apellido.");
        } else {
            if (!(Nombre_Pac.getText().matches("^[A-Z].{3,25}$"))) {
                JOptionPane.showMessageDialog(null, "Ingresa el nombre.");
            } else {
                if (Id_pac.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "El campo de id de diagnostico esta vacio.");

                } else {
                    if (TxtMedicamentos.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "El campo de medicamentos esta vacio");

                    } else {
                        if (TxtPrescripcion.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "El campo de prescripciion esta vacio");

                        } else {
                            CrearRecetaMedica();
                            limpiar_datos();
                        }
                    }
                }
            }
        }

        //   int n = JOptionPane.showme
    }//GEN-LAST:event_BtnGuardarRecetaActionPerformed

    public void limpiar_datos() {
        Apellido_Pac.setText("");
        Nombre_Pac.setText("");
        Id_pac.setText("");
        TxtMedicamentos.setText("");
        TxtPrescripcion.setText("");
    }
    private void TxtBuscarMedicamentosListaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtBuscarMedicamentosListaKeyTyped

    }//GEN-LAST:event_TxtBuscarMedicamentosListaKeyTyped

    private void Apellido_PacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Apellido_PacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Apellido_PacActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Nombre_PacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nombre_PacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nombre_PacActionPerformed

    private void Apellido_PacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Apellido_PacKeyTyped
        // TODO add your handling code here:
        char vn = evt.getKeyChar();
        if (Character.isDigit(vn)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo letras");
        }

        if (Character.isLowerCase(vn)) {

            evt.setKeyChar(Character.toUpperCase(vn));
        }
    }//GEN-LAST:event_Apellido_PacKeyTyped

    private void Nombre_PacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nombre_PacKeyTyped
        // TODO add your handling code here:
        char vn = evt.getKeyChar();
        if (Character.isDigit(vn)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo letras");
        }

        if (Character.isLowerCase(vn)) {

            evt.setKeyChar(Character.toUpperCase(vn));
        }
    }//GEN-LAST:event_Nombre_PacKeyTyped

    private void Id_pacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Id_pacKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo numeros por favor.");
        }
    }//GEN-LAST:event_Id_pacKeyTyped

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
            java.util.logging.Logger.getLogger(Receta_Medica.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Receta_Medica.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Receta_Medica.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Receta_Medica.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
    private javax.swing.JTextField Apellido_Pac;
    private javax.swing.JButton BtnBuscarPaLista;
    private javax.swing.JButton BtnCancelarReceta;
    private javax.swing.JButton BtnEliminarTurno;
    private javax.swing.JButton BtnGuardarReceta;
    private javax.swing.JButton BtnRegresarReceta;
    private javax.swing.JTextField Id_pac;
    private javax.swing.JTextField Nombre_Pac;
    private javax.swing.JTable TablaVisualizar;
    private javax.swing.JTextField TxtBuscarMedicamentosLista;
    private javax.swing.JTextArea TxtMedicamentos;
    private javax.swing.JTextArea TxtPrescripcion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
