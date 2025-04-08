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
import javax.swing.ImageIcon;

public class FrmTiposTransporte extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textnombre;
	private JTextField textObservacion;
	private JTextField textidtipotransporte;
	TipoTransporte cr = new TipoTransporte ();

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
		lblNombre.setBounds(44, 64, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblObservacion = new JLabel("Observacion");
		lblObservacion.setBounds(44, 106, 46, 14);
		contentPane.add(lblObservacion);
		
		textnombre = new JTextField();
		textnombre.setBounds(100, 61, 86, 20);
		contentPane.add(textnombre);
		textnombre.setColumns(10);
		
		textObservacion = new JTextField();
		textObservacion.setBounds(100, 103, 86, 20);
		contentPane.add(textObservacion);
		textObservacion.setColumns(10);
		
		JButton btnguardar = new JButton("GUARDAR");
		btnguardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.create(textnombre.getText(),textObservacion.getText());
				
			}
		});
		btnguardar.setBounds(82, 152, 89, 23);
		contentPane.add(btnguardar);
		
		JLabel lblidtipotransporte = new JLabel("Id Tipo Transporte");
		lblidtipotransporte.setBounds(270, 64, 86, 14);
		contentPane.add(lblidtipotransporte);
		
		textidtipotransporte = new JTextField();
		textidtipotransporte.setBounds(270, 89, 86, 20);
		contentPane.add(textidtipotransporte);
		textidtipotransporte.setColumns(10);
		
		JButton btndelete = new JButton("");
		btndelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(textidtipotransporte.getText()));

			}
		});
		btndelete.setIcon(new ImageIcon("C:\\Users\\SENA\\Downloads\\2931168_bin_delete_remove_trash_garbage_icon (1).png"));
		btndelete.setBounds(318, 120, 51, 55);
		contentPane.add(btndelete);
		
		JButton btnconsult = new JButton("");
		btnconsult.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.readOne(Integer.parseInt(textidtipotransporte.getText()),textnombre,textObservacion);
			
			}
			
			
		});
		btnconsult.setIcon(new ImageIcon("C:\\Users\\SENA\\Downloads\\9161346_search_magnifying_glass_zoom_tools_icon.png"));
		btnconsult.setBounds(246, 120, 51, 57);
		contentPane.add(btnconsult);
		
		JLabel lblNewLabel_1 = new JLabel("GESTION DE TIPO DE TRANSPORTE");
		lblNewLabel_1.setBounds(125, 11, 181, 28);
		contentPane.add(lblNewLabel_1);
	}
}
