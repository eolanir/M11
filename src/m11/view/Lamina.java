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
		
		JButton botArbol = new JButton("Arbol");
		botArbol.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controlador.addArbol();
			}
		});
		botArbol.setBounds(316, 121, 110, 35);
		add(botArbol);
		
		JButton botFlor = new JButton("Flor");
		botFlor.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				controlador.addFlor();
			}
		});
		botFlor.setBounds(28, 121, 110, 35);
		add(botFlor);
		
		JButton botDecoracion = new JButton("Decoración");
		botDecoracion.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				controlador.addDecoracion();
			}
		});
		botDecoracion.setBounds(176, 121, 110, 35);
		add(botDecoracion);
		
		JButton botStock = new JButton("Stock");
		botStock.setBounds(176, 237, 110, 35);
		botStock.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				controlador.imprimirStock();
			}
		});
		add(botStock);
		
		JButton botFloristeria = new JButton("Floristeria");
		botFloristeria.setBounds(176, 25, 110, 35);
		botFloristeria.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				controlador.crearFloristeria();
			}
		});
		add(botFloristeria);
	}
}
