package curs7;

import java.util.Scanner;

/*
 * 
 * Metode:
 * 1. metoda pentru username  
 * 2. metoda pentru parola
 * 3. metoda pentru validare parola
 * 4. metoda pentru print reguli
 * 
 */

public class PasswordValidation {
	Scanner scanner = new Scanner(System.in);
	String username;
	boolean isValid = true;
	
	public void readUsername() {
		System.out.println("Te rog sa introduci un username: ");
		username = scanner.next();
	}
	
	public void  printPasswordRules() {
		System.out.println("Reguli parola: ");
		System.out.println("1. parola trebuie sa contina minim 10 caractere");
		System.out.println("2. parola trebuie sa contina un caracter upper case");
		System.out.println("3. parola nu trebuie sa fie la fel ca username");
	}
	
	public String readProposedPassword() {
		System.out.println("Te rog sa introduci o parola: ");
		return scanner.next();
	}
	
	public void checkPasswordRules(String password) {
		isValid = true;
		
		if(password.length() < 10) {
			System.out.println("1. Parola trebuie sa contina un caracter uppercase");
			isValid = false;
		}
		
		if(password.equals(password.toLowerCase())) {
			System.out.println("2. Parola trebuie sa contina un caracter upper case");
			isValid = false;
		}
		
		if(password.equalsIgnoreCase(username)) {
			System.out.println("3. Parola nu trebuie sa fie la fel ca username");
			isValid = false;
		}
	}
	
}
