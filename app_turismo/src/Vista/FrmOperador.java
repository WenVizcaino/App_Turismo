package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Medios;
import Model.Operador;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmOperador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField texttipoidentificacion;
	private JTextField textnumerodocumento;
	private JTextField textnombre;
	private JTextField textapellido;
	private JTextField textdireción;
	private JTextField textcorreoelectronico;
	private JTextField textelefono;
	private JLabel lblidtransporte;
	private JTextField textid_transporte;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmOperador frame = new FrmOperador();
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
	public FrmOperador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTipoIdentificacion = new JLabel("Tipo Identificacion");
		lblTipoIdentificacion.setBounds(67, 37, 46, 14);
		contentPane.add(lblTipoIdentificacion);
		
		texttipoidentificacion = new JTextField();
		texttipoidentificacion.setBounds(163, 34, 86, 20);
		contentPane.add(texttipoidentificacion);
		texttipoidentificacion.setColumns(10);
		
		JLabel lblNumeroDocumento = new JLabel("Numero Documento");
		lblNumeroDocumento.setBounds(67, 75, 46, 14);
		contentPane.add(lblNumeroDocumento);
		
		textnumerodocumento = new JTextField();
		textnumerodocumento.setBounds(163, 72, 86, 20);
		contentPane.add(textnumerodocumento);
		textnumerodocumento.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(67, 118, 46, 14);
		contentPane.add(lblNombre);
		
		textnombre = new JTextField();
		textnombre.setBounds(163, 115, 86, 20);
		contentPane.add(textnombre);
		textnombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(67, 154, 46, 14);
		contentPane.add(lblApellido);
		
		textapellido = new JTextField();
		textapellido.setBounds(163, 146, 86, 20);
		contentPane.add(textapellido);
		textapellido.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(67, 192, 46, 14);
		contentPane.add(lblDireccion);
		
		textdireción = new JTextField();
		textdireción.setBounds(163, 189, 86, 20);
		contentPane.add(textdireción);
		textdireción.setColumns(10);
		
		JLabel lblCorreoElectronico = new JLabel("Correo Electronico");
		lblCorreoElectronico.setBounds(67, 223, 46, 14);
		contentPane.add(lblCorreoElectronico);
		
		textcorreoelectronico = new JTextField();
		textcorreoelectronico.setBounds(163, 220, 86, 20);
		contentPane.add(textcorreoelectronico);
		textcorreoelectronico.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(67, 260, 46, 14);
		contentPane.add(lblTelefono);
		
		textelefono = new JTextField();
		textelefono.setBounds(163, 257, 86, 20);
		contentPane.add(textelefono);
		textelefono.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Operador cr = new Operador();
				cr.create(texttipoidentificacion.getText(),textnumerodocumento.getText(),textnombre.getText(),textapellido.getText(),textdireción.getText(),textcorreoelectronico.getText(),textelefono.getText(),textid_transporte.getText());
		
			}
		});
		btnGuardar.setBounds(108, 365, 89, 23);
		contentPane.add(btnGuardar);
		
		lblidtransporte = new JLabel("ID transporte");
		lblidtransporte.setBounds(67, 304, 46, 14);
		contentPane.add(lblidtransporte);
		
		textid_transporte = new JTextField();
		textid_transporte.setBounds(163, 301, 86, 20);
		contentPane.add(textid_transporte);
		textid_transporte.setColumns(10);
	}

}
