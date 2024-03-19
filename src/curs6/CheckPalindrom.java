package curs6;

import java.util.Scanner;

public class CheckPalindrom {

	public static void main(String[] args) {
		// radar sau caiac
		//cuvant = "radar" --> cuvant.length() - 1 --> cuvant.length() == 5
		//cuvantIntors = ""
		//cuvantIntors = radar.charAt(4) --> r
		//cuvantIntors = cuvantIntors + radarCharAt(3) --> ra
		// ...
		//cuvantIntors = radar
		//cuvant == cuvantIntors
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Te rog introdu un cuvant: ");
		String cuvantInitial = scanner.next();
		
		String cuvantIntors = "";
		
		for(int i = cuvantInitial.length()-1; i>=0;i--) {
			cuvantIntors += cuvantInitial.charAt(i);
		}

		System.out.println("Cuvant initial: "+cuvantInitial);
		System.out.println("Cuvant intors: "+cuvantIntors);
		
		String palindrom = cuvantInitial.equals(cuvantIntors)?"Este palindrom":"Nu este palindrom";
		System.out.println(palindrom);
		
		System.out.println("----------------------------------------------------");
		
		StringBuilder sb = new StringBuilder(cuvantInitial);
		System.out.println("StringBuilder "+ sb.reverse());
	}

}
