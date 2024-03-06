package curs2;

public class Rectangle {
	int lungime;
    int latime;
    String culoare = "ALB";
	
	//constructor default
	public Rectangle() {}

	public Rectangle(int lungime) {
		this.lungime = lungime;
	}
	
	//ALB este culoarea default, se poate folosi si acest constructor
	public Rectangle(int lungime, int latime) {
		this.lungime = lungime;
		this.latime = latime;
	}
	
	// constructor cu 3 parametrii
	public Rectangle(int lungime, int latime, String culoare) {
		this.lungime = lungime;
		this.latime = latime;
		this.culoare = culoare;
	}

	public int calculArie(int lungime, int latime){
		
		return lungime * latime;
	}
	
	public int calculPerimetru(int lungime, int latime) {
		
		return 2 * (lungime + latime);
	}
	
	// metoda care returneaza culoarea
	public String AfiseazaCuloareDreptunghi() {
		return culoare;
	}
}
