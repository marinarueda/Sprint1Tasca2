package exercici1;

import java.util.ArrayList;

public class Venta {
	private static float precioTotal;
	private ArrayList<Producto> listaProductos;

	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public static float getPrecioTotal() {
		return precioTotal;
	}

	public static void setPrecioTotal(float precioTotal) {
		Venta.precioTotal = precioTotal;
	}

	public static void calcularTotal(ArrayList<Producto> listaProductos) {
		try {
			if (listaProductos.isEmpty()) {
				throw new VentaBuidaException();
			} else {
				for (int i = 0; i < listaProductos.size(); i++) {
					precioTotal = precioTotal + listaProductos.get(i).getPrecio();
				}
				System.out.println("El precio total de la cesta de la compra es de" + precioTotal + "€");
			}
		} catch (VentaBuidaException e) {
			System.out.println("Mensaje de error: " + e.getMessage());
		}

	}

}
