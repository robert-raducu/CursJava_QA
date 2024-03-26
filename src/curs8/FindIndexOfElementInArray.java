package curs8;

/*
 * luam un array
 * facem o metoda care sa afle indexul unui element pe care il dam ca si parametru 
 * printam elementul si indexul
 * rezolvam cu: for, for each, while, do while
 * 
 */
public class FindIndexOfElementInArray {
	
	static String[] culori = {"rosu","alb","galben","verde","negru","maro","albastru","mov"};
	// index                    0      1      2        3       4      5         6       7

	
	public static void main(String[] args) {
		rezolvareCuFor("mov");
		rezolvareCuForEach("mov");
		rezolvareCuWhile("mov");
		rezolvareCuDoWhile("mov");

	}

	public static void rezolvareCuFor(String culoare) {
		for(int i = 0; i < culori.length; i++) {
			if(culori[i].equals(culoare)) {
				System.out.println(culoare + " se afla la pozitia " + i);
			}
		}
	}
	
	
	
	public static void rezolvareCuForEach(String culoare) {
		int i = 0;
		for(String element : culori) {
			if(element.equals(culoare)) {
				System.out.println(culoare + " se afla la pozitia " + i);
			}
		i++;
		}
	}

	
	
	public static void rezolvareCuWhile(String culoare) {
		
		int i = 0;
		while(i < culori.length) {
			if(culori[i].equals(culoare)) {
				System.out.println(culoare + " se afla la pozitia " + i);
			}
			i++;
		}
	}
	
	public static void rezolvareCuDoWhile(String culoare) {
		
		int i = 0;
		do {
			if(culori[i].equals(culoare)) {
				System.out.println(culoare + " se afla la pozitia " + i);
			}
			i++;
		} while(i < culori.length);
	}
}
