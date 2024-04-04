package curs10;

public class TestShape {

	public static void main(String[] args) {
		
		Square patrat =  new Square("patrat", "galben");
		patrat.printDetails();
		
		System.out.println(patrat.nume);
		System.out.println(patrat.culoare);
		
		System.out.println("-------------------------------");

	}

}
