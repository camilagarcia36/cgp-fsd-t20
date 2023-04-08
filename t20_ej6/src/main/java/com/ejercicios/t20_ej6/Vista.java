package com.ejercicios.t20_ej6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista extends JFrame {

	private JPanel contentPane;
	private JTextField txf1;
	private JTextField txf2;
	private JTextField txfResultado;


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
		
		JLabel lblNewLabel = new JLabel("Altura (metros)");
		lblNewLabel.setBounds(33, 38, 99, 16);
		contentPane.add(lblNewLabel);
		
		txf1 = new JTextField();
		txf1.setBounds(136, 33, 93, 26);
		contentPane.add(txf1);
		txf1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Peso(kg)");
		lblNewLabel_1.setBounds(241, 38, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		txf2 = new JTextField();
		txf2.setBounds(300, 33, 93, 26);
		contentPane.add(txf2);
		txf2.setColumns(2);
		
		JButton btn = new JButton("Calcular IMC");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double altura = Double.parseDouble(txf1.getText());
				double peso = Double.parseDouble(txf2.getText());
				
				double imc = peso / (altura * altura);
				
				txfResultado.setText(String.format("%.2f", imc));
			}
		});
		btn.setBounds(63, 107, 117, 29);
		contentPane.add(btn);
		
		txfResultado = new JTextField();
		txfResultado.setBounds(233, 107, 130, 26);
		contentPane.add(txfResultado);
		txfResultado.setColumns(10);
		
		
		setVisible(true); 
	}

}
