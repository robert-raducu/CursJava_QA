package curs15;

public class VarargsExample {

	public static void main(String[] args) {
		
		printCeva(32,"A", "B");
		printCeva(12);
		printCeva(12,"A", "B", "C");
		

	}

	
//	public static void printCeva(String a, String b) {
//		System.out.println(a);
//		System.out.println(b);
//	}
	
	public static void printCeva(int number, String...values) {
		
		for(String element: values) {
			System.out.println(element);
		}
	} //trebuie sa stie sa se descurce cu un nr variabil de argumente
}
