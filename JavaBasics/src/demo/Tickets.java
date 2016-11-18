package demo;

public class Tickets {

	private double undiscountedPrice;
	private double priceForSeniorCitizens;
	private double priceForChildren;

	public Tickets(double maxPrice) {
		undiscountedPrice = maxPrice;
		priceForSeniorCitizens = maxPrice * 0.85;
		priceForChildren = maxPrice * 0.5;
	}

	public void printUndiscountedTicket() {
		System.out.println("Journey Fare = $ " + undiscountedPrice);
	}

	public void printTicketForSeniorCitizens() {
		System.out.println("Journey Fare = $ " + priceForSeniorCitizens);
	}

	public void printTicketForChildren() {
		System.out.println("Journey Fare = $ " + priceForChildren);
	}

	public static void main(String[] args) {
		Tickets trainTicket = new Tickets(48.5);

	//	trainTicket.printUndiscountedTicket();
	//	trainTicket.printTicketForSeniorCitizens();
		trainTicket.printTicketForChildren();

	}

}
