package curs15;

public class VarargsExample {

	public static void main(String[] args) {
		
		printCeva("A", "B");
		printCeva();
		printCeva("A", "B", "C");
		

	}

	
//	public static void printCeva(String a, String b) {
//		System.out.println(a);
//		System.out.println(b);
//	}
	
	public static void printCeva(String...values) {
		
		for(String element: values) {
			System.out.println(element);
		}
	}
}
