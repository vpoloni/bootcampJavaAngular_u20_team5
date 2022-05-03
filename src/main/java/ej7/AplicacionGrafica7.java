package ej7;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;


public class AplicacionGrafica7 extends JFrame {

	private static final long serialVersionUID = 1L;

	// constante 
	private final double valorPeseta = 166.386;

	// variables globales
	private JTextField cantidadTextfield;
	private JTextField resultadoTextfield;

	// el método main
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// instanciamos la clase AplicacionGrafica7
					AplicacionGrafica7 frame = new AplicacionGrafica7();
					// hacemos visible el objeto creado previamente
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public AplicacionGrafica7() {

		// el título de la ventana
		setTitle("Ejercicio7");
		// pedimos la salida de la app al cerrar la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// establecemos las dimensiones de la ventana
		setBounds(100, 100, 450, 300);
		// creamos el contenedor panel
		JPanel contentPane = new JPanel();
		// establecemos layout absolute para poder colocar los componentes a nuestro gusto
		contentPane.setLayout(null);
		// añadimos panel a la ventana
		setContentPane(contentPane);

		
		// el textfield para introducir la cantidad a convertir
		cantidadTextfield = new JTextField();
		cantidadTextfield.setBounds(163, 29, 96, 19);
		contentPane.add(cantidadTextfield);
		// el textfild para mostrar el resultado
		resultadoTextfield = new JTextField();
		resultadoTextfield.setBounds(163, 58, 96, 19);
		contentPane.add(resultadoTextfield);

		
		// la etiqueta para el textfield de cantidad a convertir
		JLabel cantidadEtiqueta = new JLabel("cantidad a convertir:");
		cantidadEtiqueta.setBounds(20, 29, 120, 19);
		contentPane.add(cantidadEtiqueta);
		// la etiqueta para el textfield de resultado
		JLabel resultadoEtiqueta = new JLabel("resultado:");
		resultadoEtiqueta.setBounds(20, 58, 69, 13);
		contentPane.add(resultadoEtiqueta);

		
		// el botón para elegir la opción de euros a pesetas
		JButton eurosPesetas = new JButton("euros a pesetas");
		eurosPesetas.setBounds(58, 120, 142, 21);
		contentPane.add(eurosPesetas);
		// el botón para elegir la opción de pesetas a euros
		JButton pesetasEuros = new JButton("pesetas a euros");
		pesetasEuros.setBounds(238, 120, 133, 21);
		contentPane.add(pesetasEuros);

		
		// añadimos el evento que se produce al pulsar el bóton eurosPesetas
		eurosPesetas.addActionListener(new ActionListener() {
			// desarrollamos el método implementado de ActionListener
			@Override
			public void actionPerformed(ActionEvent e) {
				// añadimos al textfield el valor en pesetas retornado por el método
				resultadoTextfield.setText(String.format("%.2f", convertirApesetas()));
			}

		});
		// añadimos el evento que se produce al pulsar el bóton pesetasEuros
		pesetasEuros.addActionListener(new ActionListener() {
			// desarrollamos el método implementado de ActionListener
			@Override
			public void actionPerformed(ActionEvent e) {
				// añadimos al textfield el valor en euros retornado por el método
				resultadoTextfield.setText(String.format("%.2f", convertirAeuros()));
			}

		});

	}

	// el método que convierte de euros a pesetas
	public double convertirApesetas() {
		double resultadoConvertido = 0;
		resultadoConvertido += Double.parseDouble(cantidadTextfield.getText());
		resultadoConvertido *= valorPeseta;
		return resultadoConvertido;

	}

	// el método que convierte de pesetas a euros
	public double convertirAeuros() {
		double resultadoConvertido = 0;
		resultadoConvertido += Double.parseDouble(cantidadTextfield.getText());
		resultadoConvertido /= valorPeseta;
		return resultadoConvertido;

	}

}
