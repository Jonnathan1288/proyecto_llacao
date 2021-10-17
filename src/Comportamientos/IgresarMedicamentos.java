/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comportamientos;

import Conexion_BD.Conexion;
import clases.Medicamentos;
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
public class IgresarMedicamentos extends Medicamentos {

    Conexion conet = new Conexion();
//    Conexion conexionn = new Conexion();
//    ResultSet rs;

    public boolean IsertMedicamentos() {

        //to_date('"+getfecha_nacimiento()+"','yyyy-MM-dd')
        String sql = "INSERT INTO public.medicamentos(\n"
                + "	nom_medicamento, tipo_medicamento, medicamento, presentacion, unidad_medida, via_administracion, fecha_ingreso, fecha_caducidad, cantidad_medicamentos)\n"
                + "	VALUES ('" + getNombreM() + "', '" + getTiposM() + "', '" + getMedicamentos() + "', '" + getPresentacionM() + "', '" + getUnidadesMM() + "', '" + getVia_AdministracionM() + "', '" + getFecha_IngresoM() + "', '" + getFecha_caducidad() + "', '" + getCantidad() + "');";
        System.out.println(sql);
        return conet.InsertUpdateDeleteAcciones(sql);
    }

    public List<Medicamentos> ListMedicamentos() {

        String sqls = "select * from medicamentos;";
        ResultSet rs = conet.selectConsulta(sqls);
        List<Medicamentos> lp = new ArrayList<>();

        try {
            while (rs.next()) {
                Medicamentos miMedica = new Medicamentos();
                miMedica.setCodigoM(rs.getString("cod_medicamento"));
                miMedica.setNombreM(rs.getString("nom_medicamento"));
                miMedica.setTiposM(rs.getString("tipo_medicamento"));
                miMedica.setMedicamentos(rs.getString("medicamento"));
                miMedica.setPresentacionM(rs.getString("presentacion"));
                miMedica.setUnidadesMM(rs.getString("unidad_medida"));
                miMedica.setVia_AdministracionM(rs.getString("via_administracion"));
                miMedica.setFecha_IngresoM(rs.getString("fecha_ingreso"));
                miMedica.setFecha_caducidad(rs.getString("fecha_caducidad"));
                miMedica.setCantidad(rs.getInt("cantidad_medicamentos"));
                lp.add(miMedica);
            }
            rs.close();
            return lp;
        } catch (SQLException ex) {
            Logger.getLogger(IgresarMedicamentos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
    //Esta tabla sirve para que el doctor pueda visualizar el codigo y el nombre y tamabien la cantidad
    public List<Medicamentos> Consultar_Tabla(String visualizar) {
        try {
            String sqlst = "select cod_medicamento, nom_medicamento, cantidad_medicamentos from medicamentos where nom_medicamento='" + visualizar + "';";
            ResultSet rs = conet.selectConsulta(sqlst);
            List<Medicamentos> md = new ArrayList<>();
            
            Medicamentos mimed = new Medicamentos();
            
            mimed.setCodigoM(rs.getString("cod_medicamento"));
            mimed.setNombreM(rs.getString("nom_medicamento"));
            mimed.setCantidad(rs.getInt("cantidad_medicamentos"));
            md.add(mimed);
            rs.close();
            return md;
        } catch (SQLException ex) {
            Logger.getLogger(IgresarMedicamentos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean eliminarMedicamento(String idmed) {
        String sql = "DELETE FROM public.medicamentos\n"
                + "	WHERE cod_medicamento='" + idmed + "';";
        System.out.println(sql);
        return conet.InsertUpdateDeleteAcciones(sql);
    }

    public List<Medicamentos> consulta_Medicamento(String nombre) {
        String sql = "select cod_medicamento, nom_medicamento, tipo_medicamento, medicamento, presentacion, unidad_medida, via_administracion, fecha_ingreso, fecha_caducidad, cantidad_medicamentos from medicamentos where nom_medicamento='" + nombre + "';";
        ResultSet rs = conet.selectConsulta(sql);
        List<Medicamentos> medi = new ArrayList<>();

        try {
            while (rs.next()) {
                Medicamentos miMedicas = new Medicamentos();
                miMedicas.setCodigoM(rs.getString("cod_medicamento"));
                miMedicas.setNombreM(rs.getString("nom_medicamento"));
                miMedicas.setTiposM(rs.getString("tipo_medicamento"));
                miMedicas.setMedicamentos(rs.getString("medicamento"));
                miMedicas.setPresentacionM(rs.getString("presentacion"));
                miMedicas.setUnidadesMM(rs.getString("unidad_medida"));
                miMedicas.setVia_AdministracionM(rs.getString("via_administracion"));
                miMedicas.setFecha_IngresoM(rs.getString("fecha_ingreso"));
                miMedicas.setFecha_caducidad(rs.getString("fecha_caducidad"));
                miMedicas.setCantidad(rs.getInt("cantidad_medicamentos"));
                medi.add(miMedicas);
            }
            rs.close();
            return medi;
        } catch (SQLException ex) {
            Logger.getLogger(IgresarMedicamentos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean ModificarMedicamento(String id_medicamento) {
        String sql = "UPDATE public.medicamentos\n"
                + "	SET nom_medicamento='" + getNombreM() + "', tipo_medicamento='" + getTiposM() + "', medicamento='" + getMedicamentos() + "', presentacion='" + getPresentacionM() + "', unidad_medida='" + getUnidadesMM() + "', via_administracion='" + getVia_AdministracionM() + "', fecha_ingreso='" + getFecha_IngresoM() + "', fecha_caducidad='" + getFecha_caducidad() + "', cantidad_medicamentos='" + getCantidad() + "'\n"
                + "	WHERE cod_medicamento='" + id_medicamento + "';";
        System.out.println(sql);
        return conet.InsertUpdateDeleteAcciones(sql);
    }
}
