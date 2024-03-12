package curs4;

import java.util.Scanner;

/*
 * 
 * Facem un calculator simplu pentru operatiile de baza: +(adunare), -(scadere), * sau x(inmultire)
 * si : sau /(impartire)
 * Intrebam userul pt un numar
 * Intrebam userul operatia matematica 
 * Intrebam al doilea numar
 * Printam rezultatul
 * 
 */
public class SimpleCalculator {
	int num1, num2, result;
	char operatiaMare;
	
	public void askTheUser() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		num1 = scanner.nextInt();
		System.out.println("Please enter the operation: ");
		operatiaMare = scanner.next().charAt(0);
		System.out.println("Please enter the second number: ");
		num2 = scanner.nextInt();
	}
	
	public void calculateValue() {
		
		askTheUser();
		
		if(operatiaMare == '+') {
			result = num1 + num2;
			displayResult();
		}
		else if(operatiaMare == '-') {
			result = num1 - num2;
			displayResult();
		}
		else if(operatiaMare == '*' || operatiaMare == 'x') {
			result = num1 * num2;
			displayResult();
		}
		else if(operatiaMare == '/' || operatiaMare == ':') {
			result = num1 / num2;
			displayResult();
		}
		else {
			System.out.println("Unknown operation!");
		}
		
		//System.out.println(num1+" " + operatiaMare +" " + num2 + " = " + result);
		//daca o punem aici, se executa si cand operatia nu este cunoscuta 
			
	}
	public void displayResult() {
//		if(operatiaMare == 'x' || operatiaMare == '*' || operatiaMare == '-' ||
//		operatiaMare == '+' || operatiaMare == ':' || operatiaMare == '/') {
		System.out.println(num1+" " + operatiaMare +" " + num2 + " = " + result);
//		}
		
	}
}
