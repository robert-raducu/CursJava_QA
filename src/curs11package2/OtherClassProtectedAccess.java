package curs11package2;

import curs11package1.ProtectedAccessModifier;

public class OtherClassProtectedAccess {

	public static void main(String[] args) {
		// other class, different package: NO
		ProtectedAccessModifier obj = new ProtectedAccessModifier();
		//obj.printMesaj();

	}

}
