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
		
		//daca facem un constructor cu 2 parametrii, putem sa stergem parametrii la arie 
		//pentru ca ia numerele de la constructor
		
		Rectangle rect = new Rectangle(20,10,"VERDE");
		Rectangle rect2 = new Rectangle(50,35);
	
		System.out.println("----------------Tema-------------------");
		System.out.println("The colour of the rectangle is: " + rect.AfiseazaCuloareDreptunghi());
		System.out.println("The colour of the rectangle is: " + rect2.AfiseazaCuloareDreptunghi());
		System.out.println("The colour of the rectangle is: " + obiect3.AfiseazaCuloareDreptunghi());
		
	}

}
