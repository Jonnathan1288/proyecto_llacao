/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

//import clases.Persona;

/**
 *
 * @author DELL
 */
public class Doctor extends Persona{
    
    private String id_doctor;
    private String area;
    private String titulo;

    public Doctor() {
    }

    public Doctor(String id_doctor, String area, String titulo) {
        this.id_doctor = id_doctor;
        this.area = area;
        this.titulo = titulo;
    }

    public Doctor(String id_doctor, String area, String titulo, String cedula, String apellido, String nombre, String fecha_nacimiento, String genero, String Tipo_sangre, String telefono, String direccion) {
        super(cedula, apellido, nombre, fecha_nacimiento, genero, Tipo_sangre, telefono, direccion);
        this.id_doctor = id_doctor;
        this.area = area;
        this.titulo = titulo;
    }

    public String getId_doctor() {
        return id_doctor;
    }

    public void setId_doctor(String id_doctor) {
        this.id_doctor = id_doctor;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
//    public boolean Modificar(String Identificador) {
//        String sqla = "UPDATE public.persona "
//                + "SET nombre='" + getNombre() + "', apellido='" + getApellido() + "', edad= '" + getEdad() + "', genero='" + getGenero() + "', telefono='" + getTelefono() + "', correo='" + getCorreo() + "', direccion='" + getDireccion() + "', fecha_nac= to_date('" + getFecha_nac() + "','yyyy-MM-dd') "
//                + "WHERE cedula='" + Identificador + "'";
//
//        return con.accion(sqla);
//    }
//
//    public boolean Borrar(String Identificador) {
//
//        String sqla = "UPDATE public.persona "
//                + "SET eliminado=false "
//                + "WHERE cedula='" + Identificador + "'";
//        return con.accion(sqla);
//    }


   
    
}
    