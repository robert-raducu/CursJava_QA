package tema8;


public class Duplicates {

	public static void main(String[] args) {
        String[] myStringArray = {"Maria", "Bob", "Ion", "George", "Oana", "Bogdan", "Oana", "Ion"};
    
        for (int i = 0; i < myStringArray.length; i++) {
            for (int j = i + 1; j < myStringArray.length; j++) {
                if (myStringArray[i].equals(myStringArray[j])) {
                    //hasDuplicates = true;
                    System.out.println("Numele duplicat: " + myStringArray[i]);
                }
            }
        }
    }
}
