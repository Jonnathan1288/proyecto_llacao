/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comportamientos;

import Conexion_BD.Conexion;
import clases.Receta_M;
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
public class Receta_medica extends Receta_M{

    Conexion conet = new Conexion();
    
    public Receta_medica() {
    }


    public boolean IngreserRecetaMedica() {

        //to_date('"+getfecha_nacimiento()+"','yyyy-MM-dd')
        String sql = "INSERT INTO public.receta_medica(\n"
                + "	apellido, nombre, medicamento, prescripcion, codigo_historial)\n"
                + "	VALUES ('"+getApellido()+"', '"+getNombre()+"', '"+getMedicamentos()+"', '"+getPrescripcion()+"', '"+getId_diagnostico()+"');";
        System.out.println(sql);
        return conet.InsertUpdateDeleteAcciones(sql);
    }
    public List<Receta_M> Tabla_RecetaMedica() {
        String sql = "select id_receta, cedula_paciente, apellido, nombre, sintomas, diacnostico, medicamento, prescripcion, fecha_consulta from historial_clinico p, receta_medica c where p.codigo_historial=c.codigo_historial;  ";
        ResultSet rs = conet.selectConsulta(sql);
        List<Receta_M> lp = new ArrayList<>();

        try {
            while (rs.next()) {
                Receta_M rmed = new Receta_M();
                rmed.setId_receta(rs.getString("id_receta"));
                rmed.setCedula_pa(rs.getString("cedula_paciente"));
                rmed.setApellido(rs.getString("apellido"));
                rmed.setNombre(rs.getString("nombre"));
                rmed.setSintomas(rs.getString("sintomas"));
                rmed.setDiacnostico(rs.getString("diacnostico"));
                rmed.setMedicamentos(rs.getString("medicamento"));
                rmed.setPrescripcion(rs.getString("prescripcion"));
                rmed.setFecha(rs.getString("fecha_consulta"));
                lp.add(rmed);
            }
            rs.close();
            return lp;
        } catch (SQLException ex) {
            Logger.getLogger(Receta_medica.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<Receta_M> Tabla_Busque_RecetaMedica(String cedula) {
        String sql = "select id_receta, cedula_paciente, apellido, nombre, sintomas, diacnostico, medicamento, prescripcion, fecha_consulta from historial_clinico p, receta_medica c where p.codigo_historial=c.codigo_historial AND p.cedula_paciente='"+cedula+"';  ";
        ResultSet rs = conet.selectConsulta(sql);
        List<Receta_M> lp = new ArrayList<>();

        try {
            while (rs.next()) {
                Receta_M rmed = new Receta_M();
                rmed.setId_receta(rs.getString("id_receta"));
                rmed.setCedula_pa(rs.getString("cedula_paciente"));
                rmed.setApellido(rs.getString("apellido"));
                rmed.setNombre(rs.getString("nombre"));
                rmed.setSintomas(rs.getString("sintomas"));
                rmed.setDiacnostico(rs.getString("diacnostico"));
                rmed.setMedicamentos(rs.getString("medicamento"));
                rmed.setPrescripcion(rs.getString("prescripcion"));
                rmed.setFecha(rs.getString("fecha_consulta"));
                lp.add(rmed);
            }
            rs.close();
            return lp;
        } catch (SQLException ex) {
            Logger.getLogger(Receta_medica.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<Receta_M> consulta_cedulaRE(String cedula, String fecha) {
        String sql = "select id_receta, cedula_paciente, apellido, nombre, sintomas, diacnostico, medicamento, prescripcion, fecha_consulta from historial_clinico p, receta_medica c where p.codigo_historial=c.codigo_historial AND p.cedula_paciente='"+cedula+"' AND p.fecha_consulta='"+fecha+"'; ";
        ResultSet rs = conet.selectConsulta(sql);
        List<Receta_M> lp = new ArrayList<>();

        try {
            while (rs.next()) {
                Receta_M rmed = new Receta_M();
                rmed.setId_receta(rs.getString("id_receta"));
                rmed.setCedula_pa(rs.getString("cedula_paciente"));
                rmed.setApellido(rs.getString("apellido"));
                rmed.setNombre(rs.getString("nombre"));
                rmed.setSintomas(rs.getString("sintomas"));
                rmed.setDiacnostico(rs.getString("diacnostico"));
                rmed.setMedicamentos(rs.getString("medicamento"));
                rmed.setPrescripcion(rs.getString("prescripcion"));
                rmed.setFecha(rs.getString("fecha_consulta"));
                lp.add(rmed);
            }
            rs.close();
            return lp;
        } catch (SQLException ex) {
            Logger.getLogger(Receta_medica.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
