package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controlador.Conexion;

public class Paquetes {

	public int codigo;
	public int iddestion;
	public int idorigen;
	public String fechaventa = "";
	public String horaventa = "";
	public String horasalida = "";
	public String fechaejecucion = "";
	public String observacion = "";
	public int idmedios = 0;
	public int idtipotransporte = 0;
	public int idclientes = 0;
	public int id_agencia = 0;
	public int idpromotores = 0;
	public int precio = 0;
	Conexion conector = new Conexion();

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getIddestion() {
		return iddestion;
	}

	public void setIddestion(int iddestion) {
		this.iddestion = iddestion;
	}

	public int getIdorigen() {
		return idorigen;
	}

	public void setIdorigen(int idorigen) {
		this.idorigen = idorigen;
	}

	public String getFechaventa() {
		return fechaventa;
	}

	public void setFechaventa(String fechaventa) {
		this.fechaventa = fechaventa;
	}

	public String getHoraventa() {
		return horaventa;
	}

	public void setHoraventa(String horaventa) {
		this.horaventa = horaventa;
	}

	public String getHorasalida() {
		return horasalida;
	}

	public void setHorasalida(String horasalida) {
		this.horasalida = horasalida;
	}

	public String getFechaejecucion() {
		return fechaejecucion;
	}

	public void setFechaejecucion(String fechaejecucion) {
		this.fechaejecucion = fechaejecucion;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public int getIdmedios() {
		return idmedios;
	}

	public void setIdmedios(int idmedios) {
		this.idmedios = idmedios;
	}

	public int getIdtipotransporte() {
		return idtipotransporte;
	}

	public void setIdtipotransporte(int idtipotransporte) {
		this.idtipotransporte = idtipotransporte;
	}

	public int getIdclientes() {
		return idclientes;
	}

	public void setIdclientes(int idclientes) {
		this.idclientes = idclientes;
	}

	public int getIdeagencia() {
		return id_agencia;
	}

	public void setIdeagencia(int ideagencia) {
		this.id_agencia = ideagencia;
	}

	public int getIdpromotores() {
		return idpromotores;
	}

	public void setIdpromotores(int idpromotores) {
		this.idpromotores = idpromotores;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public void create( String iddestion, String idorigen, String fechaventa, String horaventa, String horasalida, String fechaejecucion,
			String observacion, String idmedios, String idtipotransporte, String idclientes, String id_agencia, String idpromotores, String precio) {


		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "INSERT INTO tblpaquetes (iddestion,idorigen,fechaventa,horaventa,horasalida,fechaejecucion,observacion, idmedios,idtipotransporte,idclientes,id_agencia, idpromotores,precio) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";

		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);

			pst.setString(1, iddestion);
			pst.setString(2, idorigen);
			pst.setString(3, fechaventa);
			pst.setString(4, horaventa);
			pst.setString(5, horasalida);
			pst.setString(6, fechaejecucion);
			pst.setString(7, observacion);
			pst.setString(8, idmedios);
			pst.setString(9, idtipotransporte);
			pst.setString(10, idclientes);
			pst.setString(11, id_agencia);
			pst.setString(12, idpromotores);
			pst.setString(13, precio);

			pst.executeUpdate();

			JOptionPane.showConfirmDialog(null, "Registro con Exito.");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public void delete(int codigo) {
		Connection bdConnection = null;
		   PreparedStatement pst = null;
		   String script = "DELETE FROM tblpaquetes WHERE codigo = ?";

		try {
			bdConnection = conector.conectarBD();
			pst = bdConnection.prepareStatement(script);

			pst.setInt(1, codigo);

			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + codigo + "?");

			if (resp == JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + codigo + " Eliminado");

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		}

	public void readOne(int codigo, JTextField iddestion, JTextField idorigen, JTextField fechaventa,
			JTextField horaventa, JTextField horasalida, JTextField fechaejecucion,
			JTextField observacion, JTextField idmedios, JTextField idtipotransporte,
			JTextField idpromotores, JTextField precio, JTextField idclientes,JTextField id_agencia) {

		Connection bdConnection = null;
		PreparedStatement pst = null;
		String script = "SELECT * FROM tblpaquetes WHERE codigo = ?";

		try {
			bdConnection = conector.conectarBD();
			pst = bdConnection.prepareStatement(script);

			pst.setInt(1, codigo);

			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				iddestion.setText(rs.getString(2));
				idorigen.setText(rs.getString(3));
				fechaventa.setText(rs.getString(4));
				horaventa.setText(rs.getString(5));
				horasalida.setText(rs.getString(6));
				fechaejecucion.setText(rs.getString(7));
				observacion.setText(rs.getString(8));
				idmedios.setText(rs.getString(9));
				idtipotransporte.setText(rs.getString(10));
				idpromotores.setText(rs.getString(11));
				precio.setText(rs.getString(12));
				idclientes.setText(rs.getString(13));
				id_agencia.setText(rs.getString(13));
			
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}

	public void Update(int codigo, String iddestion, String idorigen, String fechaventa, String horaventa, String horasalida, String fechaejecucion,
			String observacion, String idmedios, String idtipotransporte, String idpromotores, String precio, String idclientes,String id_agencia) {

		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "UPDATE tblpaquetes SET iddestion = ?, idorigen = ?, fechaventa = ?, horaventa = ?, horasalida = ?, fechaejecucion = ?, observacion  = ?, idmedios = ?,  idtipotransporte = ?, idpromotores = ?, precio = ?,  tblclientes_idclientes = ?, id_agencia = ? WHERE codigo = ?" ;
		
		try { dbConnection = conector.conectarBD();
		pst = dbConnection.prepareStatement(script);
		
		
		pst.setString(1,iddestion);
		pst.setString(2,idorigen);
		pst.setString(3,fechaventa);
		pst.setString(4,horaventa);
		pst.setString(5,horasalida);
		pst.setString(6,fechaejecucion);
		pst.setString(7,observacion);
		pst.setString(8,idmedios);
		pst.setString(9,idtipotransporte);
		pst.setString(10,idpromotores);
		pst.setString(11,precio);
		pst.setString(12,idclientes);
		pst.setString(13,id_agencia);
		pst.setInt(14,codigo);
	
		int respuesta = JOptionPane.showConfirmDialog(null, "Desea actualizar el reistro No. " + codigo + "?");
		if (respuesta == JOptionPane.YES_OPTION) {
			pst.execute();
			JOptionPane.showConfirmDialog(null, "Registro No." + codigo +"Actualizado");
		}
	}
	  catch (Exception e) {
		System.out.println(e.getMessage());

	}
		
}
		
}

