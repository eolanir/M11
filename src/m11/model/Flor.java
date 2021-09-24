package m11.model;

public class Flor extends Producto {
	private String color;
	
	public Flor(String color, double precio){
		super(precio);
		this.color = color;
	}
	
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return "Flor de color " + this.color + ". Precio: " + this.getPrecio() + "€.";
	}
	
}
