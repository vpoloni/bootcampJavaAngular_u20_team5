package ej5;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class AplicacionGrafica5 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AplicacionGrafica5 frame = new AplicacionGrafica5();
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
	public AplicacionGrafica5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 45, 414, 205);
		contentPane.add(textArea);
		
		
		JButton Button = new JButton("Limpiar");
		Button.setBounds(179, 11, 89, 23);
		contentPane.add(Button);
		Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(null);
			}
		});		
		
	        MouseListener Mouse = new MouseListener() {

				@Override
				public void mouseClicked(MouseEvent e) {
					textArea.append("\nSe ha clicado");
					
					
				}

				@Override
				public void mousePressed(MouseEvent e) {
					textArea.append("\nSe ha apretado");
					
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					
					textArea.append("\nSe ha soltado");
					
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					
					textArea.append("\nSe ha entrado");
					
				}

				@Override
				public void mouseExited(MouseEvent e) {
					
					textArea.append("\nSe ha salido");
					
				}
		};
		textArea.addMouseListener(Mouse);
	}

}
