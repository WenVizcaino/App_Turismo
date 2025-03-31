package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class Medios {
	
public int idmedios;
public String nombre;
public String observacion;
public int tiposmedios;
public int getIdmedios() {
	return idmedios;
}
public void setIdmedios(int idmedios) {
	this.idmedios = idmedios;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getObservacion() {
	return observacion;
}
public void setObservacion(String observacion) {
	this.observacion = observacion;
}
public int getTiposmedios() {
	return tiposmedios;
}
public void setTiposmedios(int tiposmedios) {
	this.tiposmedios = tiposmedios;
}


public void create(String nombre, String observacion) {
	Conexion conector = new Conexion();

	Connection dbConnection = null;
	PreparedStatement pst = null;

	String script = "INSERT INTO tblMedios (nombre, observacion) values (?,?)";


			try {
				dbConnection = conector.conectarBD();
				pst = dbConnection.prepareStatement(script);
				
				pst.setString(1, nombre);
				pst.setString(2, observacion);
				
				
				pst.executeUpdate();
		 
				JOptionPane.showConfirmDialog(null, "Registro con Exito.");
				
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}		
}
}


  




