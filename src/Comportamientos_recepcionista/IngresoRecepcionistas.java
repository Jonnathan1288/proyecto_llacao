/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comportamientos_recepcionista;

import Conexion_BD.Conexion;
import Interface.ConexionesRecep;
import clases.Recepcionista;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class IngresoRecepcionistas implements ConexionesRecep {

    PreparedStatement preparerep; //pts
    Conexion conexionrep = new Conexion();
    ResultSet resu;//rs

    @Override
    public boolean InsertarRecepcionista(Recepcionista recepcionista) {

        String sql = "insert into recepcionistas (cedula, apellido, nombre, fnacimiento, telefono, direccion, id_r, edad, tipo_sangre, genero, titulo)" + "values (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            preparerep = conexionrep.Conexion().prepareStatement(sql);
            preparerep.setString(1, recepcionista.getCedula());
            preparerep.setString(2, recepcionista.getApellido());
            preparerep.setString(3, recepcionista.getNombre());
            preparerep.setString(4, recepcionista.getFecha_nacimiento());
            preparerep.setString(5, recepcionista.getTelefono());
            preparerep.setString(6, recepcionista.getDireccion());
            preparerep.setString(7, recepcionista.getId());
            preparerep.setInt(8, recepcionista.getEdad());
            preparerep.setString(9, recepcionista.getTipo_sangre());
            preparerep.setString(10, recepcionista.getGenero());
            preparerep.setString(11, recepcionista.getTitulo());
            preparerep.executeUpdate();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al insertar el articulo " + e.getMessage());
        } finally {
            conexionrep.Desconectar();
        }
        return false;
    }

    @Override
    public List<Recepcionista> listarDatos() {
        List<Recepcionista> listarRecepcionistas = new ArrayList<>();
        /*String sql = "SELECT d.*, c.nombre as nombrecategoria FROM articulos a\n" +
                    "JOIN categorias c ON a.idcategoria = c.idcategoria";*/
        String sql = "SELECT * FROM recepcionistas";
        try {
            preparerep = conexionrep.Conexion().prepareStatement(sql);
            resu = preparerep.executeQuery();

            while (resu.next()) {
                Recepcionista recepc = new Recepcionista();
                recepc.setCedula(resu.getString("cedula"));
                recepc.setApellido(resu.getString("apellido"));
                recepc.setNombre(resu.getString("nombre"));
                recepc.setFecha_nacimiento(resu.getString("fnacimiento"));
                recepc.setTelefono(resu.getString("telefono"));
                recepc.setDireccion(resu.getString("direccion"));
                recepc.setId(resu.getString("id_r"));
                recepc.setEdad(resu.getInt("edad"));
                recepc.setTipo_sangre(resu.getString("tipo_sangre"));
                recepc.setGenero(resu.getString("genero"));
                recepc.setTitulo(resu.getString("titulo"));
                listarRecepcionistas.add(recepc);
            }
            resu.close();
            preparerep.close();

        } catch (Exception e) {
//            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al leer los datos " + e.getMessage());
        } finally {
            conexionrep.Desconectar();
        }
        return listarRecepcionistas;
    }

    @Override
    public boolean EliminarRecepcionista(String cedula) {
        String sql = "DELETE from recepcionistas WHERE cedula = ?";
        try {
            preparerep = conexionrep.Conexion().prepareStatement(sql);
            preparerep.setString(1, cedula);

            preparerep.executeUpdate();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el registro del recepcionista " + e.getMessage());
        } finally {
            conexionrep.Desconectar();
        }
        return false;
    }

    @Override
    public boolean ModificarRecepcionista(Recepcionista recepcionista) {
        String sql = "UPDATE recepcionistas SET apellido = ?, nombre = ?, fnacimiento = ?,\n"
                + "telefono = ?, direccion = ?, id_r = ?, edad = ?, tipo_sangre = ?, genero = ?, titulo = ? WHERE cedula = ?";
        try {
            preparerep = conexionrep.Conexion().prepareStatement(sql);
            preparerep.setString(1, recepcionista.getApellido());
            preparerep.setString(2, recepcionista.getNombre());
            preparerep.setString(3, recepcionista.getFecha_nacimiento());
            preparerep.setString(4, recepcionista.getTelefono());
            preparerep.setString(5, recepcionista.getDireccion());
            preparerep.setString(6, recepcionista.getId());
            preparerep.setInt(7, recepcionista.getEdad());
            preparerep.setString(8, recepcionista.getTipo_sangre());
            preparerep.setString(9, recepcionista.getGenero());
            preparerep.setString(10, recepcionista.getTitulo());
            preparerep.setString(11, recepcionista.getCedula());
            preparerep.executeUpdate();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar los datos del recepcionista" + e.getMessage());
        } finally {
            conexionrep.Desconectar();
        }
        return false;
    }
    public List<Recepcionista> ConsultaRecepcionista(String cedula) {
        List<Recepcionista> listarRecepcionistas = new ArrayList<>();
        /*String sql = "SELECT d.*, c.nombre as nombrecategoria FROM articulos a\n" +
                    "JOIN categorias c ON a.idcategoria = c.idcategoria";*/
        String sql = "select * from recepcionistas where cedula = ?";
        try {
            preparerep = conexionrep.Conexion().prepareStatement(sql);
            preparerep.setString(1, cedula);
            resu = preparerep.executeQuery();

            while (resu.next()) {
                Recepcionista recepc = new Recepcionista();
                recepc.setCedula(resu.getString("cedula"));
                recepc.setApellido(resu.getString("apellido"));
                recepc.setNombre(resu.getString("nombre"));
                recepc.setFecha_nacimiento(resu.getString("fnacimiento"));
                recepc.setTelefono(resu.getString("telefono"));
                recepc.setDireccion(resu.getString("direccion"));
                recepc.setId(resu.getString("id_r"));
                recepc.setEdad(resu.getInt("edad"));
                recepc.setTipo_sangre(resu.getString("tipo_sangre"));
                recepc.setGenero(resu.getString("genero"));
                recepc.setTitulo(resu.getString("titulo"));
                listarRecepcionistas.add(recepc);
            }
            resu.close();
            preparerep.close();
        } catch (Exception e) {
//            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al leer los datos " + e.getMessage());
        } finally {
            conexionrep.Desconectar();
        }
        return listarRecepcionistas;
    }

}
