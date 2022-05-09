package ej6;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;

public class Ejercicio6 extends JFrame  {

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	final JButton boton2;
	private JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private JLabel lblNewLabel_2;
	static Double altura1;
	static Double pes1;

	/**
	 * Launch the application.

	/**
	 * Create the frame.
	 */
	public Ejercicio6() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		contentPane.setBorder(new TitledBorder(new String("Indice de masa corporal")));
		setVisible(true);
		
		
		boton2= new JButton("Calcular IMC");
		boton2.setBounds(79,74,150,30);
		getContentPane().add(boton2);
		
		JLabel lblNewLabel = new JLabel("Altura (metros)");
		lblNewLabel.setBounds(30, 21, 90, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Peso(kg)");
		lblNewLabel_1.setBounds(251, 26, 70, 20);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("IMC");
		lblNewLabel_2.setBounds(262, 82, 40, 14);
		contentPane.add(lblNewLabel_2);
		boton2.setVisible(true);
		
		textField = new JTextField();
		textField.setBounds(130, 26, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(314, 26, 80, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(314, 79, 80, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		boton2.addActionListener(new ActionListener() {
			 
			  public void actionPerformed(ActionEvent e) {
				  
				altura1= Double.parseDouble(textField.getText());
				pes1= Double.parseDouble(textField_1.getText());
				if(comprovardades()==true) {
				textField_2.setText(introduirvalors(altura1,pes1));
				textField_2.setVisible(true);
				}
			
			  }
		});
		
	}
	


	public static boolean comprovardades() {
		
		try {
			textField_1.getText();
			//System.out.println(altura1);
			textField_2.getText();
			
			}
		
	    catch(NullPointerException  |  NumberFormatException ex){  
	       
	    	System.err.println("Invalid string or null argumment");  
	   return false;
	    }
		return true;
		}

		public String introduirvalors(double altura1, double pes1) {
			
			String resultat1 = null;
			double resultat= pes1/(Math.pow(altura1, 2));
			 resultat1=String.valueOf(resultat)
					 ;
			return resultat1;
	}
		
		
}
	
	













