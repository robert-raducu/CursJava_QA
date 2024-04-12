package curs13;

import java.util.Scanner;

/*
 * facem un program care cauta un oras pe baza unui cod postal 
 * avem 6 orase si 6 coduri postale 
 * avem nevoie de o functionalitate care sa caute pe baza unui cod si care sa intoarca
 * orasul
 * Daca codul postal nu exista in lista mea de coduri atunci arunc CodPostalException
 * Daca apare exceptia, vreau sa intreb din nou pana primesc un cod corect
 * 
 * 
 */

public class SearchPostalCode {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		CoduriPostale cp = new CoduriPostale();
		
		String oras = "";
		
		do {
			
			
		System.out.println("Introdu un cod postal: ");
		int cod = scan.nextInt();	
		
		
		try {
			oras = cp.gasesteOras(cod);
			System.out.println("Orasul asociat codului postal " + cod + " este " + oras);
		} catch (CodPostalException e) {
			e.printStackTrace();
		}

		
		} while(oras.equals(""));
	}

}
