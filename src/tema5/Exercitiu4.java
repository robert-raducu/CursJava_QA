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
	
	double celsius;
	
	public void askTheUserForTheCelsius() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		celsius = scanner.nextDouble();
	}
	
	public void calculateFahrenheit() {
		
		askTheUserForTheCelsius();
		
		System.out.println("Temperatura Celsius de "+celsius+" este in Farenheit "+(double)((celsius * 9/5) + 32) +" grade");
	}
}
