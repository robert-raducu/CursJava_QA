package curs6;

import java.util.Scanner;

/*
 * avem un sold de 1000
 * vreau sa retrag din sold
 * nu pot retrage toata suma sau mai mult decat am in sold
 * vreau sa intreb userul cat vrea sa retraga si fac asta pana introduce o valoare valida 
 * 
 */
public class WithdrawExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sold = 1000;
		int sumaRetrasa =  scanner.nextInt();
		//	for(int i = 1; i < sold-1; i++) {}
		
			while(sumaRetrasa < 1 || sumaRetrasa > sold) {
				
				System.out.println("Suma indisponibila. Introdu alta suma:");
				sumaRetrasa =  scanner.nextInt();
			}
			
			System.out.println("Va rugam ridicati banii!");
			System.out.println("Noul sold este " + (sold-sumaRetrasa));
			
			System.out.println("Mai vrei si alta operatiune?");

	}

}
