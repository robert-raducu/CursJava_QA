package tema5;

import java.util.Scanner;

//Scriem un program care verifica daca un string este palindrom. Un
//text este palindrom atunci cand citit de la final are acelasi inteles
//ca atunci cand este citit de la inceput
//Exemplu :
//radar
//Folosim FOR

public class Exercitiu3 {
	
	String cuvant;
	boolean flag = true;
	
	public void askTheUserForTheWord() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please insert the word: ");
		cuvant = scanner.next();
	}
	
	public void checkPalindrom() {
		
		askTheUserForTheWord();
		
		cuvant = cuvant.toLowerCase();
		
		for(int i = 0; i < cuvant.length(); i++) {
			 if(cuvant.charAt(i) != cuvant.charAt(cuvant.length()-i-1)){ 
				flag = false;    
	            break;
			 }
		}
		
		if(flag)    
            System.out.println("Cuvantul dat este un palindrom");    
        else    
            System.out.println("Cuvantul dat NU este un palindrom");    
    }    

}
