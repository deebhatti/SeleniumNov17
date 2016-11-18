package inheritance;

public class HR extends Employee{
	
	
	
	
	public static void main(String[] args) {
		int bonus = 12000;
		HR John = new HR();
		System.out.println("Total yearly remuneration of John = $ " + (John.Salary+bonus));
		
		John.greetings();
		
		John.message();
	}

}
