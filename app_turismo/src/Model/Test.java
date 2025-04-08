package Model;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class Test {

	public static void main(String[] args) {
		Conexion test = new Conexion();
//Conecta la base de datos!!
		if (test.conectarBD() != null) {
			JOptionPane.showConfirmDialog(null, "Conectado a la BD");
		} else {

			JOptionPane.showConfirmDialog(null, "No Conectado a la BD");
		}

	}

}
