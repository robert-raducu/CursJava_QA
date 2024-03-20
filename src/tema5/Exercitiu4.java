package tema5;

import java.util.Scanner;

//Scriem un program face conversie din grade celsius in grade
//farenheit.
//Intrebam userul cate temperaturi vrea sa transforme
//Pentru fiecare temperatura transormam gradele celsius in farneheit
//si printam
//Exemplu :
//Temperatura Celsius de 56.0 grade este in Farenheit 132.8 grade

public class Exercitiu4 {
	
	int number;
	double celsius;
	
	public void askAndCalculateValue() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many values do you want to convert? ");
		number = scanner.nextInt();
		
		for(int i = 0; i < number ; i++) {
			System.out.println("Please enter the temperature: ");
			celsius = scanner.nextDouble();
			calculateFahrenheit();
		}
	}
	
	public void calculateFahrenheit() {		
		System.out.println("Temperatura Celsius de "+celsius+" este in Farenheit "+(double)((celsius * 9/5) + 32) +" grade");
		System.out.println(" ");
	}
}
