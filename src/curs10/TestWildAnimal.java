package curs10;

public class TestWildAnimal {

	public static void main(String[] args) {
		
		/*	WildAnimal animal = new WildAnimal();
		animal.makeSound();
		
		System.out.println("------------------------");
		
		Lion simba =  new Lion();
		simba.makeSound();//metoda suprascrisa
		simba.eatMeat();//metoda proprie a lui Lion
		simba.whereDoesItLive();//metoda mostenita din clasa parinte
		
		System.out.println("---------------------------");
		
		Deer bambi =  new Deer();
		bambi.makeSound();//metoda suprascrisa
		bambi.eatGrass();//metoda proprie a lui Deer
		bambi.whereDoesItLive();//metoda mostenita din clasa parinte
		*/
		
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
		WildAnimal simba = new Lion();
		simba.makeSound();
		((Lion) simba).eatMeat();
		simba.whereDoesItLive();
		feedAnimal(simba);
		
		simba = new Deer();
		simba.makeSound();
		((Deer) simba).eatGrass();
		feedAnimal(simba);	
	}
	
	public static void feedAnimal(WildAnimal animal) {
		
		if(animal instanceof Lion) {
			System.out.println("you are getting burgers!");
		}else if(animal instanceof Deer) {
			System.out.println("you are getting salad!");
		}
		
	}

}


