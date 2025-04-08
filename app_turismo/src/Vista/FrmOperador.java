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
import javax.swing.ImageIcon;

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
	private JLabel lblidoperador;
	private JTextField textidoperador;
	private JButton btndelete;
	Operador cr = new Operador();
	private JButton btnconsultar;
	private JLabel lblNewLabel;
	private JButton btnNewButton;

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
		lblTipoIdentificacion.setBounds(67, 105, 46, 14);
		contentPane.add(lblTipoIdentificacion);
		
		texttipoidentificacion = new JTextField();
		texttipoidentificacion.setBounds(140, 102, 86, 20);
		contentPane.add(texttipoidentificacion);
		texttipoidentificacion.setColumns(10);
		
		JLabel lblNumeroDocumento = new JLabel("Numero Documento");
		lblNumeroDocumento.setBounds(67, 150, 46, 14);
		contentPane.add(lblNumeroDocumento);
		
		textnumerodocumento = new JTextField();
		textnumerodocumento.setBounds(140, 147, 86, 20);
		contentPane.add(textnumerodocumento);
		textnumerodocumento.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(67, 192, 46, 14);
		contentPane.add(lblNombre);
		
		textnombre = new JTextField();
		textnombre.setBounds(140, 189, 86, 20);
		contentPane.add(textnombre);
		textnombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(67, 227, 46, 14);
		contentPane.add(lblApellido);
		
		textapellido = new JTextField();
		textapellido.setBounds(140, 224, 86, 20);
		contentPane.add(textapellido);
		textapellido.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(67, 269, 46, 14);
		contentPane.add(lblDireccion);
		
		textdireción = new JTextField();
		textdireción.setBounds(140, 266, 86, 20);
		contentPane.add(textdireción);
		textdireción.setColumns(10);
		
		JLabel lblCorreoElectronico = new JLabel("Correo Electronico");
		lblCorreoElectronico.setBounds(67, 302, 46, 14);
		contentPane.add(lblCorreoElectronico);
		
		textcorreoelectronico = new JTextField();
		textcorreoelectronico.setBounds(140, 299, 86, 20);
		contentPane.add(textcorreoelectronico);
		textcorreoelectronico.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(67, 333, 46, 14);
		contentPane.add(lblTelefono);
		
		textelefono = new JTextField();
		textelefono.setBounds(140, 330, 86, 20);
		contentPane.add(textelefono);
		textelefono.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.create(texttipoidentificacion.getText(),textnumerodocumento.getText(),textnombre.getText(),textapellido.getText(),textdireción.getText(),textcorreoelectronico.getText(),textelefono.getText(),textid_transporte.getText());
		
			}
		});
		btnGuardar.setBounds(107, 398, 89, 23);
		contentPane.add(btnGuardar);
		
		lblidtransporte = new JLabel("ID transporte");
		lblidtransporte.setBounds(67, 373, 46, 14);
		contentPane.add(lblidtransporte);
		
		textid_transporte = new JTextField();
		textid_transporte.setBounds(140, 367, 86, 20);
		contentPane.add(textid_transporte);
		textid_transporte.setColumns(10);
		
		lblidoperador = new JLabel("Id Operador");
		lblidoperador.setBounds(306, 183, 46, 14);
		contentPane.add(lblidoperador);
		
		textidoperador = new JTextField();
		textidoperador.setBounds(291, 208, 86, 20);
		contentPane.add(textidoperador);
		textidoperador.setColumns(10);
		
		btndelete = new JButton("");
		btndelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(textidoperador.getText()));

			}
		});
		btndelete.setIcon(new ImageIcon("C:\\Users\\SENA\\Downloads\\2931168_bin_delete_remove_trash_garbage_icon (1).png"));
		btndelete.setBounds(354, 302, 56, 57);
		contentPane.add(btndelete);
		
		btnconsultar = new JButton("");
		btnconsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.readOne(Integer.parseInt(textidoperador.getText()),texttipoidentificacion,textnumerodocumento,textnombre,textapellido,textdireción,textcorreoelectronico,textelefono,textid_transporte);

			}
		});
		btnconsultar.setIcon(new ImageIcon("C:\\Users\\SENA\\Downloads\\9161346_search_magnifying_glass_zoom_tools_icon.png"));
		btnconsultar.setBounds(344, 239, 66, 47);
		contentPane.add(btnconsultar);
		
		lblNewLabel = new JLabel("GESTION DE OPERADOR");
		lblNewLabel.setBounds(154, 29, 133, 14);
		contentPane.add(lblNewLabel);
		
		btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.Update(Integer.parseInt(textidoperador.getText()), texttipoidentificacion.getText(), textnumerodocumento.getText(), textnombre.getText(), textapellido.getText(), textdireción.getText(), textcorreoelectronico.getText(),textelefono.getText(),textid_transporte.getText());
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\SENA\\Downloads\\9161342_refresh_reload_restart_user_multimedia_icon.png"));
		btnNewButton.setBounds(344, 364, 66, 57);
		contentPane.add(btnNewButton);
	}

}
