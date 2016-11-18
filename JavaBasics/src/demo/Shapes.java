package demo;

public class Shapes {
	
	int length;  //Variable declared at class level are called as Fields.
	int breadth;
	
	public Shapes(){
		length = 3;
		breadth = 2;
	}
	
	
	public Shapes(int a, int b){    //a and b are formal parameters
		length = a;
		breadth = b;
	}
	
	public void area(){
		System.out.println("Area of the rectangle = " + (length*breadth) + " squared cm");
	}	
	
	public static void main(String[] args) {
		Shapes rectangle = new Shapes();  //Default Constructor
		//rectangle.area();
		
		Shapes rectangle2 = new Shapes(5,3);   //Parameterized Constructor
		rectangle2.area();
		
	}

}
