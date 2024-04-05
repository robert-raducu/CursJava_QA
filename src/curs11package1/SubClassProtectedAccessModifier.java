package curs11package1;

public class SubClassProtectedAccessModifier extends ProtectedAccessModifier{

	public static void main(String[] args) {
		// subclass, same package: yes
		SubClassProtectedAccessModifier obj = new SubClassProtectedAccessModifier();
		obj.printMesaj();
	}
}
