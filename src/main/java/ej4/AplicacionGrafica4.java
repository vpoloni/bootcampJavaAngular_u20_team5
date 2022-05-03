package ej4;

import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class AplicacionGrafica4 extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	// variables globales
	private JPanel contentPane;
	private JTextArea textArea;

	
	// el método main
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// creamos el objeto de la clase AplicacionGrafica4
					AplicacionGrafica4 frame = new AplicacionGrafica4();
					// hacemos visible nuestro objeto
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public AplicacionGrafica4() {
		
		// el título de la ventana
		setTitle("Ejercicio2");
		// establecemos la salida de la aplicación al cerrar la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// establecemos las dimensiones de la ventana
		setBounds(100, 100, 450, 300);
		// creamos el contenedor panel
		contentPane = new JPanel();
		// elegimos el absolute layout para poder colocar componentes a nustro gusto
		contentPane.setLayout(null);
		// añadimos el panel a la ventana
		setContentPane(contentPane);
	
	
		
		// creamos la etiqueta para el textArea
		JLabel etiqueta = new JLabel("eventos:");
		// establecemos el tamaño de la etiqueta
		etiqueta.setBounds(38, 117, 83, 13);
		// añadimos la etiqueta al panel
		contentPane.add(etiqueta);
		
		
		
		// creamos el textArea
		textArea = new JTextArea("Texto inicial \nVentana activada \nVentana abierta ");
		// establecemos las dimensiones del textArea
		textArea.setBounds(167, 10, 246, 230);
		// añadimos el textArea al panel
		contentPane.add(textArea);
		
		
		
		// eventos de teclado
		KeyListener eventoTecla = new KeyListener() {
			// desarrollamos los metodos implementados
			@Override
			public void keyTyped(KeyEvent e) {
				// adjuntamos el valor del evento producido al textArea 
				textArea.append("\nTecla pulsada");	
			}
			@Override
			public void keyPressed(KeyEvent e) {
				textArea.append("\nTecla pulsada y soltada");	
			}
			@Override
			public void keyReleased(KeyEvent e) {
				textArea.append("\nTecla soltada");
			}
			
		};
		
		// eventos de ratón
		MouseListener eventoRaton = new MouseListener() {
			// desarrollamos los metodos implementados
			@Override
			public void mouseClicked(MouseEvent e) {
				// adjuntamos el valor del evento producido al textArea
				textArea.append("\nBoton pulsado y soltado");	
			}
			@Override
			public void mousePressed(MouseEvent e) {
				textArea.append("\nBoton pulsado");	
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				textArea.append("\nBoton soltado");	
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				textArea.append("\nArea entrada");	
			}
			@Override
			public void mouseExited(MouseEvent e) {
				textArea.append("\nArea salida");
			}
		};
		// añadimos las instancias al textArea
		textArea.addKeyListener(eventoTecla);
		textArea.addMouseListener(eventoRaton);
		
	}

}
