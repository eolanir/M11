package m11.model;

public class Decoracion extends Producto{
	private String material;
	
	public Decoracion(String material, double precio) {
		super(precio);
		this.material=material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	public String toString() {
		return "Decoracion de " + this.material + ". Precio: " + this.getPrecio() + "€.";
	}
}
