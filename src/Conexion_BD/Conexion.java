package Conexion_BD;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Conexion {

    private Connection con;
    private Statement st;
    private ResultSet rs;

    private String URL = "jdbc:postgresql://localhost:5432/practicasff";//proyecto_final
    private String USER = "postgres";
    private String PASSWORD = "A"; // Cada uno pone su contraseña.

    public Conexion() {

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ResultSet Consulta(String sql) {
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);

        }
        return null;
    }

    public boolean R_Acciones(String sql) {
        try {
            st = con.createStatement();
            boolean rv = st.execute(sql);
            st.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

//    private Connection con = null;
//    
//    public Connection Conexion(){
//        
//        
//        try {
//            con = DriverManager.getConnection(URL,USER,PASSWORD);
//            System.out.println("Conectado");
//        } catch (SQLException e) {
//            System.out.println("Error en la conexion "+e.getMessage());
//        }
//        return con;
//    }
//    
//    public void Desconectar(){
//        if (con != null) {
//            try {
//                con.close();
//                System.out.println("Desconectado");
//            } catch (SQLException ex) {
//                System.out.println("Error al desconectar "+ex.getMessage());
//            }
//        }
//    }
}
