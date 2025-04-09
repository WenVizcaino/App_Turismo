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
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
	private JTextField textid_transporte;
	Transporte cr = new Transporte ();

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
		lblPuestos.setBounds(41, 96, 46, 14);
		contentPane.add(lblPuestos);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(41, 127, 46, 14);
		contentPane.add(lblModelo);
		
		textpuestos = new JTextField();
		textpuestos.setBounds(151, 93, 86, 20);
		contentPane.add(textpuestos);
		textpuestos.setColumns(10);
		
		textmodelo = new JTextField();
		textmodelo.setBounds(151, 124, 86, 20);
		contentPane.add(textmodelo);
		textmodelo.setColumns(10);
		
		JLabel lblNumeromotor = new JLabel("Numero de Motor");
		lblNumeromotor.setBounds(41, 158, 100, 14);
		contentPane.add(lblNumeromotor);
		
		textnumeromotor = new JTextField();
		textnumeromotor.setBounds(151, 155, 86, 20);
		contentPane.add(textnumeromotor);
		textnumeromotor.setColumns(10);
		
		JLabel lblPlacavehiculo = new JLabel("Placa vehiculo");
		lblPlacavehiculo.setBounds(41, 186, 82, 17);
		contentPane.add(lblPlacavehiculo);
		
		textplacavehiculo = new JTextField();
		textplacavehiculo.setBounds(151, 186, 86, 20);
		contentPane.add(textplacavehiculo);
		textplacavehiculo.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(41, 220, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblObservacion = new JLabel("Observacion");
		lblObservacion.setBounds(41, 251, 82, 14);
		contentPane.add(lblObservacion);
		
		textnombre = new JTextField();
		textnombre.setBounds(151, 217, 86, 20);
		contentPane.add(textnombre);
		textnombre.setColumns(10);
		
		textobservacion = new JTextField();
		textobservacion.setBounds(151, 248, 86, 20);
		contentPane.add(textobservacion);
		textobservacion.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.create(textpuestos.getText(),textmodelo.getText(),textnumeromotor.getText(),textplacavehiculo.getText(),textnombre.getText(),textobservacion.getText(), textidtipotransporte.getText());
				
				
			}
		});
		btnGuardar.setBounds(100, 310, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblidtipotransporte = new JLabel("ID Tipo Transporte");
		lblidtipotransporte.setBounds(41, 285, 89, 14);
		contentPane.add(lblidtipotransporte);
		
		textidtipotransporte = new JTextField();
		textidtipotransporte.setBounds(151, 279, 86, 20);
		contentPane.add(textidtipotransporte);
		textidtipotransporte.setColumns(10);
		
		JLabel lblid_transporte = new JLabel("Id Transporte");
		lblid_transporte.setBounds(321, 82, 46, 14);
		contentPane.add(lblid_transporte);
		
		textid_transporte = new JTextField();
		textid_transporte.setBounds(300, 104, 86, 20);
		contentPane.add(textid_transporte);
		textid_transporte.setColumns(10);
		
		JButton btndelete = new JButton("");
		btndelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(textid_transporte.getText()));

			}
		});
		btndelete.setIcon(new ImageIcon("C:\\Users\\SENA\\Downloads\\2931168_bin_delete_remove_trash_garbage_icon (1).png"));
		btndelete.setBounds(313, 127, 54, 59);
		contentPane.add(btndelete);
		
		JButton btnconsult = new JButton("");
		btnconsult.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.readOne(Integer.parseInt(textid_transporte.getText()),textpuestos,textmodelo,textnumeromotor,textplacavehiculo,textnombre,textobservacion,textidtipotransporte);
					
				
				
				
			}
		});
		btnconsult.setIcon(new ImageIcon("C:\\Users\\SENA\\Downloads\\9161346_search_magnifying_glass_zoom_tools_icon.png"));
		btnconsult.setBounds(247, 127, 64, 59);
		contentPane.add(btnconsult);
		
		JLabel lblNewLabel = new JLabel("GESTION DE TRANSPORTE");
		lblNewLabel.setBounds(151, 31, 145, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cr.Update(Integer.parseInt(textid_transporte.getText()),textpuestos.getText(),textmodelo.getText(),textnumeromotor.getText(),textplacavehiculo.getText(),textnombre.getText(),textobservacion.getText(),textidtipotransporte.getText());

			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\SENA\\Downloads\\9161342_refresh_reload_restart_user_multimedia_icon.png"));
		btnNewButton.setBounds(372, 127, 52, 59);
		contentPane.add(btnNewButton);
	}
}
