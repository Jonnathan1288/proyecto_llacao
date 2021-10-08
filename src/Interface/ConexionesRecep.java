/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import clases.Recepcionista;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface ConexionesRecep {
    public boolean InsertarRecepcionista(Recepcionista recepcionistas);
    
    public List<Recepcionista> listarDatos();
    
    public boolean EliminarRecepcionista(String cedula);
    
    public boolean ModificarRecepcionista(Recepcionista recepcionista);
    
}
