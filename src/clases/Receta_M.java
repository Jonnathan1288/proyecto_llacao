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
public class Receta_M extends historial_clinico{

    String id_receta, apellido, nombre,id_diagnostico, medicamentos, Prescripcion;

    
    public Receta_M(){}

    public Receta_M(String id_receta, String apellido, String nombre, String id_diagnostico, String medicamentos, String Prescripcion, String codigo_historial, String cedula_pa, String cedula_doc, String sintomas, String diacnostico, String fecha) {
        super(codigo_historial, cedula_pa, cedula_doc, sintomas, diacnostico, fecha);
        this.id_receta = id_receta;
        this.apellido = apellido;
        this.nombre = nombre;
        this.id_diagnostico = id_diagnostico;
        this.medicamentos = medicamentos;
        this.Prescripcion = Prescripcion;
    }

    public String getId_receta() {
        return id_receta;
    }

    public void setId_receta(String id_receta) {
        this.id_receta = id_receta;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId_diagnostico() {
        return id_diagnostico;
    }

    public void setId_diagnostico(String id_diagnostico) {
        this.id_diagnostico = id_diagnostico;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getPrescripcion() {
        return Prescripcion;
    }

    public void setPrescripcion(String Prescripcion) {
        this.Prescripcion = Prescripcion;
    }
    
}
