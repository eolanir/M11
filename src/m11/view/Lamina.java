package m11.view;

import javax.swing.JPanel;

import m11.controller.Controlador;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class Lamina extends JPanel {
	Controlador controlador = new Controlador();
	public Lamina() {
		setBackground(new Color(51, 153, 0));
		setLayout(null);
		
		JButton addArbol = new JButton("Arbol");
		addArbol.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		addArbol.setBounds(28, 25, 110, 35);
		add(addArbol);
		
		JButton flor = new JButton("Flor");
		flor.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		flor.setBounds(28, 121, 110, 35);
		add(flor);
		
		JButton decoracion = new JButton("Decoración");
		decoracion.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		decoracion.setBounds(28, 236, 110, 35);
		add(decoracion);
		
		JButton botStock = new JButton("Stock");
		botStock.setBounds(314, 121, 110, 35);
		add(botStock);
	}
}
