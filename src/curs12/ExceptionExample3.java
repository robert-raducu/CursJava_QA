package curs12;

public class ExceptionExample3 {

	public static void main(String[] args) {
		
		try {
			//executa codul expus erorii
			String nume =null;
			System.out.println("Lungimea lui nume este: " + nume.length());
			
		} catch(Exception e) {
			// daca apre o exceptie, asta o prinde
			System.out.println("Exception occured");
			System.out.println(3/0);
			
		} finally {
			//se executa indiferent daca codul se executa cu succes sau cu eroare
			System.out.println("Finally block of code");
		}

		
		System.out.println(" Code after try - catch ");
	}

}
