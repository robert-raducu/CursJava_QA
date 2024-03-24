package curs5r;

import java.util.Scanner;

/*
 * facem un program care verifica daca un text este pangram
 */

public class PangramCheck {

	public static void main(String[] args) {

		//Scanner scan =  new Scanner(System.in);
		String text = "The quick brown fo jumps over the lazy dog.".toLowerCase();
			//		   01234....				
		//text.indexOf(0)
	//	System.out.println(text.indexOf('h'));
		
		
	/*	char litera = 'a';
		//litera++;
	//	System.out.println(++litera);
		
		for(int i=0; i<100; i++) {
			
			System.out.println(++litera);
		}*/
		boolean estePanagram = true;
		
		for(char ch= 'a'; ch <= 'z'; ch++ ) {
		
			if(text.indexOf(ch) == -1) {
			estePanagram = false;
			break;
			}
			
		}
		
	
		System.out.println(estePanagram? "Textul este panagram" : "Textul nu este panagram");
		
		
		
	}

}
