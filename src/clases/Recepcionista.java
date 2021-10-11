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
public class Recepcionista extends Persona {

    private String id_recepcionista;
    private float sueldo;

    public Recepcionista() {
    }

    public Recepcionista(String id_recepcionista, float sueldo, String cedula, String apellido, String nombre, String fecha_nacimiento, String genero, String tipo_sangre, String telefono, String direccion) {
        super(cedula, apellido, nombre, fecha_nacimiento, genero, tipo_sangre, telefono, direccion);
        this.id_recepcionista = id_recepcionista;
        this.sueldo = sueldo;
    }

    public String getId_recepcionista() {
        return id_recepcionista;
    }

    public void setId_recepcionista(String id_recepcionista) {
        this.id_recepcionista = id_recepcionista;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    

}
