package com.ejercicios.t20_ej5;

import static java.awt.event.InputEvent.BUTTON3_MASK;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.event.MouseInputAdapter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Vista extends JFrame {

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

		JButton btnNewButton = new JButton("Limpiar text area");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				   textArea.setText("");

			}
		});
		btnNewButton.setBounds(163, 6, 117, 29);
		contentPane.add(btnNewButton);

		textArea = new JTextArea();
		textArea.setBounds(6, 62, 438, 204);
		textArea.setLineWrap(true); // ajusta el texto al ancho del área de texto
	    textArea.setWrapStyleWord(true); // divide las palabras correctamente en la línea siguiente
		contentPane.add(textArea);

		
		textArea.addMouseListener(new ListenerRaton());
		setVisible(true);
	}

	class ListenerRaton extends MouseInputAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			textArea.append("Has hecho clic en");
			textArea.append("X: " + e.getX());
			textArea.append("Y: " + e.getY());
		}

		@Override
		public void mousePressed(MouseEvent e) {

			textArea.append("Pulsado el botón derecho \n");

			textArea.append("Se ha pulsado el botón del ratón\n");
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			textArea.append("Se ha soltado el botón del ratón \n");
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			textArea.append("El ratón ha entrado en el componente \n");
		}

		@Override
		public void mouseExited(MouseEvent e) {
			textArea.append("El ratón ha salido del componente \n");
		}
	}
}
