package curs6;

import java.util.Scanner;

/*
 * facem un program care ii cere userului numere incontinuu
 * le inmulteste cu 10 si printeaza
 * face asta pana cand userul introduce 0
 * cand userul a introdus 0, iese din bucla
 * 
 */

public class ForVsWhile {

	public static void main(String[] args) {
		rezolvareCuFor();
		rezolvareCuFor2();
		rezolvareCuWhile();

	}
	
	public static void rezolvareCuFor() {
		System.out.println("Please enter a number: ");
		Scanner scanner = new Scanner(System.in);
		for(int i = scanner.nextInt() ; i!=0 ; i = scanner.nextInt()) {
			i*=10; // i = i * 10;
			System.out.println(i);
			System.out.println("Please enter a number: ");
		}
	}
	
	
	
	
	
	public static void rezolvareCuFor2() {
		System.out.println("Please enter a number: ");
		Scanner scanner = new Scanner(System.in);
		for(;;) {
			int i = scanner.nextInt();
			if(i==0) {
				break;
			}
			else {
				i*=10; // i = i * 10;
				System.out.println(i);
				System.out.println("Please enter a number: "); 
				}
		}
	}
	
	
	
	
	public static void rezolvareCuWhile() {
		System.out.println("Please enter a number: ");
		Scanner scanner = new Scanner(System.in);
		
		int i = scanner.nextInt();
		while(i!=0) {
			i*=10; // i = i * 10;
			System.out.println(i);
			System.out.println("Please enter a number: "); 
			i = scanner.nextInt();
		}
	}
}
