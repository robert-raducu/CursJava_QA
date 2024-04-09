package curs12;

public class ExceptionExample {

	public static void main(String[] args) {
		
		String[] week = {"L","Ma","Mi","J","V","S","D"};
		//                0   1    2    3   4   5   6    7  8  9 
		//exceptia apare cand incercam sa apelam un index inafara array-ului
		
		
		
		try {
			//codul supus erorii, prinde exceptia si o paseaza catre catch
			System.out.println(week[7]);
			
		} catch(ArrayIndexOutOfBoundsException err) {
			//tratam ce vrem sa se intample
			System.out.println("Ai incercat sa accesezi un index inafara array-ului!");
		}
		
		
		
		
		System.out.println("Some other code!");

	}

}
