/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comportamientos;


import Conexion_BD.Conexion;
import clases.Doctor;
import clases.Paciente;
import clases.Recepcionista;
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
public class IngresoRecepcionistas extends Recepcionista {

    Conexion conex = new Conexion();

    public boolean insertatRecepcionista() {
        String sql1 = "INSERT INTO public.persona(\n"
                + "	cedula, apellido, nombre, fecha_nacimiento, genero, tipo_sangre, telefono, direccion)\n"
                + "	VALUES ('" + getCedula() + "', '" + getApellido() + "', '" + getNombre() + "', '" + getFecha_nacimiento() + "', '" + getGenero() + "', '" + getTipo_sangre() + "', '" + getTelefono() + "', '" + getDireccion() + "');";

        String sql2 = "INSERT INTO public.recepcionista(\n"
                + "	sueldo, cedula)\n"
                + "	VALUES ('" + getSueldo() + "', '" + getCedula() + "');";
        String sql = sql1 + sql2;
        System.out.println(sql);
        return conex.InsertUpdateDeleteAcciones(sql);
    }

    public String Contador() {
        try {
            String sql = "Select count(id_recepcionista) as contador from recepcionista";

            ResultSet rs = conex.selectConsulta(sql);
            while (rs.next()) {
                return "" + (rs.getInt("contador") + 1);
                // +(rs.getInt("contador")+n());
            }
        } catch (SQLException ex) {
            Logger.getLogger(IngresoRecepcionistas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Recepcionista> Tabla_recepcionistas() {
        String sqlc = "select p.cedula, apellido, nombre, fecha_nacimiento, genero, tipo_sangre, telefono, direccion, id_recepcionista, sueldo from persona p, recepcionista c where p.cedula=c.cedula;";
        String sql1 = sqlc;
        ResultSet rs = conex.selectConsulta(sql1);
        List<Recepcionista> lp = new ArrayList<>();

        try {
            while (rs.next()) {
                Recepcionista miRecepcionista = new Recepcionista();
                miRecepcionista.setCedula(rs.getString("cedula"));
                miRecepcionista.setApellido(rs.getString("apellido"));
                miRecepcionista.setNombre(rs.getString("nombre"));
                miRecepcionista.setFecha_nacimiento(rs.getString("fecha_nacimiento"));
                miRecepcionista.setGenero(rs.getString("genero"));
                miRecepcionista.setTipo_sangre(rs.getString("tipo_sangre"));
                miRecepcionista.setTelefono(rs.getString("telefono"));
                miRecepcionista.setDireccion(rs.getString("direccion"));
                miRecepcionista.setId_recepcionista(rs.getString("id_recepcionista"));
                miRecepcionista.setSueldo(rs.getFloat("sueldo"));
                miRecepcionista.setCedula(rs.getString("cedula"));
                lp.add(miRecepcionista);
            }
            rs.close();
            return lp;
        } catch (SQLException ex) {
            Logger.getLogger(IngresoRecepcionistas.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    //Eliminar
    public boolean eliminarRecepcionista(String cedula) {
        String sql1 = "DELETE FROM public.persona\n"
                + "	WHERE cedula='" + cedula + "';";
        String sql2 = "DELETE FROM public.recepcionista\n"
                + "	WHERE cedula='" + cedula + "';";
        String sql = sql2 + sql1;
        System.out.println(sql);
        return conex.InsertUpdateDeleteAcciones(sql);

    }

    List<Recepcionista> validar_cedulaR() {
        try {
            String sql = "select cedula from persona";
            ResultSet rs = conex.selectConsulta(sql);
            List<Recepcionista> lp = new ArrayList<>();
            while (rs.next()) {
                Recepcionista recep = new Recepcionista();
                recep.setCedula(rs.getString("cedula"));
                lp.add(recep);
            }
            rs.close();
            return lp;
        } catch (SQLException ex) {
            Logger.getLogger(IngresoRecepcionistas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean valida_cedula(String cedula) {
        List<Recepcionista> listaRep = validar_cedulaR();
        for (int i = 0; i < listaRep.size(); i++) {
            if (cedula.compareTo(listaRep.get(i).getCedula()) == 0) {
                return false;
            }
        }
        return true;
    }

    public List<Recepcionista> consulta_Recepcionista(String cedula) {
        String sql = "select p.cedula, apellido, nombre, fecha_nacimiento, genero, tipo_sangre, telefono, direccion, id_recepcionista, sueldo from persona p, recepcionista c where p.cedula=c.cedula and p.cedula='" + cedula + "' ";
        ResultSet rs = conex.selectConsulta(sql);
        List<Recepcionista> lp = new ArrayList<>();

        try {
            while (rs.next()) {
                Recepcionista miRecepcionista = new Recepcionista();
                miRecepcionista.setCedula(rs.getString("cedula"));
                miRecepcionista.setApellido(rs.getString("apellido"));
                miRecepcionista.setNombre(rs.getString("nombre"));
                miRecepcionista.setFecha_nacimiento(rs.getString("fecha_nacimiento"));
                miRecepcionista.setGenero(rs.getString("genero"));
                miRecepcionista.setTipo_sangre(rs.getString("tipo_sangre"));
                miRecepcionista.setTelefono(rs.getString("telefono"));
                miRecepcionista.setDireccion(rs.getString("direccion"));
                miRecepcionista.setId_recepcionista(rs.getString("id_recepcionista"));
                miRecepcionista.setSueldo(Float.valueOf(rs.getString("sueldo")));

                lp.add(miRecepcionista);
            }
            rs.close();
            return lp;
        } catch (SQLException ex) {
            Logger.getLogger(IngresoRecepcionistas.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean ModificarRecepcionista(String cedula) {
        String sql1 = "UPDATE public.recepcionista\n"
                + "	SET sueldo='"+getSueldo()+"'\n"
                + "	WHERE cedula='"+cedula+"';";
        String sql2 = "UPDATE public.persona\n"
                + "	SET apellido='" + getApellido() + "', nombre='" + getNombre() + "', fecha_nacimiento='" + getFecha_nacimiento() + "', genero='" + getGenero() + "', tipo_sangre='" + getTipo_sangre() + "', telefono='" + getTelefono() + "', direccion='" + getDireccion() + "'\n"
                + "	WHERE cedula='" + cedula + "';";

        String sql = sql1 + sql2;
        System.out.println(sql);
        return conex.InsertUpdateDeleteAcciones(sql);
    }
}
