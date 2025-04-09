  package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Agencia;
import Model.TiposMedios;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class FrmAgencia extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textNombre;
	private JTextField textdirección;
	private JTextField textCorreoElectronico;
	private JTextField textTelefono;
	private JTextField textWed;
	private JTextField textid_compañia;
	private JTextField textid_agencia;
	Agencia cr = new Agencia();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmAgencia frame = new FrmAgencia();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmAgencia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 536, 372);
		getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(54, 59, 46, 14);
		getContentPane().add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setBounds(164, 56, 86, 20);
		getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(54, 103, 46, 14);
		getContentPane().add(lblDireccion);
		
		JLabel lblCorreoElectronico = new JLabel("Correo Electronico");
		lblCorreoElectronico.setBounds(47, 146, 93, 14);
		getContentPane().add(lblCorreoElectronico);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(63, 177, 46, 14);
		getContentPane().add(lblTelefono);
		
		JLabel lblWed = new JLabel("Web");
		lblWed.setBounds(63, 216, 46, 14);
		getContentPane().add(lblWed);
		
		textdirección = new JTextField();
		textdirección.setBounds(164, 100, 86, 20);
		getContentPane().add(textdirección);
		textdirección.setColumns(10);
		
		textCorreoElectronico = new JTextField();
		textCorreoElectronico.setBounds(164, 143, 86, 20);
		getContentPane().add(textCorreoElectronico);
		textCorreoElectronico.setColumns(10);
		
		textTelefono = new JTextField();
		textTelefono.setBounds(164, 174, 86, 20);
		getContentPane().add(textTelefono);
		textTelefono.setColumns(10);
		
		textWed = new JTextField();
		textWed.setBounds(164, 213, 86, 20);
		getContentPane().add(textWed);
		textWed.setColumns(10);
		
		JButton btnguardar = new JButton("GUARDAR");
		btnguardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnguardar.addMouseListener(new MouseAdapter() {
			@Override
			//Inserta nuevo registro en la tabla "tblagencia" utilizando los parametros proporcionados
			public void mouseClicked(MouseEvent e) {
				cr.create(textNombre.getText(),textdirección.getText(),textCorreoElectronico.getText(),textTelefono.getText(),textWed.getText(),textid_compañia.getText());
				
			}
		});
		btnguardar.setBounds(204, 288, 89, 23);
		getContentPane().add(btnguardar);
		
		JLabel lblidcompañia = new JLabel("ID Compañia");
		lblidcompañia.setBounds(63, 261, 46, 14);
		getContentPane().add(lblidcompañia);
		
		textid_compañia = new JTextField();
		textid_compañia.setBounds(164, 258, 86, 20);
		getContentPane().add(textid_compañia);
		textid_compañia.setColumns(10);
		
		JLabel lblid_agencia = new JLabel("ID Agencia");
		lblid_agencia.setBounds(351, 59, 46, 14);
		getContentPane().add(lblid_agencia);
		
		textid_agencia = new JTextField();
		textid_agencia.setBounds(333, 84, 86, 20);
		getContentPane().add(textid_agencia);
		textid_agencia.setColumns(10);
		
		JButton btndelete = new JButton("");
		btndelete.addMouseListener(new MouseAdapter() {
			@Override
			//Eliminar, este metodo elimina un registro de la tabla "tblagencia" basado en el "id_agencia"
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(textid_agencia.getText()));
			}
		});
		btndelete.setIcon(new ImageIcon("C:\\Users\\SENA\\Downloads\\2931168_bin_delete_remove_trash_garbage_icon (1).png"));
		btndelete.setBounds(351, 115, 46, 57);
		getContentPane().add(btndelete);
		
		JButton btnconsultar = new JButton("");
		btnconsultar.addMouseListener(new MouseAdapter() {
			@Override
			//consultar, este metodo consulta un registro especifico de la tabla "tblagencia" utilizando "id_agencia" proporcionado
			public void mouseClicked(MouseEvent e) {
				cr.readOne(Integer.parseInt(textid_agencia.getText()),textNombre,textdirección,textCorreoElectronico,textTelefono,textWed,textid_compañia);
		}
		});
		btnconsultar.setIcon(new ImageIcon("C:\\Users\\SENA\\Downloads\\9161346_search_magnifying_glass_zoom_tools_icon.png"));
		btnconsultar.setBounds(282, 126, 53, 46);
		getContentPane().add(btnconsultar);
		
		JLabel lblNewLabel = new JLabel("GESTION AGENCIA");
		lblNewLabel.setBounds(204, 11, 93, 14);
		getContentPane().add(lblNewLabel);
		
		JButton btnupdate = new JButton("");
		btnupdate.addMouseListener(new MouseAdapter() {
			@Override
			//Actualizar, Este metodo Actualiza un registro existente en la tblagencia con los nuevos valores proporcionados 
			public void mouseClicked(MouseEvent e) {
			cr.Update(Integer.parseInt(textid_agencia.getText()), textNombre.getText(), textdirección.getText(), textCorreoElectronico.getText(),textTelefono.getText(), textWed.getText(), textid_compañia.getText());
			
			}
		});
		btnupdate.setIcon(new ImageIcon("C:\\Users\\SENA\\Downloads\\9161342_refresh_reload_restart_user_multimedia_icon.png"));
		btnupdate.setBounds(415, 126, 68, 46);
		getContentPane().add(btnupdate);
		
		
		//°La clase utiliza una conexión a la base de datos para realizar las operaciones CRUD.
		//Los métodos utilizan sentencias SQL para interactuar con la base de datos.
		//Los parámetros de los métodos son los datos que se van a insertar, actualizar o eliminar en la base de datos.
		//Los campos de texto son utilizados para mostrar los datos del registro consultado o actualizado.
	}
}
