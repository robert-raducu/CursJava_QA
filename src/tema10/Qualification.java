package tema10;

//Avem o clasa Qualification care mosteneste clasa Teacher
//In cadrul acestei clase avem un constuctor care seteaza
//caracteristicle din Teacher
//Avem o metoda care se numeste verify si care verifica urmatoarele:
//Daca experienceYears sunt mai mari ca 3 si daca course este egal cu
//“Java” si daca schedule este egal cu “Afternoon”
//Daca toate conditiile sunt indeplinite printeaza mesajul de qualification
//de mai sus.
//Daca nu printeaza mesajul de necalificare de mai sus.

public class Qualification extends Teacher{

	public Qualification(String course, int experienceYears, String schedule) {
		super(course, experienceYears, schedule);
	}
	
	public void verify() {
		if(course.equals("Java") && experienceYears > 3 && schedule.equals("Afternoon")) {
			System.out.println("You qualify to teach at this school!");
		}
		else {
			System.out.println("You do not qualify!");
		}
	}
}
