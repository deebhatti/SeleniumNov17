package demo;

public class Calculator {
	
	public Calculator(){
		
	}
	
	
	public int add(int a, int b) {    // Defining the add method , a and b are called as Formal Arguments
		//System.out.println(a + b);
		return (a+b);
	}

	public void subtract(int a, int b) {  //Defining the subtract method
		System.out.println(a - b);
	}

	public void multiply(int a, int b) {
		System.out.println(a * b);
	}

	public void divide(int a, int b) {
		System.out.println(a / b);
	}

	public static void main(String[] args) {
		Calculator basicCal = new Calculator();
		
		System.out.println(basicCal.add(5, 6));
		                         //Calling the add method , 5 and 6 are called as Actual arguments
		basicCal.add(20, 30);
		basicCal.add(50, 62);

		basicCal.subtract(20, 10); 					//Calling the subtract method	

		basicCal.multiply(10, 4);

		basicCal.divide(100, 10);

	}

}
