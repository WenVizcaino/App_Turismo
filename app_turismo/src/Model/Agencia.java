package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class Agencia {
    	
	public int idagencia ;
	public String nombre ;
	public int dirección;
	public String Correoelectronico ;
	public int telefono ;
	public String wed ;
	public int idcompañia;
	public int getIdagencia() {
		return idagencia;
	}
	public void setIdagencia(int idagencia) {
		this.idagencia = idagencia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDirección() {
		return dirección;
	}
	public void setDirección(int dirección) {
		this.dirección = dirección;
	}
	public String getCorreoelectronico() {
		return Correoelectronico;
	}
	public void setCorreoelectronico(String correoelectronico) {
		Correoelectronico = correoelectronico;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getWed() {
		return wed;
	}
	public void setWed(String wed) {
		this.wed = wed;
	}
	public int getIdcompañia() {
		return idcompañia;
	}
	public void setIdcompañia(int idcompañia) {
		this.idcompañia = idcompañia;
	}

	public void create(String nombreAgencia, String direccion, String correo, String tel, String web, String idcompania) {
		Conexion conector = new Conexion();
				
				Connection dbConnection = null;
				PreparedStatement pst = null;
				
				String script = "INSERT INTO tblagencia (nombre, dirección, correoelectronico, telefono, web, id_compañia) values (?,?,?,?,?,?)";
				
				try {
					System.out.println(idcompania);
					dbConnection = conector.conectarBD();
					pst = dbConnection.prepareStatement(script);
					
					pst.setString(1, nombreAgencia);
					pst.setString(2, direccion);
					pst.setString(3, correo);
					pst.setString(4, tel);
					pst.setString(5, web);
					pst.setString(6, idcompania);
					
					
					pst.executeUpdate();
			 
					JOptionPane.showConfirmDialog(null, "Registro con Exito.");
					
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}		
	}
	
	
}




