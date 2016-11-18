package inheritance;

public class IT extends Employee{
	
	
	private int bonus = 10000;
	
	public void greetings(){
		 System.out.println("Good Evening all IT folks!");
	 }
	
	public static void main(String[] args) {
		IT Ram = new IT();
		
		System.out.println("Total bonus of Ram = $ " + Ram.bonus);
		System.out.println("Total salary of Ram = $" + Ram.Salary);
		
		Ram.greetings();
		
		Ram.message();
	}
	
	
	
	

}
