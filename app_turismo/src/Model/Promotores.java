package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controlador.Conexion;

public class Promotores {
	public int idpromotores =0;
	public String tipoidentificacion="";
	public int numerodocumento =0;
	public String nombre ="";
	public String apellido ="";
	public String direción ="";
	public String correopersonal="";
	public String correocorporativo="";
	public String fechanacimiento="";
	public int telefono =0;
	Conexion conector = new Conexion();

	public int getIdpromotores() {
		return idpromotores;
	}
	public void setIdpromotores(int idpromotores) {
		this.idpromotores = idpromotores;
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
		return direción;
	}
	public void setDireccion(String direccion) {
		this.direción = direccion;
	}
	public String getCorreopersonal() {
		return correopersonal;
	}
	public void setCorreopersonal(String correopersonal) {
		this.correopersonal = correopersonal;
	}
	public String getCorreocorporativo() {
		return correocorporativo;
	}
	public void setCorreocorporativo(String correocorporativo) {
		this.correocorporativo = correocorporativo;
	}
	public String getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public void create( String tipoidentificacion, String numerodocumento, String nombre, String apellido, String direción, String correopersonal,
			String correocorporativo, String fechanacimiento, String telefono) {


		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "INSERT INTO tblPromotores (tipoidentificacion, numerodocumento, nombre,apellido,direción,correopersonal, correocorporativo, fechanacimiento, telefono) values (?,?,?,?,?,?,?,?,?)";

		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);

			pst.setString(1, tipoidentificacion);
			pst.setString(2, numerodocumento);
			pst.setString(3, nombre);
			pst.setString(4, apellido);
			pst.setString(5, direción);
			pst.setString(6, correopersonal);
			pst.setString(7, correocorporativo);
			pst.setString(8, fechanacimiento);
			pst.setString(9, telefono);
		

			pst.executeUpdate();

			JOptionPane.showConfirmDialog(null, "Registro con Exito.");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	
	
	}
	public void delete(int idpromotores) {
		Connection bdConnection = null;
		   PreparedStatement pst = null;
		   String script = "DELETE FROM tblpromotores WHERE idpromotores = ?";

		try {
			bdConnection = conector.conectarBD();
			pst = bdConnection.prepareStatement(script);

			pst.setInt(1, idpromotores);

			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idpromotores + "?");

			if (resp == JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + idpromotores + " Eliminado");

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}
	public void readOne(int idpromotores, JTextField tipoidentificacion, JTextField numerodocumento,
			JTextField nombre, JTextField apellido, JTextField direción, JTextField correopersonal,
			JTextField correocorporativo, JTextField fechanacimiento, JTextField telefono) {
		
		Connection bdConnection = null;
		PreparedStatement pst = null;
		String script = "SELECT * FROM tblpromotores WHERE idpromotores = ?";

		try {
			bdConnection = conector.conectarBD();
			pst = bdConnection.prepareStatement(script);

			pst.setInt(1, idpromotores);

			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				tipoidentificacion.setText(rs.getString(2));
				numerodocumento.setText(rs.getString(3));
				nombre.setText(rs.getString(4));
				apellido.setText(rs.getString(5));
				direción.setText(rs.getString(6));
				correopersonal.setText(rs.getString(7));
				correocorporativo.setText(rs.getString(8));
				fechanacimiento.setText(rs.getString(9));
				telefono.setText(rs.getString(10));
				
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}		
	}			
	
}
	
		
	

