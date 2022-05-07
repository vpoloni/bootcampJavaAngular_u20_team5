package ej3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class AplicacionGrafica3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AplicacionGrafica3 frame = new AplicacionGrafica3();
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
	public AplicacionGrafica3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Etiquetas numericas
		JLabel Label_1 = new JLabel("0");
		Label_1.setBounds(87, 52, 24, 14);
		contentPane.add(Label_1);
		
		JLabel Label_2 = new JLabel("0");
		Label_2.setBounds(350, 52, 24, 14);
		contentPane.add(Label_2);
		
		
		// Botones
		JButton Button_1 = new JButton("boton 1");
		Button_1.setBounds(28, 138, 89, 23);
		contentPane.add(Button_1);
		Button_1.addActionListener(new ActionListener() {
			int contador=0;
			public void actionPerformed(ActionEvent e) {
				contador++;
				 String numcadena= contador+"";
				 Label_1.setText(numcadena);
			}
		});
		
		JButton btnBoton = new JButton("Boton 2");
		btnBoton.setBounds(302, 138, 89, 23);
		contentPane.add(btnBoton);
		btnBoton.addActionListener(new ActionListener() {
			int contador=0;
			public void actionPerformed(ActionEvent e) {
				contador++;
				 String numcadena= contador+"";
				 Label_2.setText(numcadena);
			}
		});
		
		
		// etiquetas
		JLabel lblNewLabel = new JLabel("boton 1:");
		lblNewLabel.setBounds(28, 52, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("veces");
		lblNewLabel_1.setBounds(117, 52, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblBoton = new JLabel("boton 2:");
		lblBoton.setBounds(294, 52, 46, 14);
		contentPane.add(lblBoton);
		
		JLabel lblNewLabel_1_1 = new JLabel("veces");
		lblNewLabel_1_1.setBounds(384, 52, 46, 14);
		contentPane.add(lblNewLabel_1_1);

	}

}
