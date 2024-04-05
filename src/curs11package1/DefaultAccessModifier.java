package curs11package1;

class DefaultAccessModifier {
/*
* Default inseamna atunci cand nu specific nimic
* Scopul lui default este limitat la pachetul in care se afla 
* 
* Aceeasi clasa : yes
* Alta clasa din acelasi pachet : yes
* 
* Subclasa(clasa copil) in acelasi pachet : yes
* 
* Subclasa in alt pachet : NO
* 
* Alta clasa in alt pachet: NO
* 
*/
	
	String mesaj = "Default Access Modifier"; //e default
	
	void printMesaj() {
		System.out.println(mesaj);
	}
}
