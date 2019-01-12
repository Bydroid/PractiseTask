package chapter1;

public class Reservation {
	int TicketID;
	
	Reservation(){
		TicketID=21;
	}
	
	void showticket() {
		System.out.println("Ticket ID : "+TicketID);
	}
	
	public static void main(String arg[]) {
		Reservation r=new Reservation();
		r.showticket();
	}

}
