package curs12;

import java.util.Scanner;

public class ExceptionExample4 {

	public static void main(String[] args) {
		ExceptionExample4 obj = new ExceptionExample4();
		obj.division();

		
	}
	
	public void division() {
		Scanner scan = new Scanner(System.in);
		int number1, number2 = 0;
		boolean conditieNumar1 = true;
		boolean conditieNumar2 = true;
		
		do {
		try {
			System.out.println("Please enter number 1: ");
			try {
				// Integer.parseInt()
				number1 = Integer.parseInt(scan.next());
				
			} catch(NumberFormatException e) {
				//e.printStackTrace();
				System.out.println("Please enter only numeric values!");
				continue;
			}
			
			do {
			System.out.println("Please enter number 2: ");
			try {
				// Integer.parseInt()
				number2 = Integer.parseInt(scan.next());
				
			} catch(NumberFormatException e) {
				//e.printStackTrace();
				System.out.println("Please enter only numeric values!");
				continue;
			}
			conditieNumar2 = false;
			
			}while(conditieNumar2);
			
			if(number1 == 0 || number2 ==0) {
				//System.out.println("One of the numbers is 0! Try again!");
				//continue;
				throw new ArithmeticException("One of the numbers is 0! Try again!");
				
			}
			
			System.out.println("Result " + number1/number2);
			
			conditieNumar1 = false;
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		} while(conditieNumar1);
	}

}
