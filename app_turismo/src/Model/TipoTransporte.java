package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controlador.Conexion;

public class TipoTransporte {
	
	public int idtipotransporte =0;
	public String nombre ="";
	public String observacion ="";
	Conexion conector = new Conexion();

	public int getIdtipotransporte() {
		return idtipotransporte;
	}
	public void setIdtipotransporte(int idtipotransporte) {
		this.idtipotransporte = idtipotransporte;
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
	
	public void create(String nombre, String observacion) {
				
				Connection dbConnection = null;
				PreparedStatement pst = null;
				
				String script = "INSERT INTO tbltipotransporte (nombre, observacion) values (?,?)";
				
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
	public void delete(int idtipotransporte) {
		Connection bdConnection = null;
		   PreparedStatement pst = null;
		   String script = "DELETE FROM tbltipotransporte WHERE idtipotransporte = ?";

		try {
			bdConnection = conector.conectarBD();
			pst = bdConnection.prepareStatement(script);

			pst.setInt(1, idtipotransporte);

			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idtipotransporte + "?");

			if (resp == JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + idtipotransporte + " Eliminado");

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}		
	}
	public void readOne(int idtipotransporte, JTextField nombre, JTextField Observacion) {
		
		
		Connection bdConnection = null;
		PreparedStatement pst = null;
		String script = "SELECT * FROM tbltipotransporte WHERE idtipotransporte = ?";

		try {
			bdConnection = conector.conectarBD();
			pst = bdConnection.prepareStatement(script);

			pst.setInt(1, idtipotransporte);

			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				nombre.setText(rs.getString(2));
				Observacion.setText(rs.getString(3));
			
				
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}		
	}
	public void Update(int idtipotransporte, String nombre, String Observacion) {

		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "UPDATE tbltipotransporte SET nombre = ?, Observacion = ? WHERE idtipotransporte = ? " ;
			
		try { 
		
		dbConnection = conector.conectarBD();
		pst = dbConnection.prepareStatement(script);
		
		pst.setString(1,nombre);
		pst.setString(2,Observacion);
		pst.setInt(3,idtipotransporte);

		int respuesta = JOptionPane.showConfirmDialog(null, "Desea actualizar el reistro No. " + idtipotransporte + "?");
		
		if (respuesta == JOptionPane.YES_OPTION) {
			pst.execute();
			JOptionPane.showConfirmDialog(null, "Registro No." + idtipotransporte +"Actualizado");
		}
	}
	  catch (Exception e) {
		System.out.println(e.getMessage());

	}
	}
	}
	
	
	



