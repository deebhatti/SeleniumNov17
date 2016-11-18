package abstractClassDemo;

public class Test {
	public static void main(String[] args) {
		Employee Ram = new IT();
		Employee Vijay = new HR();
		Employee Tim = new Security();

		Employee John = new Accounts();
		Employee2 Steve = new Accounts();
		Accounts Sam = new Accounts();

		Ram.message();
		Vijay.message();
		John.message();
		Tim.message();

		Employee2 Sham = new Security();

		Ram.day();
		Vijay.day();
		John.day();
		Tim.day();

		Steve.message2();
		Sham.message2();

		Sam.message();
		Sam.message2();

	}

}
