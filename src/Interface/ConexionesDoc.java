/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import clases.Doctor;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface ConexionesDoc {
    public boolean InsertarDoctor(Doctor doctores);
    
    public List<Doctor> listarDatos();
    
    public boolean EliminarDoctor(String cedulad);
    
    public boolean ModificarDoctor(Doctor doctore);
}
