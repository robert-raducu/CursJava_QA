package curs3;

import java.util.Scanner;

/*
 * Facem un program care verifica daca userul a introdus o litera
 * Daca a introdus o litera, printam: Caracterul este o litera
 * Daca a introdus altceva, printam: caracterul nu este o litera
 * 
 */

public class VerificaCaracter {
	
	char caracter;
	/*
	 * char
	 * String
	 * 
	 * televizor
	 * 012345678
	 * 
	 * televizor.charAt(5) == i
	 * 
	 */
	public void askTheUserForACharacter() {
		System.out.println("Please enter a character: ");
		Scanner scan = new Scanner(System.in);
		caracter = scan.next().charAt(0); //citesc un String + metoda care citeste un caracter de pe un
										  //                    anumit index 
	}
	
	public void checkIfCharacterIsLetter() {
		
		askTheUserForACharacter(); // pot apela metoda aici ca sa nu o mai apelez in main 
		
		if(Character.isLetter(caracter)) {
			System.out.println("Caracterul este o litera");
		}
		else {
			System.out.println("Caracterul nu este o litera");
		}
	}
}
