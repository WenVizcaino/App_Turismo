package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controlador.Conexion;

public class Transporte {

	public int idtransporte;
	public int puestos;
	public int modelo;
	public int numeromotor;
	public String placavehiculo;
	public String nombre;
	public String observacion;
	Conexion conector = new Conexion();

	public int getIdtransporte() {
		return idtransporte;
	}
	public void setIdtransporte(int idtransporte) {
		this.idtransporte = idtransporte;
	}
	public int getPuestos() {
		return puestos;
	}
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	public int getModelos() {
		return modelo;
	}
	public void setModelos(int modelos) {
		this.modelo = modelos;
	}
	public int getNumeromotor() {
		return numeromotor;
	}
	public void setNumeromotor(int numeromotor) {
		this.numeromotor = numeromotor;
	}
	public String getPlacavehiculo() {
		return placavehiculo;
	}
	public void setPlacavehiculo(String placavehiculo) {
		this.placavehiculo = placavehiculo;
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
	public int getIdtipotransporte() {
		return idtipotransporte;
	}
	public void setIdtipotransporte(int idtipotransporte) {
		this.idtipotransporte = idtipotransporte;
	}
	public int idtipotransporte =0;


    public void create(String puestos, String modelo, String numeromotor, String placavehiculo, String nombre, String observacion, String idtipotransporte) {
			
			Connection dbConnection = null;
			PreparedStatement pst = null;
			
			String script = "INSERT INTO tbltransporte (puestos, modelo, numeromotor, placavehiculo, nombre, observacion, idtipotransporte) values (?,?,?,?,?,?,?)";
			
			try {
				System.out.println(idtipotransporte);
				dbConnection = conector.conectarBD();
				pst = dbConnection.prepareStatement(script);
				
				pst.setString(1, puestos);
				pst.setString(2, modelo);
				pst.setString(3, numeromotor);
				pst.setString(4, placavehiculo);
				pst.setString(5, nombre);
				pst.setString(6, observacion);
				pst.setString(7, idtipotransporte);
				
				pst.executeUpdate();
		 
				JOptionPane.showConfirmDialog(null, "Registro con Exito.");
				
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}		
}
	public void delete(int id_transporte) {
		Connection bdConnection = null;
		   PreparedStatement pst = null;
		   String script = "DELETE FROM tbltransporte WHERE id_transporte = ?";

		try {
			bdConnection = conector.conectarBD();
			pst = bdConnection.prepareStatement(script);

			pst.setInt(1, id_transporte);

			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + id_transporte + "?");

			if (resp == JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + id_transporte + " Eliminado");

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}		
	}
	public void readOne(int id_transporte, JTextField puestos, JTextField modelo, JTextField numeromotor,
			JTextField placavehiculo, JTextField nombre, JTextField observacion,
			JTextField idtipotransporte) {
	



		Connection bdConnection = null;
		PreparedStatement pst = null;
		String script = "SELECT * FROM tbltransporte WHERE id_transporte = ?";

		try {
			bdConnection = conector.conectarBD();
			pst = bdConnection.prepareStatement(script);

			pst.setInt(1, id_transporte);

			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				puestos.setText(rs.getString(2));
				modelo.setText(rs.getString(3));
				numeromotor.setText(rs.getString(4));
				placavehiculo.setText(rs.getString(5));
				nombre.setText(rs.getString(6));
				observacion.setText(rs.getString(7));
				idtipotransporte.setText(rs.getString(8));
				
				
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}		
	}

		
	}
	
	
	
	




