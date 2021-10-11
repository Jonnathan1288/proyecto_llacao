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
    private String id_paciente, alergias, discapacidad;

    public Paciente() {
        super();
    }

    public Paciente(String id_paciente, String alergias, String discapacidad, String cedula, String apellido, String nombre, String fecha_nacimiento, String genero, String tipo_sangre, String telefono, String direccion) {
        super(cedula, apellido, nombre, fecha_nacimiento, genero, tipo_sangre, telefono, direccion);
        this.id_paciente = id_paciente;
        this.alergias = alergias;
        this.discapacidad = discapacidad;
    }

    public String getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(String id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(String discapacidad) {
        this.discapacidad = discapacidad;
    }
    
    
}
