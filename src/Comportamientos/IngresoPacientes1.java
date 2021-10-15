/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comportamientos;

import Conexion_BD.Conexion;
import clases.Paciente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class IngresoPacientes1 extends Paciente {

    Conexion conex = new Conexion();

    public boolean insertatPacientes() {
        String sql1 = "INSERT INTO public.persona(\n"
                + "	cedula, apellido, nombre, fecha_nacimiento, genero, tipo_sangre, telefono, direccion)\n"
                + "	VALUES ('" + getCedula() + "', '" + getApellido() + "', '" + getNombre() + "', '" + getFecha_nacimiento() + "', '" + getGenero() + "', '" + getTipo_sangre() + "', '" + getTelefono() + "', '" + getDireccion() + "');";

        String sql2 = "INSERT INTO public.paciente(\n"
                + "	alergias, discapacidad, cedula)\n"
                + "	VALUES ('" + getAlergias() + "','" + getDiscapacidad() + "', '" + getCedula() + "');";
        String sql = sql1 + sql2;
        System.out.println(sql);
        return conex.InsertUpdateDeleteAcciones(sql);
    }

    public String Contador() {
        try {
            String sql = "Select count(id_paciente) as contador from paciente";

            ResultSet rs = conex.selectConsulta(sql);
            while (rs.next()) {
                return "" + (rs.getInt("contador") + 1);
                // +(rs.getInt("contador")+n());
            }
        } catch (SQLException ex) {
            Logger.getLogger(IngresoPacientes1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Paciente> pacientes() {
        String sqlc = "select p.cedula, apellido, nombre, fecha_nacimiento, genero, tipo_sangre, telefono, direccion, id_paciente, alergias, discapacidad from persona p, paciente c where p.cedula=c.cedula;";
        String sql1 = sqlc;
        ResultSet rs = conex.selectConsulta(sql1);
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
            Logger.getLogger(IngresoPacientes1.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    List<Paciente> validar_cedula() {
        try {
            String sql = "select cedula from persona";
            ResultSet rs = conex.selectConsulta(sql);
            List<Paciente> lp = new ArrayList<>();
            while (rs.next()) {
                Paciente pacient = new Paciente();
                pacient.setCedula(rs.getString("cedula"));
                lp.add(pacient);
            }
            rs.close();
            return lp;
        } catch (SQLException ex) {
            Logger.getLogger(IngresoPacientes1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean valida_cedula(String cedula) {
        List<Paciente> listaP = validar_cedula();
        for (int i = 0; i < listaP.size(); i++) {
            if (cedula.compareTo(listaP.get(i).getCedula()) == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean eliminarPaciente(String cedula) {
        String sql1 = "DELETE FROM public.persona\n"
                + "	WHERE cedula='" + cedula + "';";
        String sql2 = "DELETE FROM public.paciente\n"
                + "	WHERE cedula='" + cedula + "';";
        String sql = sql2 + sql1;
        System.out.println(sql);
        return conex.InsertUpdateDeleteAcciones(sql);

    }

    public List<Paciente> consulta_paciente(String cedula) {
        String sql = "select p.cedula, apellido, nombre, fecha_nacimiento, genero, tipo_sangre, telefono, direccion, id_paciente, alergias, discapacidad from persona p, paciente c where p.cedula=c.cedula and p.cedula='"+cedula+"';";
        ResultSet rs = conex.selectConsulta(sql);
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
            Logger.getLogger(IngresoPacientes1.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean ModificarPaciente(String cedula) {
        String sql1 = "UPDATE public.paciente\n"
                + "	SET alergias='"+getAlergias()+"', discapacidad='"+getDiscapacidad()+"'\n"
                + "	WHERE cedula='"+cedula+"';";
        String sql2 = "UPDATE public.persona\n"
                + "	SET apellido='" + getApellido() + "', nombre='" + getNombre() + "', fecha_nacimiento='" + getFecha_nacimiento() + "', genero='" + getGenero() + "', tipo_sangre='" + getTipo_sangre() + "', telefono='" + getTelefono() + "', direccion='" + getDireccion() + "'\n"
                + "	WHERE cedula='" + cedula + "';";
        
        String sql = sql1+sql2;
        System.out.println(sql);
        return conex.InsertUpdateDeleteAcciones(sql);
    }
}
