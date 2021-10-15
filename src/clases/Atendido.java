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
public class Atendido extends Generar_T{
    private String id_turn, atendido;

    public Atendido() {
        super();
    }

    public String getId_turn() {
        return id_turn;
    }

    public void setId_turn(String id_turn) {
        this.id_turn = id_turn;
    }

    public String getAtendido() {
        return atendido;
    }

    public void setAtendido(String atendido) {
        this.atendido = atendido;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
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

    public String getCedula_doc() {
        return cedula_doc;
    }

    public void setCedula_doc(String cedula_doc) {
        this.cedula_doc = cedula_doc;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Atendido(String id_turn, String atendido, String turno, String cedula, String apellido, String nombre, String cedula_doc, String horario, String fecha) {
        super(turno, cedula, apellido, nombre, cedula_doc, horario, fecha);
        this.id_turn = id_turn;
        this.atendido = atendido;
    }
    
}
