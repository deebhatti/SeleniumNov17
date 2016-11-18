package demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsDemo {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		try {
		System.out.println("Please enter number 1 ");
		int num1 = k.nextInt();
		
		System.out.println("Please enter nnumber 2");
		int num2 = k.nextInt();
		
		System.out.println("Result of division of 2 numbers = " + (num1/num2));
		}
		
		
		
		
		catch(ArithmeticException e){
			System.out.println("Please don't enter a zero in denominator");
		}
		
		catch(InputMismatchException e){
			System.out.println("Please enter integers only. Other types of inputs are not valid");
		}
		
		catch(Exception e){
			System.out.println("Input is not valid");
		}
		
		
		
	}

}
