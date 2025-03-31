package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class Transporte {

	public int idtransporte;
	public int puestos;
	public int modelo;
	public int numeromotor;
	public String placavehiculo;
	public String nombre;
	public String observacion;
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
	Conexion conector = new Conexion();
			
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

	}







