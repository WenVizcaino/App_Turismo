package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class Clientes {

	public int idclientes;
	public String tipodocumento;
	public int numerodocumento;
	public String nombre;
	public String apellido;
	public String eps;
	public String alergias;
	public int fechanacimiento;
	public String correoelectronico;
	public String estadocivil;
	public int telefono;
	public String direción;
	public int getIdclientes() {
		return idclientes;
	}
	public void setIdclientes(int idclientes) {
		this.idclientes = idclientes;
	}
	public String getTipodocumento() {
		return tipodocumento;
	}
	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
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
	public String getEps() {
		return eps;
	}
	public void setEps(String eps) {
		this.eps = eps;
	}
	public String getAlergias() {
		return alergias;
	}
	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}
	public int getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(int fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	public String getCorreoelectronico() {
		return correoelectronico;
	}
	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}
	public String getEstadocivil() {
		return estadocivil;
	}
	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direción;
	}
	public void setDireccion(String direccion) {
		this.direción = direccion;
	}

	public void create(String tipodocumento, String numerodocumento, String nombre, String apellido, String eps, String alergias, String fechanacimiento, String correoelectronico, String estadocivil, String telefono, String direción) {
		Conexion conector = new Conexion();
				
				Connection dbConnection = null;
				PreparedStatement pst = null;
				
				String script = "INSERT INTO tblClientes (tipodocumento, numerodocumento, nombre, apellido, eps, alergias, fechanacimiento, correoelectronico, estadocivil,telefono,direción) values (?,?,?,?,?,?,?,?,?,?,?)";
				
				try {
					dbConnection = conector.conectarBD();
					pst = dbConnection.prepareStatement(script);
					
					pst.setString(1, tipodocumento);
					pst.setString(2, numerodocumento);
					pst.setString(3, nombre);
					pst.setString(4, apellido);
					pst.setString(5, eps);
					pst.setString(6, alergias);
					pst.setString(7, fechanacimiento);
					pst.setString(8, correoelectronico);
					pst.setString(9, estadocivil);
					pst.setString(10, telefono);
					pst.setString(11, direción);
					
					
					
					pst.executeUpdate();
			 
					JOptionPane.showConfirmDialog(null, "Registro con Exito.");
					
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}		
	}
}



	
	
	
	
	


