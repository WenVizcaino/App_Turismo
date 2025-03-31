package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Agencia;
import Model.Clientes;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmClientes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField texttipodocumento;
	private JTextField textnumerodocumento;
	private JTextField textnombre;
	private JTextField textapellido;
	private JTextField texteps;
	private JTextField textalergias;
	private JTextField textfechanacimiento;
	private JButton btnguardar;
	private JTextField textcorreoelectronico;
	private JTextField textestadocivil;
	private JTextField texttelefono;
	private JTextField textdireción;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmClientes frame = new FrmClientes();
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
	public FrmClientes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTipodocumento = new JLabel("Tipo documento");
		lblTipodocumento.setBounds(37, 73, 76, 14);
		contentPane.add(lblTipodocumento);
		
		texttipodocumento = new JTextField();
		texttipodocumento.setBounds(155, 70, 86, 20);
		contentPane.add(texttipodocumento);
		texttipodocumento.setColumns(10);
		
		JLabel lblNumerodocumento = new JLabel("Numero Documento");
		lblNumerodocumento.setBounds(23, 98, 108, 20);
		contentPane.add(lblNumerodocumento);
		
		textnumerodocumento = new JTextField();
		textnumerodocumento.setBounds(155, 101, 86, 20);
		contentPane.add(textnumerodocumento);
		textnumerodocumento.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(75, 135, 46, 14);
		contentPane.add(lblNombre);
		
		textnombre = new JTextField();
		textnombre.setBounds(155, 132, 86, 20);
		contentPane.add(textnombre);
		textnombre.setColumns(10);
		
		textapellido = new JTextField();
		textapellido.setBounds(155, 163, 86, 20);
		contentPane.add(textapellido);
		textapellido.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Apellido");
		lblNewLabel.setBounds(75, 169, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lbleps = new JLabel("Eps");
		lbleps.setBounds(85, 197, 46, 14);
		contentPane.add(lbleps);
		
		JLabel lblalergias = new JLabel("Alergias");
		lblalergias.setBounds(85, 228, 46, 14);
		contentPane.add(lblalergias);
		
		texteps = new JTextField();
		texteps.setBounds(155, 194, 86, 20);
		contentPane.add(texteps);
		texteps.setColumns(10);
		
		textalergias = new JTextField();
		textalergias.setBounds(155, 225, 86, 20);
		contentPane.add(textalergias);
		textalergias.setColumns(10);
		
		JLabel lblfechanacimiento = new JLabel("Fecha de Nacimiento");
		lblfechanacimiento.setBounds(75, 259, 46, 14);
		contentPane.add(lblfechanacimiento);
		
		textfechanacimiento = new JTextField();
		textfechanacimiento.setBounds(155, 256, 86, 20);
		contentPane.add(textfechanacimiento);
		textfechanacimiento.setColumns(10);
		
		btnguardar = new JButton("Guardar");
		btnguardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			Clientes cr = new Clientes();
			cr.create(texttipodocumento.getText(),textnumerodocumento.getText(),textnombre.getText(),textapellido.getText(),texteps.getText(),textalergias.getText(),textfechanacimiento.getText(),textcorreoelectronico.getText(),textestadocivil.getText(),texttelefono.getText(),textdireción.getText());
	
			}
		});
		btnguardar.setBounds(324, 193, 89, 23);
		contentPane.add(btnguardar);
		
		JLabel lblCorreoElectronico = new JLabel("Correo ");
		lblCorreoElectronico.setBounds(75, 296, 46, 14);
		contentPane.add(lblCorreoElectronico);
		
		textcorreoelectronico = new JTextField();
		textcorreoelectronico.setBounds(155, 293, 86, 20);
		contentPane.add(textcorreoelectronico);
		textcorreoelectronico.setColumns(10);
		
		JLabel lblEstadoCivil = new JLabel("Estado Civil");
		lblEstadoCivil.setBounds(75, 333, 46, 14);
		contentPane.add(lblEstadoCivil);
		
		textestadocivil = new JTextField();
		textestadocivil.setBounds(155, 330, 86, 20);
		contentPane.add(textestadocivil);
		textestadocivil.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(85, 373, 46, 14);
		contentPane.add(lblTelefono);
		
		texttelefono = new JTextField();
		texttelefono.setBounds(155, 370, 86, 20);
		contentPane.add(texttelefono);
		texttelefono.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(85, 400, 46, 14);
		contentPane.add(lblDireccion);
		
		textdireción = new JTextField();
		textdireción.setBounds(155, 406, 86, 20);
		contentPane.add(textdireción);
		textdireción.setColumns(10);
	}
}
