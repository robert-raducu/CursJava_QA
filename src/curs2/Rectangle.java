package curs2;

public class Rectangle {
	int lungime;
	int latime;
	
	public int calculArie(int lungime, int latime){
		
		return lungime * latime;
	}
	
	public int calculPerimetru(int lungime, int latime) {
		
		return 2 * (lungime + latime);
	}
	
	//constructor default 
	public Rectangle() {}

	public Rectangle(int lungime) {
		this.lungime = lungime;
	}
}
