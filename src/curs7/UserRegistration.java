package curs7;

import java.util.Scanner;

/*
 * username nu este null si nu este mai mic decat 6 caractere 
 * 
 */

public class UserRegistration {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Introdu username :");
		String username =  scan.next();
		
		while(username.equals(null) || username.length()<6) {
			System.out.println("Introdu username :");
			username =  scan.next();	
		}
		
		System.out.println("Username-ul este " + username);
		
		System.out.println("---------------------------------------------");
		
		do {
			System.out.println("Introdu username :");
			username =  scan.next();	
			
		}while(username.equals(null) || username.length()<6);
		
		System.out.println("Username-ul este " + username);

		scan.close();
	}

}
