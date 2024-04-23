package tema14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

//Scriem un program care printeaza in consola cate calorii are o
//leguma pe care utilizatorul vrea sa o cumpere.

//Avem o metoda care scrie intr-un properties file 5 legume si un
//numar de calorii asociat lor (exemplu morcov=58)

//Avem o metoda care citeste si din properties file valoarea caloriilor.

//Daca utilizatorul introduce o leguma care nu se afla in acest data
//structure returneaza “Nu vindem aceasta leguma”

//In metoda main intrebam utilizatorul ce leguma vrea sa cumpere.
//Daca leguma se afla in cele pe care le avem in data structure
//printam : “Leguma aleasa de tine are X calorii”. 

//Daca nu se afla, printam “Nu vindem aceasta leguma” si rugam utilizatorul sa
//aleaga alta leguma.

public class VegetablesCalories {

	public void writeVegetables() {
		try {
			OutputStream outputStream = new FileOutputStream("vegetables.calories");
			Properties propFile = new Properties();
			propFile.setProperty("ciuperci", "35");
			propFile.setProperty("cartofi", "80");
			propFile.setProperty("nap", "26");
			propFile.setProperty("salata", "12");
			propFile.setProperty("usturoi", "146");
			
			propFile.store(outputStream, "Legumele disponibile pentru cumparat");
			//outputStream.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
