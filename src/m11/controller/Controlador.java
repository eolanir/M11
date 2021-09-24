package m11.controller;

import javax.swing.JList;
import javax.swing.JOptionPane;

import m11.model.Arbol;
import m11.model.Decoracion;
import m11.model.Flor;
import m11.model.Floristeria;

public class Controlador {
	private Floristeria floristeria;
	
	public void crearFloristeria() {
		String nombre = JOptionPane.showInputDialog("Introduce el nombre de la floristeria.");
		
		floristeria = new Floristeria(nombre);
	}
	
	public void addArbol() {
		String altura = JOptionPane.showInputDialog("Introduce la altura del arbol.");
		String precioStr = "";
		while(isNumeric(precioStr) == false) {
			precioStr = JOptionPane.showInputDialog("Introduce el precio del producto.");
			if(isNumeric(precioStr)==false) {
				JOptionPane.showMessageDialog(null, "Introduce un valor numerico.", "alert", JOptionPane.ERROR_MESSAGE);
			}
		}
		double precio = Double.parseDouble(precioStr);
		Arbol arbol = new Arbol(altura, precio);
		floristeria.addProducto(arbol);
		JOptionPane.showMessageDialog(null, "Arbol añadido correctamente al stock de la floristeria.");
	}
	
	public void addFlor() {
		String color = JOptionPane.showInputDialog("Introduce el color de la flor.");
		String precioStr = "";
		while(isNumeric(precioStr) == false) {
			precioStr = JOptionPane.showInputDialog("Introduce el precio del producto.");
			if(isNumeric(precioStr)==false) {
				JOptionPane.showMessageDialog(null, "Introduce un valor numerico.", "alert", JOptionPane.ERROR_MESSAGE);
			}
		}
		double precio = Double.parseDouble(precioStr);
		Flor flor = new Flor(color, precio);
		floristeria.addProducto(flor);
		JOptionPane.showMessageDialog(null, "Flor añadida correctamente al stock de la floristeria.");
	}
	
	public void addDecoracion() {
		String material = JOptionPane.showInputDialog("Introduce el material de la decoracion.");
		String precioStr = "";
		while(isNumeric(precioStr) == false) {
			precioStr = JOptionPane.showInputDialog("Introduce el precio del producto.");
			if(isNumeric(precioStr)==false) {
				JOptionPane.showMessageDialog(null, "Introduce un valor numerico.", "alert", JOptionPane.ERROR_MESSAGE);
			}
		}
		double precio = Double.parseDouble(precioStr);
		Decoracion decoracion = new Decoracion(material, precio);
		floristeria.addProducto(decoracion);
		JOptionPane.showMessageDialog(null, "Decoracion añadida correctamente al stock de la floristeria.");
	}
	
	
	public void imprimirStock() {
		floristeria = new Floristeria("tienda");
		addDecoracion();
		addFlor();
		addArbol();
		JOptionPane.showMessageDialog(null, new JList(floristeria.getListaProductos()), "Stock de la tienda " + floristeria.getNombre(), JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	//Metodo para comprobar que el input sea numerico
	public boolean isNumeric(String string) {
		if(string == null) {
			return false;
		}
		try {
			double number = Double.parseDouble(string);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
