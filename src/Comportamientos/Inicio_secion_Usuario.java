/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comportamientos;

import Conexion_BD.Conexion;
import clases.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class Inicio_secion_Usuario extends Usuario {

    Conexion conex = new Conexion();

    public String inicioSesion(String usuario, String contra, String tipoUs) {
        String busqueda = null;
        try {
            String sql = "select id_usuario from usuario where usuario='" + usuario + "' AND contrasenia='" + contra + "' AND tipo_usuario='"+tipoUs+"';";
            ResultSet rs = conex.selectConsulta(sql);
            if (rs.next()) {
                busqueda = "Acceso";
            } else {
                busqueda = "Error";
            }
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(Inicio_secion_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return busqueda;
    }
    
    public String buscoNombre(String usuario) {
        String nombred = null;
        try {
            String sql = "select nombre from persona p, doctor c where p.cedula=c.cedula and c.cedula='"+usuario+"';";
            ResultSet rs = conex.selectConsulta(sql);
            if (rs.next()) {
                nombred = rs.getString("nombre");
            } 
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(Inicio_secion_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nombred;
    }
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public String inicioSesionRep(String usuario, String contra, String tipoUs) {
        String busqueda = null;
        try {
            String sql = "select id_usuario from usuario where usuario='" + usuario + "' AND contrasenia='" + contra + "' AND tipo_usuario='"+tipoUs+"';";
            ResultSet rs = conex.selectConsulta(sql);
            if (rs.next()) {
                busqueda = "Acceso";
            } else {
                busqueda = "Error";
            }
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(Inicio_secion_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return busqueda;
    }
    
    public String buscoNombreRep(String usuario) {
        String nombred = null;
        try {
            String sql = "select nombre from persona p, recepcionista c where p.cedula=c.cedula and c.cedula='"+usuario+"';";
            ResultSet rs = conex.selectConsulta(sql);
            if (rs.next()) {
                nombred = rs.getString("nombre");
            } 
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(Inicio_secion_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nombred;
    }
}
