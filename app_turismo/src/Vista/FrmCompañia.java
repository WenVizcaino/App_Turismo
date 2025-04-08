package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Compañia;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmCompañia extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textrazonsocial;
	private JTextField textdireccion;
	private JTextField texttelefono;
	private JTextField textcorreo;
	private JTextField textfechacreacion;
	private JTextField textid_compañia;
	Compañia cr = new Compañia();
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
		setBounds(100, 100, 450, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblrazonsocial = new JLabel("Razon Social");
		lblrazonsocial.setBounds(27, 61, 46, 14);
		contentPane.add(lblrazonsocial);
		
		JLabel lbldireccion = new JLabel("Direccion");
		lbldireccion.setBounds(27, 86, 46, 14);
		contentPane.add(lbldireccion);
		
		JLabel lblcorreo = new JLabel("Correo");
		lblcorreo.setBounds(27, 135, 46, 14);
		contentPane.add(lblcorreo);
		
		JLabel lblweb = new JLabel("Web");
		lblweb.setBounds(27, 185, 46, 14);
		contentPane.add(lblweb);
		
		JLabel lblfechacreacion = new JLabel("Fecha Creacion");
		lblfechacreacion.setBounds(27, 160, 46, 14);
		contentPane.add(lblfechacreacion);
		
		JLabel lbltelefono = new JLabel("Telefono");
		lbltelefono.setBounds(27, 111, 46, 14);
		contentPane.add(lbltelefono);
		
		textrazonsocial = new JTextField();
		textrazonsocial.setBounds(83, 58, 86, 20);
		contentPane.add(textrazonsocial);
		textrazonsocial.setColumns(10);
		
		textdireccion = new JTextField();
		textdireccion.setBounds(83, 83, 86, 20);
		contentPane.add(textdireccion);
		textdireccion.setColumns(10);
		
		texttelefono = new JTextField();
		texttelefono.setBounds(83, 108, 86, 20);
		contentPane.add(texttelefono);
		texttelefono.setColumns(10);
		
		textcorreo = new JTextField();
		textcorreo.setBounds(83, 132, 86, 20);
		contentPane.add(textcorreo);
		textcorreo.setColumns(10);
		
		textfechacreacion = new JTextField();
		textfechacreacion.setBounds(83, 157, 86, 20);
		contentPane.add(textfechacreacion);
		textfechacreacion.setColumns(10);
		
		JButton btnguardar = new JButton("GUARDAR");
		btnguardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.create(textrazonsocial.getText(),textdireccion.getText(),texttelefono.getText(),textcorreo.getText(),textfechacreacion.getText(),textweb.getText());

			}
		});
		btnguardar.setBounds(112, 213, 89, 23);
		contentPane.add(btnguardar);
		
		JLabel lblid_compañia = new JLabel("Id Compañia");
		lblid_compañia.setBounds(260, 61, 86, 14);
		contentPane.add(lblid_compañia);
		
		textid_compañia = new JTextField();
		textid_compañia.setBounds(260, 83, 86, 20);
		contentPane.add(textid_compañia);
		textid_compañia.setColumns(10);
		
		JButton btndelete = new JButton("");
		btndelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(textid_compañia.getText()));

			}
		});
		btndelete.setIcon(new ImageIcon("C:\\Users\\SENA\\Downloads\\2931168_bin_delete_remove_trash_garbage_icon (1).png"));
		btndelete.setBounds(348, 161, 56, 57);
		contentPane.add(btndelete);
		
		textweb = new JTextField();
		textweb.setBounds(83, 182, 86, 20);
		contentPane.add(textweb);
		textweb.setColumns(10);
		
		JButton btnconsultar = new JButton("");
		btnconsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.readOne(Integer.parseInt(textid_compañia.getText()),textrazonsocial,textdireccion,texttelefono,textcorreo,textfechacreacion,textweb);

			}
		});
		btnconsultar.setIcon(new ImageIcon("C:\\Users\\SENA\\Downloads\\9161346_search_magnifying_glass_zoom_tools_icon.png"));
		btnconsultar.setBounds(348, 111, 56, 49);
		contentPane.add(btnconsultar);
		
		JLabel lblNewLabel = new JLabel("GESTION COMPAÑIA");
		lblNewLabel.setBounds(167, 27, 102, 20);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.Update(Integer.parseInt(textid_compañia.getText()), textrazonsocial.getText(),textdireccion.getText(),texttelefono.getText(),textcorreo.getText(),textfechacreacion.getText(),textweb.getText());
				
				
				
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\SENA\\Downloads\\9161342_refresh_reload_restart_user_multimedia_icon.png"));
		btnNewButton.setBounds(348, 226, 56, 60);
		contentPane.add(btnNewButton);
	}
}
