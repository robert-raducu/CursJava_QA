package curs15;

public class GenericsExample {

	public static void main(String[] args) {
		
		printCeva("text");
		//printCvea(5.6);
		
		printGeneric("text");
		printGeneric(123);
		printGeneric(123.4);
		printGeneric(true);
		
		
		printCevaGenerics(12, "text", 13.55, false);
		
		addNumbers(44.55, 777);

	}
	
	public static void printCeva(String text) {
		System.out.println(text);
	}
	
	public static <T> void printGeneric(T obiect) {
		
		System.out.println("Data type obiect : " + obiect.getClass().getName());
	}
	
	
	public static <T> void printCevaGenerics(T...values) {
		for(T element : values) {
			System.out.println(element);
		}
	}
	
	public static <T extends Number> void addNumbers(T...values) { //mosteneste number, doar numere 
		//but still generic
		//
	}

}
