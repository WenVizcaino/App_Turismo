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

public class FrmTiposMedios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtObservacion;
	private JTextField txtidmedios;

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
		lblNombre.setBounds(123, 81, 46, 14);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(226, 78, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblObservacion = new JLabel("Observacion");
		lblObservacion.setBounds(123, 129, 75, 14);
		contentPane.add(lblObservacion);
		
		txtObservacion = new JTextField();
		txtObservacion.setBounds(226, 126, 86, 20);
		contentPane.add(txtObservacion);
		txtObservacion.setColumns(10);
		
		JLabel lblGestionMedios = new JLabel("Gestion de tipo de medios");
		lblGestionMedios.setBounds(154, 11, 141, 14);
		contentPane.add(lblGestionMedios);
		
		JLabel lblidmedios = new JLabel("Id Medios");
		lblidmedios.setBounds(141, 170, 46, 14);
		contentPane.add(lblidmedios);
		
		txtidmedios = new JTextField();
		txtidmedios.setBounds(226, 167, 86, 20);
		contentPane.add(txtidmedios);
		txtidmedios.setColumns(10);
		
		JButton btnguardar = new JButton("GUARDAR");
		btnguardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TiposMedios cr = new TiposMedios();
				cr.create(txtNombre.getText(),txtObservacion.getText(),txtidmedios.getText());
			}
		});
		btnguardar.setBounds(195, 213, 89, 23);
		contentPane.add(btnguardar);
	}
}
