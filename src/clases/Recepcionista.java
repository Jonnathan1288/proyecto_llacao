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
public class Recepcionista extends Persona{
    String titulo, id;

    public Recepcionista() {
    }
    

    public Recepcionista(String titulo, String id, String cedula, String apellido, String nombre, String fecha_nacimiento, String genero, String tipo_sangre, String telefono, String direccion, int edad) {
        super(cedula, apellido, nombre, fecha_nacimiento, genero, tipo_sangre, telefono, direccion, edad);
        this.titulo = titulo;
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
