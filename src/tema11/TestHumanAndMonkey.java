package tema11;

public class TestHumanAndMonkey {
	
	public static void main(String[] args) {
		
		Primate human = new Human();
		Monkey monkey = new Monkey();
		
		System.out.println("Primate dataType instance of Human");
		System.out.println("----------------------------------");
		human.walk();
		human.run();
		System.out.println(((Human)human).eat()); 
		human.speak();
		((Human) human).sleep();
		
		((Human) human).drink();
		System.out.println("\n");
		
		
		System.out.println("Primate dataType instance of Monkey");
		System.out.println("-----------------------------------");
		monkey.walk();
		monkey.run();
		monkey.sleep();
		System.out.println(monkey.eat());
		monkey.speak();
		
		monkey.drink();
	}
}
