package tema3;

import java.util.Scanner;

//Scriem un program care intreaba utilizatorul ce varsta are.
//Daca utilizatorul introduce o valoare sub 18 , printeaza ”Esti minor”
//Daca utilizatorul introduce o valoare intre 18 si 65, printeaza ”Esti adult” 
//Daca utilizatorul introduce o valoare peste 65 , printeaza ”Esti batran”

public class CheckAge {
	
	int age;
	
	public void askTheUserForTheAge() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please insert your age: ");
		age = scanner.nextInt();
	}
	
	public void aboutTheAge() {
		
		askTheUserForTheAge();
		
		if(age >= 0 && age <= 18) {
			System.out.println("Esti minor");
		}
		
		else if(age > 18 && age <= 65) {
			System.out.println("Esti adult");
		}
		
		else if (age > 65) {
			System.out.println("Esti batran");
		}
		else {
			System.out.println("Varsta incorecta. Incearca din nou");
		}
	}

}
