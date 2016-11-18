package abstractClassDemo;

public class Accounts extends Employee implements Employee2 {

	@Override
	public void message() {             //Belongs to parent class Employee
		System.out.println("All the employees in Accounts department will have 4 WFHs from next month onwards");
		
	}

	@Override
	public void message2() {               //Belongs to interface Employee2
		System.out.println("All the employees in Accounts department will work 3 extra days in a month");
		
	}

}
