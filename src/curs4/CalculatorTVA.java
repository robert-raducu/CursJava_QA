package curs4;

/*
 * Scriem un program de tip calculator care calculeaza TVA la o suma data
 * TVA poate avea valori diferite 
 * Afisam calcul TVA pentru diverse valori
 * 
 * 
 * Afisam numarul total de calcule facute 
 */

public class CalculatorTVA {
	//counter global
	private static int counterGlobal = 0;
	
	//valoare TVA
	private double tvaDouble;
	
	public CalculatorTVA(int tva) {
		this.tvaDouble =  tva/100.0;
	}
	
	public double adunaTVA(double suma) {
		counterGlobal++;
		return suma * (1+ tvaDouble);
	}
	
	public static int getCounterGlobal() {
		return counterGlobal;
	}
	

}
