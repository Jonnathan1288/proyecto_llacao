/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comportamientos;

import Conexion_BD.Conexion;
import M_Recepcionista.Generar_Turno;
import clases.Generar_T;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author DELL
 */
public class GenerarTurno extends Generar_T {

    Conexion conex = new Conexion();

    public boolean GenerarTurno() {
        //to_date('"+getfecha_nacimiento()+"','yyyy-MM-dd')
        String sql = "INSERT INTO public.turno(\n"
                + "	id_turno, cedulap, apellido, nombre, cedulad, horario, fecha)\n"
                + "	VALUES ('" + Contador() + "', '" + getCedula() + "', '" + getApellido() + "', '" + getNombre() + "', '" + getCedula_doc() + "', '" + getHorario() + "', '" + getFecha() + "');";
        System.out.println(sql);
        return conex.InsertUpdateDeleteAcciones(sql);
    }

    public Generar_T buscoCedula(String usuario) {
        try {
            String sql = "select p.cedula, apellido, nombre from persona p, paciente d where p.cedula=d.cedula and p.cedula='" + usuario + "'";
            ResultSet rs = conex.selectConsulta(sql);
            while (rs.next()) {
                Generar_T g = new Generar_T();
                g.setCedula(rs.getString("cedula"));
                g.setApellido(rs.getString("apellido"));
                g.setNombre(rs.getString("nombre"));
            }
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(GenerarTurno.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void cargarDoctores(JComboBox comboDoctores, JComboBox Combo_cedulaDoc) {
        try {
            String sql = "select p.cedula, nombre from persona p, doctor c where p.cedula=c.cedula; ";
            ResultSet rs = conex.selectConsulta(sql);
            comboDoctores.addItem("Nombre");
            Combo_cedulaDoc.addItem("Cedula");
            while (rs.next()) {
                comboDoctores.addItem(rs.getString("nombre"));
                Combo_cedulaDoc.addItem(rs.getString("cedula"));
            }
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(GenerarTurno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String Contador() {
        try {
            String sql = "Select count(id_turno) as contador from turno";

            ResultSet rs = conex.selectConsulta(sql);
            while (rs.next()) {
                return "" + (rs.getInt("contador") + 1);
                // +(rs.getInt("contador")+n());
            }
        } catch (SQLException ex) {
            Logger.getLogger(GenerarTurno.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Generar_T> Tabla_Turnos() {
        String sql = "select * from turno;";
        ResultSet rs = conex.selectConsulta(sql);
        List<Generar_T> lp = new ArrayList<>();

        try {
            while (rs.next()) {
                Generar_T turno = new Generar_T();
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
            Logger.getLogger(GenerarTurno.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<Generar_T> consulta_Turno(String cedula) {
        String sql = "select id_turno, cedulap, apellido, nombre, cedulad, horario, fecha from turno where cedulap='" + cedula + "';";
        ResultSet rs = conex.selectConsulta(sql);
        List<Generar_T> lp = new ArrayList<>();

        try {
            while (rs.next()) {
                Generar_T turno = new Generar_T();
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
            Logger.getLogger(GenerarTurno.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public String buscoCEDULAPAC(String cedula) {
        try {
            String sql = "select p.cedula, apellido, nombre from persona p, paciente d where p.cedula=d.cedula and p.cedula='" + cedula + "';";
            ResultSet rs = conex.selectConsulta(sql);
            if (rs.next()) {
                String cedul = rs.getString("cedula");
                String apellido = rs.getString("apellido");
                String nombre = rs.getString("nombre");
            }
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(GenerarTurno.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    //-----------------------------------------------
    public String denegarturno(String num) {
        String nu = null;
        try {
            String sql = "select id_turno from turno where id_turno='" + num + "';";
            ResultSet rs = conex.selectConsulta(sql);
            if (rs.next()) {
                nu = "verdad";
            } else {
                nu = "erroneo";
            }
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(GenerarTurno.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nu;
    }

    public boolean truncateTablaT(String nombre) {
        String sql = "truncate table " + nombre + "";
        System.out.println(sql);
        return conex.InsertUpdateDeleteAcciones(sql);

    }

    public String Validar_usuarioParaTURNO(String cedula, String apellido, String nombre) {
        String busqueda = null;
        try {
            String sql = "select p.cedula from persona p, paciente c where p.cedula=c.cedula AND c.cedula='" + cedula + "' AND apellido='" + apellido + "' AND nombre='" + nombre + "';";
            ResultSet rs = conex.selectConsulta(sql);
            if (rs.next()) {
                busqueda = "correcto";
            } else {
                busqueda = "Error";
            }
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(GenerarTurno.class.getName()).log(Level.SEVERE, null, ex);
        }
        return busqueda;
    }

    public String verificoVida(String numero) {
        String busqueda = null;
        try {
            String sql = "select id_turno from turno where id_turno ='" + numero + "';";
            ResultSet rs = conex.selectConsulta(sql);
            if (rs.next()) {
                busqueda = "uno";
            } else {
                busqueda = "caso";
            }
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(GenerarTurno.class.getName()).log(Level.SEVERE, null, ex);
        }
        return busqueda;
    }

    public String verificoFechaCorrecta(String fecha) {
        String busqueda = null;
        try {
            String sql = "select id_turno from turno where fecha ='" + fecha + "';";
            ResultSet rs = conex.selectConsulta(sql);
            if (rs.next()) {
                busqueda = "acceso";
            } else {
                busqueda = "error";
            }
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(GenerarTurno.class.getName()).log(Level.SEVERE, null, ex);
        }
        return busqueda;
    }
}
