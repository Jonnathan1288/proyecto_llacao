/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crear_Cuenta;

/**
 *
 * @author DELL
 */
public class Usuario {
    String usuario, contrasenia1, contrasenia2, tipoUsuario;

    public Usuario() {
    }

    public Usuario(String usuario, String contrasenia1, String contrasenia2, String tipoUsuario) {
        this.usuario = usuario;
        this.contrasenia1 = contrasenia1;
        this.contrasenia2 = contrasenia2;
        this.tipoUsuario = tipoUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia1() {
        return contrasenia1;
    }

    public void setContrasenia1(String contrasenia1) {
        this.contrasenia1 = contrasenia1;
    }

    public String getContrasenia2() {
        return contrasenia2;
    }

    public void setContrasenia2(String contrasenia2) {
        this.contrasenia2 = contrasenia2;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", contrasenia1=" + contrasenia1 + ", contrasenia2=" + contrasenia2 + ", tipoUsuario=" + tipoUsuario + '}';
    }
    
    
    
}
