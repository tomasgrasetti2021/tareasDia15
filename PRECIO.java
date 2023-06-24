package tareaDia15;

public class PRECIO {
	
	    private static final double PORCENTAJE_DESCUENTO_SUPERIOR = 0.10; 
	    private static final double PORCENTAJE_DESCUENTO_INFERIOR = 0.05; 
	    private static final double PORCENTAJE_IVA = 0.16; 

	    public double porcentajeIVA(double precio) {
	        return precio * PORCENTAJE_IVA;
	    }

	    public double calcularPrecioConIVA(double precio) {
	        return precio + porcentajeIVA(precio);
	    }

	    public double calcularPrecioFinal(double precio, double iva) {
	        if (precio > 50) {
	            return calcularPrecioConIVA(precio) - (precio * PORCENTAJE_DESCUENTO_SUPERIOR);
	        } else {
	            return calcularPrecioConIVA(precio) - (precio * PORCENTAJE_DESCUENTO_INFERIOR);
	        }
	    }
	
}

