package curs11package1;

public class ProtectedAccessModifier { 
	/*
	 * Scopul este in acelasi pachet si sub clasa din pachete diferite 
	 * 
	 * Clasele nu pot fi declarate ca protected
	 * 
	 * Aceeasi clasa : yes
	 * Alta clasa din acelasi pachet : yes
	 * 
	 * Subclasa(clasa copil) in acelasi pachet : yes
	 * 
	 * Subclasa in alt pachet : yes
	 * 
	 * Alta clasa in alt pachet: NO
	 * 
	 */
	
	protected String mesaj = "Protected Access";
	
	protected void printMesaj() {
		System.out.println(mesaj);
	}
	
	public static void main(String[] args) {
		ProtectedAccessModifier obj = new ProtectedAccessModifier();
		obj.printMesaj();
	}
}
