package tema8;

//Scriem un program care printeaza in consola numele unei luni a
//anului bazandu-se pe inputul utilizatorului.
//Intreba untilizatorul un numar si pe baza numarului va printa numele
//lunii. Ex : utilizatorul introduce 1 si printeaza Ianuarie
//Folosim un array pentru numele lunilor
//Daca ultilzatorul introduce un numar invalid, intreaba din nou pana
//numarul introdus este valid
//Pentru numar invalid informeaza utilizatorul print-un mesaj ca
//numarul este invalid.

import java.util.Scanner;

public class MonthlyInput {
	int number;
	String[] lunileAnului = {"Ianuarie", "Februarie","Martie",
			"Aprilie","Mai","Iunie","Iulie","August","Septembrie",
			"Octombrie","Noiembrie","Decembrie"};
	
	public void askTheUserForANumber() {
		System.out.println("Please enter a number corresponding to a month: ");
		Scanner scan = new Scanner(System.in);
		//number = scan.nextInt();
		do {
			while(!scan.hasNextInt()) { //new method, check if the next token in this scanner's input can be interpreted as an int value
				// hasNextInt(), hasNextFloat(), hasNext()...
				System.out.println("You did not insert an integer. Try again please!");
				String junk = scan.next();
			}
			number = scan.nextInt();
			if(number < 1 || number > 12) {
			 System.out.println("The inserted number is not valid. Please try again!");
			 number = scan.nextInt();
			}
			 
		} while(number < 1 || number > 12);
	}
	
	public void monthlyInput() {
		askTheUserForANumber();
		
		for(int i = 0; i < lunileAnului.length; i++) {
			if(number == (i+1)) {
				System.out.println("Luna "+ lunileAnului[i] + " este asociata numarului " + number);
				break;
			}
		}
	}
}
