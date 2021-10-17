/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comportamientos;

import Conexion_BD.Conexion;
import clases.Atendido;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class Atendido_Paciente extends Atendido {

    Conexion conet = new Conexion();

    public List<Atendido> Tabla_Turnos_p() {
        String sql = "select * from turno;";
        ResultSet rs = conet.selectConsulta(sql);
        List<Atendido> lp = new ArrayList<>();

        try {
            while (rs.next()) {
                Atendido turno = new Atendido();
                turno.setTurno(rs.getString("id_turno"));
                turno.setCedula(rs.getString("cedulap"));
                turno.setApellido(rs.getString("apellido"));
                turno.setNombre(rs.getString("nombre"));
                turno.setCedula_doc(rs.getString("cedulad"));
                turno.setHorario(rs.getString("horario"));
                turno.setFecha(rs.getString("fecha"));
                lp.add(turno);
            }
            rs.close();
            return lp;
        } catch (SQLException ex) {
            Logger.getLogger(Atendido_Paciente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<Atendido> consulta_TurnosDoc(String cedula) {
        String sql = "select id_turno, cedulap, apellido, nombre, cedulad, horario, fecha from turno where cedulad='" + cedula + "';";
        ResultSet rs = conet.selectConsulta(sql);
        List<Atendido> lp = new ArrayList<>();

        try {
            while (rs.next()) {
                Atendido turno = new Atendido();
                turno.setTurno(rs.getString("id_turno"));
                turno.setCedula(rs.getString("cedulap"));
                turno.setApellido(rs.getString("apellido"));
                turno.setNombre(rs.getString("nombre"));
                turno.setCedula_doc(rs.getString("cedulad"));
                turno.setHorario(rs.getString("horario"));
                turno.setFecha(rs.getString("fecha"));
                lp.add(turno);
            }
            rs.close();
            return lp;
        } catch (SQLException ex) {
            Logger.getLogger(Atendido_Paciente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean Guardar_Cambios() {
        //to_date('"+getfecha_nacimiento()+"','yyyy-MM-dd')
        String sql = "INSERT INTO public.turno_respaldo(\n"
                + "	numero_turn, cedulap, apellido, nombre, cedulad, horario, fecha, estado)\n"
                + "	VALUES ('" + getTurno() + "', '" + getCedula() + "', '" + getApellido() + "', '" + getNombre() + "', '" + getCedula_doc() + "', '" + getHorario() + "', '" + getFecha() + "', '" + getAtendido() + "');";

        System.out.println(sql);
        return conet.InsertUpdateDeleteAcciones(sql);
    }
    
    public List<Atendido> Tabla_BDTurno() {
        String sql = "select * from turno_respaldo;";
        ResultSet rs = conet.selectConsulta(sql);
        List<Atendido> lp = new ArrayList<>();

        try {
            while (rs.next()) {
                Atendido turno = new Atendido();
                turno.setId_turn(rs.getString("id_tur"));
                turno.setTurno(rs.getString("numero_turn"));
                turno.setCedula(rs.getString("cedulap"));
                turno.setApellido(rs.getString("apellido"));
                turno.setNombre(rs.getString("nombre"));
                turno.setCedula_doc(rs.getString("cedulad"));
                turno.setHorario(rs.getString("horario"));
                turno.setFecha(rs.getString("fecha"));
                turno.setAtendido(rs.getString("estado"));
                lp.add(turno);
            }
            rs.close();
            return lp;
        } catch (SQLException ex) {
            Logger.getLogger(Atendido_Paciente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
    public List<Atendido> Tabla_BDTurnoBUSCAR(String cedula) {
        String sql = "select * from turno_respaldo where cedulap='"+cedula+"';";
        ResultSet rs = conet.selectConsulta(sql);
        List<Atendido> lp = new ArrayList<>();

        try {
            while (rs.next()) {
                Atendido turno = new Atendido();
                turno.setId_turn(rs.getString("id_tur"));
                turno.setTurno(rs.getString("numero_turn"));
                turno.setCedula(rs.getString("cedulap"));
                turno.setApellido(rs.getString("apellido"));
                turno.setNombre(rs.getString("nombre"));
                turno.setCedula_doc(rs.getString("cedulad"));
                turno.setHorario(rs.getString("horario"));
                turno.setFecha(rs.getString("fecha"));
                turno.setAtendido(rs.getString("estado"));
                lp.add(turno);
            }
            rs.close();
            return lp;
        } catch (SQLException ex) {
            Logger.getLogger(Atendido_Paciente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public String verificoTurno(String turno, String fecha) {
        String busqueda = null;
        try {
            String sql = "select id_tur from turno_respaldo where numero_turn='"+turno+"' AND fecha ='"+fecha+"';";
            ResultSet rs = conet.selectConsulta(sql);
            if (rs.next()) {
                busqueda = "error";
            } else {
                busqueda = "acceso";
            }
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(Atendido_Paciente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return busqueda;
    }
}
