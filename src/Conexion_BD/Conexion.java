/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion_BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Conexion {

    private String URL = "jdbc:postgresql://localhost:5432/proyecto_final";//proyecto_final
    private String USER = "postgres";
    private String PASSWORD = "jav123"; // Cada uno pone su contraseña.
    
    private Connection con = null;
    
    public Connection Conexion(){
        
        
        try {
            con = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("Conectado");
        } catch (SQLException e) {
            System.out.println("Error en la conexion "+e.getMessage());
        }
        return con;
    }
    
    public void Desconectar(){
        if (con != null) {
            try {
                con.close();
                System.out.println("Desconectado");
            } catch (SQLException ex) {
                System.out.println("Error al desconectar "+ex.getMessage());
            }
        }
    }

}
