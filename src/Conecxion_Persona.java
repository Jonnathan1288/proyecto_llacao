/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//import Proyecto.Paciente;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface Conecxion_Persona {
    public boolean InsertarPaciente(Persona personita);
    
    public List<Persona> listarDatos();
    
}
