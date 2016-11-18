package abstractClassDemo;

public class Security extends Employee implements Employee2{

	@Override
	public void message() {
		System.out.println("All the employees in Security department will have 2 WFHs from next month onwards");
		
	}

	@Override
	public void message2() {
		System.out.println("All the employees in Security department will work 4 extra days in a month");
		
	}

}
