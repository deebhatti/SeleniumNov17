package methodOverloading;

public class Cal {
	
	public void add(int a, int b){
		System.out.println(a+b);
	}	
	
	public void  add(int a, int b, int c){
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		Cal scientificCal = new Cal();
		
		scientificCal.add(20, 30);
		
		scientificCal.add(5, 6, 7);
	}

}
