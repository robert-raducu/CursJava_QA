package tema5;

import java.util.Scanner;

//Scriem un program care intreaba utilizatorul un numar si printeaza
//tabla inmultirii acelui numar de la 1 la 10

public class Exercitiu2 {
	
	int number;
	
	public void askTheUserForTheNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		number = scanner.nextInt();
	}
	
	public void calculateMultiplication() {
		
		askTheUserForTheNumber();
		
		for(int i = 1; i <= 10;i++) {
			int res = number * i;
			System.out.println(number + " * " + i + " = "+ res);
		}
	}
}
