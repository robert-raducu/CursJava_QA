package curs7;

public class DoWhileExample {

	public static void main(String[] args) {

		String[] array = { "rosu", "verde", "galben", "alb" };
		
		int i=0;
		
		while(i > array.length) {
			System.out.println(array[i]);
			i++;
		}
		System.out.println("--------------------------------------");
		
		int j = 0;
		do {
			System.out.println(array[j]);
			j++;
		}while(j > array.length);
		
	}

}
