package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Paquetes;
import Model.Promotores;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class FrmPromotores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField texttipoidentificacion;
	private JTextField textnumerodocumento;
	private JTextField textnombre;
	private JTextField textapellido;
	private JTextField textdireción;
	private JTextField textcorreopersonal;
	private JTextField textcorreocorporativo;
	private JTextField textfechanacimiento;
	private JTextField texttelefono;
	private JTextField textidpromotores;
	Promotores cr = new Promotores ();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPromotores frame = new FrmPromotores();
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
	public FrmPromotores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 585);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTipodeIdentificacion = new JLabel("Tipo de Identificacion");
		lblTipodeIdentificacion.setBounds(78, 82, 46, 14);
		contentPane.add(lblTipodeIdentificacion);
		
		JLabel lblNumerodeDocumento = new JLabel("Numero de documento");
		lblNumerodeDocumento.setBounds(78, 124, 46, 14);
		contentPane.add(lblNumerodeDocumento);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(78, 174, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(78, 221, 46, 14);
		contentPane.add(lblApellido);
		
		JLabel lblDireccion = new JLabel("direción");
		lblDireccion.setBounds(78, 259, 46, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblCorreoPersonal = new JLabel("Correo Personal");
		lblCorreoPersonal.setBounds(78, 301, 46, 14);
		contentPane.add(lblCorreoPersonal);
		
		JLabel lblCorreoCorporativo = new JLabel("Correo Corporativo");
		lblCorreoCorporativo.setBounds(78, 338, 46, 16);
		contentPane.add(lblCorreoCorporativo);
		
		JLabel lblFechaNaciento = new JLabel("Fecha de Nacimiento");
		lblFechaNaciento.setBounds(78, 385, 46, 14);
		contentPane.add(lblFechaNaciento);
		
		texttipoidentificacion = new JTextField();
		texttipoidentificacion.setBounds(153, 79, 86, 20);
		contentPane.add(texttipoidentificacion);
		texttipoidentificacion.setColumns(10);
		
		textnumerodocumento = new JTextField();
		textnumerodocumento.setBounds(153, 121, 86, 20);
		contentPane.add(textnumerodocumento);
		textnumerodocumento.setColumns(10);
		
		textnombre = new JTextField();
		textnombre.setBounds(153, 171, 86, 20);
		contentPane.add(textnombre);
		textnombre.setColumns(10);
		
		textapellido = new JTextField();
		textapellido.setBounds(153, 218, 86, 20);
		contentPane.add(textapellido);
		textapellido.setColumns(10);
		
		textdireción = new JTextField();
		textdireción.setBounds(153, 256, 86, 20);
		contentPane.add(textdireción);
		textdireción.setColumns(10);
		
		textcorreopersonal = new JTextField();
		textcorreopersonal.setBounds(153, 298, 86, 20);
		contentPane.add(textcorreopersonal);
		textcorreopersonal.setColumns(10);
		
		textcorreocorporativo = new JTextField();
		textcorreocorporativo.setBounds(153, 336, 86, 20);
		contentPane.add(textcorreocorporativo);
		textcorreocorporativo.setColumns(10);
		
		textfechanacimiento = new JTextField();
		textfechanacimiento.setBounds(153, 382, 86, 20);
		contentPane.add(textfechanacimiento);
		textfechanacimiento.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(78, 427, 46, 14);
		contentPane.add(lblTelefono);
		
		texttelefono = new JTextField();
		texttelefono.setBounds(153, 424, 86, 20);
		contentPane.add(texttelefono);
		texttelefono.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.create(texttipoidentificacion.getText(),textnumerodocumento.getText(),textnombre.getText(),textapellido.getText(),textdireción.getText(),textcorreopersonal.getText(),textcorreocorporativo.getText(),textfechanacimiento.getText(),texttelefono.getText());
			}
		});
		btnGuardar.setBounds(320, 278, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblidpromotores = new JLabel("Id Promotores");
		lblidpromotores.setBounds(398, 85, 79, 14);
		contentPane.add(lblidpromotores);
		
		textidpromotores = new JTextField();
		textidpromotores.setBounds(398, 108, 86, 20);
		contentPane.add(textidpromotores);
		textidpromotores.setColumns(10);
		
		JButton btndelete = new JButton("");
		btndelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(textidpromotores.getText()));

			}
		});
		btndelete.setIcon(new ImageIcon("C:\\Users\\SENA\\Downloads\\2931168_bin_delete_remove_trash_garbage_icon (1).png"));
		btndelete.setBounds(438, 130, 46, 57);
		contentPane.add(btndelete);
		
		JButton btnconsult = new JButton("");
		btnconsult.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.readOne(Integer.parseInt(textidpromotores.getText()),texttipoidentificacion,textnumerodocumento,textnombre,textapellido,textdireción,textcorreopersonal,textcorreocorporativo,textfechanacimiento,texttelefono);

			}
	
		});
		btnconsult.setIcon(new ImageIcon("C:\\Users\\SENA\\Downloads\\9161346_search_magnifying_glass_zoom_tools_icon.png"));
		btnconsult.setBounds(370, 140, 58, 48);
		contentPane.add(btnconsult);
		
		JLabel lblNewLabel = new JLabel("GESTION PROMOTORES");
		lblNewLabel.setBounds(177, 29, 142, 14);
		contentPane.add(lblNewLabel);
	}
}
