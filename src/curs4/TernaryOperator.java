package curs4;

import java.util.Scanner;

// var = (conditia)? adevarat : fals

public class TernaryOperator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		int num1 = scanner.nextInt();
		System.out.println("Please enter the second number: ");
		int num2 = scanner.nextInt();
		
		if(num1 > 0) {
			System.out.println("Num1 este pozitiv");
		}
		
		else {
			System.out.println("Num1 este negativ");
		}
		
		String result = (num1 > 0) ? "Num1 este pozitiv" : "Num1 este negativ" ;
		System.out.println(result);
		
		//verific num1 si num2 sunt pozitive
		result = num1 > 0 && num2 > 0 ? "Ambele sunt pozitive" : "Unul dintre numere este negativ";
		System.out.println(result);
		
		
		//verific care nr este mai mare si daca sunt egale
		
		if(num1 > num2) {
			System.out.println("Num1 este mai mare");
		}
		else if(num1 == num2) {
			System.out.println("Numerele sunt egale");
		}
		else {
			System.out.println("Num2 este mai mare");
		}
		
		//alternativa
		result = num1 == num2 ? "Numerele sunt egale " : 
			(num1 > num2) ? "Num1 este mai mare" : "Num2 este mai mare";
		System.out.println(result);
	}

}
