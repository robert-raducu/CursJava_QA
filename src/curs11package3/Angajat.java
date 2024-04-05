package curs11package3;

public interface Angajat {
	
	public static final int salariu = 1000; //trebuie facuta constanta 
	
	
	// toate metodele abstracte, nu mai e nevoie de cuvantul cheie abstract
	
	void setName();
	String getName();
	void setEmail();
	String getEmail();
	void setName(String name);
	
	// nu pot face obiect din interfata 
	
	default void printDep() {
		System.out.println("QA");
	} // poate fi suprascrisa 
}
