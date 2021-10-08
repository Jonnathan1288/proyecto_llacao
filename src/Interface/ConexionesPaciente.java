/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import clases.Paciente;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface ConexionesPaciente {
    public boolean InsertarPaciente(Paciente pacientes);
    
    public List<Paciente> listarDatos();
    
    public boolean EliminarPaciente(String cedulap);
    
    public boolean ModificarPaciente(Paciente pacientes);
}
