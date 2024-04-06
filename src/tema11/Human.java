package tema11;

public class Human extends Primate implements BasicNeeds{

	@Override
	public String eat() {
		return "Omnivore";
	}

	@Override
	public void sleep() {
		System.out.println("I need to sleep!");
		
	}

	@Override
	public void drink() {
		System.out.println("Extra: I am thirsty, gimme some orange juice!");
		
	}
	
	@Override
	public void speak() {
		System.out.println("can speak");
	}

}
