package curs5r;

import java.util.Scanner;

/*
 * facem un program care citeste de la tastatura un text
 * in text cautam litera 'o'
 * daca gasim litera printam ca am gasit litera, daca nu
 * printam ca nu am gasit litera in text
 * 
 */

public class LetterSearch {

	public static void main(String[] args) {
		
		System.out.println("Please enter a text: ");
		Scanner scan = new Scanner(System.in);
		String text = scan.next().toLowerCase();
		int j = 0;
		
		for(int i=0; i<text.length(); i++) {
		
			if(text.charAt(i) == 'o'  ) { //|| text.charAt(i) == 'O' ) {
				j++;
				//System.out.println("Am gasit litera in text!");
				//break;
			}
		
		}
	/*	
		if(j != 0) {
			System.out.println("Am gasit de " + j +" ori litera in text!");
		}else {
			System.out.println("Nu am gasit litera in text!");
		}*/
		String result = j != 0 ? "Am gasit de " + j +" ori litera in text!" :"Nu am gasit litera in text!";
		System.out.println(result);
	}

}
