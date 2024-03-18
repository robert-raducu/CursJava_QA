package tema5;

import java.util.Scanner;

//Scriem un program care intreaba utilizatorul 10 numere sub urmatoarea
//forma:
//Please enter number 1:
//Please enter number 2:
//---etc
//Dupa ce utilizatorul a introdus cele zece numere calculam suma lor si o
//printam sub urmatoarea forma :
//The sum of the numbers is:

public class Exercitiu1 {
	
	int number, S=0;
	
	public void askTheUserAndCalculateSum() {
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.println("Please enter number "+i+": ");
			number = scanner.nextInt();
			S += number;
		}
		
		System.out.println("The sum of the numbers is: " + S);
	}
	
	
}
