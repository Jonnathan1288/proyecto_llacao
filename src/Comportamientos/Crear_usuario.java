/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comportamientos;


import Conexion_BD.Conexion;
import clases.Doctor;
import clases.Recepcionista;
import clases.Usuario;
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
public class Crear_usuario extends Usuario {

    Conexion conet = new Conexion();

    List<Doctor> validar_cedula() {
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

    public boolean valida_cedula(String cedula) {
        List<Doctor> listaD = validar_cedula();
        for (int i = 0; i < listaD.size(); i++) {
            if (cedula.compareTo(listaD.get(i).getCedula()) == 0) {
                return false;
            }
        }
        return true;
    }
//-----------------------------------------------------------------------------------------------------------------------
    List<Recepcionista> validar_cedulaRe() {
        try {
            String sql = "select p.cedula from persona p, recepcionista r where p.cedula = r.cedula";
            ResultSet rs = conet.selectConsulta(sql);
            List<Recepcionista> lp = new ArrayList<>();
            while (rs.next()) {
                Recepcionista recep = new Recepcionista();
                recep.setCedula(rs.getString("cedula"));
                lp.add(recep);
            }
            rs.close();
            return lp;
        } catch (SQLException ex) {
            Logger.getLogger(Crear_usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean valida_cedular(String cedul) {
        List<Recepcionista> listaRep = validar_cedulaRe();
        for (int i = 0; i < listaRep.size(); i++) {
            if (cedul.compareTo(listaRep.get(i).getCedula()) == 0) {
                return false;
            }
        }
        return true;
    }
    
    
//-----------------------------------------------------------------------------------------------------------------------

    public boolean InsertarUsuarios() {
        //to_date('"+getfecha_nacimiento()+"','yyyy-MM-dd')
        String sql = "INSERT INTO public.usuario(\n"
                + "	usuario, contrasenia, tipo_usuario)\n"
                + "	VALUES ('"+getUser()+"', '"+getPasswd()+"', '"+getTipo_user()+"');";
        return conet.InsertUpdateDeleteAcciones(sql);
    }
    
     List<Usuario> validar_usuario() {
        try {
            String sql = "select usuario from usuario";
            ResultSet rs = conet.selectConsulta(sql);
            List<Usuario> user = new ArrayList<>();
            while (rs.next()) {
                Usuario us = new Usuario();
                us.setUser(rs.getString("usuario"));
                user.add(us);
            }
            rs.close();
            return user;
        } catch (SQLException ex) {
            Logger.getLogger(Crear_usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean valida_user(String usuario) {
        List<Usuario> listaus = validar_usuario();
        for (int i = 0; i < listaus.size(); i++) {
            if (usuario.compareTo(listaus.get(i).getUser()) == 0) {
                return false;
            }
        }
        return true;
    }
}
