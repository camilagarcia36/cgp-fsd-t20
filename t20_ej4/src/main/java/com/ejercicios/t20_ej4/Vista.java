package com.ejercicios.t20_ej4;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Vista extends JFrame implements WindowListener {

	private JPanel contentPane;

	private JTextArea textArea;

	/**
	 * Create the frame.
	 */
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblEventos = new JLabel("Eventos");
		lblEventos.setBounds(24, 114, 64, 16);
		contentPane.add(lblEventos);

		textArea = new JTextArea();
		textArea.setBounds(117, 18, 308, 175);
		contentPane.add(textArea);
		addWindowListener((WindowListener) this);

		setVisible(true);
	}



	//Los metodos me los crea automaticamente al añadir el implements Windowlistener. Pero solo utilizo los que creo convenientes para el ejercicio. 
	@Override
	public void windowActivated(WindowEvent e) {
		textArea.append("Ventana Activada\n");		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		textArea.append("Ventana cerrada\n");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		textArea.append("Ventana abierta\n");

	}
	
	
	
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		textArea.append("Ventana desactivada");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}