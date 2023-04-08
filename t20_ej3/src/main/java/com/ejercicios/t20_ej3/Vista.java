package com.ejercicios.t20_ej3;

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
	private JLabel lbl1;
	private JLabel lbl2;

	private JButton btn1;
	private JButton btn2;
	private int vecesClicadas;

	/**
	 * Create the frame.
	 */
	public Vista() {
		setTitle("Clics botones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		lbl1 = new JLabel("Boton 1: 0 veces");
		lbl1.setBounds(50, 32, 113, 16);
		contentPane.add(lbl1);

		lbl2 = new JLabel("Boton 2: 0 veces");
		lbl2.setBounds(223, 32, 132, 16);
		contentPane.add(lbl2);

		btn1 = new JButton("Botón 1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vecesClicadas++;
				lbl1.setText("Boton 1: " + vecesClicadas + " veces");
			}
		});
		btn1.setBounds(23, 80, 117, 29);
		contentPane.add(btn1);

		btn2 = new JButton("Botón 2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vecesClicadas++;
				lbl2.setText("Boton 2: " + vecesClicadas + " veces");
			}
		});
		btn2.setBounds(211, 80, 117, 29);
		contentPane.add(btn2);
		
		setVisible(true);
	}

}
