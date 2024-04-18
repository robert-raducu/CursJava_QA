package tema12;

import java.util.Scanner;

public class InterogareElev {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Catalog catalog = new Catalog();
		
		System.out.println("Cum te cheama, puisor?");
		String nume = scan.nextLine(); 
		
		//scan.next() imi ia doar numele, nu si prenumele si primeam exceptie
		
		System.out.println("Ce nota zici ca ai luat?");
		double nota = scan.nextDouble();
		
		
		catalog.modifyCatalog(nume, nota);
		
		

	}

}
