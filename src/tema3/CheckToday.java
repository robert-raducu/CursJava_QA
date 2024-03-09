package tema3;

import java.util.Scanner;

//Scriem un program care intreaba utilizatorul ce zi este astazi.
//Utilizatorul trebuie sa introduca un numar de la 1 -7
//Daca introduce zero – printam “Te rog sa introduci un numar mai mare ca 0”
//Daca introduce 1 – printam “Astazi este luni”
//Daca introuce 2 – Printam ”Astazi este marti”
//Si tot asa pana duminica
//Daca introduce un numar mai mare ca 7 printam : ”Saptamana are doar 7 zile te rog sa introduci un numar valid”

public class CheckToday {
	int day;
	
	public void askTheUserForTheDay() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please insert the day: ");
		day = scanner.nextInt();
	}
	
	public void checkTheDay() {
		
		askTheUserForTheDay();
		
		switch(day) {
			case 0:
				System.out.println("Te rog sa introduci un numar mai mare ca 0");
				break;
			case 1:
				System.out.println("Astazi este luni");
				break;
			case 2:
				System.out.println("Astazi este marti");
				break;
			case 3:
				System.out.println("Astazi este miercuri");
				break;
			case 4:
				System.out.println("Astazi este joi");
				break;
			case 5:
				System.out.println("Astazi este vineri");
				break;
			case 6:
				System.out.println("Astazi este sambata");
				break;
			case 7:
				System.out.println("Astazi este duminica");
				break;
			default:
				System.out.println("Numarul introdus nu corespunde unei zile. Incearca din nou");
				break;
		}
		
	}
	
}
