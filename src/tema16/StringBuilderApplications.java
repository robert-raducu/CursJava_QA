package tema16;

//Avem urmatorul string : “Lorem ipsum dolor sit amet, consectetur
//adipiscing elit. Aliquam consectetur odio ac quam commodo, eu
//eleifend felis imperdiet. Integer bibendum nunc quis sem faucibus,
//vitae laoreet mi dignissim. Praesent eget ligula nec lorem varius
//malesuada. Nulla neque lacus, euismod quis erat nec, convallis
//vestibulum augue. Nullam et aliquet justo. Aliquam erat volutpat.
//Nulla elementum urna in dolor viverra, in efficitur lectus mattis.”

//u Vom face 4 metode :
// 1. Prima metoda va verifica de catre ori apare cuvantul “Nulla” in
//acest string si va printa numarul

// 2. A doua metoda va imparti stringul in cate propozitii cuprinde si le
//va printa fiecare pe randul ei in consola. Putem folosi split(). Ideal pe
//un obiect de tip StringBuilder (sb.toString().split())

// 3. A treia metoda va folosi metoda deleteCharAt() din StringBuilder
//pentru a sterge toate aparitiile literei ‘a’
//
// 4. A patra metoda va folosi clasa StringBuilder pentru a inlocui toate
//aparitiile literei ‘o’ cu caracterul ‘#’ . Putem folosi metoda
//setCharAt() din StringBuilder()

public class StringBuilderApplications {

	public static void main(String[] args) {
		String text = "Lorem ipsum dolor sit amet, consectetur"
				+ " adipiscing elit. Aliquam consectetur odio ac quam commodo, eu"
				+ " eleifend felis imperdiet. Integer bibendum nunc quis sem faucibus,"
				+ " vitae laoreet mi dignissim. Praesent eget ligula nec lorem varius"
				+ " malesuada. Nulla neque lacus, euismod quis erat nec, convallis"
				+ " vestibulum augue. Nullam et aliquet justo. Aliquam erat volutpat."
				+ "Nulla elementum urna in dolor viverra, in efficitur lectus mattis.";
		
		System.out.println("Exercitiul 1");
		System.out.println("-------------------------");
		countApparitions("Nulla", text);
		System.out.println("Exercitiul 2");
		System.out.println("-------------------------");
		divideSentences(text);
		System.out.println("Exercitiul 3");
		System.out.println("-------------------------");
		eraseLetter('a', text);
		System.out.println("Exercitiul 4");
		System.out.println("-------------------------");
		replaceLetter('o', '#', text);

	}
	
	public static void countApparitions(String word, String text) {
		
		StringBuilder sb = new StringBuilder(text);
		
		int count = 0;
	    int startIndex = 0;
	    int wordLength = word.length();

	        
	    while ((startIndex = sb.indexOf(word, startIndex)) != -1) {
	        count++;
	        startIndex += wordLength; // Move index to the end of the found word (4 for "Nulla")
	    }

	    System.out.println("The word " + word + " appears " + count + " times\n");
		
	}
	
	public static void divideSentences(String text) {
		StringBuilder sb = new StringBuilder(text);
		String[] phrases = sb.toString().split("\\.");
		
		for(String phrase : phrases) {
			 System.out.println(phrase.trim() +".\n");
		}
	}

	public static void eraseLetter(char letter, String text) {
		StringBuilder sb = new StringBuilder(text);
		StringBuilder sbLower =  new StringBuilder(sb.toString().toLowerCase());
		
		for(int i = 0 ; i < sbLower.length();i++) {
			if(sbLower.charAt(i) == letter) {
				sbLower.deleteCharAt(i);
				i++;
			}
		}
		System.out.println(sbLower + "\n");
	}
	
	public static void replaceLetter(char oldChar, char newChar, String text) {
		StringBuilder sb = new StringBuilder(text);
		
		for(int i = 0 ; i < sb.length();i++) {
			if(sb.charAt(i) == oldChar) {
				sb.setCharAt(i, newChar);;
				i++;
			}
		}
		
		System.out.println(sb + "\n");
	}
}
