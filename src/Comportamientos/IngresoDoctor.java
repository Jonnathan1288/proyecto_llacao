/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comportamientos;

//import Persona;
import Conexion_BD.Conexion;
import clases.Doctor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlo
 */
public class IngresoDoctor extends Doctor {

    Conexion con = new Conexion();

    public boolean InsertarDoctores() {
        String sql1 = "INSERT INTO persona(\n"
                + "	cedula, apellido, nombre, fecha_nacimiento, genero, tipo_sangre, telefono, direccion)\n"
                + "	VALUES ('" + getCedula() + "', '" + getApellido() + "', '" + getNombre() + "', '" + getFecha_nacimiento() + "', "
                + "'" + getGenero() + "', '" + getTipo_sangre() + "', '" + getTelefono() + "', '" + getDireccion() + "');";
        String sql2 = "INSERT INTO doctor(\n"
                + "	id_doctor, area, titulo, cedula)\n"
                + "	VALUES ('" + getId_doctor() + "', '" + getArea() + "', '" + getTitulo() + "', '" + getCedula() + "');";
        String sql = sql1 + sql2;
        return con.InsertUpdateDeleteAcciones(sql);
    }
    
    public List<Doctor> Lisdoctor() {
        
        String sqls = "select p.cedula, apellido, nombre, fecha_nacimiento, genero, tipo_sangre, telefono, direccion, id_doctor, area, titulo from persona p, doctor d where p.cedula=d.cedula; ";
        ResultSet rs = con.selectConsulta(sqls);
        List<Doctor> lp = new ArrayList<>();

        try {
            while (rs.next()) {
                Doctor miDoctor = new Doctor();
                miDoctor.setCedula(rs.getString("cedula"));
                miDoctor.setApellido(rs.getString("apellido"));
                miDoctor.setNombre(rs.getString("nombre"));
                miDoctor.setFecha_nacimiento(rs.getString("fecha_nacimiento"));
                miDoctor.setGenero(rs.getString("genero"));
                miDoctor.setTipo_sangre(rs.getString("tipo_sangre"));
                miDoctor.setTelefono(rs.getString("telefono"));
                miDoctor.setDireccion(rs.getString("direccion"));
                miDoctor.setId_doctor(rs.getString("id_doctor"));
                miDoctor.setArea(rs.getString("area"));
                miDoctor.setTitulo(rs.getString("titulo"));
                lp.add(miDoctor);
            }
            rs.close();
            return lp;
        } catch (SQLException ex) {
            Logger.getLogger(IngresoDoctor.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    public boolean eliminarDoctor(String cedula) {
        String sql1 = "DELETE FROM public.doctor\n"
                + "	WHERE cedula='" + cedula + "';";
        String sql2 = "DELETE FROM public.doctor\n"
                + "	WHERE cedula='" + cedula + "';";
        String sql = sql2 + sql1;
        System.out.println(sql);
        return con.InsertUpdateDeleteAcciones(sql);

    }
    
//    Validacion de Cedula
    List<Doctor> validar_cedula() {
        try {
            String sql = "select cedula from doctor";
            ResultSet rs = con.selectConsulta(sql);
            List<Doctor> lp = new ArrayList<>();
            while (rs.next()) {
                Doctor doc= new Doctor();
                doc.setCedula(rs.getString("cedula"));
                lp.add(doc);
            }
            rs.close();
            return lp;
        } catch (SQLException ex) {
            Logger.getLogger(IngresoDoctor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    public boolean valida_cedula(String cedula) {
        List<Doctor> listaD = validar_cedula();
        for (int i = 0; i < listaD.size(); i++) {
            if (cedula.compareTo(listaD.get(i).getCedula()) == 0) {
                return false;
            }
        }
        return true;
    }
}


