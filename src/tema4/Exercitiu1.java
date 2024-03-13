package tema4;

import java.util.Scanner;

// Scriem un program care aplica un discount unei facturi.
// Daca factura este mai mare decat 100 aplica un discount de 10%
// Daca factura este mai mica decat 100 aplica un discount de 5%
// Printam rezultatul

public class Exercitiu1 {
	double factura;

	public void askTheUserForTheValue() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please insert the value of your bill: ");
		factura = scanner.nextDouble();
	}
	
	public double calculateDiscount(double factura, int discountValue) {
		double result = factura - ((double)discountValue/100)* factura;
		return result;
	}
	
	public void calculateTheBill() {
		
		askTheUserForTheValue();
		
		double value = (factura > 100) ? calculateDiscount(factura,10):calculateDiscount(factura,5);
		
		System.out.println("The bill after discount is: " + value);
		
	}
}
