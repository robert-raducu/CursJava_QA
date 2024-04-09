package curs12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample2 {

	public static void main(String[] args) {
		
		try {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu numarul 1: ");
		int num1 = scan.nextInt();
		System.out.println("Introdu numarul 2: ");
		int num2 = scan.nextInt();
		num2 = (Integer) null;
		int division = num1 / num2;
		
		System.out.println(division);
		
		} catch(ArithmeticException e) {
			System.out.println("Nu mai imparti la 0 ca nu merge!");
		}catch (InputMismatchException e) {
			System.out.println("Nu mai scrie alte caractere inafara de numere ca nu merge!");
		} catch(NullPointerException e) {
			System.out.println("A iesit cu Null Pointer!");
		}catch(Exception e) {
			System.out.println("A aparut o eroare!"); //nu poate fi prima intr un try catch block
		}
		
		System.out.println("--------------------------------------------------------------------");
		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Introdu numarul 1: ");
			int num1 = scan.nextInt();
			System.out.println("Introdu numarul 2: ");
			int num2 = scan.nextInt();
			num2 = (Integer) null;
			int division = num1 / num2;
			
			System.out.println(division);
			
		} catch(Exception e) {
				System.out.println("A aparut o eroare!");
				e.printStackTrace();//nu poate fi prima intr un try catch block
			}
	}

}
