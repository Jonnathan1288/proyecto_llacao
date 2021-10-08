
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author carlo
 */
public class IgresarMedicamentos extends Medicamentos {
//     PreparedStatement pst;

    Conexion conet = new Conexion();
//    Conexion conexionn = new Conexion();
//    ResultSet rs;

    
    public boolean IsertMedicamentos() {
        String sql= "INSERT INTO public.medicametos("
                + "cod_medicamentos, nom_medicamentos, tipos_medicamentos, presentacion_medicamentos, unidad_medida, via_administracion, fecha_ingreso, cantidad_medicamentos)"
                + "VALUES ('"+Contador()+"', '"+getNombreM()+"', '"+getTiposM()+"', '"+getPresentacionM()+"', '"+getUnidadesMM()+"', '"+getVia_AdministracionM()+"', '"+getFecha_IngresoM()+"', '"+getCantidad()+"');";
        System.out.println(sql);
        return conet.R_Acciones(sql);
    }
    
    public String Contador(){
        try {
            String sql="Select count(cod_medicamentos) as contador from medicametos";
            
            ResultSet rs= conet.Consulta(sql);
            while(rs.next()){
              return ""+(rs.getInt("contador")+1);
            }} catch (SQLException ex) {
            Logger.getLogger(IgresarMedicamentos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    /*
    /*
    private void cargarTabla() {
        DefaultTableModel tblModelo = (DefaultTableModel) vista.getTbl_Persona().getModel();

        tblModelo.setNumRows(0);
        List<Persona> listaPersona = modelo.Leer();

        listaPersona.stream().forEach(p -> {
            String[] persona = {p.getCedula(), p.getNombre(), p.getApellido(),
                p.getCorreo(), p.getDireccion(), p.getFecha_nac(), p.getEdad().toString(),
                p.getTelefono(), p.getGenero()};
            tblModelo.addRow(persona);
        });
        limpiarCampos();
    }*
    public List<Persona> Leer() {
        String sqlc = "SELECT * FROM public.persona where eliminado = true;";
        ResultSet rs = con.consulta(sqlc);
        List<Persona> lp = new ArrayList<>();

        try {
            while (rs.next()) {
                Persona miPersona = new Persona();
                miPersona.setCedula(rs.getString("cedula"));
                miPersona.setNombre(rs.getString("nombre"));
                miPersona.setApellido(rs.getString("apellido"));
                miPersona.setEdad(rs.getInt("edad"));
                miPersona.setGenero(rs.getString("genero"));
                miPersona.setTelefono(rs.getString("telefono"));
                miPersona.setCorreo(rs.getString("correo"));
                miPersona.setDireccion(rs.getString("direccion"));
                miPersona.setFecha_nac(rs.getString("fecha_nac"));

                lp.add(miPersona);
            }
            rs.close();
            return lp;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPersona.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    */
    
//
//    public boolean InsertarDoctor(Medicamentos medicamentos) {
//        String sql = "insert into medicamentos (cod_medicamentos,nom_medicamentos,tipos_medicamentos,presentacion_medicamentos,unidad_medida,via_administracion,fecha_ingreso,cantidad_medicamentos )" + "values (?,?,?,?,?,?,?,?,?,?,?,?)";
//        try {
//            pst = conet.Conexion().prepareStatement(sql);
//            pst.setString(1, medicamentos.getCodigoM());
//            pst.setString(2, medicamentos.getNombreM());
//            pst.setString(3, medicamentos.getTiposM());
//            pst.setString(4, medicamentos.getMedicamentos());
//            pst.setString(5, medicamentos.getPresentacionM());
//            pst.setString(6, medicamentos.getUnidadesMM());
//            pst.setString(7, medicamentos.getVia_AdministracionM());
//            pst.setString(8, medicamentos.getFecha_IngresoM());
//            pst.setString(9, medicamentos.getCantidad());
//            pst.executeUpdate();
//            return true;
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Error al insertar el articulo " + e.getMessage());
//        } finally {
//            conet.Desconectar();
//        }
//        return false;
//    }
//
//    public List<Medicamentos> listarDatos() {
//        List<Medicamentos> listarDoctores = new ArrayList<>();
//        /*String sql = "SELECT d.*, c.nombre as nombrecategoria FROM articulos a\n" +
//                    "JOIN categorias c ON a.idcategoria = c.idcategoria";*/
//        String sql = "SELECT * FROM medicamentos";
//        try {
//            pst = conet.Conexion().prepareStatement(sql);
//            rs = pst.executeQuery();
//
//            while (rs.next()) {
//                Medicamentos med = new Medicamentos
//                
//                med.setCodigoM(rs.getString("cod_medicamentos"));
//                med.setNombreM(rs.getString(""));
////                med.setCodigoM(rs.getString(""));
////                Doctor art = new Doctor();
////                art.setCedula(rs.getString("cedulad"));
////                art.setApellido(rs.getString("apellidod"));
////                art.setNombre(rs.getString("nombred"));
////                art.setFecha_nacimiento(rs.getString("fnacimientod"));
////                art.setTelefono(rs.getString("telefono"));
////                art.setDireccion(rs.getString("direcciond"));
////                art.setCodigo_doctor(rs.getString("codigod"));
////                art.setEdad(rs.getInt("edad"));
////                art.setTipo_sangre(rs.getString("tiposangred"));
////                art.setGenero(rs.getString("genero"));
////                art.setEspecialidad(rs.getString("especialidad"));
////                art.setConsultorio(rs.getInt("consultorio"));
////                listarDoctores.add(art);
//            }
//            rs.close();
//            pst.close();
//
//        } catch (Exception e) {
////            e.printStackTrace();
//            JOptionPane.showMessageDialog(null, "Error al leer los datos " + e.getMessage());
//        } finally {
//            conexionn.Desconectar();
//        }
//        return listarDoctores;
//    }
//
//    @Override
//    public boolean EliminarDoctor(String cedulad) {
//        String sql = "DELETE from doctores WHERE cedulad = ?";
//        try {
//            pst = conexionn.Conexion().prepareStatement(sql);
//            pst.setString(1, cedulad);
//
//            pst.executeUpdate();
//            return true;
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Error al eliminar el registro del doctor " + e.getMessage());
//        } finally {
//            conexionn.Desconectar();
//        }
//        return false;
//    }
//
//    @Override
//    public boolean ModificarDoctor(Doctor doctore) {
//        String sql = "UPDATE doctores SET apellidod = ?, nombred = ?, fnacimientod = ?,\n"
//                + "telefono = ?, direcciond = ?, codigod = ?, edad = ?, tiposangred = ?, genero = ?, especialidad = ?, consultorio = ? WHERE cedulad = ?";
//        try {
//            pst = conexionn.Conexion().prepareStatement(sql);
//            pst.setString(1, doctore.getApellido());
//            pst.setString(2, doctore.getNombre());
//            pst.setString(3, doctore.getFecha_nacimiento());
//            pst.setString(4, doctore.getTelefono());
//            pst.setString(5, doctore.getDireccion());
//            pst.setString(6, doctore.getCodigo_doctor());
//            pst.setInt(7, doctore.getEdad());
//            pst.setString(8, doctore.getTipo_sangre());
//            pst.setString(9, doctore.getGenero());
//            pst.setString(10, doctore.getEspecialidad());
//            pst.setInt(11, doctore.getConsultorio());
//            pst.setString(12, doctore.getCedula());
//            pst.executeUpdate();
//            return true;
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Error al actualizar los datos del doctor" + e.getMessage());
//        } finally {
//            conexionn.Desconectar();
//        }
//        return false;
//    }
//
//    public List<Doctor> consultaDoctor(String cedulad) {
//        List<Doctor> listaConsultaDoc = new ArrayList<>();
//        /*String sql = "SELECT d.*, c.nombre as nombrecategoria FROM articulos a\n" +
//                    "JOIN categorias c ON a.idcategoria = c.idcategoria";*/
//        String sql = "select * from doctores where cedulad = ?";
//        try {
//            pst = conexionn.Conexion().prepareStatement(sql);
//            pst.setString(1, cedulad);
//            rs = pst.executeQuery();
//            // pst.executeQuery();
//
//            while (rs.next()) {
//                Doctor art = new Doctor();
//                art.setCedula(rs.getString("cedulad"));
//                art.setApellido(rs.getString("apellidod"));
//                art.setNombre(rs.getString("nombred"));
//                art.setFecha_nacimiento(rs.getString("fnacimientod"));
//                art.setTelefono(rs.getString("telefono"));
//                art.setDireccion(rs.getString("direcciond"));
//                art.setCodigo_doctor(rs.getString("codigod"));
//                art.setEdad(rs.getInt("edad"));
//                art.setTipo_sangre(rs.getString("tiposangred"));
//                art.setGenero(rs.getString("genero"));
//                art.setEspecialidad(rs.getString("especialidad"));
//                art.setConsultorio(rs.getInt("consultorio"));
//                listaConsultaDoc.add(art);
//            }
//            rs.close();
//            pst.close();
//
//        } catch (Exception e) {
////            e.printStackTrace();
//            JOptionPane.showMessageDialog(null, "Error el doctor no exite: error " + e.getMessage());
//        } finally {
//            conexionn.Desconectar();
//        }
//        return listaConsultaDoc;
//    }
}
