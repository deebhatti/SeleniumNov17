package inheritance;

public class Accounts extends Employee {

	
	private int bonus = 8000;
	
	public static void main(String[] args) {
		Accounts Tim = new Accounts();
		
		Tim.message();
	}

}
