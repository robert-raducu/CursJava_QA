package curs7;

import java.util.Scanner;

/*
 * Facem un program care valideaza o parola pe baza unor reguli:
 * 
 * La rulare, printam reguli parola
 * pasul 2 cerem username
 * pasul 3 cerem parola si validam parola, intrebam pana cand parola este corecta
 * Printam ce reguli nu se respecta in parola
 * 
 * Reguli:
 * 1. parola trebuie sa contina minim 10 caractere
 * 2. parola trebuie sa contina un caracter upper case
 * 3. parola nu trebuie sa fie la fel ca username
 * 
 * Daca parola respecta regulile printam : Parola valida
 * 
 * Metode:
 * 1. metoda pentru username 
 * 2. metoda pentru parola
 * 3. metoda pentru validare parola
 * 4. metoda pentru print reguli
 * 
 */

public class PasswordValidation {

	Scanner scan  =  new Scanner(System.in);
	String username;
	boolean isValid =  true;
	
	public void readUsername() {
		System.out.println("Te rog sa introduci un username:");
		username = scan.next();
	}
	
	public void printPasswordRules() {
		System.out.println("Reguli parola:");
		System.out.println("1. parola trebuie sa contina minim 10 caractere");
		System.out.println("2. parola trebuie sa contina un caracter upper case");
		System.out.println("3. parola nu trebuie sa fie la fel ca username");
	}

	public String readProposedPassword() {
		System.out.println("Te rog sa introduci o parola:");
		return scan.next();
	} 
	
	public void checkPasswordRules(String password) {
	//	isValid = true;
	//	System.out.println(isValid);
		
		if(password.length() < 10 ) {
			System.out.println("1. parola trebuie sa contina minim 10 caractere");
			isValid = false;
		}
		if(password.equals(password.toLowerCase())) {
			System.out.println("2. parola trebuie sa contina un caracter upper case");
			isValid= false;
		}
		if(password.equalsIgnoreCase(username)) {
			System.out.println("3. parola nu trebuie sa fie la fel ca username");
			isValid = false;

		}
		
	}
}
