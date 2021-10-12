/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comportamientos;

import Medicamentos.Medicamentos;
import Conexion_BD.Conexion;
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
                miMedica.setCantidad(rs.getString("cantidad_medicamentos"));
                lp.add(miMedica);
            }
            rs.close();
            return lp;
        } catch (SQLException ex) {
            Logger.getLogger(IngresoDoctor.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public boolean eliminarMedicamento(String idmed) {
        String sql = "DELETE FROM public.medicamentos\n"
                + "	WHERE cod_medicamento='"+idmed+"';";
        System.out.println(sql);
        return conet.InsertUpdateDeleteAcciones(sql);
    }
}
