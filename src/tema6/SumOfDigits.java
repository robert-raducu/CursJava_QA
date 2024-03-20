package tema6;

//Scriem un program care calculeaza suma cifrelor unui numar.
//Numarul in primim de la tastatura.
//
//Ex: Daca user-ul introduce numarul : 334
//Suma numerelor este 10

import java.util.Scanner;

public class SumOfDigits {
	long number; //8 bytes, stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
	
	public void askTheUserForTheNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		number = scanner.nextLong();
	}
	
	public void sumOfDigits() {
		
		askTheUserForTheNumber();
		
		if(number < 0) {
			number = -number;
		}
		
		int sum = 0;
		while(number!=0) {
			int digit = (int) (number % 10);
			sum+=digit;
			number = number / 10;
		}
		
		System.out.println("The sum of the digit of your number is " + sum);
	}
}
