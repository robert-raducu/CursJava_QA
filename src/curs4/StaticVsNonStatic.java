package curs4;

public class StaticVsNonStatic {

	static String nume;
	String prenume;
	
	public static void main(String[] args) {

		StaticVsNonStatic person1 = new StaticVsNonStatic();
		person1.nume = "Ion";
		person1.prenume = "Popescu";
		
		System.out.println("Person1 "+ person1.nume + " " + person1.prenume);
		
		StaticVsNonStatic person2 = new StaticVsNonStatic();
		person2.nume = "Eugen";
		person2.prenume = "Mihai";
		
		System.out.println("Person2 "+ person2.nume + " " + person2.prenume);
		
		StaticVsNonStatic person3 = new StaticVsNonStatic();
		person3.nume = "John";
		person3.prenume = "Doe";
		
		System.out.println("Person3 "+ person3.nume + " " + person3.prenume);
		
		System.out.println("--------------------------------------------------");
		
		System.out.println("Person1 "+ person1.nume + " " + person1.prenume);
		System.out.println("Person2 "+ person2.nume + " " + person2.prenume);
		System.out.println("Person3 "+ person3.nume + " " + person3.prenume);
	}

}
