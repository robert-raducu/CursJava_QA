package curs10;

public class MethodOverload {
	
	public static void main(String[] args) {

		System.out.println(multiply(2, 3));
		System.out.println(multiply(4, 5.5));
		
		System.out.println(123);//integer
		System.out.println("123");//String
		System.out.println(true);//boolean
		System.out.println('x');//char
		
		
		
	}
	
	public static int multiply(int a, int b) {
		return a*b;
	}
	public static double multiply(double a, double b) {
		return a*b;
	}
}
