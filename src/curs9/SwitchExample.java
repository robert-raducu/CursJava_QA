package curs9;

import java.util.Scanner;

/*
 * intreb userul un calificativ
 * in functie de raspuns, printrez:
 * A --> Felicitari!
 * B --> Destul de bine!
 * C --> Suficient!
 * D --> Insuficient!
 * Daca introduce orice alt calificativ --> Calificativ invalid!
 * 
 */
public class SwitchExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu un calificativ: ");
		String calificativ = scan.next();
		
		//if-else
		if(calificativ.equals("A")) {
			System.out.println("Felicitari!");
		}
		else if(calificativ.equals("B")) {
			System.out.println("Destul de bine!");
		}
		else if(calificativ.equals("C")) {
			System.out.println("Suficient!");
		}
		else if(calificativ.equals("D")) {
			System.out.println("Insuficient!");
		}
		else {
			System.out.println("Calificativ invalid!");
		}
		
		
		
		//switch 
		switch(calificativ) {
		case "A":
			System.out.println("Felicitari!");
			break;
		case "B":
			System.out.println("Destul de bine!");
			break;
		case "C":
			System.out.println("Suficient!");
			break;
		case "D":
			System.out.println("Insuficient!");
			break;
		default:
			System.out.println("Calificativ invalid!");
		}
		
		//enhanced switch 
		switch(calificativ) {
		case "A" -> System.out.println("Felicitari!");
		case "B" -> System.out.println("Destul de bine!");
		case "C" -> System.out.println("Suficient!");
		case "D" -> System.out.println("Insuficient!");
		default -> System.out.println("Calificativ invalid!");
		}
		
	}

}
