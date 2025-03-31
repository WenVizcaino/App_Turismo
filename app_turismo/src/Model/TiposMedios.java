package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class TiposMedios {

	public String nombre;
	public String Observacion;
	public int idmedios;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getObservacion() {
		return Observacion;
	}
	public void setObservacion(String observacion) {
		Observacion = observacion;
	}
	public int getIdmedios() {
		return idmedios;
	}
	public void setIdmedios(int idmedios) {
		this.idmedios = idmedios;
	}
	public void create(String nombre, String Observacion, String idmedios) {
		Conexion conector = new Conexion();
				
				Connection dbConnection = null;
				PreparedStatement pst = null;
				
				String script = "INSERT INTO tblTiposMedios (nombre, Observacion,idmedios) values (?,?,?)";
				
				try {
				
					dbConnection = conector.conectarBD();
					pst = dbConnection.prepareStatement(script);
					
					pst.setString(1, nombre);
					pst.setString(2, Observacion);
					pst.setString(3, idmedios);
					
					pst.executeUpdate();
					
					JOptionPane.showConfirmDialog(null, "Registro con Exito.");
					
			 
		} catch (SQLException e) {
			System.out.println(e.getLocalizedMessage());
		}		
	}
	
}
