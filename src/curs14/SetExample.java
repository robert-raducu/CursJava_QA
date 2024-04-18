package curs14;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	
	public static void main(String[] args) {
	
		Set<String> set = new HashSet<>();
		
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		
		set.add("mov");
		set.add("alb");
		set.add("rosu");
		set.add("negru");
		
		System.out.println(set);
		
		//nu avem metoda de get (set.get)
		
		set.add("negru"); //nu tine duplicate
		System.out.println(set.size());
		System.out.println(set);
		
		for(String element : set) {
			System.out.println(element);
		}
		
		set.remove("mov");
		System.out.println(set);
		
		
		System.out.println(set.contains("alb"));
		
		set.clear();
		
		System.out.println(set.isEmpty());
		
	}
}
