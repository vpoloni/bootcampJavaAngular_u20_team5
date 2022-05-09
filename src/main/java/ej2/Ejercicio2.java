package ej2;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Ejercicio2 extends JFrame implements ActionListener  {

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	final JButton boton1;
	final JButton boton2;
	final JLabel NewLabel;
	JLabel JLabel;

	public Ejercicio2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		setVisible(true);
		
		
		NewLabel = new JLabel ("Has pulsado: ");
		NewLabel.setFont(new Font("Source Serif Pro Black", Font.ITALIC, 14));
		NewLabel.setBackground(Color.MAGENTA);
		NewLabel.setBounds(15,50,300,50);
		contentPane.add(NewLabel);
		
		boton1= new JButton("Boton 1"); 
		boton1.setBounds(150,60,100,30);
		add(boton1);
		boton1.addActionListener(this);
		
		
		boton2= new JButton("Boton 2");
		boton2.setBounds(250,60,100,30);
		add(boton2);
		boton2.addActionListener(this);
		setVisible(true);
		
		
		JLabel = new JLabel();
		NewLabel.setFont(new Font("Source Serif Pro Black", Font.ITALIC, 14));
		NewLabel.setBackground(Color.MAGENTA);
		JLabel.setBounds(100,50,300,50);
		contentPane.add(JLabel);
	 
	}
	
	public void actionPerformed(ActionEvent e) {
		
		
		 if (e.getSource() == boton1) {
			 
			
			 JLabel.setText(boton1.getText());
			 contentPane.add(JLabel);
				
	     }
		 if (e.getSource() == boton2) {
			 
			 JLabel.setText(boton2.getText());
			 contentPane.add(JLabel);
			 
	     }
		 
			
			  }// TODO Auto-generated method stub
		
	
}
