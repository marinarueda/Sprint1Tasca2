package exercici1;

public class Producto {
	private String nombre;
	private float precio;
	
	
	
	public Producto(String nombre, float f) {
		this.nombre = nombre;
		this.precio = f;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Producto:" + nombre + "- precio:" + precio + "€";
	}
	
	
	
	

}
