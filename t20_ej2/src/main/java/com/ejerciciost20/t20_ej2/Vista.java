package com.ejerciciost20.t20_ej2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista extends JFrame {

	private JPanel contentPane;
	private String ultimoBotonClickeado;

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

		JLabel lbl1 = new JLabel("Pulsa boton");
		lbl1.setBounds(16, 47, 158, 16);
		contentPane.add(lbl1);

		JButton btn1 = new JButton("boton1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ultimoBotonClickeado = "Botón 1";
				lbl1.setText("Has pulsado: " + ultimoBotonClickeado);
			}
		});
		btn1.setBounds(169, 42, 117, 29);
		contentPane.add(btn1);

		JButton btn2 = new JButton("boton2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ultimoBotonClickeado = "Botón 2";
				lbl1.setText("Has pulsado: " + ultimoBotonClickeado);
			}
		});
		btn2.setBounds(298, 42, 117, 29);
		contentPane.add(btn2);
		
		
		setVisible(true);
	}

}
