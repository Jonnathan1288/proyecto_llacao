/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comportamientos_recepcionista;

import Conexion_BD.Conexion;
import clases.Doctor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Interface.ConexionesDoc;

/**
 *
 * @author DELL
 */
public class IngresoDoctores implements ConexionesDoc {

    PreparedStatement pst;
    Conexion conexionn = new Conexion();
    ResultSet rs;

    @Override
    public boolean InsertarDoctor(Doctor doctor) {
        String sql = "insert into doctores (cedulad, apellidod, nombred, fnacimientod, telefono, direcciond, codigod, edad, tiposangred, genero, especialidad, consultorio)" + "values (?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            pst = conexionn.Conexion().prepareStatement(sql);
            pst.setString(1, doctor.getCedula());
            pst.setString(2, doctor.getApellido());
            pst.setString(3, doctor.getNombre());
            pst.setString(4, doctor.getFecha_nacimiento());
            pst.setString(5, doctor.getTelefono());
            pst.setString(6, doctor.getDireccion());
            pst.setString(7, doctor.getCodigo_doctor());
            pst.setInt(8, doctor.getEdad());
            pst.setString(9, doctor.getTipo_sangre());
            pst.setString(10, doctor.getGenero());
            pst.setString(11, doctor.getEspecialidad());
            pst.setInt(12, doctor.getConsultorio());
            pst.executeUpdate();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al insertar el articulo " + e.getMessage());
        } finally {
            conexionn.Desconectar();
        }
        return false;
    }

    @Override
    public List<Doctor> listarDatos() {
        List<Doctor> listarDoctores = new ArrayList<>();
        /*String sql = "SELECT d.*, c.nombre as nombrecategoria FROM articulos a\n" +
                    "JOIN categorias c ON a.idcategoria = c.idcategoria";*/
        String sql = "SELECT * FROM doctores";
        try {
            pst = conexionn.Conexion().prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                Doctor art = new Doctor();
                art.setCedula(rs.getString("cedulad"));
                art.setApellido(rs.getString("apellidod"));
                art.setNombre(rs.getString("nombred"));
                art.setFecha_nacimiento(rs.getString("fnacimientod"));
                art.setTelefono(rs.getString("telefono"));
                art.setDireccion(rs.getString("direcciond"));
                art.setCodigo_doctor(rs.getString("codigod"));
                art.setEdad(rs.getInt("edad"));
                art.setTipo_sangre(rs.getString("tiposangred"));
                art.setGenero(rs.getString("genero"));
                art.setEspecialidad(rs.getString("especialidad"));
                art.setConsultorio(rs.getInt("consultorio"));
                listarDoctores.add(art);
            }
            rs.close();
            pst.close();

        } catch (Exception e) {
//            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al leer los datos " + e.getMessage());
        } finally {
            conexionn.Desconectar();
        }
        return listarDoctores;
    }

    @Override
    public boolean EliminarDoctor(String cedulad) {
        String sql = "DELETE from doctores WHERE cedulad = ?";
        try {
            pst = conexionn.Conexion().prepareStatement(sql);
            pst.setString(1, cedulad);

            pst.executeUpdate();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el registro del doctor " + e.getMessage());
        } finally {
            conexionn.Desconectar();
        }
        return false;
    }

    @Override
    public boolean ModificarDoctor(Doctor doctore) {
        String sql = "UPDATE doctores SET apellidod = ?, nombred = ?, fnacimientod = ?,\n"
                + "telefono = ?, direcciond = ?, codigod = ?, edad = ?, tiposangred = ?, genero = ?, especialidad = ?, consultorio = ? WHERE cedulad = ?";
        try {
            pst = conexionn.Conexion().prepareStatement(sql);
            pst.setString(1, doctore.getApellido());
            pst.setString(2, doctore.getNombre());
            pst.setString(3, doctore.getFecha_nacimiento());
            pst.setString(4, doctore.getTelefono());
            pst.setString(5, doctore.getDireccion());
            pst.setString(6, doctore.getCodigo_doctor());
            pst.setInt(7, doctore.getEdad());
            pst.setString(8, doctore.getTipo_sangre());
            pst.setString(9, doctore.getGenero());
            pst.setString(10, doctore.getEspecialidad());
            pst.setInt(11, doctore.getConsultorio());
            pst.setString(12, doctore.getCedula());
            pst.executeUpdate();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar los datos del doctor" + e.getMessage());
        } finally {
            conexionn.Desconectar();
        }
        return false;
    }
    
    public List<Doctor> consultaDoctor(String cedulad) {
        List<Doctor> listaConsultaDoc = new ArrayList<>();
        /*String sql = "SELECT d.*, c.nombre as nombrecategoria FROM articulos a\n" +
                    "JOIN categorias c ON a.idcategoria = c.idcategoria";*/
        String sql = "select * from doctores where cedulad = ?";
        try {
            pst = conexionn.Conexion().prepareStatement(sql);
            pst.setString(1, cedulad);
            rs = pst.executeQuery();
           // pst.executeQuery();

            while (rs.next()) {
                Doctor art = new Doctor();
                art.setCedula(rs.getString("cedulad"));
                art.setApellido(rs.getString("apellidod"));
                art.setNombre(rs.getString("nombred"));
                art.setFecha_nacimiento(rs.getString("fnacimientod"));
                art.setTelefono(rs.getString("telefono"));
                art.setDireccion(rs.getString("direcciond"));
                art.setCodigo_doctor(rs.getString("codigod"));
                art.setEdad(rs.getInt("edad"));
                art.setTipo_sangre(rs.getString("tiposangred"));
                art.setGenero(rs.getString("genero"));
                art.setEspecialidad(rs.getString("especialidad"));
                art.setConsultorio(rs.getInt("consultorio"));
                listaConsultaDoc.add(art);
            }
            rs.close();
            pst.close();

        } catch (Exception e) {
//            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error el doctor no exite: error " + e.getMessage());
        } finally {
            conexionn.Desconectar();
        }
        return listaConsultaDoc;
    }

}
