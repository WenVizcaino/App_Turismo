package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Agencia;
import Model.Compañia;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmCompañia extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textrazonsocial;
	private JTextField textdireccion;
	private JTextField texttelefono;
	private JTextField textcorreo;
	private JTextField textfechaCreacion;
	private JTextField textweb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmCompañia frame = new FrmCompañia();
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
	public FrmCompañia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRazonSocial = new JLabel("Razon Social");
		lblRazonSocial.setBounds(111, 68, 46, 14);
		contentPane.add(lblRazonSocial);
		
		textrazonsocial = new JTextField();
		textrazonsocial.setBounds(196, 65, 86, 20);
		contentPane.add(textrazonsocial);
		textrazonsocial.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(111, 99, 46, 14);
		contentPane.add(lblDireccion);
		
		textdireccion = new JTextField();
		textdireccion.setBounds(196, 96, 86, 20);
		contentPane.add(textdireccion);
		textdireccion.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(111, 146, 46, 14);
		contentPane.add(lblTelefono);
		
		texttelefono = new JTextField();
		texttelefono.setBounds(196, 143, 86, 20);
		contentPane.add(texttelefono);
		texttelefono.setColumns(10);
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setBounds(111, 194, 46, 14);
		contentPane.add(lblCorreo);
		
		textcorreo = new JTextField();
		textcorreo.setBounds(196, 191, 86, 20);
		contentPane.add(textcorreo);
		textcorreo.setColumns(10);
		
		JLabel lblFechaCreacion = new JLabel("Fecha Creacion");
		lblFechaCreacion.setBounds(111, 243, 46, 14);
		contentPane.add(lblFechaCreacion);
		
		textfechaCreacion = new JTextField();
		textfechaCreacion.setBounds(196, 240, 86, 20);
		contentPane.add(textfechaCreacion);
		textfechaCreacion.setColumns(10);
		
		JLabel lblWeb = new JLabel("Web");
		lblWeb.setBounds(111, 284, 46, 14);
		contentPane.add(lblWeb);
		
		textweb = new JTextField();
		textweb.setBounds(196, 284, 86, 20);
		contentPane.add(textweb);
		textweb.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Compañia cr = new Compañia();
				cr.create(textrazonsocial.getText(),textdireccion.getText(),texttelefono.getText(),textcorreo.getText(),textfechaCreacion.getText(),textweb.getText());
				
			}
		});
		btnGuardar.setBounds(155, 346, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblCompañia = new JLabel("Compañia");
		lblCompañia.setBounds(155, 23, 66, 14);
		contentPane.add(lblCompañia);
	}

}
