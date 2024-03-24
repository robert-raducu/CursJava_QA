package tema7;

import java.util.Scanner;

//Scriem un program care simuleaza validarea unui cod PIN.
//Programul primeste input de la utilizator un PIN si il compara cu un PIN default
//care are valoarea 2244.
//Are trei incercari de acces
// Atata timp cat incearca de trei ori si PIN este gresit programul va printa :
//	“Maximum attempts reached. Card blocked”
//Pentru fiecare incercare gresita programul printeaza : “Wrong PIN”
//Daca PIN este valid programmul printeaza : “Acces granted”

public class PinValidation {
	int pin, defaultPin = 2244;
	
	public void askTheUserForAPin() {
		System.out.println("Please enter your PIN: ");
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		
		if (input.length() != 4 || !input.matches("\\d{4}")) {
		    System.out.println("PIN must be exactly 4 digits!");
		    askTheUserForAPin(); 
		} 
		
		else {
		    pin = Integer.parseInt(input);
		}
	}
	
	public void checkPin() {
		
		int flag = 3;
		do {
			askTheUserForAPin();
			if(pin == defaultPin) {
				System.out.println("Access granted!");
				break;
			}
			else {
				System.out.println("Wrong PIN!");
				if(flag == 1) {
					System.out.println("Maximum attempts reached. Card blocked");
				}
			}
			flag--;
			
		} while(flag != 0 );
		
		
//		while(flag != 0) {
//			askTheUserForANumber();
//			if(pin == defaultPin) {
//				System.out.println("Access granted!");
//				break;
//			}
//			else {
//				System.out.println("Wrong PIN!");
//				if(flag == 1) {
//					System.out.println("Maximum attempts reached. Card blocked");
//				}
//			}
//			flag--;
//		}
	}
}
