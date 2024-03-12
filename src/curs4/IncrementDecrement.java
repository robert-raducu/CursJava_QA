package curs4;

/*
 * operator unar = un singur operand (ex: increment, nr++/decrement, nr--)
 * operator binar = 2 operanzi (ex: nr1 + nr2)
 * operator ternar = 3 operanzi 
 * 
 * 
 */

public class IncrementDecrement {

	public static void main(String[] args) {
		
		//num + 1 --> num++
		//num++   --> POST increment
		//++num   --> PRE increment
		
		System.out.println("---- POST increment ----");
		int num = 10;
		System.out.println("Nume inainte de increment:" +  num);
		System.out.println("Num in POST increment: " + num++);
		System.out.println("Num dupa POST increment: " + num);
		System.out.println(" ");
		
		System.out.println("---- PRE increment ----");
		int num2 = 10;
		System.out.println("Nume inainte de increment:" +  num2);
		System.out.println("Num in PRE increment: " + ++num2);
		System.out.println("Num dupa PRE increment: " + num2);
		
		//pre decrement  --> --num
		//post decrement --> num--
		
		int num3 = 0;
		System.out.println(--num3);

	}

}
