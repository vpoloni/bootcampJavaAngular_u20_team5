package ej8;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AplicacionGrafica8 extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AplicacionGrafica8 frame = new AplicacionGrafica8();
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
	public AplicacionGrafica8() {
		setTitle("Calculadora cambio de monedas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Label_1 = new JLabel("Cantidad a convertir");
		Label_1.setBounds(10, 43, 121, 14);
		contentPane.add(Label_1);
		
		JLabel Label_2 = new JLabel("Resultado");
		Label_2.setBounds(251, 43, 68, 14);
		contentPane.add(Label_2);
		
		
		// Campos de texto
		textField_1 = new JTextField();
		textField_1.setBounds(141, 40, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(319, 40, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		
		// Botones
		JButton Button_1 = new JButton("Euros a ptas");
		Button_1.setBounds(68, 111, 121, 23);
		contentPane.add(Button_1);
		Button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					if(Button_1.getText()=="Ptas a euros") {
						ConversionPtasEuros();
					}else {
						ConversionEurosPtas();
					}
				}catch(Exception ex){
					//System.out.println("Pon valores numericos");
					JOptionPane.showMessageDialog(null,"Pon valores numericos");
				}

			}
		});
		
		JButton Button_2 = new JButton("Cambiar");
		Button_2.setBounds(199, 111, 89, 23);
		contentPane.add(Button_2);
		Button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(null);
				textField_2.setText(null);
				if(Button_1.getText()=="Ptas a euros") {
					Button_1.setText("Euros a ptas");
				}else {
					Button_1.setText("Ptas a euros");
				}
				
			}
		});
		
		JButton Button_3 = new JButton("Borrar");
		Button_3.setBounds(298, 111, 89, 23);
		contentPane.add(Button_3);
		Button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(null);
				textField_2.setText(null);
			}	
		});
		
		// Apretar botones por el teclado E, C, B
        KeyListener teclado = new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				
				if(e.getExtendedKeyCode()==67) {
					Button_2.requestFocus();
					Button_2.doClick();
				}
				
				if(e.getExtendedKeyCode()==66) {
					Button_3.requestFocus();
					Button_3.doClick();
				}
				
				if(e.getExtendedKeyCode()==69) {
					Button_1.requestFocus();
					Button_1.doClick();
				}
				
			}


	};
	Button_1.addKeyListener(teclado);
	Button_2.addKeyListener(teclado);
	Button_3.addKeyListener(teclado);
	
	}
	
	// Metodo de Euros a Ptas
	public void ConversionEurosPtas() {
		double valor= Double.parseDouble(textField_1.getText());
		double result=valor*166.386;
		String result1=String.format("%.2f", result);
		textField_2.setText(result1);
	
	}
	
	// Metodo de Ptas a Euros
	public void ConversionPtasEuros() {
		double valor= Double.parseDouble(textField_1.getText());
		double result=valor/166.386;
		String result1=String.format("%.2f", result);
		textField_2.setText(result1);
	}

}
