package curs2;

public class ExampleVariable {
	
	String prenume; // variabila de instanta

	// nu apartine de instanta acestei clase 
	
	public static void main(String[] args) {
		
		String nume = "Ion"; //declarare si initializare
		
		int age; //declarare
		
		age = 22; //initializare variabila
		
		// var keyword
		var number = 55;
		var masina="Dacia";
		
		/* var keyword --not allowed
		 * method parameters
		 * instance variables 
		 * return type of a method
		 * lambda expressions
		 * arrays
		 * constructor parameters
		 * */

		System.out.println(nume);
		
		//se apeleaza functia corect
		ExampleVariable obj = new ExampleVariable();
		obj.afiseazaMesaj("text"); // eroare daca e apelat singur
	}
	
	
	/** metode ale clasei in care ma aflu **/
	
	public void afiseazaMesaj(String ceva) {
		String numeFamilie = "Popescu"; // variabila locala
		System.out.println(numeFamilie+prenume);
	}
	
	public void afiseazaAltMesaj() {
		// numeFamilie = "Ionescu";
		prenume = "Elena";
	}

}
