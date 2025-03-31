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

public class FrmAgencia extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textNombre;
	private JTextField textdirección;
	private JTextField textCorreoElectronico;
	private JTextField textTelefono;
	private JTextField textWed;
	private JTextField textidcompañia;

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
		
		JLabel lblWed = new JLabel("Wed ");
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
			public void mouseClicked(MouseEvent e) {
				Agencia cr = new Agencia();
				cr.create(textNombre.getText(),textdirección.getText(),textCorreoElectronico.getText(),textTelefono.getText(),textWed.getText(),textidcompañia.getText());
				
			}
		});
		btnguardar.setBounds(351, 270, 89, 23);
		getContentPane().add(btnguardar);
		
		JLabel lblidcompañia = new JLabel("ID Compañia");
		lblidcompañia.setBounds(63, 261, 46, 14);
		getContentPane().add(lblidcompañia);
		
		textidcompañia = new JTextField();
		textidcompañia.setBounds(164, 258, 86, 20);
		getContentPane().add(textidcompañia);
		textidcompañia.setColumns(10);
		
	}
}
