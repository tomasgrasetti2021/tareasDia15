package tareaDia15;
import java.util.Scanner;
public class Conversion {
	
	public static double dollar = 0.058;
	public static double quetzal = 0.46;
	public static double soles =  0.21;
	
public static double USD(double peso) {
	return peso * dollar;
}
public static double Guate(double peso) {
	return peso + quetzal;
}

public static double Peru(double peso) {
	return peso * soles;
	}
public static void main(String[] args) {
	Scanner en = new Scanner(System.in);
	
	System.out.println("Ingresa la cantidad en pesos mexicanos: ");
	double pesos = en.nextDouble();
	
	double dollar = USD(pesos);
	double quetzal = Guate(pesos);
	double soles = Peru(pesos);
	
	System.out.println(pesos + " pesos Mexicanos es igual a: " + dollar + " Dollares");
	System.out.println(pesos + " pesos Mexicanos es igual a: " + quetzal + " Quetzales");
	System.out.println(pesos +" pesos Mexicanos es igual a: " + soles + " Soles");
	
}

}
