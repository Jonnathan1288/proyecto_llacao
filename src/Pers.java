/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//import Conexion_BD.Conexion;
//import Interface.ConexionesPaciente;
////import Proyecto.Paciente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Pers implements Conecxion_Persona{
    PreparedStatement prepare; //pts
    Conexion conexionpa = new Conexion();
    ResultSet res;//rs

    @Override
    public boolean InsertarPaciente(Persona personita) {
        String sql = "insert into pacientes (cedulap, apellidop, nombrep, fnacimientop, telefonop, direccionp, alergiap, ocupacionp, edadp, tiposangrep, generop, estado_civilp, nivel_estudio, discapacidadp)"+"values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            prepare = conexionpa.Conexion().prepareStatement(sql);
      
            prepare.setString(2, personita.getApellido());
            prepare.setString(3, personita.getNombre());
           
           
            prepare.executeUpdate();
            return true;
        } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Error al insertar el articulo "+e.getMessage());
        }finally{
            conexionpa.Desconectar();
        }
        return false;
    }

    @Override
    public List<Persona> listarDatos() {
         List<Persona> listarPacientes = new ArrayList<>();
        String sql ="SELECT * FROM pacientes";
        try {
            prepare = conexionpa.Conexion().prepareStatement(sql);
            res = prepare.executeQuery();
            
            while (res.next()) {                
                Persona perso = new Persona();        
             
                perso.setApellido(res.getString("apellidop"));
                perso.setNombre(res.getString("nombrep"));
               
                listarPacientes.add(perso); 
            }
            res.close();
            prepare.close();
            
        } catch (Exception e) {
//            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al leer los datos "+e.getMessage());
        }finally{
            conexionpa.Desconectar();
        }
        return listarPacientes;
    }
    
}
