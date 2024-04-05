package curs11package2;

import curs11package1.ProtectedAccessModifier;

public class SubClassProtectedAccessModifier extends ProtectedAccessModifier{

	public static void main(String[] args){
		// subclass, different package: yes
		SubClassProtectedAccessModifier obj = new SubClassProtectedAccessModifier();
		obj.printMesaj();
	}

}
