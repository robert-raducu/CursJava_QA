package tema3;

import java.util.Scanner;

// Scriem un program care intreaba utilizatorul punctajul unui test.
// Daca utilizatorul introduce o valoare intre 0 si 65 atunci printeaza ”Ai picat. Mai incearca”
// Daca utilizatorul introduce o valoare mai mare sau egala cu 66, atunci printeaza ”Felicitari, Ai trecut”

public class CheckScore {
	int score;
	
	public void askTheUserForTheScore() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please insert your score: ");
		score = scanner.nextInt();
	}
	
	public void passOrFail() {
		
		askTheUserForTheScore();
		
		if(score >= 0 && score <= 65) {
			System.out.println("Ai picat. Mai incearca");
		}
		
		else if(score >= 66 && score <= 100) {
			System.out.println("Felicitari, Ai trecut");
		}
		else {
			System.out.println("Punctaj incorect. Incearca din nou");
		}
	}

}
