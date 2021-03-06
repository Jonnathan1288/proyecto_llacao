/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M_Recepcionista;

import Comportamientos.GenerarTurno;
import clases.Generar_T;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class Generar_Turno extends javax.swing.JFrame {

    /**
     * Creates new form Generar_Turno
     */
    GenerarTurno gt = new GenerarTurno();

    public Generar_Turno() {
        initComponents();
        gt.cargarDoctores(Combo_Doctor, Combo_ceduladoc);
        cargarTabla();
        BtnEliminarTurno.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Txtcedulapac = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtApellidoPac = new javax.swing.JTextField();
        TxtNombrePac = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Combo_Doctor = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        DateTurno = new com.toedter.calendar.JDateChooser();
        BtnGenerarTurno = new javax.swing.JButton();
        BtnCancelarTurno = new javax.swing.JButton();
        BtnRegresarTurno = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        Combo_Horario = new javax.swing.JComboBox<>();
        Combo_ceduladoc = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablaturnos = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        TxtBuscarPacienteLista = new javax.swing.JTextField();
        BtnBuscarPaLista = new javax.swing.JButton();
        BtnEliminarTurno = new javax.swing.JButton();
        Registros = new javax.swing.JButton();
        Registros1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Turno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Ingrese la cedula: ");

        Txtcedulapac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtcedulapacActionPerformed(evt);
            }
        });
        Txtcedulapac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtcedulapacKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Apellido: ");

        TxtApellidoPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtApellidoPacActionPerformed(evt);
            }
        });
        TxtApellidoPac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtApellidoPacKeyTyped(evt);
            }
        });

        TxtNombrePac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNombrePacKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Nombre");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Nombre Doctor: ");

        Combo_Doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo_DoctorActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Fecha:");

        BtnGenerarTurno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnGenerarTurno.setText("Generar");
        BtnGenerarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGenerarTurnoActionPerformed(evt);
            }
        });

        BtnCancelarTurno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnCancelarTurno.setForeground(new java.awt.Color(255, 0, 0));
        BtnCancelarTurno.setText("Cancelar");
        BtnCancelarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarTurnoActionPerformed(evt);
            }
        });

        BtnRegresarTurno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnRegresarTurno.setText("Regresar");
        BtnRegresarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarTurnoActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Horario: ");

        Combo_Horario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "8 am - 8:59 am", "9 am - 9:59 am", "10 am - 10:59 am", "11 am - 11:59 am", "12 pm - 12:59 pm", "14 pm - 14:59 pm", "15 pm - 15:59 pm", "16 pm - 16:59 pm", " " }));
        Combo_Horario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo_HorarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txtcedulapac, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(DateTurno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TxtNombrePac, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Combo_Horario, 0, 181, Short.MAX_VALUE))
                            .addComponent(TxtApellidoPac, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Combo_Doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Combo_ceduladoc, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnGenerarTurno)
                        .addGap(28, 28, 28)
                        .addComponent(BtnCancelarTurno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                        .addComponent(BtnRegresarTurno)
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Txtcedulapac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtApellidoPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TxtNombrePac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Combo_Doctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Combo_ceduladoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Combo_Horario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(DateTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnGenerarTurno)
                            .addComponent(BtnCancelarTurno)
                            .addComponent(BtnRegresarTurno)))
                    .addComponent(jLabel9))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Generar turnos para pacientes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(500, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(485, 485, 485))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de turnos"));

        Tablaturnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "N Turno", "Cedula", "Apellido", "Nombre", "Cedula Doctor", "Horario", "Fecha"
            }
        ));
        Tablaturnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaturnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tablaturnos);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Ingrese la cedula: ");

        BtnBuscarPaLista.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnBuscarPaLista.setText("Buscar");
        BtnBuscarPaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarPaListaActionPerformed(evt);
            }
        });

        BtnEliminarTurno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnEliminarTurno.setText("Eliminar");
        BtnEliminarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarTurnoActionPerformed(evt);
            }
        });

        Registros.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Registros.setText("Registros");
        Registros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrosActionPerformed(evt);
            }
        });

        Registros1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Registros1.setText("Limpiar");
        Registros1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Registros1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtBuscarPacienteLista, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnBuscarPaLista)
                .addGap(18, 18, 18)
                .addComponent(Registros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Registros1)
                .addGap(18, 18, 18)
                .addComponent(BtnEliminarTurno))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TxtBuscarPacienteLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscarPaLista)
                    .addComponent(BtnEliminarTurno)
                    .addComponent(Registros)
                    .addComponent(Registros1))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarTabla() {
        DefaultTableModel tblModelo = (DefaultTableModel) Tablaturnos.getModel();

        tblModelo.setNumRows(0);
        List<Generar_T> listaturnos = gt.Tabla_Turnos();

        listaturnos.stream().forEach(p -> {
            String[] turnos = {p.getTurno(), p.getCedula(), p.getApellido(), p.getNombre(), p.getCedula_doc(), p.getHorario(), p.getFecha()};
            tblModelo.addRow(turnos);
        });
    }

    private void Buscar_turno() {
        DefaultTableModel tblModelo = (DefaultTableModel) Tablaturnos.getModel();

        tblModelo.setNumRows(0);
        List<Generar_T> listaturnos = gt.consulta_Turno(TxtBuscarPacienteLista.getText());

        listaturnos.stream().forEach(p -> {
            String[] turnos = {p.getTurno(), p.getCedula(), p.getApellido(), p.getNombre(), p.getCedula_doc(), p.getHorario(), p.getFecha()};
            tblModelo.addRow(turnos);
        });
    }

    public void RealizarTurno() {

        GenerarTurno turno = new GenerarTurno();
        turno.setCedula(Txtcedulapac.getText());
        turno.setApellido(TxtApellidoPac.getText());
        turno.setNombre(TxtNombrePac.getText());
        turno.setCedula_doc(Combo_ceduladoc.getSelectedItem().toString());
        turno.setHorario(Combo_Horario.getSelectedItem().toString());
        turno.setFecha(((JTextField) DateTurno.getDateEditor().getUiComponent()).getText());
        if (turno.GenerarTurno()) {
            System.out.println("Conexion Exitosa");
        } else {
            System.out.println("Conexion Erronea");
        }
    }
    private void BtnCancelarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarTurnoActionPerformed
        limpiar_d();        // TODO add your handling code here:

    }//GEN-LAST:event_BtnCancelarTurnoActionPerformed

    private void BtnEliminarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarTurnoActionPerformed
        // TODO add your handling code here:

        int con = JOptionPane.showConfirmDialog(this, "Esta seguro de eliminar los registros del d??a?", "Elimina", JOptionPane.YES_NO_OPTION);
        if (con == JOptionPane.YES_OPTION) {
            String n = "turno";
            
            if (gt.truncateTablaT(n)) {
                JOptionPane.showMessageDialog(null, "Ahora puede generar mas turnos.");
                cargarTabla();
                BtnEliminarTurno.setEnabled(false);
            }
        }
        if(con == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Tenga en cuenta que no se va poder implementar mas turnos en este d??a.");
        }


    }//GEN-LAST:event_BtnEliminarTurnoActionPerformed

    private void BtnRegresarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarTurnoActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(this, "Estas seguro que deseas salir del crud de doctor.", "Confirma", JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.YES_OPTION) {
            Menu_Recepcionista mrr = new Menu_Recepcionista();
            mrr.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Sesi??n cancelada.");
        }
    }//GEN-LAST:event_BtnRegresarTurnoActionPerformed

    private void TxtApellidoPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtApellidoPacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtApellidoPacActionPerformed

    private void TxtcedulapacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtcedulapacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtcedulapacActionPerformed

    private void Combo_DoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo_DoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Combo_DoctorActionPerformed

    private void Combo_HorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo_HorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Combo_HorarioActionPerformed

    private void BtnGenerarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGenerarTurnoActionPerformed
        // TO
        Date fechat = DateTurno.getDate();
        if (!(Txtcedulapac.getText().matches("^\\d{10}$"))) {
            JOptionPane.showMessageDialog(null, "Verifique la cedula.");
        } else {
            if (!(TxtApellidoPac.getText().matches("^[A-Z].{3,25}$"))) {
                // !()
                JOptionPane.showMessageDialog(null, "Verifique el apellido.");
            } else {
                if (!(TxtNombrePac.getText().matches("^[A-Z].{3,25}$"))) {
                    JOptionPane.showMessageDialog(null, "Verifique el nombre.");
                } else {
                    if (Combo_ceduladoc.getSelectedItem().toString().equals("Cedula")) {
                        JOptionPane.showMessageDialog(null, "Verifique seleccionar la cedula de doctor.");
                    } else {
                        if (fechat == null) {
                            JOptionPane.showMessageDialog(null, "Ingrese la fecha por favor.");
                        } else {
                            if (Combo_Horario.getSelectedItem().toString().equals("Seleccione")) {
                                JOptionPane.showMessageDialog(null, "Debe seleccionar una hora para el turno.");
                            } else {
                                String nu = "4";
                                String conta = gt.denegarturno(nu);
                                if (conta.equals("verdad")) {
                                    JOptionPane.showMessageDialog(null, "Error a alcanzado el numero de turnos diarios.");
                                    limpiar_d();
                                    BtnEliminarTurno.setEnabled(true);
                                } else {

                                    String generoT = gt.Validar_usuarioParaTURNO(Txtcedulapac.getText(), TxtApellidoPac.getText(), TxtNombrePac.getText());
                                    if (generoT.equals("correcto")) {//aqui
                                        RealizarTurno();
                                        cargarTabla();
                                        limpiar_d();
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Verifique si el usuario dio bien sus datos, caso contrario el paciente no esta registrado.");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_BtnGenerarTurnoActionPerformed

    private void BtnBuscarPaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarPaListaActionPerformed
        // TODO add your handling code here:
        Buscar_turno();
    }//GEN-LAST:event_BtnBuscarPaListaActionPerformed

    private void RegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrosActionPerformed
        // TODO add your handling code here:
        cargarTabla();
    }//GEN-LAST:event_RegistrosActionPerformed

    private void Registros1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Registros1ActionPerformed
        // TODO add your handling code here:
        limpiar_d();

    }//GEN-LAST:event_Registros1ActionPerformed

    private void TxtcedulapacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtcedulapacKeyTyped
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
    }//GEN-LAST:event_TxtcedulapacKeyTyped

    private void TxtApellidoPacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtApellidoPacKeyTyped
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
    }//GEN-LAST:event_TxtApellidoPacKeyTyped

    private void TxtNombrePacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNombrePacKeyTyped
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
    }//GEN-LAST:event_TxtNombrePacKeyTyped

    private void TablaturnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaturnosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TablaturnosMouseClicked

    public void limpiar_d() {
        Txtcedulapac.setText("");
        TxtApellidoPac.setText("");
        TxtNombrePac.setText("");
        Combo_Horario.setSelectedItem("Seleccione");
        Combo_Doctor.setSelectedItem("Nombre");
        Combo_ceduladoc.setSelectedItem("Cedula");
        ((JTextField) DateTurno.getDateEditor().getUiComponent()).setText(null);
    }

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
            java.util.logging.Logger.getLogger(Generar_Turno.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Generar_Turno.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Generar_Turno.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Generar_Turno.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Generar_Turno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscarPaLista;
    private javax.swing.JButton BtnCancelarTurno;
    private javax.swing.JButton BtnEliminarTurno;
    private javax.swing.JButton BtnGenerarTurno;
    private javax.swing.JButton BtnRegresarTurno;
    private javax.swing.JComboBox<String> Combo_Doctor;
    private javax.swing.JComboBox<String> Combo_Horario;
    private javax.swing.JComboBox<String> Combo_ceduladoc;
    private com.toedter.calendar.JDateChooser DateTurno;
    private javax.swing.JButton Registros;
    private javax.swing.JButton Registros1;
    private javax.swing.JTable Tablaturnos;
    private javax.swing.JTextField TxtApellidoPac;
    private javax.swing.JTextField TxtBuscarPacienteLista;
    private javax.swing.JTextField TxtNombrePac;
    private javax.swing.JTextField Txtcedulapac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
