package curs7;

import java.util.Scanner;

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

		boolean incercare = true;
		
		while(incercare) {
			
			int dice = (int) (Math.random() * 6+1);
			int dice2 = (int) (Math.random() * 6+1);
			int total = dice +dice2;
			
			
			if(total == 2 || total == 6 || total == 11) {
				System.out.println("Imi pare rau! Ai dat " + total + " Ai pierdut jocul!");
				break;
			}else if(total == 8 || total == 12) {
				System.out.println("Felicitari! Ai dat " + total + " Ai castigat jocul!");
				break;
			}else if(total == 3 || total == 9) {
				System.out.println("Ai dat " + total + " Automat mai dai o data!");
				continue;
			}else {
				
				boolean continuare = true;
				while(continuare) {
					System.out.println("Mai vrei sa continui jocul?");
					Scanner scan = new Scanner(System.in);
					String raspuns = scan.next().toLowerCase();
					//incercare = scan.next().equalsIgnoreCase("yes") ? incercare == true : incercare == false;
					
					if(raspuns.equals("yes")) {
						incercare = true ;
						continuare = false;
					}else if(raspuns.equals("no")) {
						incercare = false ;
						continuare = false;
					}else {
						System.out.println("Raspuns invalid. Raspunde cu Yes sau NO");
						continuare = true;

					}
					
				}
				
			}
			
		}
		
		System.out.println("Game over!");
		
	}

}
