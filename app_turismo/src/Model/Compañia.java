package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controlador.Conexion;

public class Compañia {
	
	public int idcompañia =0;
	public String razonsocial ="";
	public int direccion =0;
	public int telefono =0;
	public String correo ="";
	public int fechacreacion =0;
	public String web ="";
	
	Conexion conector = new Conexion();
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
	public void delete(int id_compañia) {
		Connection bdConnection = null;
		   PreparedStatement pst = null;
		   String script = "DELETE FROM tblcompañia WHERE id_compañia = ?";

		try {
			bdConnection = conector.conectarBD();
			pst = bdConnection.prepareStatement(script);

			pst.setInt(1, id_compañia);

			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + id_compañia + "?");

			if (resp == JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + id_compañia + " Eliminado");

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		}
	public void readOne(int id_compañia, JTextField razonsocial, JTextField direccion, JTextField telefono,
			JTextField correo, JTextField fechacreacion, JTextField web) {

		Connection bdConnection = null;
		PreparedStatement pst = null;
		String script = "SELECT * FROM tblcompañia WHERE id_compañia = ?";

		try {
			bdConnection = conector.conectarBD();
			pst = bdConnection.prepareStatement(script);

			pst.setInt(1, id_compañia);

			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				razonsocial.setText(rs.getString(2));
				direccion.setText(rs.getString(3));
				telefono.setText(rs.getString(4));
				correo.setText(rs.getString(5));
				fechacreacion.setText(rs.getString(6));
				web.setText(rs.getString(7));
			
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}
	public void Update(int id_compañia, String razonsocial, String direccion, String telefono, String correo, String fechacreacion, String web) {
		
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "UPDATE tblcompañia SET razonsocial = ?, direccion = ?, telefono = ?, correo = ?, fechacreacion = ?, web = ?  WHERE  id_compañia = ? " ;
		
		try { dbConnection = conector.conectarBD();
		pst = dbConnection.prepareStatement(script);
		
		pst.setString(1,razonsocial);
		pst.setString(2,direccion);
		pst.setString(3,telefono);
		pst.setString(4,correo);
		pst.setString(5,fechacreacion);
		pst.setString(6,web);
		pst.setInt(7, id_compañia);
		


		int respuesta = JOptionPane.showConfirmDialog(null, "Desea actualizar el reistro No. " + id_compañia + "?");
		if (respuesta == JOptionPane.YES_OPTION) {
			pst.execute();
			JOptionPane.showConfirmDialog(null, "Registro No." + id_compañia +"Actualizado");
		}
	}
	catch (Exception e) {
	System.out.println(e.getMessage());	
	}
	}
	
	}
		

	
      
	
	
	
	
	
	

