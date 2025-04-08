package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controlador.Conexion;

public class Medios {
	
public int idmedios;
public String nombre;
public String observacion;
public int tiposmedios;
Conexion conector = new Conexion();

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
public void delete(int idmedios) {
	Connection bdConnection = null;
	   PreparedStatement pst = null;
	   String script = "DELETE FROM tblmedios WHERE idmedios = ?";

	try {
		bdConnection = conector.conectarBD();
		pst = bdConnection.prepareStatement(script);

		pst.setInt(1, idmedios);

		int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idmedios + "?");

		if (resp == JOptionPane.OK_OPTION) {
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro No. " + idmedios + " Eliminado");

		}

	} catch (Exception e) {
		System.out.println(e.getMessage());

	}
	}
public void readOne(int idmedios, JTextField nombre, JTextField observacion) {
	Connection bdConnection = null;
	PreparedStatement pst = null;
	String script = "SELECT * FROM tblmedios WHERE idmedios = ?";

	try {
		bdConnection = conector.conectarBD();
		pst = bdConnection.prepareStatement(script);

		pst.setInt(1, idmedios);

		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			nombre.setText(rs.getString(2));
			observacion.setText(rs.getString(3));
			
		}

	} catch (Exception e) {
		System.out.println(e.getMessage());

	}	
}
public void Update(int idmedios, String nombre, String observacion) {
	// TODO Auto-generated method stub
	
	Connection dbConnection = null;
	PreparedStatement pst = null;
	
	String script = "UPDATE tblmedios SET nombre = ?, observacion = ? WHERE idmedios = ?" ;
	
	try { dbConnection = conector.conectarBD();
	pst = dbConnection.prepareStatement(script);
	
	
	
	pst.setString(1,nombre);
	pst.setString(2,observacion);
	pst.setInt(3,idmedios);

	int respuesta = JOptionPane.showConfirmDialog(null, "Desea actualizar el reistro No. " + idmedios + "?");
	if (respuesta == JOptionPane.YES_OPTION) {
		pst.execute();
		JOptionPane.showConfirmDialog(null, "Registro No." + idmedios +"Actualizado");
	}
}
catch (Exception e) {
System.out.println(e.getMessage());	
}
}
}

	


  




