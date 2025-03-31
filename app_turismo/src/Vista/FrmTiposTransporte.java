package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Agencia;
import Model.TipoTransporte;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmTiposTransporte extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textnombre;
	private JTextField textObservacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmTiposTransporte frame = new FrmTiposTransporte();
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
	public FrmTiposTransporte() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(82, 64, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblObservacion = new JLabel("Observacion");
		lblObservacion.setBounds(82, 123, 46, 14);
		contentPane.add(lblObservacion);
		
		textnombre = new JTextField();
		textnombre.setBounds(181, 61, 86, 20);
		contentPane.add(textnombre);
		textnombre.setColumns(10);
		
		textObservacion = new JTextField();
		textObservacion.setBounds(181, 120, 86, 20);
		contentPane.add(textObservacion);
		textObservacion.setColumns(10);
		
		JButton btnguardar = new JButton("GUARDAR");
		btnguardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TipoTransporte cr = new TipoTransporte ();
				cr.create(textnombre.getText(),textObservacion.getText());
				
			}
		});
		btnguardar.setBounds(178, 189, 89, 23);
		contentPane.add(btnguardar);
	}
}
