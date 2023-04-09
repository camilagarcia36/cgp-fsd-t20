package com.ejercicios.principal;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class Vista extends JFrame implements ActionListener{

    private JToggleButton[] botones;
	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 503);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 4, 5, 5));
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.YELLOW);
		contentPane.add(btnNewButton);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		tglbtnNewToggleButton.setSelected(true);
		tglbtnNewToggleButton.setBackground(new Color(255, 85, 144));
		contentPane.add(tglbtnNewToggleButton);
		
		
		 // Crear los ToggleButtons y agregarlos al JPanel
        botones = new JToggleButton[16];
        for (int i = 0; i < botones.length; i++) {
            botones[i] = new JToggleButton();
            botones[i].addActionListener((ActionListener) this);
            contentPane.add(botones[i]);
            botones[i].setSize(50, 50); // Establecer el tamaño de los botones
        }
        
        // Configuración del Layout
        setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JToggleButton boton = (JToggleButton) e.getSource();
        if (boton.isSelected()) {
            boton.setBackground(Color.RED); // Cambiar el color del botón
        } else {
            boton.setBackground(new Color(200,200,200)); // Volver al color original del botón
        }
    }
	}


