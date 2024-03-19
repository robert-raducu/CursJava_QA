package curs6;

import java.util.Scanner;

/*
 * porgram care simuleaza un ATM
 * are o singura functionalitate de retragere bani (retrageri multiple)
 * nu permite retragerea unei sume mai mari decat soldul
 * intreaba userul dupa fiecare operatiune daca vrea sa continue si face exit
 * 
 */

public class Atm {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sold = 2500;
		System.out.println("Ce suma vrei sa retragi: ");
		int sumaRetrasa = scanner.nextInt();
		boolean retragere = true;
		
		while(retragere) {
			if(sumaRetrasa < 1 || sumaRetrasa >= sold) {
				System.out.println("Suma indisponibila. Introdu alta suma: ");
				sumaRetrasa = scanner.nextInt();
			}
			else {
				System.out.println("Va rugam sa ridicatii banii!");
				System.out.println("Noul sold este "+(sold-sumaRetrasa));
				sold = sold - sumaRetrasa;
			}
			
			System.out.println("Vrei sa continui?");
			retragere=scanner.nextBoolean();
		}
		System.out.println("La revedere!");

	}

}
