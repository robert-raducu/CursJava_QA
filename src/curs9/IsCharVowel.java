package curs9;
/*
 * 
 * citim de la tastatura o litera si verificam daca este consoana sau vocala
 */

import java.util.Scanner;

public class IsCharVowel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu o litera : ");
		char litera = scan.next().charAt(0);
		litera = Character.toUpperCase(litera);
		
//				String text = "masina";
//				System.out.println(text.toUpperCase());
		
		// clasa parinte a lui char
//				litera = Character.toUpperCase(litera);
//				System.out.println(litera);
		// a e i o u A E I O U

		switch(litera) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Este vocala!");
			break;
		default: 
			System.out.println("Este consoana!");
		}
		
		
		switch(litera) {
		case 'A', 'E', 'I','O','U' -> System.out.println("Este vocala!");
		default -> System.out.println("Este consoana!");
		}
	}

}
