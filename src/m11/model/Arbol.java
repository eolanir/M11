package m11.model;

public class Arbol extends Producto {
	private String altura;

	public Arbol(String altura, double precio) {
		super(precio);
		this.altura = altura;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}
	
	public String toString() {
		return "Arbol de " + this.altura + ". Precio: " + this.getPrecio() + "€.";
	}
}
