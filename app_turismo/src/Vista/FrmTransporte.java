package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Agencia;
import Model.Transporte;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmTransporte extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textpuestos;
	private JTextField textmodelo;
	private JTextField textnumeromotor;
	private JTextField textplacavehiculo;
	private JTextField textnombre;
	private JTextField textobservacion;
	private JTextField textidtipotransporte;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmTransporte frame = new FrmTransporte();
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
	public FrmTransporte() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPuestos = new JLabel("Puestos");
		lblPuestos.setBounds(77, 39, 46, 14);
		contentPane.add(lblPuestos);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(77, 82, 46, 14);
		contentPane.add(lblModelo);
		
		textpuestos = new JTextField();
		textpuestos.setBounds(151, 36, 86, 20);
		contentPane.add(textpuestos);
		textpuestos.setColumns(10);
		
		textmodelo = new JTextField();
		textmodelo.setBounds(151, 79, 86, 20);
		contentPane.add(textmodelo);
		textmodelo.setColumns(10);
		
		JLabel lblNumeromotor = new JLabel("Numero de Motor");
		lblNumeromotor.setBounds(77, 123, 46, 14);
		contentPane.add(lblNumeromotor);
		
		textnumeromotor = new JTextField();
		textnumeromotor.setBounds(151, 120, 86, 20);
		contentPane.add(textnumeromotor);
		textnumeromotor.setColumns(10);
		
		JLabel lblPlacavehiculo = new JLabel("Placa vehiculo");
		lblPlacavehiculo.setBounds(77, 168, 46, 14);
		contentPane.add(lblPlacavehiculo);
		
		textplacavehiculo = new JTextField();
		textplacavehiculo.setBounds(151, 165, 86, 20);
		contentPane.add(textplacavehiculo);
		textplacavehiculo.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(77, 212, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblObservacion = new JLabel("Observacion");
		lblObservacion.setBounds(77, 252, 46, 14);
		contentPane.add(lblObservacion);
		
		textnombre = new JTextField();
		textnombre.setBounds(151, 209, 86, 20);
		contentPane.add(textnombre);
		textnombre.setColumns(10);
		
		textobservacion = new JTextField();
		textobservacion.setBounds(151, 249, 86, 20);
		contentPane.add(textobservacion);
		textobservacion.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Transporte cr = new Transporte ();
				cr.create(textpuestos.getText(),textmodelo.getText(),textnumeromotor.getText(),textplacavehiculo.getText(),textnombre.getText(),textobservacion.getText(), textidtipotransporte.getText());
				
				
			}
		});
		btnGuardar.setBounds(299, 119, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblidtipotransporte = new JLabel("ID Tipo Transporte");
		lblidtipotransporte.setBounds(77, 302, 46, 14);
		contentPane.add(lblidtipotransporte);
		
		textidtipotransporte = new JTextField();
		textidtipotransporte.setBounds(151, 299, 86, 20);
		contentPane.add(textidtipotransporte);
		textidtipotransporte.setColumns(10);
	}
}
