package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class Compañia {
	
	public int idcompañia =0;
	public String razonsocial ="";
	public int direccion =0;
	public int telefono =0;
	public String correo ="";
	public int fechacreacion =0;
	public String web ="";
	public int getIdcompañia() {
		return idcompañia;
	}
	public void setIdcompañia(int idcompañia) {
		this.idcompañia = idcompañia;
	}
	public String getRazonsocial() {
		return razonsocial;
	}
	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}
	public int getDireccion() {
		return direccion;
	}
	public void setDireccion(int direccion) {
		this.direccion = direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getFechacreacion() {
		return fechacreacion;
	}
	public void setFechacreacion(int fechacreacion) {
		this.fechacreacion = fechacreacion;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}

	public void create(String razonsocial, String direccion, String telefono, String correo, String fechacreacion, String web) {
		Conexion conector = new Conexion();
				
				Connection dbConnection = null;
				PreparedStatement pst = null;
				
				String script = "INSERT INTO tblcompañia (razonsocial, direccion, telefono, correo, fechacreacion, web) values (?,?,?,?,?,?)";
				
				try {
					dbConnection = conector.conectarBD();
					pst = dbConnection.prepareStatement(script);
					
					pst.setString(1, razonsocial);
					pst.setString(2, direccion);
					pst.setString(3, telefono);
					pst.setString(4, correo);
					pst.setString(5, fechacreacion);
					pst.setString(6, web);
					
					
					
					pst.executeUpdate();
			 
					JOptionPane.showConfirmDialog(null, "Registro con Exito.");
					
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}		
	}
}


      
	
	
	
	
	
	

