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
		lbliddestion.setBounds(75, 80, 46, 14);
		contentPane.add(lbliddestion);
		
		textiddestion = new JTextField();
		textiddestion.setBounds(166, 77, 86, 20);
		contentPane.add(textiddestion);
		textiddestion.setColumns(10);
		
		JLabel lblideorigen = new JLabel("idOrigen");
		lblideorigen.setBounds(75, 122, 46, 14);
		contentPane.add(lblideorigen);
		
		textidorigen = new JTextField();
		textidorigen.setBounds(166, 119, 86, 20);
		contentPane.add(textidorigen);
		textidorigen.setColumns(10);
		
		JLabel lblFechaVenta = new JLabel("Fecha Venta");
		lblFechaVenta.setBounds(75, 168, 46, 14);
		contentPane.add(lblFechaVenta);
		
		textfechaventa = new JTextField();
		textfechaventa.setBounds(166, 165, 86, 20);
		contentPane.add(textfechaventa);
		textfechaventa.setColumns(10);
		
		JLabel lblHoraVenta = new JLabel("Hora Venta");
		lblHoraVenta.setBounds(75, 218, 46, 14);
		contentPane.add(lblHoraVenta);
		
		texthoraventa = new JTextField();
		texthoraventa.setBounds(166, 215, 86, 20);
		contentPane.add(texthoraventa);
		texthoraventa.setColumns(10);
		
		JLabel lblHoraSalida = new JLabel("Hora Salida");
		lblHoraSalida.setBounds(75, 275, 46, 14);
		contentPane.add(lblHoraSalida);
		
		texthorasalida = new JTextField();
		texthorasalida.setBounds(166, 262, 86, 20);
		contentPane.add(texthorasalida);
		texthorasalida.setColumns(10);
		
		JLabel lblFechaejecucion = new JLabel("Fecha Ejecucion");
		lblFechaejecucion.setBounds(75, 316, 46, 14);
		contentPane.add(lblFechaejecucion);
		
		textfechaejecucion = new JTextField();
		textfechaejecucion.setBounds(166, 313, 86, 20);
		contentPane.add(textfechaejecucion);
		textfechaejecucion.setColumns(10);
		
		JLabel lblObservacion = new JLabel("Observacion");
		lblObservacion.setBounds(347, 34, 46, 14);
		contentPane.add(lblObservacion);
		
		textobservacion = new JTextField();
		textobservacion.setBounds(419, 31, 86, 20);
		contentPane.add(textobservacion);
		textobservacion.setColumns(10);
		
		JLabel lblidmedios = new JLabel("idmedios");
		lblidmedios.setBounds(347, 80, 46, 14);
		contentPane.add(lblidmedios);
		
		textidmedios = new JTextField();
		textidmedios.setBounds(419, 77, 86, 20);
		contentPane.add(textidmedios);
		textidmedios.setColumns(10);
		
		JLabel lblidtipotransporte = new JLabel("idTipoTransporte");
		lblidtipotransporte.setBounds(347, 122, 46, 14);
		contentPane.add(lblidtipotransporte);
		
		textidtipotransporte = new JTextField();
		textidtipotransporte.setBounds(419, 119, 86, 20);
		contentPane.add(textidtipotransporte);
		textidtipotransporte.setColumns(10);
		
		JLabel lblidclientes = new JLabel("idclientes");
		lblidclientes.setBounds(347, 168, 46, 14);
		contentPane.add(lblidclientes);
		
		textidclientes = new JTextField();
		textidclientes.setBounds(419, 165, 86, 20);
		contentPane.add(textidclientes);
		textidclientes.setColumns(10);
		
		JLabel lblidAgencia = new JLabel("idAgencia");
		lblidAgencia.setBounds(347, 218, 46, 14);
		contentPane.add(lblidAgencia);
		
		textid_agencia = new JTextField();
		textid_agencia.setBounds(419, 215, 86, 20);
		contentPane.add(textid_agencia);
		textid_agencia.setColumns(10);
		
		JLabel lblidPromotores = new JLabel("idPromotores");
		lblidPromotores.setBounds(347, 262, 46, 14);
		contentPane.add(lblidPromotores);
		
		textidpromotores = new JTextField();
		textidpromotores.setBounds(419, 262, 86, 20);
		contentPane.add(textidpromotores);
		textidpromotores.setColumns(10);
		
		JLabel lblPrecios = new JLabel("Precios");
		lblPrecios.setBounds(347, 316, 46, 14);
		contentPane.add(lblPrecios);
		
		textprecio = new JTextField();
		textprecio.setBounds(419, 313, 86, 20);
		contentPane.add(textprecio);
		textprecio.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Paquetes cr = new Paquetes();
				cr.create(textiddestion.getText(),textidorigen.getText(),textfechaventa.getText(),texthoraventa.getText(),texthorasalida.getText(),textfechaejecucion.getText(),textobservacion.getText(),textidmedios.getText(),textidtipotransporte.getText(),textidclientes.getText(),textid_agencia.getText(),textidpromotores.getText(),textprecio.getText());
			}
		});
		btnGuardar.setBounds(274, 417, 89, 23);
		contentPane.add(btnGuardar);
	}

}
