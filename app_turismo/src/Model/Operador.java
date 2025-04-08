package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

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
	Conexion conector = new Conexion();

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
	public void delete(int idoperador) {
		Connection bdConnection = null;
		   PreparedStatement pst = null;
		   String script = "DELETE FROM tbloperador WHERE idoperador = ?";

		try {
			bdConnection = conector.conectarBD();
			pst = bdConnection.prepareStatement(script);

			pst.setInt(1, idoperador);

			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idoperador + "?");

			if (resp == JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + idoperador + " Eliminado");

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}		
	}
	public void readOne(int idoperador, JTextField tipoidentificacion, JTextField numerodocumento,
			JTextField nombre, JTextField apellido, JTextField direción, JTextField correoelectronico,
			JTextField telefono, JTextField id_transporte) {

		Connection bdConnection = null;
		PreparedStatement pst = null;
		String script = "SELECT * FROM tbloperador WHERE idoperador = ?";

		try {
			bdConnection = conector.conectarBD();
			pst = bdConnection.prepareStatement(script);

			pst.setInt(1, idoperador);

			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				tipoidentificacion.setText(rs.getString(2));
				numerodocumento.setText(rs.getString(3));
				nombre.setText(rs.getString(4));
				apellido.setText(rs.getString(5));
				direción.setText(rs.getString(6));
				correoelectronico.setText(rs.getString(7));
				telefono.setText(rs.getString(8));
				id_transporte.setText(rs.getString(9));
			
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}
	public void Update(int idoperador, String tipoidentificacion, String numerodocumento, String nombre, String apellido, String direción, String correoelectronico,
			String telefono, String id_transporte) {
		
		Connection dbConnection = null;
		PreparedStatement pst = null;
		String script = "UPDATE tbloperador SET tipoidentificacion = ?, numerodocumento = ?, nombre = ?, apellido = ?, direción = ?, correoelectronico = ?, telefono = ? WHERE  idoperador = ? " ;
		
		try { dbConnection = conector.conectarBD();
		pst = dbConnection.prepareStatement(script);
		
		pst.setString(1,tipoidentificacion);
		pst.setString(2,numerodocumento);
		pst.setString(3,nombre);
		pst.setString(4,apellido);
		pst.setString(5,direción);
		pst.setString(6,correoelectronico);
		pst.setString(7,telefono);
		pst.setInt(8,idoperador);
	
	

	
		int respuesta = JOptionPane.showConfirmDialog(null, "Desea actualizar el reistro No. " + idoperador + "?");
		if (respuesta == JOptionPane.YES_OPTION) {
			pst.execute();
			JOptionPane.showConfirmDialog(null, "Registro No." + idoperador +"Actualizado");
		}
	}
	catch (Exception e) {
	System.out.println(e.getMessage());	
	}
	}
		
}
	

      
	
	
	
	
	
	
	
	
	

