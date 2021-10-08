
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author carlo
 */
public interface Ingresos_Medc {

    public boolean Insertar(Medicamentos medicamentos);

    public List<Medicamentos> ListaMedicamentos();

    public boolean EliminarMedicamentos(String cedulad);

    public boolean ModificarMedicamentos(Medicamentos medicamentos);
}
