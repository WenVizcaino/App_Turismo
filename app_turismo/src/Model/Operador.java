package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class Operador {
	public int idoperador;
	public String tipoidentificacion;
	public int numerodocumento;
	public String nombre;
	public String apellido;
	public String direccion;
	public String correoelectronico;
	public int telefono;
	public int idtransporte;
	public int getIdoperador() {
		return idoperador;
	}
	public void setIdoperador(int idoperador) {
		this.idoperador = idoperador;
	}
	public String getTipoidentificacion() {
		return tipoidentificacion;
	}
	public void setTipoidentificacion(String tipoidentificacion) {
		this.tipoidentificacion = tipoidentificacion;
	}
	public int getNumerodocumento() {
		return numerodocumento;
	}
	public void setNumerodocumento(int numerodocumento) {
		this.numerodocumento = numerodocumento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreoelectronico() {
		return correoelectronico;
	}
	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public int getIdtransporte() {
		return idtransporte;
	}
	public void setIdtransporte(int idtransporte) {
		this.idtransporte = idtransporte;
	}

	public void create(String tipoidentificacion, String numerodocumento, String nombre, String apellido, String direción, String correoelectronico, String telefono, String id_transporte) {
		Conexion conector = new Conexion();
				
				Connection dbConnection = null;
				PreparedStatement pst = null;
				
				String script = "INSERT INTO tbloperador (tipoidentificacion, numerodocumento,nombre, apellido, direción, correoelectronico, telefono, id_transporte) values (?,?,?,?,?,?,?,?)";
				
				try {
					dbConnection = conector.conectarBD();
					pst = dbConnection.prepareStatement(script);
					
					pst.setString(1, tipoidentificacion);
					pst.setString(2, numerodocumento);
					pst.setString(3, nombre);
					pst.setString(4, apellido);
					pst.setString(5, direción);
					pst.setString(6, correoelectronico);
					pst.setString(7, telefono);
					pst.setString(8, id_transporte);
					
					pst.executeUpdate();
			 
					JOptionPane.showConfirmDialog(null, "Registro con Exito.");
					
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}		
	}
}


      
	
	
	
	
	
	
	
	
	

