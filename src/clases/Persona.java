/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author carlo
 */
public class Persona {

    private String cedula;
    private String apellido;
    private String nombre;
    private String fecha_nacimiento;
    private String genero;
    private String Tipo_sangre;
    private String telefono;
    private String direccion;

    public Persona() {
    }

    public Persona(String cedula, String apellido, String nombre, String fecha_nacimiento, String genero, String Tipo_sangre, String telefono, String direccion) {
        this.cedula = cedula;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.genero = genero;
        this.Tipo_sangre = Tipo_sangre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipo_sangre() {
        return Tipo_sangre;
    }

    public void setTipo_sangre(String Tipo_sangre) {
        this.Tipo_sangre = Tipo_sangre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    

}
