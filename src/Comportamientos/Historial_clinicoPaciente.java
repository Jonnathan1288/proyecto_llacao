/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comportamientos;

import Conexion_BD.Conexion;
import clases.Doctor;
import clases.Paciente;
import clases.historial_clinico;
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
public class Historial_clinicoPaciente extends historial_clinico {

    Conexion conet = new Conexion();

    public boolean IngreserHistorialPac() {

        //to_date('"+getfecha_nacimiento()+"','yyyy-MM-dd')
        String sql = "INSERT INTO public.historial_clinico(\n"
                + "	cedula_paciente, cedula_doctor, sintomas, diacnostico, fecha_consulta)\n"
                + "	VALUES ('" + getCedula_pa() + "', '" + getCedula_doc() + "', '" + getSintomas() + "', '" + getDiacnostico() + "', '" + getFecha() + "');";
        System.out.println(sql);
        return conet.InsertUpdateDeleteAcciones(sql);
    }

    public List<Paciente> pacientes() {
        String sqlc = "select p.cedula, apellido, nombre, fecha_nacimiento, genero, tipo_sangre, telefono, direccion, id_paciente, alergias, discapacidad from persona p, paciente c where p.cedula=c.cedula;";
        String sql1 = sqlc;
        ResultSet rs = conet.selectConsulta(sql1);
        List<Paciente> lp = new ArrayList<>();

        try {
            while (rs.next()) {
                Paciente miPaciente = new Paciente();
                miPaciente.setCedula(rs.getString("cedula"));
                miPaciente.setApellido(rs.getString("apellido"));
                miPaciente.setNombre(rs.getString("nombre"));
                miPaciente.setFecha_nacimiento(rs.getString("fecha_nacimiento"));
                miPaciente.setGenero(rs.getString("genero"));
                miPaciente.setTipo_sangre(rs.getString("tipo_sangre"));
                miPaciente.setTelefono(rs.getString("telefono"));
                miPaciente.setDireccion(rs.getString("direccion"));
                miPaciente.setId_paciente(rs.getString("id_paciente"));
                miPaciente.setAlergias(rs.getString("alergias"));
                miPaciente.setDiscapacidad(rs.getString("discapacidad"));
                miPaciente.setCedula(rs.getString("cedula"));
                lp.add(miPaciente);
            }
            rs.close();
            return lp;
        } catch (SQLException ex) {
            Logger.getLogger(IngresoPacientes.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<Paciente> consulta_paciente1(String cedula) {
        String sql = "select p.cedula, apellido, nombre, fecha_nacimiento, genero, tipo_sangre, telefono, direccion, id_paciente, alergias, discapacidad from persona p, paciente c where p.cedula=c.cedula and p.cedula='" + cedula + "';";
        ResultSet rs = conet.selectConsulta(sql);
        List<Paciente> lp = new ArrayList<>();

        try {
            while (rs.next()) {
                Paciente miPaciente = new Paciente();
                miPaciente.setCedula(rs.getString("cedula"));
                miPaciente.setApellido(rs.getString("apellido"));
                miPaciente.setNombre(rs.getString("nombre"));
                miPaciente.setFecha_nacimiento(rs.getString("fecha_nacimiento"));
                miPaciente.setGenero(rs.getString("genero"));
                miPaciente.setTipo_sangre(rs.getString("tipo_sangre"));
                miPaciente.setTelefono(rs.getString("telefono"));
                miPaciente.setDireccion(rs.getString("direccion"));
                miPaciente.setId_paciente(rs.getString("id_paciente"));
                miPaciente.setAlergias(rs.getString("alergias"));
                miPaciente.setDiscapacidad(rs.getString("discapacidad"));
                miPaciente.setCedula(rs.getString("cedula"));
                lp.add(miPaciente);
            }
            rs.close();
            return lp;
        } catch (SQLException ex) {
            Logger.getLogger(IngresoPacientes.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<historial_clinico> historialclinicoPac() {
        String sql1 = "select codigo_historial, cedula_paciente, cedula_doctor, sintomas, diacnostico, fecha_consulta from historial_clinico;";
        ResultSet rs = conet.selectConsulta(sql1);
        List<historial_clinico> hc = new ArrayList<>();
        try {
            while (rs.next()) {
                historial_clinico miHC = new historial_clinico();
                miHC.setCodigo_historial(rs.getString("codigo_historial"));
                miHC.setCedula_pa(rs.getString("cedula_paciente"));
                miHC.setCedula_doc(rs.getString("cedula_doctor"));
                miHC.setSintomas(rs.getString("sintomas"));
                miHC.setDiacnostico(rs.getString("diacnostico"));
                miHC.setFecha(rs.getString("fecha_consulta"));
                hc.add(miHC);
            }
            rs.close();
            return hc;
        } catch (SQLException ex) {
            Logger.getLogger(Historial_clinicoPaciente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public List<historial_clinico> consultaHC(String cedula) {
        String sql1 = "select codigo_historial, cedula_paciente, cedula_doctor, sintomas, diacnostico, fecha_consulta from historial_clinico where cedula_paciente='"+cedula+"';";
        ResultSet rs = conet.selectConsulta(sql1);
        List<historial_clinico> hc = new ArrayList<>();
        try {
            while (rs.next()) {
                historial_clinico miHC = new historial_clinico();
                miHC.setCodigo_historial(rs.getString("codigo_historial"));
                miHC.setCedula_pa(rs.getString("cedula_paciente"));
                miHC.setCedula_doc(rs.getString("cedula_doctor"));
                miHC.setSintomas(rs.getString("sintomas"));
                miHC.setDiacnostico(rs.getString("diacnostico"));
                miHC.setFecha(rs.getString("fecha_consulta"));
                hc.add(miHC);
            }
            rs.close();
            return hc;
        } catch (SQLException ex) {
            Logger.getLogger(Historial_clinicoPaciente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    //-----------------------------------------------------------------------------------------------------
    
    List<Paciente> paciente_registros_busqueda() {
        try {
            String sql = "select p.cedula from persona p, paciente d where p.cedula = d.cedula";
            ResultSet rs = conet.selectConsulta(sql);
            List<Paciente> lp = new ArrayList<>();
            while (rs.next()) {
                Paciente pac = new Paciente();
                pac.setCedula(rs.getString("cedula"));
                lp.add(pac);
            }
            rs.close();
            return lp;
        } catch (SQLException ex) {
            Logger.getLogger(Historial_clinicoPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public boolean valida_cedula_paciente(String cedula) {
        List<Paciente> listaP = paciente_registros_busqueda();
        for (int i = 0; i < listaP.size(); i++) {
            if (cedula.compareTo(listaP.get(i).getCedula()) == 0) {
                return false;
            }
        }
        return true;
    }
    
    //-----------------------------------------------------------------------------------------------------
    List<Doctor> Doctor_registros_busqueda() {
        try {
            String sql = "select p.cedula from persona p, doctor d where p.cedula = d.cedula";
            ResultSet rs = conet.selectConsulta(sql);
            List<Doctor> lp = new ArrayList<>();
            while (rs.next()) {
                Doctor doc = new Doctor();
                doc.setCedula(rs.getString("cedula"));
                lp.add(doc);
            }
            rs.close();
            return lp;
        } catch (SQLException ex) {
            Logger.getLogger(Crear_usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public boolean valida_cedula_DOC(String cedula) {
        List<Doctor> listaD = Doctor_registros_busqueda();
        for (int i = 0; i < listaD.size(); i++) {
            if (cedula.compareTo(listaD.get(i).getCedula()) == 0) {
                return false;
            }
        }
        return true;
    }
    
    public List<historial_clinico> BuscarHC(String cedula, String fecha) {
        String sql1 = "select codigo_historial, cedula_paciente, cedula_doctor, sintomas, diacnostico, fecha_consulta from historial_clinico where cedula_paciente='"+cedula+"' AND fecha_consulta='"+fecha+"';";
        ResultSet rs = conet.selectConsulta(sql1);
        List<historial_clinico> hc = new ArrayList<>();
        try {
            while (rs.next()) {
                historial_clinico miHC = new historial_clinico();
                miHC.setCodigo_historial(rs.getString("codigo_historial"));
                miHC.setCedula_pa(rs.getString("cedula_paciente"));
                miHC.setCedula_doc(rs.getString("cedula_doctor"));
                miHC.setSintomas(rs.getString("sintomas"));
                miHC.setDiacnostico(rs.getString("diacnostico"));
                miHC.setFecha(rs.getString("fecha_consulta"));
                hc.add(miHC);
            }
            rs.close();
            return hc;
        } catch (SQLException ex) {
            Logger.getLogger(Historial_clinicoPaciente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
