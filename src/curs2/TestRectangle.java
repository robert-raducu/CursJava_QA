package curs2;

public class TestRectangle {

	public static void main(String[] args) {
		
		Rectangle obiect = new Rectangle();
		obiect.latime = 5;
		obiect.lungime = 3;
		System.out.println(obiect.calculArie(obiect.lungime, obiect.latime));
		
		Rectangle obiect2 = new Rectangle();
		obiect2.latime = 4;
		obiect2.lungime = 88;
		System.out.println(obiect2.calculArie(obiect2.lungime, obiect2.latime));
		
		Rectangle obiect3 = new Rectangle(5);
		obiect3.latime = 6;
		System.out.println(obiect3.calculArie(obiect3.lungime, obiect3.latime));
		
	}

}
