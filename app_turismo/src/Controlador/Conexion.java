package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	

	public Connection conectarBD() {
		Connection connection = null;
		try {
//Reaizar la coneccion, String de conexion 
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_turismo","root","2556229");
		System.out.println("Connected whith the database successfully");
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
		return connection; //retomar la conexion abierta con la BD	
	}
}
	
	
	
	
	
	
	
