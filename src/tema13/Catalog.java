package tema13;

import java.util.HashMap;
import java.util.Map;

public class Catalog {
	
	Map <String, Double> catalog = new HashMap<>();
	
	public Catalog(){
		catalog.put("Grigore Georgiana", 8.88);
		catalog.put("Acrismaritei Leontin", 5.01);
		catalog.put("Irimie Amalia", 7.42);
		catalog.put("Geanta Xenopol", 8.89);
		catalog.put("Dumitriu Serafina", 3.67);
		catalog.put("Micu Marcel", 1.00);
		catalog.put("Bodnaras Ruxandra", 7.42);
		catalog.put("Uicalan Haralambie", 9.92);
	}
	
	
	public boolean checkStudent(String studentName) {
		return catalog.containsKey(studentName);
	}
	
	public void modifyCatalog(String studentName, double studentGrade) {
		
		if(checkStudent(studentName)== false) {
			System.out.println("Nu aveai nota, ti-am trecut acum\n");
			catalog.put(studentName, studentGrade);
		}
		
		else {
			double oldGrade = catalog.get(studentName);
			if(oldGrade > studentGrade) {
				System.out.println("Nu ai nevoie de alta nota\n");
			}
			else {
				catalog.put(studentName, studentGrade);
			}
		}
		
		
		System.out.println("Catalog");
		System.out.println("---------");
		
        for (Map.Entry<String, Double> elev : catalog.entrySet()) {
            System.out.println(elev.getKey() + ": " + elev.getValue());
        }
		
	}

}
