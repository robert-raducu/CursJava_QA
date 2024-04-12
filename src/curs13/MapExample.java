package curs13;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		// nume = ion
		Map <String, String> map = new HashMap<>();

		System.out.println(map.size()); // intoarce un integer cu size ul map-ului
		System.out.println(map.isEmpty()); // boolean true / false in functie daca map-ul este gol sau nu
		
		map.put("T", "Tester"); //adauga in map
		map.put("D", "Developer");
		map.put("M", "Manager");
		map.put("R", "Recruiter");
		
		System.out.println("-------------------------------------------");
		System.out.println(map.size()); 
		System.out.println(map.isEmpty());
		
		System.out.println(map);
		
		map.put("D", "Director");
		System.out.println(map);
		
		System.out.println(map.get("M")); // aduce valoarea corespondenta cheii 
		
		map.put("n", null);
		System.out.println(map);
		System.out.println(map.get("n"));
		
		System.out.println("-------------------------------------------");
		
		System.out.println("Contains key: " + map.containsKey("n"));
		System.out.println("Contains key: " + map.containsValue("Tester"));
		
		System.out.println("-------------------------------------------");
		
		for(String key : map.keySet()) {
			System.out.println(key);
		}
		
		for(String value : map.values()) {
			System.out.println(value);
		}
		
		System.out.println("-------------------------------------------");
		
		map.replace("D", "Developer");
		System.out.println(map);
		
		map.remove("n");
		System.out.println(map);
		
		System.out.println("-------------------------------------------");
		
		//concatenare intr un singur map
		
		Map <String, String> map2 = new HashMap<>();
		map2.put("a", "alb");
		map2.put("b", "bej");
		map2.put("c", "crem");
		
		map.putAll(map2);
		System.out.println(map);
		
		map.clear();
		System.out.println(map.size()); 
		System.out.println(map.isEmpty());
	}

}
