package tema9;

import java.util.Scanner;

//Scriem un program care simuleaza un program de acordat bonusuri.
//Programul primeste input de la utilizator :
//  Anul de vechime in firma
//	Valoarea vanzarilor efectuate
//	Luna in care a efectuat vanzarile
//Daca are un an vechime atunci primeste un bonus de 100
//Daca are 2 ani vechime atunci primeste un bonus de 200
//Daca are 3 ani vechime si valoarea vanzarilor este mai mica sau egala cu 5000 atunci primeste bonus 600
//Daca are 3 ani si valoarea vanzarilor este mai mica sau egala cu 10000 si
//vanzarile au fost efectuate in oricare din lunile 1-6 primeste bonus 800
//Daca are 3 ani si valoarea vanzarilor este mai mica sau egala cu 10000 si
//vanzarile au fost efectuate in oricare din lunile 7-11 primeste bonus 1000
//Daca are 3 ani si valoarea vanzarilor este mai mica sau egala cu 10000 si
//vanzarile au fost efectuate in luna 12 primeste bonus 900 si mesajul : “In
//decembrie se vand singure!”
//Daca are 3 ani si valoarea vanzarilor este mai mare decat 10000 primeste
//bonus 1200

public class BonusFunctionality {
	int anVechime;
	int valoareaVanzarilor;
	int lunaVanzarilor;
	
	
	public void askUserForDetails() {
	Scanner scan = new Scanner(System.in);
	System.out.println("Introdu anii de vechime in firma: ");
	anVechime = scan.nextInt();
	System.out.println("Introdu valoarea vanzarilor efectuate: ");
	valoareaVanzarilor = scan.nextInt();
	do {
		System.out.println("Introdu luna in care au fost efectuate vanzarile (1-12): ");
        lunaVanzarilor = scan.nextInt();
        if (lunaVanzarilor < 1 || lunaVanzarilor > 12) {
            System.out.println("Luna introdusa nu e valida. Incercati din nou.");
        }
		
	} while (lunaVanzarilor < 1 || lunaVanzarilor > 12);
	}
	
	
	public void bonusValue() {
		askUserForDetails();
		
		int bonus = 0;
		switch(anVechime){
			case 1 -> bonus = 100;
			case 2 -> bonus = 200;
			case 3 -> {
				if(valoareaVanzarilor <= 5000) {
					bonus = 600;
				}
				else if(valoareaVanzarilor > 5000 && valoareaVanzarilor <= 10000 ) {
					switch(lunaVanzarilor) {
					case 1,2,3,4,5,6 -> bonus = 800;
					case 7,8,9,10,11 -> bonus = 1000;
					case 12 -> {
						bonus = 900;
						System.out.println("In decembrie se vand singure!");
					}
				  }
				}
				
				else if(valoareaVanzarilor > 10000) {
					bonus = 1200;
				}
			}
			default -> System.out.println("Bonusul trebuie discutat cu superiorul, iar ulterior va fi modificat manual!");
		}
		
		System.out.println("Bonusul dvs este de " + bonus + " de lei!");
	}
}
