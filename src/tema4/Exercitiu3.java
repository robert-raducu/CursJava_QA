package tema4;

import java.util.Scanner;

//Scriem un program care intreaba utilizatorul un punctaj.
//Daca utilizatorul introduce o valoare mai mare sau egala cu 90 ii
//atribuim FB
//Daca utilizatorul introduce o valoare mai mare sau egala cu 80 ii
//atribuim B
//Daca utilizatorul introduce o valoare mai mica decat 80 ii atribuim S
//Daca a luat calificativ FB printam : “Ai primit : FoarteBine”
//Daca a luat calificativ FB printam : “Ai primit : Bine”
//Daca a luat calificativ FB printam : “Ai primit : Suficient”

public class Exercitiu3 {
	int score;
	
	public void askTheUserForTheScore() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please insert the score: ");
		score = scanner.nextInt();
	}
	
	public void thisIsYourScore() {
		
		askTheUserForTheScore();
		String message = (score >= 90) ? "Foarte Bine":(score >= 80) ? "Bine": "Suficient";
		System.out.println(message);
	}
}
