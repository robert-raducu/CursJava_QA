package curs4;

/*
 * 
 * Urmarim un cos de cumparaturi
 * avem 3 validari
 * 1. Verificam daca cosul este gol
 * 2. Verificam daca cosul contine peste 100 lei
 * 3. Verificam daca nr de produse este mai mare sau egal cu 5, adica un cos mare
 * si daca valoarea cosului este peste 150 de lei, adica valoare mare
 */
public class TernaryExample {

	public static void main(String[] args) {
		int numarProduse = 10;
		int totalPretCos = 160;
		
		// 1. Verificam daca cosul este gol
		
		String mesaj = (numarProduse > 0) ? "Avem produse" : "Cos gol";
		System.out.println(mesaj);

		// 2. Verificam daca cosul contine peste 100 lei
		
		mesaj = totalPretCos > 100 ? "Totalul depaseste 100 lei" : "Total sub 100 lei";
		
//		3. Verificam daca nr de produse este mai mare sau egal cu 5, adica un cos mare
//		si daca valoarea cosului este peste 150 de lei, adica valoare mare
		
//		mesaj = numarProduse >= 5 ? "Cos mare" : totalPretCos > 150 ? "Valoare mare" : 
//		mesaj = numarProduse >= 5 && totalPretCos > 150 ? "Cos mare si valoare mare" : 
		
		//1--> nr de produs mare cu valoare mica
		//2--> nr de produs mic cu valoare mare
		//3--> nr de produs mare cu valoare mare
		//4--> nr de produs mic cu valoare mica
		
		mesaj = numarProduse >= 5 && totalPretCos > 150 ? "Cos mare si valoare mare":
			numarProduse < 5 && totalPretCos < 150 ? "Cos mic si valoare mica" : "Cos intermediar";
		
		System.out.println(mesaj);
	}

}
