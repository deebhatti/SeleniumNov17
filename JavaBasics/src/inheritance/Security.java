package inheritance;

public class Security extends Employee {

	
	private int bonus = 5000;
	private int Salary = 60000;
	
	public void message(){
		System.out.println("From next month onwards, all employee will get 3 WFHs");
		
	}
	
	public static void main(String[] args) {
		Security Ajay = new Security();
		
		System.out.println("Total remuneration of Ajay = $ " + (Ajay.Salary+Ajay.bonus));
		
		Ajay.message();
	}

}
