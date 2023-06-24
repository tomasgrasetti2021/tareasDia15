package tareaDia15;
import java.util.Scanner;

	public class descuentoIVA {
	    public static void main(String[] args) {
	        Scanner en = new Scanner(System.in);
	        System.out.print("Ingrese el precio: ");
	        double precio = en.nextDouble();

	       PRECIO calculadora = new PRECIO(); 

	        double iva = calculadora.porcentajeIVA(precio); 
	        double precioIVA = calculadora.calcularPrecioConIVA(precio); 
	        double precioFinal = calculadora.calcularPrecioFinal(precio, iva); 

	        System.out.println("Precio con IVA: " + precioIVA);
	        System.out.println("Precio final con descuento: " + precioFinal);
	    }
	}


