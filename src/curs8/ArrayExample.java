package curs8;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		
		String[] textArray = new String[4];
		// String[] textArray = {null,null,null,null};
		//       index            0    1    2    3     4
		
		System.out.println(textArray[2]);
		textArray[0]="Acesta ";
		// String[] textArray = {Acesta ,null,null,null};
		System.out.println(textArray[0]);
		textArray[1] = "este ";
		// String[] textArray = {Acesta ,este ,null,null};
		System.out.println(textArray[1]);
		textArray[2] = "un ";
		textArray[3] = "Array!";
		
		//System.out.println(textArray);
		System.out.println(Arrays.toString(textArray));
		
		for(int i = 0 ; i < textArray.length; i++) {
			System.out.print(textArray[i]);
		}
		
		System.out.println("--------------------------------");
		
		//FOR EACH
		
		for(String element : textArray) {
			System.out.print(element);
		}
	}

}
