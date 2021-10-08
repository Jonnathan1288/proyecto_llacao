
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlo
 */
public class conexionBDD {
    
    private String URL = "jdbc:postgresql://localhost:5432/proyect_final";//proyecto_final
    private String USER = "postgres";
    private String PASSWORD = "A"; // Cada uno pone su contraseña.
    
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
    
//     private String url = "jdbc:postgresql://localhost:5432/proyect_final";//proyecto_final
//    private String user = "postgres";
//    private String password = "A"; // Cada uno pone su contraseña.
//    
//    private Connection ex = null;
//
//    public conexionBDD() {
//        try {
//            ex=DriverManager.getConnection(url,user,password);
//            System.out.println("****ON*****");
//        } catch (Exception e) {
//            System.out.println("****OF*****"+e.getMessage());
//        }
//        return ex;
//    }
//    
//    
//    
////    public Connection Conexion(){
////        
////        
////        try {
////            con = DriverManager.getConnection(url,user,password);
////            System.out.println("Conectado");
////        } catch (SQLException e) {
////            System.out.println("Error en la conexion "+e.getMessage());
////        }
////        return con;
////    }
//       public void Desconectar(){
//        if (ex != null) {
//            try {
//                ex.close();
//                System.out.println("Desconectado");
//            } catch (SQLException ex) {
//                System.out.println("Error al desconectar "+ex.getMessage());
//            }
//        }
//    }
//    
//    
////    public void Desconectar(){
////        if (con != null) {
////            try {
////                con.close();
////                System.out.println("Desconectado");
////            } catch (SQLException ex) {
////                System.out.println("Error al desconectar "+ex.getMessage());
////            }
////        }
////    }

}
