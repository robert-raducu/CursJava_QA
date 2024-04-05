package curs11package3;

public abstract class Product {
// dintr o clasa abstracta, nu pot crea un obiect (instantiez)
// poate sa aiba metode fara implementare (abstracte)
// o clasa abstracta ma obliga sa i creez o subclasa 
	
	// public abstract String nume; - nu exista variabile abstracte
	
	public abstract int calculatePrice();
	
	public void productRating() {
		System.out.println("Best product!");
	}
}
