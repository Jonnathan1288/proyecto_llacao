package Medicamentos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlo
 */
public class Medicamentos {

    private String CodigoM;
    private String NombreM;
    private String TiposM;
    private String Medicamentos;
    private String UnidadesMM;
    private String PresentacionM;
    private String Via_AdministracionM;
    private String Fecha_IngresoM;
    private String Fecha_caducidad;
    private String Cantidad;

    public Medicamentos() {
    }

    public Medicamentos(String CodigoM, String NombreM, String TiposM, String Medicamentos, String UnidadesMM, String PresentacionM, String Via_AdministracionM, String Fecha_IngresoM, String Fecha_caducidad, String Cantidad) {
        this.CodigoM = CodigoM;
        this.NombreM = NombreM;
        this.TiposM = TiposM;
        this.Medicamentos = Medicamentos;
        this.UnidadesMM = UnidadesMM;
        this.PresentacionM = PresentacionM;
        this.Via_AdministracionM = Via_AdministracionM;
        this.Fecha_IngresoM = Fecha_IngresoM;
        this.Fecha_caducidad = Fecha_caducidad;
        this.Cantidad = Cantidad;
    }

    public String getCodigoM() {
        return CodigoM;
    }

    public void setCodigoM(String CodigoM) {
        this.CodigoM = CodigoM;
    }

    public String getNombreM() {
        return NombreM;
    }

    public void setNombreM(String NombreM) {
        this.NombreM = NombreM;
    }

    public String getTiposM() {
        return TiposM;
    }

    public void setTiposM(String TiposM) {
        this.TiposM = TiposM;
    }

    public String getMedicamentos() {
        return Medicamentos;
    }

    public void setMedicamentos(String Medicamentos) {
        this.Medicamentos = Medicamentos;
    }

    public String getUnidadesMM() {
        return UnidadesMM;
    }

    public void setUnidadesMM(String UnidadesMM) {
        this.UnidadesMM = UnidadesMM;
    }

    public String getPresentacionM() {
        return PresentacionM;
    }

    public void setPresentacionM(String PresentacionM) {
        this.PresentacionM = PresentacionM;
    }

    public String getVia_AdministracionM() {
        return Via_AdministracionM;
    }

    public void setVia_AdministracionM(String Via_AdministracionM) {
        this.Via_AdministracionM = Via_AdministracionM;
    }

    public String getFecha_IngresoM() {
        return Fecha_IngresoM;
    }

    public void setFecha_IngresoM(String Fecha_IngresoM) {
        this.Fecha_IngresoM = Fecha_IngresoM;
    }

    public String getFecha_caducidad() {
        return Fecha_caducidad;
    }

    public void setFecha_caducidad(String Fecha_caducidad) {
        this.Fecha_caducidad = Fecha_caducidad;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }
    
}
