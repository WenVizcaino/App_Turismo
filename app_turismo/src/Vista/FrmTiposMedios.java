package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.TiposMedios;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;

public class FrmTiposMedios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtObservacion;
	private JTextField txtidmedios;
	private JTextField textidtiposmedios;
	TiposMedios cr = new TiposMedios();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmTiposMedios frame = new FrmTiposMedios();
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
	public FrmTiposMedios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(49, 81, 46, 14);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(123, 78, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblObservacion = new JLabel("Observacion");
		lblObservacion.setBounds(49, 117, 75, 14);
		contentPane.add(lblObservacion);
		
		txtObservacion = new JTextField();
		txtObservacion.setBounds(123, 109, 86, 20);
		contentPane.add(txtObservacion);
		txtObservacion.setColumns(10);
		
		JLabel lblGestionMedios = new JLabel("Gestion de tipo de medios");
		lblGestionMedios.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblGestionMedios.setBounds(140, 26, 158, 14);
		contentPane.add(lblGestionMedios);
		
		JLabel lblidmedios = new JLabel("Id Medios");
		lblidmedios.setBounds(49, 152, 46, 14);
		contentPane.add(lblidmedios);
		
		txtidmedios = new JTextField();
		txtidmedios.setBounds(123, 149, 86, 20);
		contentPane.add(txtidmedios);
		txtidmedios.setColumns(10);
		
		JButton btnguardar = new JButton("GUARDAR");
		btnguardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				cr.create(txtNombre.getText(),txtObservacion.getText(),txtidmedios.getText());
			}
		});
		btnguardar.setBounds(77, 196, 89, 23);
		contentPane.add(btnguardar);
		
		JLabel lblidtiposmedios = new JLabel("Id Tipos Medios");
		lblidtiposmedios.setBounds(286, 81, 46, 14);
		contentPane.add(lblidtiposmedios);
		
		textidtiposmedios = new JTextField();
		textidtiposmedios.setBounds(264, 106, 86, 20);
		contentPane.add(textidtiposmedios);
		textidtiposmedios.setColumns(10);
		
		JButton btndelete = new JButton("");
		btndelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(textidtiposmedios.getText()));

			}
		});
		btndelete.setIcon(new ImageIcon("C:\\Users\\SENA\\Downloads\\2931168_bin_delete_remove_trash_garbage_icon (1).png"));
		btndelete.setBounds(321, 137, 46, 63);
		contentPane.add(btndelete);
		
		JButton btnconsult = new JButton("");
		btnconsult.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.readOne(Integer.parseInt(textidtiposmedios.getText()),txtNombre,txtObservacion,txtidmedios);
			
			}
		});
		btnconsult.setIcon(new ImageIcon("C:\\Users\\SENA\\Downloads\\9161346_search_magnifying_glass_zoom_tools_icon.png"));
		btnconsult.setBounds(242, 137, 53, 51);
		contentPane.add(btnconsult);
	}
}
