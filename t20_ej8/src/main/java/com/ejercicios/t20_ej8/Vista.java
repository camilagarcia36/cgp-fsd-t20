package com.ejercicios.t20_ej8;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Vista extends JFrame {

	private JPanel contentPane;
	private JTextField txf1;
	private JTextField tzfResultado;
	private JButton btnEP;
	private JButton btnPE;

	private final double EURO_A_PESETA = 166.386;
	private final double PESETA_A_EURO = 1 / EURO_A_PESETA;
	private JLabel lblResultado;
	private JButton btnBorrar;

	/**
	 * Create the frame.
	 */
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 205);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Cantidad a convertir");
		lblNewLabel.setBounds(28, 33, 134, 16);
		contentPane.add(lblNewLabel);

		txf1 = new JTextField();
		txf1.setBounds(159, 28, 68, 26);
		contentPane.add(txf1);
		txf1.setColumns(10);

		tzfResultado = new JTextField();
		tzfResultado.setBounds(310, 28, 221, 26);
		contentPane.add(tzfResultado);
		tzfResultado.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Resultado");
		lblNewLabel_1.setBounds(239, 33, 69, 16);
		contentPane.add(lblNewLabel_1);

		btnEP = new JButton("Convertir de euros a pesetas");
		btnEP.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        try {
		            double cantidad = Double.parseDouble(txf1.getText());
		            double resultado = cantidad * EURO_A_PESETA;
		            tzfResultado.setText(Double.toString(resultado));
		            lblResultado.setText("Pesetas");
		        } catch (NumberFormatException ex) {
		            JOptionPane.showMessageDialog(null, "Error: Introduce un número válido", "Error", JOptionPane.ERROR_MESSAGE);
		        }
		    }
		});
		//llama al método doClick() al presionar una tecla específica.
		btnEP.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
		        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
		            btnEP.doClick();
		        }
		    }
		});

		btnPE = new JButton("Convertir de pesetas a euros");
		btnPE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try {
			            double cantidad = Double.parseDouble(txf1.getText());
			            double resultado = cantidad * PESETA_A_EURO;
			            tzfResultado.setText(Double.toString(resultado));
			            lblResultado.setText("Euros");
			        } catch (NumberFormatException ex) {
			            JOptionPane.showMessageDialog(null, "Error: Introduce un número válido", "Error", JOptionPane.ERROR_MESSAGE);
			        }
			}
		});
		
		btnPE.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
		        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
		            btnPE.doClick();
		        }
		    }
		});


		lblResultado = new JLabel("");
		lblResultado.setBounds(396, 53, 61, 16);
		contentPane.add(lblResultado);
		btnPE.setBounds(66, 123, 221, 29);
		contentPane.add(btnPE);
		btnEP.setBounds(66, 82, 221, 29);
		contentPane.add(btnEP);

		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txf1.setText("");
				tzfResultado.setText("");
				lblResultado.setText("");
			}
		});
		
		btnBorrar.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
		        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
		            btnBorrar.doClick();
		        }
		    }
		});
		btnBorrar.setBounds(377, 97, 117, 29);
		contentPane.add(btnBorrar);

		setVisible(true);
	}

}
