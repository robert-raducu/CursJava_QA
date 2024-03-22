package curs7;

/*
 * facem un joc de zaruri in care avem urmatoarele reguli:
 * 1. daca user-ul da in total una dintre valorile 2,6,11 -> pierde jocul --> facem exit
 * 2. daca user-ul da in total una dintre valorile 8, 12 -> castiga jocul --> facem exit 
 * 2. daca user-ul da in total una dintre valorile 3, 9 -> repeta automat aruncarea 
 * 4. daca user-ul da orice alta varianta decat cele de mai sus, il intrebam daca mai vrea sa dea
 * inca o data
 * Raspunsul trebuie sa fie de forma yes-no si mapam in spate pe un true-false
 * - daca raspunde nu, facem exit
 * - daca raspunde da, o luam de la capat
 * 
 */

public class DiceGame {

	public static void main(String[] args) {
		int dice = (int)(Math.random() * 6 + 1);
		int dice2 = (int)(Math.random() * 6 + 1);
		
		int total = dice + dice2;
		
		/*
		while() {
			
			if() {
				
			}
			
			else {
				
			}
		} */

	}

}
