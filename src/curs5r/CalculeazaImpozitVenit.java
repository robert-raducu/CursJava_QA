package curs5r;

import java.util.Scanner;

/*
 * facem un program care calculeaza impozitul pe venit
 * reguli:
 * --> putem avea mai multe venituri. Intreb nr de venituri]
 * --> pentru fiecare venit calculez formula : 
 * daca venit este mai mic sau egal cu 50k atunci impozit este 0.1
 * daca este mai mare atunci impozit este 0.15
 * 
 * la final printam impozit total (suma)
 */

public class CalculeazaImpozitVenit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double suma = 0.0;
		int venituri = 0;
		
		System.out.println("Cate venituri ai ? ");
		venituri =  scan.nextInt();
		
		for(int i =1; i <= venituri; i++) {
			
			System.out.println("Care este valoarea venitului " + i);
			double valoareVenit = scan.nextDouble();
			
		    suma = (valoareVenit <= 50000) ? suma + valoareVenit*0.1 : suma + valoareVenit*0.15;
		    System.out.println("Suma " + suma);
		}
		
		System.out.println("Impozit total de plata : " + suma);
		
	}

}
