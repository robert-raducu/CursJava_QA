package curs8;

public class Legume {
	public String nume;
	public int calorii;
	
	public Legume(String nume, int calorii) {
		this.nume = nume;
		this.calorii = calorii;
	}
	
	public void printDetails() {
		System.out.println(nume + " are " + calorii + " calorii!");
	}

}
