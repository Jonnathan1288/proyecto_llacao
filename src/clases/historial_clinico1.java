/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author DELL
 */
public class historial_clinico1 {
    private String codigo_historial, cedula_pa, cedula_doc, sintomas, diacnostico, fecha;

    public historial_clinico1() {
    }

    public historial_clinico1(String codigo_historial, String cedula_pa, String cedula_doc, String sintomas, String diacnostico, String fecha) {
        this.codigo_historial = codigo_historial;
        this.cedula_pa = cedula_pa;
        this.cedula_doc = cedula_doc;
        this.sintomas = sintomas;
        this.diacnostico = diacnostico;
        this.fecha = fecha;
    }

    public String getCodigo_historial() {
        return codigo_historial;
    }

    public void setCodigo_historial(String codigo_historial) {
        this.codigo_historial = codigo_historial;
    }

    public String getCedula_pa() {
        return cedula_pa;
    }

    public void setCedula_pa(String cedula_pa) {
        this.cedula_pa = cedula_pa;
    }

    public String getCedula_doc() {
        return cedula_doc;
    }

    public void setCedula_doc(String cedula_doc) {
        this.cedula_doc = cedula_doc;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getDiacnostico() {
        return diacnostico;
    }

    public void setDiacnostico(String diacnostico) {
        this.diacnostico = diacnostico;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
