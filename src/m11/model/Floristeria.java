package m11.model;

import java.util.ArrayList;
import java.util.List;

public class Floristeria {
	private String nombre;
	private List<Producto> listaProductos;
	
	
	public Floristeria(String nombre) {
		this.nombre = nombre;
		listaProductos = new ArrayList<Producto>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String[] getListaProductos() {
		int n = listaProductos.size();
		String[] stock = new String[n];
		int i = 0;
		for(Producto producto : listaProductos) {
			stock[i] = producto.toString();
			i++;
		}
		
		return stock;
	}

	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}
	
	public void addProducto(Producto producto) {
		listaProductos.add(producto);
	}
	
}
