package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Compañia;
import Model.Medios;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class FrmMedios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textnombre;
	private JTextField textobservacion;
	private JTextField textidmedios;
	Medios cr = new Medios();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmMedios frame = new FrmMedios();
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
	public FrmMedios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblnombre = new JLabel("Nombre");
		lblnombre.setBounds(66, 90, 46, 14);
		contentPane.add(lblnombre);
		
		textnombre = new JTextField();
		textnombre.setBounds(122, 87, 86, 20);
		contentPane.add(textnombre);
		textnombre.setColumns(10);
		
		JLabel lblobservacion = new JLabel("Observacion");
		lblobservacion.setBounds(52, 142, 60, 8);
		contentPane.add(lblobservacion);
		
		textobservacion = new JTextField();
		textobservacion.setBounds(122, 139, 86, 20);
		contentPane.add(textobservacion);
		textobservacion.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.create(textnombre.getText(),textobservacion.getText());
			}
		});
		btnGuardar.setBounds(74, 182, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblidmedios = new JLabel("Id Medios");
		lblidmedios.setBounds(321, 79, 46, 14);
		contentPane.add(lblidmedios);
		
		textidmedios = new JTextField();
		textidmedios.setBounds(302, 94, 86, 20);
		contentPane.add(textidmedios);
		textidmedios.setColumns(10);
		
		JButton btndelete = new JButton("");
		btndelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(textidmedios.getText()));

			}
		});
		btndelete.setIcon(new ImageIcon("C:\\Users\\SENA\\Downloads\\2931168_bin_delete_remove_trash_garbage_icon (1).png"));
		btndelete.setBounds(344, 125, 60, 57);
		contentPane.add(btndelete);
		
		JButton btnconsultar = new JButton("");
		btnconsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.readOne(Integer.parseInt(textidmedios.getText()),textnombre,textobservacion);

			}
		});
		btnconsultar.setIcon(new ImageIcon("C:\\Users\\SENA\\Downloads\\9161346_search_magnifying_glass_zoom_tools_icon.png"));
		btnconsultar.setBounds(286, 131, 48, 51);
		contentPane.add(btnconsultar);
		
		JLabel lblNewLabel = new JLabel("GESTION DE MEDIOS");
		lblNewLabel.setBounds(161, 28, 102, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.Update(Integer.parseInt(textidmedios.getText()), textnombre.getText(),textobservacion.getText());
				
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\SENA\\Downloads\\9161342_refresh_reload_restart_user_multimedia_icon.png"));
		btnNewButton.setBounds(321, 193, 60, 40);
		contentPane.add(btnNewButton);
	}
}
