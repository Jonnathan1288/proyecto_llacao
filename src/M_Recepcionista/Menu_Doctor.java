/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M_Recepcionista;

import M_Doctor.Historial_Clinico;
import M_Doctor.Receta_Medica;
import inicio.Login;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Menu_Doctor extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Doctor
     */
    public Menu_Doctor() {
        initComponents();
         this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRegistrarPacientes1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnRegistrarTurno = new javax.swing.JButton();
        LblDoctor = new javax.swing.JLabel();
        CerrarSeciRep = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/hombre (1).png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 267));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Doctor: ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        btnRegistrarPacientes1.setBackground(new java.awt.Color(51, 51, 51));
        btnRegistrarPacientes1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRegistrarPacientes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/medicina.png"))); // NOI18N
        btnRegistrarPacientes1.setText("Generar Receta Medica");
        btnRegistrarPacientes1.setBorder(null);
        btnRegistrarPacientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPacientes1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistrarPacientes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 380, 53));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reporte (1).png"))); // NOI18N
        jButton2.setText("Visualizar Turnos");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 380, 53));

        btnRegistrarTurno.setBackground(new java.awt.Color(51, 51, 51));
        btnRegistrarTurno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRegistrarTurno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registro.png"))); // NOI18N
        btnRegistrarTurno.setText("Historial Clinico");
        btnRegistrarTurno.setBorder(null);
        btnRegistrarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarTurnoActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistrarTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 380, 53));

        LblDoctor.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel2.add(LblDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 190, 40));

        CerrarSeciRep.setText("CERRAR SESION");
        CerrarSeciRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSeciRepActionPerformed(evt);
            }
        });
        jPanel2.add(CerrarSeciRep, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 862, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu3.setText("Generar Receta");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Hisorial Clinico");
        jMenuBar2.add(jMenu4);

        jMenu1.setText("Diagnostico");
        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarPacientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPacientes1ActionPerformed
    Receta_Medica rc= new Receta_Medica();
    rc.setVisible(true);
    dispose();
    }//GEN-LAST:event_btnRegistrarPacientes1ActionPerformed

    private void btnRegistrarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarTurnoActionPerformed
        Historial_Clinico hc= new Historial_Clinico();
        hc.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegistrarTurnoActionPerformed

    private void CerrarSeciRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSeciRepActionPerformed
        // TODO add your handling code here:
        int salir = JOptionPane.showConfirmDialog(this, "Esta seguro que desea serrar sesion?", "Confirmar para salir ", JOptionPane.YES_NO_OPTION);
        if (salir == JOptionPane.YES_OPTION) {
            Login log = new Login();
            log.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Sesión de salir cancelada");
        }
    }//GEN-LAST:event_CerrarSeciRepActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CerrarSeciRep;
    public javax.swing.JLabel LblDoctor;
    private javax.swing.JButton btnRegistrarPacientes1;
    private javax.swing.JButton btnRegistrarTurno;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
