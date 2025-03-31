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

public class FrmMedios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textnombre;
	private JTextField textobservacion;

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
		lblnombre.setBounds(96, 37, 46, 14);
		contentPane.add(lblnombre);
		
		textnombre = new JTextField();
		textnombre.setBounds(197, 34, 86, 20);
		contentPane.add(textnombre);
		textnombre.setColumns(10);
		
		JLabel lblobservacion = new JLabel("Observacion");
		lblobservacion.setBounds(96, 87, 46, 14);
		contentPane.add(lblobservacion);
		
		textobservacion = new JTextField();
		textobservacion.setBounds(197, 84, 86, 20);
		contentPane.add(textobservacion);
		textobservacion.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Medios cr = new Medios();
				cr.create(textnombre.getText(),textobservacion.getText());
			}
		});
		btnGuardar.setBounds(145, 145, 89, 23);
		contentPane.add(btnGuardar);
	}

}
