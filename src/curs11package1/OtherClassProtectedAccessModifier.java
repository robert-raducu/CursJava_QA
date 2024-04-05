package curs11package1;

public class OtherClassProtectedAccessModifier {

	public static void main(String[] args) {
		// other class, same package: yes
		ProtectedAccessModifier obj = new ProtectedAccessModifier();
		obj.printMesaj();
	}

}
