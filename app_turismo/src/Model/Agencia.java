package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controlador.Conexion;

public class Agencia {
//atributos
	public int id_agencia;
	public String nombre;
	public int dirección;
	public String Correoelectronico;
	public int telefono;
	public String wed;
	public int idcompañia;

	
	//llamando clasesz coneccion
	Conexion conector = new Conexion();

	
	//contructores
	public int getIdagencia() {

		return id_agencia;
	}

	public void setIdagencia(int id_agencia) {
		this.id_agencia = id_agencia;
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
	
	//metodo que recibe y no retorna, se llama create


	public void create(String Nombre, String direccion, String correo, String tel, String web, String tblcompañia_id_compañia) {

		Connection dbConnection = null;
		PreparedStatement pst = null; //prepara la transaccion

		String script = "INSERT INTO tblagencia (nombre, dirección, correoelectronico, telefono, web, tblcompañia_id_compañia) values (?,?,?,?,?,?)";

		try {
			dbConnection = conector.conectarBD(); // abre la conecccion
			pst = dbConnection.prepareStatement(script); //buffer, Almacenamiento temporal

			
			//parametrizar los campos
			pst.setString(1, Nombre);
			pst.setString(2, direccion);
			pst.setString(3, correo);
			pst.setString(4, tel);
			pst.setString(5, web);
			pst.setString(6, tblcompañia_id_compañia);
             // ejecuta la transaccion
			pst.executeUpdate();

			JOptionPane.showConfirmDialog(null, "Registro con Exito.");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	//Eliminar, este metodo elimina un registro de la tabla "tblagencia" basado en el "id_agencia"
	
	//metodo que recibe y no retorna

	public void delete(int id_agencia) {
	
		Connection bdConnection = null;
		PreparedStatement pst = null; //prepara la transaccion
		String script = "DELETE FROM tblagencia WHERE id_agencia = ?";

		try {
			bdConnection = conector.conectarBD();
			pst = bdConnection.prepareStatement(script);

			pst.setInt(1, id_agencia);

			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + id_agencia + "?");

			if (resp == JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + id_agencia + " Eliminado");

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}
	//consultar, este metodo consulta un registro especifico de la tabla "tblagencia" utilizando "id_agencia" proporcionado
	
	
	//metodo que recibe y no retorna

	public void readOne(int id_agencia, JTextField Nombre, JTextField dirección, JTextField CorreoElectronico,
			JTextField Telefono, JTextField web, JTextField tblcompañia_id_compañia) {

		Connection bdConnection = null;
		PreparedStatement pst = null;
		String script = "SELECT * FROM tblagencia WHERE id_agencia = ?";

		try {
			bdConnection = conector.conectarBD();
			pst = bdConnection.prepareStatement(script);

			pst.setInt(1, id_agencia);

			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Nombre.setText(rs.getString(2));
				dirección.setText(rs.getString(3));
				CorreoElectronico.setText(rs.getString(4));
				Telefono.setText(rs.getString(5));
				web.setText(rs.getString(6));
				tblcompañia_id_compañia.setText(rs.getString(7));

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}
	//Actualizar, Este metodo Actualiza un registro existente en la tblagencia con los nuevos valores proporcionados 
	
	
	//metodo que recibe y no retorna

	public void Update(int id_agencia, String Nombre, String dirección, String CorreoElectronico,
			String Telefono, String web, String tblcompañia_id_compañia) {

		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "UPDATE tblagencia SET nombre = ?, dirección = ?, correoelectronico = ?, telefono = ?, web = ?, tblcompañia_id_compañia = ? WHERE id_agencia = ? " ;
			
		try { dbConnection = conector.conectarBD();
		pst = dbConnection.prepareStatement(script);
		
		pst.setString(1,Nombre);
		pst.setString(2,dirección);
		pst.setString(3,CorreoElectronico);
		pst.setString(4,Telefono);
		pst.setString(5,web);
		pst.setString(6,tblcompañia_id_compañia);
		pst.setInt(7,id_agencia);
	
		int respuesta = JOptionPane.showConfirmDialog(null, "Desea actualizar el reistro No. " + id_agencia + "?");
		if (respuesta == JOptionPane.YES_OPTION) {
			pst.execute();
			JOptionPane.showConfirmDialog(null, "Registro No." + id_agencia +"Actualizado");
		}
	}
	  catch (Exception e) {
		System.out.println(e.getMessage());

	}
		
}
		
}

