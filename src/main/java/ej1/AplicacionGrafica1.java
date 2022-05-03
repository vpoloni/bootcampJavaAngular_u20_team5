package ej1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class AplicacionGrafica1 extends JFrame {

	private static final long serialVersionUID = 1L;
	// el método main
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// creamos el objeto de la clase AplicacionGrafica1
					AplicacionGrafica1 frame = new AplicacionGrafica1();
					// hacemos visible el objeto creado previamente
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public AplicacionGrafica1() {
		
		// el título de la ventana
		setTitle("Ejercicio1");
		// establecemos las dimensiones de la ventana
		setBounds(100, 100, 450, 300);
		// salimos del programa cuando cerramos la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// creamos el panel
		JPanel contentPane = new JPanel();
		// elegimos absolute layout para poder colocar componentes a nuestro gusto
		contentPane.setLayout(null);
		// asignamos el panel a la ventana
		setContentPane(contentPane);
		// creamos el componente de tipo JLabel
		JLabel etiqueta = new JLabel("etiqueta");
		// establecemos el diseño del componente
		etiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		etiqueta.setBounds(23, 10, 125, 48);
		// añadimos componente al panel
		contentPane.add(etiqueta);
		
	}

}
