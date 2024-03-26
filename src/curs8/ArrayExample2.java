package curs8;

public class ArrayExample2 {

	public static void main(String[] args) {
		Legume cartof = new Legume("Cartof",98);
		cartof.printDetails();
		
		Legume[] arrayDeLegume = new Legume[3];
		arrayDeLegume[0] = cartof;
	//  Legume[] arrayDeLegume = {cartof, null, null}
		
		arrayDeLegume[0].printDetails();
		
		arrayDeLegume[1] = new Legume("Praz", 55);
		arrayDeLegume[1].printDetails();
	//  Legume[] arrayDeLegume = {cartof, arrayDeLegume[1], null}
		
		
		arrayDeLegume[2] = new Legume("Pastarnac", 35);
		
		for(Legume leguma : arrayDeLegume) {
			leguma.printDetails();
		}
	}

}
