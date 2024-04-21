package tema15;

//Considerand urmatoarele array-uri :
//String[] textArray = {"Alba", "Iasi", "Bacau", "Constanta"};
//Integer[] intArray = {100, 500, 300, 400, 200};
//Character[] charArray = {'a', 'b', 'd', 'c’};
//
//Vom face o singura metoda care ordoneaza aray-ul de tip String
//alfabetic, array-ul de tip Integer crescator, si array-ul de tip char tot
//alfabetic.
//
//Solutia o ganditi strict pe aceste array-uri de mai sus, nu daca
//adaugam sau le modificam (ca sa nu complicam lucrurile J)

public class SortArrays {

	public static void main(String[] args) {
		String[] textArray = {"Alba", "Iasi", "Bacau", "Constanta"};
		Integer[] intArray = {100, 500, 300, 400, 200};
		Character[] charArray = {'a', 'b', 'd', 'c'};
		
		
		sort(textArray);
        sort(intArray);
        sort(charArray);

        
        System.out.println("New Text Array:");
        printArray(textArray);

        System.out.println("\nNew Integer Array:");
        printArray(intArray);

        System.out.println("\nNew Character Array:");
        printArray(charArray);
	}
	
	
	private static <T> void printArray(T[] elements) {
		for (T element : elements) {
	            System.out.print(element + " ");
	        }
	        System.out.println();
	    }
		



	public static <T extends Comparable<? super T>> void sort(T[] elements){
		
		T buffer;
		for(int i = 0; i < elements.length - 1; i++) {
			for(int j = i + 1; j < elements.length ; j++) {
				if(elements[i].compareTo(elements[j]) > 0) {
					buffer = elements[i];
					elements[i] = elements[j];
					elements[j] = buffer;
				}
			}
		}
	}		
	
	
}


