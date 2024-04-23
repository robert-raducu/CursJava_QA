package curs16;

public class StringBuilderExample {

	public static void main(String[] args) {
		// structura nemodificabila -> in memorie se face o locatie noua 

		reverseString("masina");
		replaceFromString("Salut Bogdan",0,5,"Oana");
		insertIntoString("televizor ", 10, "color");
		addSpacestoText("thisIsCamelCaseText");
		deleteFromString("Salut Ion Popescu",10,18);
		appendToString("Pina", "colada");
		
	}

	public static void reverseString(String text) {
		StringBuilder sb = new StringBuilder(text);
		//un singur obiect cu care lucram, nu doua
		
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
	
	public static void replaceFromString(String text,
			int startIndex, int endIndex, String textToReplace) {
		StringBuilder sb = new StringBuilder(text);
		sb.replace(startIndex, endIndex, textToReplace);
		//11 nu e luat in calcul, deci char + 1
		System.out.println(sb);
	}
	
	public static void insertIntoString(String text, int startIndex,
			String textToInsert) {
		StringBuilder sb = new StringBuilder(text);
		sb.insert(startIndex, textToInsert);
		System.out.println(sb);
	}
	
	//thisIsACamelCaseText - spatiu inainte de UpperCase
	
	public static void addSpacestoText(String text) {
		StringBuilder sb = new StringBuilder(text);
		
		for(int i = 0 ; i < sb.length();i++) {
			if(Character.isUpperCase(sb.charAt(i))) {
				sb.insert(i, " ");
				i++;
			}
			//System.out.println(sb);
		}
		
		System.out.println(sb);
	}
	
	public static void deleteFromString(String text, int startIndex,
			int endIndex) {
		StringBuilder sb = new StringBuilder(text);
		sb.delete(startIndex, endIndex);
		System.out.println(sb);
	}
	
	public static void appendToString(String text, 
			String textToAppend) {
		StringBuilder sb = new StringBuilder(text);
		sb.append(textToAppend);
		System.out.println(sb);
	}
	
}
