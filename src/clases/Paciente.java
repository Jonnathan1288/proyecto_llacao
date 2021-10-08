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
public class Paciente extends Persona{
    private String alergias, ocupacion, estado_civil, nivel_estudio, discapacidad;

    public Paciente() {
        super();
    }

    public Paciente(String alergias, String ocupacion, String estado_civil, String nivel_estudio, String discapacidad, String cedula, String apellido, String nombre, String fecha_nacimiento, String genero, String tipo_sangre, String telefono, String direccion, int edad) {
        super(cedula, apellido, nombre, fecha_nacimiento, genero, tipo_sangre, telefono, direccion, edad);
        this.alergias = alergias;
        this.ocupacion = ocupacion;
        this.estado_civil = estado_civil;
        this.nivel_estudio = nivel_estudio;
        this.discapacidad = discapacidad;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getNivel_estudio() {
        return nivel_estudio;
    }

    public void setNivel_estudio(String nivel_estudio) {
        this.nivel_estudio = nivel_estudio;
    }

    public String getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(String discapacidad) {
        this.discapacidad = discapacidad;
    }
    
    
}
