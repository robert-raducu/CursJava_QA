package curs6;

import java.util.Scanner;

/*
 * program care simuleaza un ATM
 * are o singura functionalitate de retragere bani (retrageri multiple)
 * nu permite retragerea unei sume mai mari decat soldul
 * intreaba usrul dupa fiecare operatiune daca vrea sa contiune sau face exit
 */

public class Atm {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		
		int sold = 2500;

		boolean retragere = true;
		
		while(retragere) {
			System.out.println("Ce suma vrei sa retragi:");		
			int sumaRetrasa =  scan.nextInt();
			
			
			if(sumaRetrasa < 1 || sumaRetrasa >= sold) {
				System.out.println("Suma indisponibila. ");
				//sumaRetrasa =  scan.nextInt();
			}else {
				System.out.println("Va rugam ridicati banii!");
				System.out.println("Noul sold este " + (sold-sumaRetrasa));
				sold = sold - sumaRetrasa; //sold -=sumaRetrasa;
			}
			
			System.out.println("Vrei sa continui ?");
			retragere = scan.nextBoolean();
		}
		
		System.out.println("La revedere!");
		scan.close();
	}

}