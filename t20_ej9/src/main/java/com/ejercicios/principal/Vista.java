package com.ejercicios.principal;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Vista extends JFrame implements ActionListener {
  private JPanel panel;
  private JButton[] botones;
  private Color[] colores;
  private int[] numeros;
  private int seleccion1 = -1;
  private int seleccion2 = -1;
  private int parejasEncontradas = 0;
  private int totalParejas = 8;

  public Vista() {
    setTitle("Juego de Memoria");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 300);

    panel = new JPanel(new GridLayout(4, 4));
    botones = new JButton[16];
    colores = new Color[8];
    numeros = new int[16];

    // Inicializar colores
    colores[0] = Color.RED;
    colores[1] = Color.ORANGE;
    colores[2] = Color.YELLOW;
    colores[3] = Color.GREEN;
    colores[4] = Color.CYAN;
    colores[5] = Color.BLUE;
    colores[6] = Color.MAGENTA;
    colores[7] = Color.PINK;

    // Asignar colores aleatorios a cada botón
    for (int i = 0; i < 8; i++) {
      int numero = (int) (Math.random() * 8);
      while (numeros[numero] != 0) {
        numero = (int) (Math.random() * 8);
      }
      numeros[numero] = i + 1;
      numeros[numero + 8] = i + 1;
    }

    // Crear botones y agregarlos al panel
    for (int i = 0; i < 16; i++) {
      botones[i] = new JButton();
      botones[i].addActionListener(this);
      panel.add(botones[i]);
    }

    add(panel);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    for (int i = 0; i < 16; i++) {
      if (e.getSource() == botones[i]) {
   //si no hay ninguna carta seleccionada se guarda como selecion 1. 
        if (seleccion1 == -1) {
          seleccion1 = i;
          
       // se cambia el color de fondo del botón a su correspondiente color
          botones[i].setBackground(colores[numeros[i]-1]);
          botones[i].setEnabled(false);
        } else if (seleccion2 == -1 && i != seleccion1) {
          seleccion2 = i;
          botones[i].setBackground(colores[numeros[i]-1]);
          botones[i].setEnabled(false);

       // si las dos cartas seleccionadas forman una pareja, se ocultan
          if (numeros[seleccion1] == numeros[seleccion2]) {
            parejasEncontradas++;
            JOptionPane.showMessageDialog(null, "¡Encontraste una pareja!");
            botones[seleccion1].setVisible(false);
            botones[seleccion2].setVisible(false);

            if (parejasEncontradas == totalParejas) {
              JOptionPane.showMessageDialog(null, "¡Has ganado!");
              System.exit(0);
            }
          } else {
        	  
        	//Coge la seleccin 1 y 2 y como no son iguales te da un option pane avisando de que no es pareja. 
            JOptionPane.showMessageDialog(null, "No es una pareja.");
            botones[seleccion1].setBackground(null);
            botones[seleccion1].setEnabled(true);
            botones[seleccion2].setBackground(null);
            botones[seleccion2].setEnabled(true);
          }

          seleccion1 = -1;
          seleccion2 = -1;
        }
      }
    }
  }


}