package exercici1;

import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) {
		
		ArrayList <Producto >listaProductos = new ArrayList<>();
		
		/*Producto producto1= new Producto("Leche", 1.75f);
		listaProductos.add(producto1);
		Producto producto2= new Producto("Huevos", 3.20f);
		listaProductos.add(producto2);
		Producto producto3= new Producto("Pan", 3.20f);
		listaProductos.add(producto3);*/
		
		//Llamada a método calcularTotal para sacar en el caso de no añadir productos en VentaBuidaException
		//Venta.calcularTotal(listaProductos);
		
		//Provocar un ArrayIndexOutOfBoundsException
		try {
		    System.out.println(listaProductos.get(6));
		} catch (IndexOutOfBoundsException e) {
		    String mensaje = "La lista de productos no tiene esa posición";
		    System.out.println("Se ha producido un error: " + mensaje);
		}
		
		
		
	}

}
