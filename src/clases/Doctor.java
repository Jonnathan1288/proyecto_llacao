/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import clases.Persona;

/**
 *
 * @author DELL
 */
public class Doctor extends Persona{
    private String codigo_doctor, especialidad;
    int consultorio;

    public Doctor() {
        super();
    }

    public Doctor(String codigo_doctor, String especialidad, int consultorio, String cedula, String apellido, String nombre, String fecha_nacimiento, String genero, String tipo_sangre, String telefono, String direccion, int edad) {
        super(cedula, apellido, nombre, fecha_nacimiento, genero, tipo_sangre, telefono, direccion, edad);
        this.codigo_doctor = codigo_doctor;
        this.especialidad = especialidad;
        this.consultorio = consultorio;
    }

    public String getCodigo_doctor() {
        return codigo_doctor;
    }

    public void setCodigo_doctor(String codigo_doctor) {
        this.codigo_doctor = codigo_doctor;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(int consultorio) {
        this.consultorio = consultorio;
    }
    
    
}
