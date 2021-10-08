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
public class Validaciones {

    public boolean Validacion_Cedula(String Vcedula) {
        return Vcedula.matches("[0-9]{10}");
    }

    public boolean Validacion_Nombre(String Vnombre) {
        return Vnombre.matches("[A-Z]{1}[a-z]+");
    }

    public boolean Validacion_Apellido(String Vapellido) {
        return Vapellido.matches("[A-Z]{1}[a-z]+");
    }

    public boolean Validaciones_ID(String Vid) {
        return Vid.matches("[A-Z]{1}[a-z]+");
    }

}
