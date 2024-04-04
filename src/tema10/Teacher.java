package tema10;

//Scriem un program care verifica daca un profesor se califica sa
//predea la o scoala.
//Daca se califica, atunci printeaza ”You qualify to teach at this
//school!”
//Daca nu se califica, atunci printeaza “You do not qualify!”
//Avem o clasa Teacher care are urmatoarele caracteristici :
// Course
// ExperienceYears
// Schedule
//
//Avem o clasa Qualification care mosteneste clasa Teacher
//In cadrul acestei clase avem un constuctor care seteaza
//caracteristicle din Teacher
//Avem o metoda care se numeste verify si care verifica urmatoarele:
//Daca xperienceYears sunt mai mari ca 3 si daca course este egal cu
//“Java” si daca schedule este egal cu “Afternoon”
//Daca toate conditiile sunt indeplinite printeaza mesajul de qualification
//de mai sus.
//Daca nu printeaza mesajul de necalificare de mai sus.

public class Teacher {

	String course;
	int experienceYears;
	String schedule;
	
	public Teacher(String course,int experienceYears, String schedule) {
		this.course = course;
		this.experienceYears = experienceYears;
		this.schedule = schedule;
	}
}
