package com.camila.ejercicio1.t20_ejercicio1;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Vista extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Vista() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		JLabel etiqueta = new JLabel("Label de ejemplo");
		add(etiqueta);
		setResizable(true);
		
		
		setVisible(true);
	}

}
