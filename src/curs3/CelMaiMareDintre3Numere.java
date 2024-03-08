package curs3;

import java.util.Scanner;

/*
 * Facem un program care citeste 3 numere de la tastatura
 * Verifica carre dintre ele este cel mai mare si printeaza in consola
 * Daca 2 numere sunt egale, printeaza: Numere egale 
 * 
 */

public class CelMaiMareDintre3Numere {
	int nr1, nr2, nr3;
	
	public void askTheUserFor3Numbers() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		nr1 = scan.nextInt();
		System.out.println("Please enter the second number: ");
		nr2 = scan.nextInt();
		System.out.println("Please enter the third number: ");
		nr3 = scan.nextInt();
	}
	
	public void findOutBiggestNumber() {
		
		askTheUserFor3Numbers();
		
		if(nr1 > nr2 && nr1 > nr3) {
			System.out.println("First nunmber is the greatest");
		}
		
		else if(nr2 > nr3 && nr2 > nr1) {
			System.out.println("Second number is the greatest");
		}
		
		else if(nr3 > nr1 && nr3 > nr2) {
			System.out.println("Third number is the greatest");
		}
		
		else {
			System.out.println("At least two numbers are equal");
		}
		
		
	}
	
	


}
