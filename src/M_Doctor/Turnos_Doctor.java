/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M_Doctor;

import Comportamientos.Atendido_Paciente;
import M_Recepcionista.Crud_Doctor;
import clases.Atendido;
import clases.Generar_T;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class Turnos_Doctor extends javax.swing.JFrame {

    /**
     * Creates new form Turnos_Doctor
     */
    Atendido_Paciente atp = new Atendido_Paciente();

    public Turnos_Doctor() {
        initComponents();
        TxtNturno.setEnabled(false);
        Txtcedulapac.setEnabled(false);
        TxtApellidoPac.setEnabled(false);
        TxtNombrePac.setEnabled(false);
        TxtCed.setEnabled(false);
        Combo_Horario.setEnabled(false);
        DateTurno.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaturnosDoc = new javax.swing.JTable();
        BtnBuscarTP = new javax.swing.JButton();
        TxtcedulaDoc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        BtnSalirCrudDoc = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Txtcedulapac = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtApellidoPac = new javax.swing.JTextField();
        TxtNombrePac = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        DateTurno = new com.toedter.calendar.JDateChooser();
        BtnGenerarCambios = new javax.swing.JButton();
        BtnCancelarTurno = new javax.swing.JButton();
        BtnRegresarTurno = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        Combo_Horario = new javax.swing.JComboBox<>();
        TxtNturno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Combo_EstadoAT = new javax.swing.JComboBox<>();
        TxtCed = new javax.swing.JTextField();
        BtnLimpiar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaturnosDoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N Turno", "Cedula", "Apellido", "Nombre", "Cedula Doctor", "Horario", "Fecha"
            }
        ));
        TablaturnosDoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaturnosDocMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaturnosDoc);

        BtnBuscarTP.setText("Buscar");
        BtnBuscarTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarTPActionPerformed(evt);
            }
        });

        TxtcedulaDoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtcedulaDocKeyTyped(evt);
            }
        });

        jLabel1.setText("Ingrese su cedula para consultar los turnos asignados.");

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("TURNOS ASIGNADOS");

        BtnSalirCrudDoc.setText("Salir");
        BtnSalirCrudDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirCrudDocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(258, 258, 258)
                .addComponent(BtnSalirCrudDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(BtnSalirCrudDoc)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Turno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Paciente cedula: ");

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
        jLabel8.setText("Cedula Doctor: ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Fecha:");

        BtnGenerarCambios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnGenerarCambios.setText("Generar");
        BtnGenerarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGenerarCambiosActionPerformed(evt);
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

        TxtNturno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNturnoActionPerformed(evt);
            }
        });
        TxtNturno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNturnoKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("N Turno");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Estado  Turno: ");

        Combo_EstadoAT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Atendido", "No asistió", "Emergencia" }));
        Combo_EstadoAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo_EstadoATActionPerformed(evt);
            }
        });

        TxtCed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCedKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(BtnGenerarCambios)
                .addGap(28, 28, 28)
                .addComponent(BtnCancelarTurno)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4)
                            .addComponent(jLabel13)
                            .addComponent(jLabel10))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtNturno, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BtnRegresarTurno)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Txtcedulapac, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DateTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtNombrePac)
                            .addComponent(Combo_Horario, javax.swing.GroupLayout.Alignment.TRAILING, 0, 181, Short.MAX_VALUE)
                            .addComponent(TxtApellidoPac)
                            .addComponent(Combo_EstadoAT, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtCed))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNturno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txtcedulapac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtApellidoPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNombrePac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TxtCed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(Combo_Horario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DateTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Combo_EstadoAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGenerarCambios)
                    .addComponent(BtnCancelarTurno)
                    .addComponent(BtnRegresarTurno))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        jButton1.setText("Resgitro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(TxtcedulaDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(BtnBuscarTP)))
                        .addGap(18, 18, 18)
                        .addComponent(BtnLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addContainerGap(191, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtcedulaDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnBuscarTP)
                            .addComponent(BtnLimpiar)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(553, 553, 553))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void RealizarAtendidoTurno() {

        Atendido_Paciente turnoAT = new Atendido_Paciente();
        turnoAT.setTurno(TxtNturno.getText());
        turnoAT.setCedula(Txtcedulapac.getText());
        turnoAT.setApellido(TxtApellidoPac.getText());
        turnoAT.setNombre(TxtNombrePac.getText());
        turnoAT.setCedula_doc(TxtCed.getText());
        turnoAT.setHorario(Combo_Horario.getSelectedItem().toString());
        turnoAT.setFecha(((JTextField) DateTurno.getDateEditor().getUiComponent()).getText());
        turnoAT.setAtendido(Combo_EstadoAT.getSelectedItem().toString());
        if (turnoAT.Guardar_Cambios()) {
            System.out.println("Conexion Exitosa");
            JOptionPane.showMessageDialog(null, "Datos guardados, correctamente.");
        } else {
            System.out.println("Conexion Erronea");
        }
    }

    private void cargarTabla() {
        DefaultTableModel tblModelo = (DefaultTableModel) TablaturnosDoc.getModel();

        tblModelo.setNumRows(0);
        List<Atendido> listaturnos = atp.Tabla_Turnos_p();

        listaturnos.stream().forEach(p -> {
            String[] turnos = {p.getTurno(), p.getCedula(), p.getApellido(), p.getNombre(), p.getCedula_doc(), p.getHorario(), p.getFecha()};
            tblModelo.addRow(turnos);
        });
        // limpiarCampos();
    }

    private void Buscar_turnoDoct() {
        DefaultTableModel tblModelo = (DefaultTableModel) TablaturnosDoc.getModel();

        tblModelo.setNumRows(0);
        List<Atendido> listaturnos = atp.consulta_TurnosDoc(TxtcedulaDoc.getText());

        listaturnos.stream().forEach(p -> {
            String[] turnos = {p.getTurno(), p.getCedula(), p.getApellido(), p.getNombre(), p.getCedula_doc(), p.getHorario(), p.getFecha()};
            tblModelo.addRow(turnos);
        });
        // limpiarCampos();
    }
    private void BtnBuscarTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarTPActionPerformed

        if (!(TxtcedulaDoc.getText().matches("^\\d{10}$"))) {
            JOptionPane.showMessageDialog(null, "No esta ingresado los 10 dijitos, verifique.");
        } else {
            Buscar_turnoDoct();
            TxtcedulaDoc.setText("");
        }

    }//GEN-LAST:event_BtnBuscarTPActionPerformed

    private void BtnSalirCrudDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirCrudDocActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(this, "Estas seguro que deseas salir del crud de paciente.", "Confirma", JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.YES_OPTION) {
//            sdf ni = new sdf();
//            ni.setVisible(true);
//            dispose();
//            //            Menu_Recepcionista mrep = new Menu_Recepcionista();
//            //            mrep.setVisible(true);
//            //            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Sesión cancelada.");
        }
    }//GEN-LAST:event_BtnSalirCrudDocActionPerformed

    private void TxtcedulapacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtcedulapacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtcedulapacActionPerformed

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

    private void TxtApellidoPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtApellidoPacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtApellidoPacActionPerformed

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

    private void BtnGenerarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGenerarCambiosActionPerformed

        if (Txtcedulapac.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione el turno con la cedula de paciente para guardar los cambios.");

        } else {

            if (Combo_EstadoAT.getSelectedItem().toString().equals("Seleccione")) {
                JOptionPane.showMessageDialog(null, "Seleccione el estado de turno para el paciente " + TxtApellidoPac.getText() + " " + TxtNombrePac.getText());

            } else {
                String s = (((JTextField) DateTurno.getDateEditor().getUiComponent()).getText());
                String turn = atp.verificoTurno(TxtNturno.getText(), s);
                if (turn.equals("error")) {
                    JOptionPane.showMessageDialog(null, "Error el turno ya fue registrado");
                    limpiar_d();

                } else {
                    RealizarAtendidoTurno();
                    limpiar_d();
                }
            }
        }


    }//GEN-LAST:event_BtnGenerarCambiosActionPerformed

    public void limpiar_d() {
        TxtNturno.setText("");
        Txtcedulapac.setText("");
        TxtApellidoPac.setText("");
        TxtNombrePac.setText("");
        TxtCed.setText("");
        Combo_Horario.setSelectedItem("Seleccione");
        TxtcedulaDoc.setText("");
        Combo_EstadoAT.setSelectedItem("Seleccione");
        ((JTextField) DateTurno.getDateEditor().getUiComponent()).setText(null);
    }
    private void BtnCancelarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarTurnoActionPerformed
        // limpiar_d();        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCancelarTurnoActionPerformed

    private void BtnRegresarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarTurnoActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(this, "Estas seguro que deseas salir del crud de doctor.", "Confirma", JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.YES_OPTION) {
//            Menu_Recepcionista mrr = new Menu_Recepcionista();
//            mrr.setVisible(true);
//            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Sesión cancelada.");
        }
    }//GEN-LAST:event_BtnRegresarTurnoActionPerformed

    private void Combo_HorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo_HorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Combo_HorarioActionPerformed

    private void TxtNturnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNturnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNturnoActionPerformed

    private void TxtNturnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNturnoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNturnoKeyTyped

    private void Combo_EstadoATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo_EstadoATActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Combo_EstadoATActionPerformed

    private void TablaturnosDocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaturnosDocMouseClicked
        // TODO add your handling code here:
        int i = TablaturnosDoc.getSelectedRow();

        if (i >= 0) {
            String nturno = TablaturnosDoc.getValueAt(i, 0).toString();
            String cedula = TablaturnosDoc.getValueAt(i, 1).toString();
            String apellido = TablaturnosDoc.getValueAt(i, 2).toString();
            String nombre = TablaturnosDoc.getValueAt(i, 3).toString();
            String cedulada = TablaturnosDoc.getValueAt(i, 4).toString();
            String horario = TablaturnosDoc.getValueAt(i, 5).toString();

            TxtNturno.setText(nturno);
            Txtcedulapac.setText(cedula);
            TxtApellidoPac.setText(apellido);
            TxtNombrePac.setText(nombre);
            TxtCed.setText(cedulada);
            Combo_Horario.setSelectedItem(horario);
            String fecha = (String) TablaturnosDoc.getValueAt(i, 6);
            Date fechas;
            try {
                fechas = new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
                DateTurno.setDate(fechas);

            } catch (ParseException ex) {
                Logger.getLogger(Turnos_Doctor.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

        } else {

        }
    }//GEN-LAST:event_TablaturnosDocMouseClicked

    private void TxtCedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCedKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCedKeyTyped

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar_d();
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Turno_Base_Datos bd = new Turno_Base_Datos();
        bd.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void TxtcedulaDocKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtcedulaDocKeyTyped
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
    }//GEN-LAST:event_TxtcedulaDocKeyTyped

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
            java.util.logging.Logger.getLogger(Turnos_Doctor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Turnos_Doctor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Turnos_Doctor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Turnos_Doctor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Turnos_Doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscarTP;
    private javax.swing.JButton BtnCancelarTurno;
    private javax.swing.JButton BtnGenerarCambios;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnRegresarTurno;
    private javax.swing.JButton BtnSalirCrudDoc;
    private javax.swing.JComboBox<String> Combo_EstadoAT;
    private javax.swing.JComboBox<String> Combo_Horario;
    private com.toedter.calendar.JDateChooser DateTurno;
    private javax.swing.JTable TablaturnosDoc;
    private javax.swing.JTextField TxtApellidoPac;
    private javax.swing.JTextField TxtCed;
    private javax.swing.JTextField TxtNombrePac;
    private javax.swing.JTextField TxtNturno;
    private javax.swing.JTextField TxtcedulaDoc;
    private javax.swing.JTextField Txtcedulapac;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}