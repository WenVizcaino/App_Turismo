package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controlador.Conexion;

public class TiposMedios {

	public String nombre;
	public String Observacion;
	public int idmedios;
	Conexion conector = new Conexion();

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
	public void delete(int idtiposmedios) {
		Connection bdConnection = null;
		   PreparedStatement pst = null;
		   String script = "DELETE FROM tbltiposmedios WHERE idtiposmedios = ?";

		try {
			bdConnection = conector.conectarBD();
			pst = bdConnection.prepareStatement(script);

			pst.setInt(1, idtiposmedios);

			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idtiposmedios + "?");

			if (resp == JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + idtiposmedios + " Eliminado");

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		}
	public void readOne(int idtiposmedios, JTextField Nombre, JTextField Observacion, JTextField idmedios) {
		
		
		Connection bdConnection = null;
		PreparedStatement pst = null;
		String script = "SELECT * FROM tbltiposmedios WHERE idtiposmedios = ?";

		try {
			bdConnection = conector.conectarBD();
			pst = bdConnection.prepareStatement(script);

			pst.setInt(1, idtiposmedios);

			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				Nombre.setText(rs.getString(2));
				Observacion.setText(rs.getString(3));
				idmedios.setText(rs.getString(4));
	
				
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}		
	}
	
				
	

//metodo que recibe y no retorna

    public void Update(int idtiposmedios, String Nombre, String Observacion, int idmedios) {

	Connection dbConnection = null;
	PreparedStatement pst = null;
	
	String script = "UPDATE tbltiposmedios SET nombre = ?, Observacion = ?,idmedios=? WHERE idtiposmedios = ? " ;
		
	try { 
	
	dbConnection = conector.conectarBD();
	pst = dbConnection.prepareStatement(script);
	
	pst.setString(1,Nombre);
	pst.setString(2,Observacion);
	pst.setInt(3,idmedios);
	pst.setInt(4,idtiposmedios);

	int respuesta = JOptionPane.showConfirmDialog(null, "Desea actualizar el reistro No. " + idtiposmedios + "?");
	
	if (respuesta == JOptionPane.YES_OPTION) {
		pst.execute();
		JOptionPane.showConfirmDialog(null, "Registro No." + idtiposmedios +"Actualizado");
	}
}
  catch (Exception e) {
	System.out.println(e.getMessage());

}
	
}
	
}

		
	
	
