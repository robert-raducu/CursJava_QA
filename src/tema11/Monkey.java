package tema11;

public class Monkey extends Primate implements BasicNeeds{

	@Override
	public String eat() {
		return "mostly erbivore";
	}

	@Override
	public void sleep() {
		System.out.println("I need to sleep!");
		
	}

	@Override
	public void drink() {
		System.out.println("Extra: Water! Just water!");
		
	}

	@Override
	public void speak() {
		System.out.println("cannot speak");
	}
}
