package curs7;

public class TestPasswordValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PasswordValidation obj = new PasswordValidation();
		obj.printPasswordRules();
		obj.readUsername();
		
//		while(!obj.isValid) {
//			
//		}
		
		do {
			obj.checkPasswordRules(obj.readProposedPassword());
			
		} while(!obj.isValid);
		
		System.out.println("Parola valida!");
	}

}
