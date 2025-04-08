package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Compañia;
import Model.Paquetes;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class FrmPaquete extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textiddestion;
	private JTextField textidorigen;
	private JTextField textfechaventa;
	private JTextField texthoraventa;
	private JTextField texthorasalida;
	private JTextField textfechaejecucion;
	private JTextField textobservacion;
	private JTextField textidmedios;
	private JTextField textidtipotransporte;
	private JTextField textidclientes;
	private JTextField textid_agencia;
	private JTextField textidpromotores;
	private JTextField textprecio;
	private JTextField textcodigo;
	Paquetes cr = new Paquetes();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPaquete frame = new FrmPaquete();
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
	public FrmPaquete() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 572);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbliddestion = new JLabel("idgestion");
		lbliddestion.setBounds(85, 143, 46, 14);
		contentPane.add(lbliddestion);
		
		textiddestion = new JTextField();
		textiddestion.setBounds(166, 140, 86, 20);
		contentPane.add(textiddestion);
		textiddestion.setColumns(10);
		
		JLabel lblideorigen = new JLabel("idOrigen");
		lblideorigen.setBounds(85, 187, 46, 14);
		contentPane.add(lblideorigen);
		
		textidorigen = new JTextField();
		textidorigen.setBounds(166, 184, 86, 20);
		contentPane.add(textidorigen);
		textidorigen.setColumns(10);
		
		JLabel lblFechaVenta = new JLabel("Fecha Venta");
		lblFechaVenta.setBounds(70, 221, 86, 14);
		contentPane.add(lblFechaVenta);
		
		textfechaventa = new JTextField();
		textfechaventa.setBounds(166, 218, 86, 20);
		contentPane.add(textfechaventa);
		textfechaventa.setColumns(10);
		
		JLabel lblHoraVenta = new JLabel("Hora Venta");
		lblHoraVenta.setBounds(70, 262, 71, 14);
		contentPane.add(lblHoraVenta);
		
		texthoraventa = new JTextField();
		texthoraventa.setBounds(166, 259, 86, 20);
		contentPane.add(texthoraventa);
		texthoraventa.setColumns(10);
		
		JLabel lblHoraSalida = new JLabel("Hora Salida");
		lblHoraSalida.setBounds(70, 295, 78, 14);
		contentPane.add(lblHoraSalida);
		
		texthorasalida = new JTextField();
		texthorasalida.setBounds(166, 292, 86, 20);
		contentPane.add(texthorasalida);
		texthorasalida.setColumns(10);
		
		JLabel lblFechaejecucion = new JLabel("Fecha Ejecucion");
		lblFechaejecucion.setBounds(63, 326, 78, 14);
		contentPane.add(lblFechaejecucion);
		
		textfechaejecucion = new JTextField();
		textfechaejecucion.setBounds(166, 323, 86, 20);
		contentPane.add(textfechaejecucion);
		textfechaejecucion.setColumns(10);
		
		JLabel lblObservacion = new JLabel("Observacion");
		lblObservacion.setBounds(63, 351, 68, 14);
		contentPane.add(lblObservacion);
		
		textobservacion = new JTextField();
		textobservacion.setBounds(166, 354, 86, 20);
		contentPane.add(textobservacion);
		textobservacion.setColumns(10);
		
		JLabel lblidmedios = new JLabel("idmedios");
		lblidmedios.setBounds(391, 143, 46, 14);
		contentPane.add(lblidmedios);
		
		textidmedios = new JTextField();
		textidmedios.setBounds(468, 140, 86, 20);
		contentPane.add(textidmedios);
		textidmedios.setColumns(10);
		
		JLabel lblidtipotransporte = new JLabel("idTipoTransporte");
		lblidtipotransporte.setBounds(365, 187, 90, 14);
		contentPane.add(lblidtipotransporte);
		
		textidtipotransporte = new JTextField();
		textidtipotransporte.setBounds(468, 184, 86, 20);
		contentPane.add(textidtipotransporte);
		textidtipotransporte.setColumns(10);
		
		JLabel lblidclientes = new JLabel("idclientes");
		lblidclientes.setBounds(391, 221, 46, 14);
		contentPane.add(lblidclientes);
		
		textidclientes = new JTextField();
		textidclientes.setBounds(468, 221, 86, 20);
		contentPane.add(textidclientes);
		textidclientes.setColumns(10);
		
		JLabel lblidAgencia = new JLabel("idAgencia");
		lblidAgencia.setBounds(391, 262, 46, 14);
		contentPane.add(lblidAgencia);
		
		textid_agencia = new JTextField();
		textid_agencia.setBounds(468, 262, 86, 20);
		contentPane.add(textid_agencia);
		textid_agencia.setColumns(10);
		
		JLabel lblidPromotores = new JLabel("idPromotores");
		lblidPromotores.setBounds(383, 295, 86, 14);
		contentPane.add(lblidPromotores);
		
		textidpromotores = new JTextField();
		textidpromotores.setBounds(468, 292, 86, 20);
		contentPane.add(textidpromotores);
		textidpromotores.setColumns(10);
		
		JLabel lblPrecios = new JLabel("Precios");
		lblPrecios.setBounds(391, 339, 46, 14);
		contentPane.add(lblPrecios);
		
		textprecio = new JTextField();
		textprecio.setBounds(468, 336, 86, 20);
		contentPane.add(textprecio);
		textprecio.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.create(textiddestion.getText(),textidorigen.getText(),textfechaventa.getText(),texthoraventa.getText(),texthorasalida.getText(),textfechaejecucion.getText(),textobservacion.getText(),textidmedios.getText(),textidtipotransporte.getText(),textidclientes.getText(),textid_agencia.getText(),textidpromotores.getText(),textprecio.getText());
			}
		});
		btnGuardar.setBounds(166, 434, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblcodigo = new JLabel("Codigo");
		lblcodigo.setBounds(484, 398, 46, 14);
		contentPane.add(lblcodigo);
		
		textcodigo = new JTextField();
		textcodigo.setBounds(468, 423, 86, 20);
		contentPane.add(textcodigo);
		textcodigo.setColumns(10);
		
		JButton btndelete = new JButton("");
		btndelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(textcodigo.getText()));

			}
		});
		btndelete.setIcon(new ImageIcon("C:\\Users\\SENA\\Downloads\\2931168_bin_delete_remove_trash_garbage_icon (1).png"));
		btndelete.setBounds(515, 450, 58, 57);
		contentPane.add(btndelete);
		
		JButton btnconsultar = new JButton("");
		btnconsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.readOne(Integer.parseInt(textcodigo.getText()),textiddestion,textidorigen,textfechaventa,texthoraventa,texthorasalida,textfechaejecucion,textobservacion,textidmedios,textidtipotransporte,textidpromotores,textprecio,textidclientes);

			}
		});
		btnconsultar.setIcon(new ImageIcon("C:\\Users\\SENA\\Downloads\\9161346_search_magnifying_glass_zoom_tools_icon.png"));
		btnconsultar.setBounds(447, 461, 58, 46);
		contentPane.add(btnconsultar);
		
		JLabel lblNewLabel = new JLabel("GESTION DE PAQUETES");
		lblNewLabel.setBounds(252, 55, 128, 14);
		contentPane.add(lblNewLabel);
	}

}
